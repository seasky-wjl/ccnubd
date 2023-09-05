package com.ccnu.service.impl;

import com.ccnu.mapper.CourseStatus211Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.CourseStatus211;
import com.ccnu.pojo.CourseStatus211Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.CourseStatus211Vo;
import com.ccnu.service.CourseStatus211Service;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.PageUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/23 20:24
 */
@Service
public class CourseStatus211ServiceImpl implements CourseStatus211Service {

    @Autowired
    CourseStatus211Mapper courseStatus211Mapper;
    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<CourseStatus211Vo> getAllDoctorCourseInfoBy211(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<CourseStatus211Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<CourseStatus211Vo> doctorsInfo = courseStatus211Mapper.getAllDoctorCourseInfoBy211(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<CourseStatus211Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addCourseInfoBy211(CourseStatus211 courseStatus211) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(courseStatus211.getId() == null){
            //新增
            CourseStatus211Example example = new CourseStatus211Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(courseStatus211.getTutorIdentificationCode());

            List<CourseStatus211> doctorTutorInfos = courseStatus211Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前信息已存在,请勿重复添加");
//            }
            courseStatus211.setLastTime(sdf.format(new Date()));

            //默认未删除
            courseStatus211.setIsdelete("0");
            courseStatus211Mapper.insert(courseStatus211);
        }
        return true;

    }

    @Override
    public CourseStatus211 updateCourseInfoBy211(CourseStatus211 courseStatus211) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        courseStatus211.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(courseStatus211.getIsdelete())){
            courseStatus211.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(courseStatus211.getId() == null || courseStatus211.getId() < 1){
            if(StringUtils.isBlank(courseStatus211.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {

                CourseStatus211Example example = new CourseStatus211Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(courseStatus211.getTutorIdentificationCode());
                List<CourseStatus211> doctorTutorInfos = courseStatus211Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                courseStatus211.setId(doctorTutorInfos.get(0).getId());
            }
        }
        courseStatus211Mapper.updateByPrimaryKey(courseStatus211);
        return courseStatus211;
    }

    @Override
    public Boolean deleteCourseInfoBy211(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CourseStatus211 CourseStatus211 = courseStatus211Mapper.selectByPrimaryKey(id);
        if(CourseStatus211 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        CourseStatus211.setLastTime(sdf.format(new Date()));
        //1代表删除
        CourseStatus211.setIsdelete("1");
        courseStatus211Mapper.updateByPrimaryKey(CourseStatus211);
        return true;

    }

    @Override
    public CourseStatus211 getDoctorCourseInfoBy211(IdDto idDto) {
        CourseStatus211Example example = new CourseStatus211Example();
        CourseStatus211Example.Criteria criteria = example.createCriteria();
        if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<CourseStatus211> courseStatus211List = courseStatus211Mapper.selectByExample(example);
        if(courseStatus211List == null || courseStatus211List.size() < 1){
            return null;
        }else {
            return courseStatus211List.get(0);
        }
    }
}
