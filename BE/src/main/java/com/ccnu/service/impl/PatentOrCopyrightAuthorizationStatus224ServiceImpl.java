package com.ccnu.service.impl;

import com.ccnu.mapper.PatentOrCopyrightAuthorizationStatus224Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.PatentOrCopyrightAuthorizationStatus224;
import com.ccnu.pojo.PatentOrCopyrightAuthorizationStatus224Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;

import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.PatentOrCopyrightAuthorizationStatus224Vo;
import com.ccnu.service.PatentOrCopyrightAuthorizationStatus224Service;
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
public class PatentOrCopyrightAuthorizationStatus224ServiceImpl implements PatentOrCopyrightAuthorizationStatus224Service {

    @Autowired
    PatentOrCopyrightAuthorizationStatus224Mapper patentOrCopyrightAuthorizationStatus224Mapper;

    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<PatentOrCopyrightAuthorizationStatus224Vo> getAllDoctorPatentInfoBy224(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<PatentOrCopyrightAuthorizationStatus224Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<PatentOrCopyrightAuthorizationStatus224Vo> doctorsInfo = patentOrCopyrightAuthorizationStatus224Mapper.getAllDoctorPatentInfoBy224(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<PatentOrCopyrightAuthorizationStatus224Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addPatentInfoBy224(PatentOrCopyrightAuthorizationStatus224 patentOrCopyrightAuthorizationStatus224) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(patentOrCopyrightAuthorizationStatus224.getId() == null){
            //新增
            PatentOrCopyrightAuthorizationStatus224Example example = new PatentOrCopyrightAuthorizationStatus224Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(patentOrCopyrightAuthorizationStatus224.getTutorIdentificationCode());
            List<PatentOrCopyrightAuthorizationStatus224> doctorTutorInfos = patentOrCopyrightAuthorizationStatus224Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前博导信息已存在,请勿重复添加");
//            }
            patentOrCopyrightAuthorizationStatus224.setLastTime(sdf.format(new Date()));
            //默认未删除
            patentOrCopyrightAuthorizationStatus224.setIsdelete("0");
            patentOrCopyrightAuthorizationStatus224Mapper.insert(patentOrCopyrightAuthorizationStatus224);
        }
        return true;
    }

    @Override
    public PatentOrCopyrightAuthorizationStatus224 updatePatentInfoBy224(PatentOrCopyrightAuthorizationStatus224 patentOrCopyrightAuthorizationStatus224) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        patentOrCopyrightAuthorizationStatus224.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(patentOrCopyrightAuthorizationStatus224.getIsdelete())){
            patentOrCopyrightAuthorizationStatus224.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(patentOrCopyrightAuthorizationStatus224.getId() == null || patentOrCopyrightAuthorizationStatus224.getId() < 1){
            if(StringUtils.isBlank(patentOrCopyrightAuthorizationStatus224.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {
                PatentOrCopyrightAuthorizationStatus224Example example = new PatentOrCopyrightAuthorizationStatus224Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(patentOrCopyrightAuthorizationStatus224.getTutorIdentificationCode());
                List<PatentOrCopyrightAuthorizationStatus224> doctorTutorInfos = patentOrCopyrightAuthorizationStatus224Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                patentOrCopyrightAuthorizationStatus224.setId(doctorTutorInfos.get(0).getId());
            }
        }
        patentOrCopyrightAuthorizationStatus224Mapper.updateByPrimaryKey(patentOrCopyrightAuthorizationStatus224);
        return patentOrCopyrightAuthorizationStatus224;
    }

    @Override
    public Boolean deletePatentInfoBy224(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PatentOrCopyrightAuthorizationStatus224 patentOrCopyrightAuthorizationStatus224 = patentOrCopyrightAuthorizationStatus224Mapper.selectByPrimaryKey(id);
        if(patentOrCopyrightAuthorizationStatus224 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        patentOrCopyrightAuthorizationStatus224.setLastTime(sdf.format(new Date()));
        //1代表删除
        patentOrCopyrightAuthorizationStatus224.setIsdelete("1");
        patentOrCopyrightAuthorizationStatus224Mapper.updateByPrimaryKey(patentOrCopyrightAuthorizationStatus224);
        return true;
    }

    @Override
    public PatentOrCopyrightAuthorizationStatus224 getDoctorPatentInfoBy224(IdDto idDto) {
        PatentOrCopyrightAuthorizationStatus224Example example = new PatentOrCopyrightAuthorizationStatus224Example();
        PatentOrCopyrightAuthorizationStatus224Example.Criteria criteria = example.createCriteria();
        if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<PatentOrCopyrightAuthorizationStatus224> patentOrCopyrightAuthorizationStatus224List = patentOrCopyrightAuthorizationStatus224Mapper.selectByExample(example);
        if(patentOrCopyrightAuthorizationStatus224List == null || patentOrCopyrightAuthorizationStatus224List.size() < 1){
            return null;
        }else {
            return patentOrCopyrightAuthorizationStatus224List.get(0);
        }
    }
}
