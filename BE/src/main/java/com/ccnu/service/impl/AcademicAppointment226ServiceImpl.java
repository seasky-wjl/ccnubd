package com.ccnu.service.impl;

import com.ccnu.mapper.AcademicAppointment226Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.AcademicAppointment226;
import com.ccnu.pojo.AcademicAppointment226Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;

import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.AcademicAppointment226Vo;
import com.ccnu.service.AcademicAppointment226Service;
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
public class AcademicAppointment226ServiceImpl implements AcademicAppointment226Service {

    @Autowired
    AcademicAppointment226Mapper academicAppointment226Mapper;

    @Autowired
    UserAccountMapper userAccountMapper;
    @Override
    public PageUtils<AcademicAppointment226Vo> getAcademicAppointmentInfoBy226(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<AcademicAppointment226Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<AcademicAppointment226Vo> doctorsInfo = academicAppointment226Mapper.getAcademicAppointmentInfoBy226(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<AcademicAppointment226Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addAcademicAppointmentInfoBy226(AcademicAppointment226 academicAppointment226) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(academicAppointment226.getId() == null){
            //新增
            AcademicAppointment226Example example = new AcademicAppointment226Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(academicAppointment226.getTutorIdentificationCode());
            List<AcademicAppointment226> doctorTutorInfos = academicAppointment226Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前博导信息已存在,请勿重复添加");
//            }
            academicAppointment226.setLastTime(sdf.format(new Date()));
            //默认未删除
            academicAppointment226.setIsdelete("0");
            academicAppointment226Mapper.insert(academicAppointment226);
        }
        return true;
    }

    @Override
    public AcademicAppointment226 updateAcademicAppointmentInfoBy226(AcademicAppointment226 academicAppointment226) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        academicAppointment226.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(academicAppointment226.getIsdelete())){
            academicAppointment226.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(academicAppointment226.getId() == null || academicAppointment226.getId() < 1){
            if(StringUtils.isBlank(academicAppointment226.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {
                AcademicAppointment226Example example = new AcademicAppointment226Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(academicAppointment226.getTutorIdentificationCode());
                List<AcademicAppointment226> doctorTutorInfos = academicAppointment226Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                academicAppointment226.setId(doctorTutorInfos.get(0).getId());
            }
        }
        academicAppointment226Mapper.updateByPrimaryKey(academicAppointment226);
        return academicAppointment226;
    }

    @Override
    public Boolean deleteAcademicAppointmentInfoBy226(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        AcademicAppointment226 academicAppointment226 = academicAppointment226Mapper.selectByPrimaryKey(id);
        if(academicAppointment226 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        academicAppointment226.setLastTime(sdf.format(new Date()));
        //1代表删除
        academicAppointment226.setIsdelete("1");
        academicAppointment226Mapper.updateByPrimaryKey(academicAppointment226);
        return true;
    }

    @Override
    public AcademicAppointment226 getAcademic(IdDto idDto) {
        AcademicAppointment226Example example=new AcademicAppointment226Example();
        AcademicAppointment226Example.Criteria criteria=example.createCriteria();
        if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<AcademicAppointment226> academicAppointment226List = academicAppointment226Mapper.selectByExample(example);
        if(academicAppointment226List == null || academicAppointment226List.size() < 1){
            return null;
        }else {
            return academicAppointment226List.get(0);
        }
    }
}
