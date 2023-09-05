package com.ccnu.service.impl;

import com.ccnu.mapper.DoctorTutorInformation111Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.*;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.service.DoctorTutorInformation111Service;
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
 * @date 2020/12/4 13:47
 */
@Service
public class DoctorTutorInformation111ServiceImpl implements DoctorTutorInformation111Service {

    @Autowired
    DoctorTutorInformation111Mapper doctorTutorInformation111Mapper;
    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<DoctorTutorInformation111> getAllDoctorsInfoBy111(DoctorInfosQueryDto doctorInfosQueryDto) {
        DoctorTutorInformation111Example example = new DoctorTutorInformation111Example();
        DoctorTutorInformation111Example.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(doctorInfosQueryDto.getTutorIdentificationCode())){
            criteria.andTutorIdentificationCodeLike("%"+doctorInfosQueryDto.getTutorIdentificationCode()+"%");
        }
        if(StringUtils.isNotBlank(doctorInfosQueryDto.getCollege())){
            UserAccountExample userAccountExample = new UserAccountExample();
            userAccountExample.createCriteria().andFacultyCodeEqualTo(doctorInfosQueryDto.getCollege());
            //符合学院要求的用户列表
            List<UserAccount> users = userAccountMapper.selectByExample(userAccountExample);
            if(users == null || users.size() < 1){
                return null;
            }else {
                List<String> tutorIdentificationCode = users.stream().map(UserAccount::getUsername).collect(Collectors.toList());
                criteria.andTutorIdentificationCodeIn(tutorIdentificationCode);
            }
        }
        criteria.andIsdeleteEqualTo("0");
        Page<DoctorTutorInformation111> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<DoctorTutorInformation111> doctorsInfo = doctorTutorInformation111Mapper.selectByExample(example);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<DoctorTutorInformation111> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addDoctorsInfoBy111(DoctorTutorInformation111 doctorTutorInformation111) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(doctorTutorInformation111.getId() == null){
            //新增
            DoctorTutorInformation111Example example = new DoctorTutorInformation111Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(doctorTutorInformation111.getTutorIdentificationCode());
            List<DoctorTutorInformation111> doctorTutorInfos = doctorTutorInformation111Mapper.selectByExample(example);
            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
                throw new AppException(ErrorCode.ERR_EXISTED,"当前博导信息已存在,请勿重复添加");
            }
            doctorTutorInformation111.setLastTime(sdf.format(new Date()));
            //默认未删除
            doctorTutorInformation111.setIsdelete("0");
            doctorTutorInformation111Mapper.insert(doctorTutorInformation111);
        }
        return true;
    }

    @Override
    public DoctorTutorInformation111 updateDoctorsInfoBy111(DoctorTutorInformation111 doctorTutorInformation111) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        doctorTutorInformation111.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(doctorTutorInformation111.getIsdelete())){
            doctorTutorInformation111.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(doctorTutorInformation111.getId() == null || doctorTutorInformation111.getId() < 1){
            if(StringUtils.isBlank(doctorTutorInformation111.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {
                DoctorTutorInformation111Example example = new DoctorTutorInformation111Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(doctorTutorInformation111.getTutorIdentificationCode());
                List<DoctorTutorInformation111> doctorTutorInfos = doctorTutorInformation111Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                doctorTutorInformation111.setId(doctorTutorInfos.get(0).getId());
            }
        }
        doctorTutorInformation111Mapper.updateByPrimaryKey(doctorTutorInformation111);
        return doctorTutorInformation111;
    }

    @Override
    public Boolean deleteDoctorsInfoBy111(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DoctorTutorInformation111 doctorTutorInformation111 = doctorTutorInformation111Mapper.selectByPrimaryKey(id);
        if(doctorTutorInformation111 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        doctorTutorInformation111.setLastTime(sdf.format(new Date()));
        //1代表删除
        doctorTutorInformation111.setIsdelete("1");
        doctorTutorInformation111Mapper.updateByPrimaryKey(doctorTutorInformation111);
        return true;
    }

    @Override
    public DoctorTutorInformation111 getDoctorsInfoBy111(DoctorTutorInformation111 doctorTutorInformation111) {
        DoctorTutorInformation111Example example = new DoctorTutorInformation111Example();
        DoctorTutorInformation111Example.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(doctorTutorInformation111.getTutorIdentificationCode())){
            criteria.andTutorIdentificationCodeEqualTo(doctorTutorInformation111.getTutorIdentificationCode());
        }
        criteria.andIsdeleteEqualTo("0");
        List<DoctorTutorInformation111> doctorTutorInformation111List = doctorTutorInformation111Mapper.selectByExample(example);
        if(doctorTutorInformation111List == null || doctorTutorInformation111List.size() < 1){
            return null;
        }else {
            return doctorTutorInformation111List.get(0);
        }
    }

}
