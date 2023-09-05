package com.ccnu.service.impl;

import com.ccnu.mapper.ParticipationInternationalAcademicConferences225Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.*;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;

import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ParticipationInternationalAcademicConferences225Vo;
import com.ccnu.service.ParticipationInternationalAcademicConferences225Service;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.PageUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParticipationInternationalAcademicConferences225ServiceImpl implements ParticipationInternationalAcademicConferences225Service {

    @Autowired
    ParticipationInternationalAcademicConferences225Mapper participationInternationalAcademicConferences225Mapper;

    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<ParticipationInternationalAcademicConferences225Vo> getAllDoctorConferenceInfoBy225(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<ParticipationInternationalAcademicConferences225Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<ParticipationInternationalAcademicConferences225Vo> doctorsInfo = participationInternationalAcademicConferences225Mapper.getAllDoctorConferenceInfoBy225(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<ParticipationInternationalAcademicConferences225Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addConferenceInfoBy225(ParticipationInternationalAcademicConferences225 participationInternationalAcademicConferences225) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(participationInternationalAcademicConferences225.getId() == null){
            //新增
            ParticipationInternationalAcademicConferences225Example example = new ParticipationInternationalAcademicConferences225Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(participationInternationalAcademicConferences225.getTutorIdentificationCode());
            List<ParticipationInternationalAcademicConferences225> doctorTutorInfos = participationInternationalAcademicConferences225Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前博导信息已存在,请勿重复添加");
//            }
            participationInternationalAcademicConferences225.setLastTime(sdf.format(new Date()));
            //默认未删除
            participationInternationalAcademicConferences225.setIsDelete("0");
            participationInternationalAcademicConferences225Mapper.insert(participationInternationalAcademicConferences225);
        }
        return true;
    }

    @Override
    public ParticipationInternationalAcademicConferences225 updateConferenceInfoBy225(ParticipationInternationalAcademicConferences225 participationInternationalAcademicConferences225) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        participationInternationalAcademicConferences225.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(participationInternationalAcademicConferences225.getIsDelete())){
            participationInternationalAcademicConferences225.setIsDelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(participationInternationalAcademicConferences225.getId() == null || participationInternationalAcademicConferences225.getId() < 1){
            if(StringUtils.isBlank(participationInternationalAcademicConferences225.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {
                ParticipationInternationalAcademicConferences225Example example = new ParticipationInternationalAcademicConferences225Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(participationInternationalAcademicConferences225.getTutorIdentificationCode());
                List<ParticipationInternationalAcademicConferences225> doctorTutorInfos = participationInternationalAcademicConferences225Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                participationInternationalAcademicConferences225.setId(doctorTutorInfos.get(0).getId());
            }
        }
        participationInternationalAcademicConferences225Mapper.updateByPrimaryKey(participationInternationalAcademicConferences225);
        return participationInternationalAcademicConferences225;
    }

    @Override
    public Boolean deleteConferenceInfoBy225(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParticipationInternationalAcademicConferences225 participationInternationalAcademicConferences225 = participationInternationalAcademicConferences225Mapper.selectByPrimaryKey(id);
        if(participationInternationalAcademicConferences225 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        participationInternationalAcademicConferences225.setLastTime(sdf.format(new Date()));
        //1代表删除
        participationInternationalAcademicConferences225.setIsDelete("1");
        participationInternationalAcademicConferences225Mapper.updateByPrimaryKey(participationInternationalAcademicConferences225);
        return true;
    }

    @Override
    public ParticipationInternationalAcademicConferences225 getDoctorConferenceInfoBy225(IdDto idDto) {

        ParticipationInternationalAcademicConferences225Example example=new ParticipationInternationalAcademicConferences225Example();
        ParticipationInternationalAcademicConferences225Example.Criteria criteria=example.createCriteria();

          if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsDeleteEqualTo("0");
        List<ParticipationInternationalAcademicConferences225> participationInternationalAcademicConferences225List = participationInternationalAcademicConferences225Mapper.selectByExample(example);
        if(participationInternationalAcademicConferences225List == null || participationInternationalAcademicConferences225List.size() < 1){
            return null;
        }else {
            return participationInternationalAcademicConferences225List.get(0);
        }
    }
}
