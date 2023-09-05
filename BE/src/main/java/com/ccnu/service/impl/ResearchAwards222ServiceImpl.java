package com.ccnu.service.impl;

import com.ccnu.mapper.ResearchAwards222Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.ResearchAwards222;
import com.ccnu.pojo.ResearchAwards222Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ResearchAwards222Vo;
import com.ccnu.service.ResearchAwards222Service;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.PageUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResearchAwards222ServiceImpl implements ResearchAwards222Service {

    @Autowired
    ResearchAwards222Mapper researchAwards222Mapper;

    @Autowired
    UserAccountMapper userAccountMapper;
    @Override
    public PageUtils<ResearchAwards222Vo> getAllDoctorAwardsInfoBy222(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<ResearchAwards222Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<ResearchAwards222Vo> doctorsInfo = researchAwards222Mapper.getAllDoctorAwardsInfoBy222(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<ResearchAwards222Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addAwardsInfoBy222(ResearchAwards222 researchAwards222) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(researchAwards222.getId() == null){
            //新增
            ResearchAwards222Example example = new ResearchAwards222Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(researchAwards222.getTutorIdentificationCode());
            List<ResearchAwards222> doctorTutorInfos = researchAwards222Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前博导信息已存在,请勿重复添加");
//            }
            researchAwards222.setLastTime(sdf.format(new Date()));
            //默认未删除
            researchAwards222.setIsdelete("0");
            researchAwards222Mapper.insert(researchAwards222);
        }
        return true;
    }

    @Override
    public ResearchAwards222 updateAwardsInfoBy222(ResearchAwards222 researchAwards222) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        researchAwards222.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(researchAwards222.getIsdelete())){
            researchAwards222.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(researchAwards222.getId() == null || researchAwards222.getId() < 1){
            if(StringUtils.isBlank(researchAwards222.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {
                ResearchAwards222Example example = new ResearchAwards222Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(researchAwards222.getTutorIdentificationCode());
                List<ResearchAwards222> doctorTutorInfos = researchAwards222Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                researchAwards222.setId(doctorTutorInfos.get(0).getId());
            }
        }
        researchAwards222Mapper.updateByPrimaryKey(researchAwards222);
        return researchAwards222;
    }

    @Override
    public Boolean deleteAwardsInfoBy222(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ResearchAwards222 doctorTutorInformation111 = researchAwards222Mapper.selectByPrimaryKey(id);
        if(doctorTutorInformation111 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        doctorTutorInformation111.setLastTime(sdf.format(new Date()));
        //1代表删除
        doctorTutorInformation111.setIsdelete("1");
        researchAwards222Mapper.updateByPrimaryKey(doctorTutorInformation111);
        return true;
    }

    @Override
    public ResearchAwards222 getDoctorAwardsInfoBy222(IdDto idDto) {
        ResearchAwards222Example example=new ResearchAwards222Example();
        ResearchAwards222Example.Criteria criteria=example.createCriteria();
        if (idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<ResearchAwards222> researchAwards222s = researchAwards222Mapper.selectByExample(example);
        if(researchAwards222s == null || researchAwards222s.size() < 1){
            return null;
        }else {
            return researchAwards222s.get(0);
        }
    }
}
