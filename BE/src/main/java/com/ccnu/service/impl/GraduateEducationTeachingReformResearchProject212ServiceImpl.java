package com.ccnu.service.impl;

import com.ccnu.mapper.GraduateEducationTeachingReformResearchProject212Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.GraduateEducationTeachingReformResearchProject212;
import com.ccnu.pojo.GraduateEducationTeachingReformResearchProject212Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.GraduateEducationTeachingReformResearchProject212Vo;
import com.ccnu.service.GraduateEducationTeachingReformResearchProject212Service;
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
 * @date 2020/12/23 20:26
 */
@Service
public class GraduateEducationTeachingReformResearchProject212ServiceImpl implements GraduateEducationTeachingReformResearchProject212Service {
    @Autowired
    GraduateEducationTeachingReformResearchProject212Mapper graduateEducationTeachingReformResearchProject212Mapper;
    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<GraduateEducationTeachingReformResearchProject212Vo> getAllDoctoGraduateEducationInfoBy212(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<GraduateEducationTeachingReformResearchProject212Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<GraduateEducationTeachingReformResearchProject212Vo> doctorsInfo = graduateEducationTeachingReformResearchProject212Mapper.getAllDoctoGraduateEducationInfoBy212(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<GraduateEducationTeachingReformResearchProject212Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addGraduateEducationInfoBy212(GraduateEducationTeachingReformResearchProject212 graduateEducationTeachingReformResearchProject212) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(graduateEducationTeachingReformResearchProject212.getId() == null){
            //新增
            GraduateEducationTeachingReformResearchProject212Example example = new GraduateEducationTeachingReformResearchProject212Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(graduateEducationTeachingReformResearchProject212.getTutorIdentificationCode());

            List<GraduateEducationTeachingReformResearchProject212> doctorTutorInfos = graduateEducationTeachingReformResearchProject212Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前信息已存在,请勿重复添加");
//            }
            graduateEducationTeachingReformResearchProject212.setLastTime(sdf.format(new Date()));

            //默认未删除
            graduateEducationTeachingReformResearchProject212.setIsdelete("0");
            graduateEducationTeachingReformResearchProject212Mapper.insert(graduateEducationTeachingReformResearchProject212);
        }
        return true;
    }

    @Override
    public GraduateEducationTeachingReformResearchProject212 updateGraduateEducationInfoBy212(GraduateEducationTeachingReformResearchProject212 graduateEducationTeachingReformResearchProject212) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        graduateEducationTeachingReformResearchProject212.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(graduateEducationTeachingReformResearchProject212.getIsdelete())){
            graduateEducationTeachingReformResearchProject212.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(graduateEducationTeachingReformResearchProject212.getId() == null || graduateEducationTeachingReformResearchProject212.getId() < 1){
            if(StringUtils.isBlank(graduateEducationTeachingReformResearchProject212.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {

                GraduateEducationTeachingReformResearchProject212Example example = new GraduateEducationTeachingReformResearchProject212Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(graduateEducationTeachingReformResearchProject212.getTutorIdentificationCode());
                List<GraduateEducationTeachingReformResearchProject212> doctorTutorInfos = graduateEducationTeachingReformResearchProject212Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                graduateEducationTeachingReformResearchProject212.setId(doctorTutorInfos.get(0).getId());
            }
        }
        graduateEducationTeachingReformResearchProject212Mapper.updateByPrimaryKey(graduateEducationTeachingReformResearchProject212);
        return graduateEducationTeachingReformResearchProject212;

    }

    @Override
    public Boolean deleteGraduateEducationInfoBy212(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        GraduateEducationTeachingReformResearchProject212 GraduateEducationTeachingReformResearchProject212 = graduateEducationTeachingReformResearchProject212Mapper.selectByPrimaryKey(id);
        if(GraduateEducationTeachingReformResearchProject212 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        GraduateEducationTeachingReformResearchProject212.setLastTime(sdf.format(new Date()));
        //1代表删除
        GraduateEducationTeachingReformResearchProject212.setIsdelete("1");
        graduateEducationTeachingReformResearchProject212Mapper.updateByPrimaryKey(GraduateEducationTeachingReformResearchProject212);
        return true;
    }

    @Override
    public GraduateEducationTeachingReformResearchProject212 getDoctoGraduateEducationInfoBy212(IdDto idDto) {
        GraduateEducationTeachingReformResearchProject212Example example = new GraduateEducationTeachingReformResearchProject212Example();
        GraduateEducationTeachingReformResearchProject212Example.Criteria criteria = example.createCriteria();
        if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<GraduateEducationTeachingReformResearchProject212> graduateEducationTeachingReformResearchProject212List = graduateEducationTeachingReformResearchProject212Mapper.selectByExample(example);
        if(graduateEducationTeachingReformResearchProject212List == null || graduateEducationTeachingReformResearchProject212List.size() < 1){
            return null;
        }else {
            return graduateEducationTeachingReformResearchProject212List.get(0);
        }
    }
}
