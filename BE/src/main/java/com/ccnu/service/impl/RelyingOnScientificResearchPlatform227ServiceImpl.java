package com.ccnu.service.impl;

import com.ccnu.mapper.RelyingOnScientificResearchPlatform227Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.RelyingOnScientificResearchPlatform227;
import com.ccnu.pojo.RelyingOnScientificResearchPlatform227Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;


import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.RelyingOnScientificResearchPlatform227Vo;
import com.ccnu.service.RelyingOnScientificResearchPlatform227Service;
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
public class RelyingOnScientificResearchPlatform227ServiceImpl implements RelyingOnScientificResearchPlatform227Service {

    @Autowired
    RelyingOnScientificResearchPlatform227Mapper relyingOnScientificResearchPlatform227Mapper;

    @Autowired
    UserAccountMapper userAccountMapper;
    @Override
    public PageUtils<RelyingOnScientificResearchPlatform227Vo> getScientificResearchPlatformInfoBy227(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<RelyingOnScientificResearchPlatform227Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<RelyingOnScientificResearchPlatform227Vo> doctorsInfo = relyingOnScientificResearchPlatform227Mapper.getScientificResearchPlatformInfoBy227(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<RelyingOnScientificResearchPlatform227Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addScientificResearchPlatformInfoBy227(RelyingOnScientificResearchPlatform227 relyingOnScientificResearchPlatform227) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(relyingOnScientificResearchPlatform227.getId() == null){
            //新增
            RelyingOnScientificResearchPlatform227Example example = new RelyingOnScientificResearchPlatform227Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(relyingOnScientificResearchPlatform227.getTutorIdentificationCode());
            List<RelyingOnScientificResearchPlatform227> doctorTutorInfos = relyingOnScientificResearchPlatform227Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前博导信息已存在,请勿重复添加");
//            }
            relyingOnScientificResearchPlatform227.setLastTime(sdf.format(new Date()));
            //默认未删除
            relyingOnScientificResearchPlatform227.setIsdelete("0");
            relyingOnScientificResearchPlatform227Mapper.insert(relyingOnScientificResearchPlatform227);
        }
        return true;
    }

    @Override
    public RelyingOnScientificResearchPlatform227 updateScientificResearchPlatformInfoBy227(RelyingOnScientificResearchPlatform227 relyingOnScientificResearchPlatform227) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        relyingOnScientificResearchPlatform227.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(relyingOnScientificResearchPlatform227.getIsdelete())){
            relyingOnScientificResearchPlatform227.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(relyingOnScientificResearchPlatform227.getId() == null || relyingOnScientificResearchPlatform227.getId() < 1){
            if(StringUtils.isBlank(relyingOnScientificResearchPlatform227.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {
                RelyingOnScientificResearchPlatform227Example example = new RelyingOnScientificResearchPlatform227Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(relyingOnScientificResearchPlatform227.getTutorIdentificationCode());
                List<RelyingOnScientificResearchPlatform227> doctorTutorInfos = relyingOnScientificResearchPlatform227Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                relyingOnScientificResearchPlatform227.setId(doctorTutorInfos.get(0).getId());
            }
        }
        relyingOnScientificResearchPlatform227Mapper.updateByPrimaryKey(relyingOnScientificResearchPlatform227);
        return relyingOnScientificResearchPlatform227;
    }

    @Override
    public Boolean deleteScientificResearchPlatformInfoBy227(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        RelyingOnScientificResearchPlatform227 relyingOnScientificResearchPlatform227 = relyingOnScientificResearchPlatform227Mapper.selectByPrimaryKey(id);
        if(relyingOnScientificResearchPlatform227 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        relyingOnScientificResearchPlatform227.setLastTime(sdf.format(new Date()));
        //1代表删除
        relyingOnScientificResearchPlatform227.setIsdelete("1");
        relyingOnScientificResearchPlatform227Mapper.updateByPrimaryKey(relyingOnScientificResearchPlatform227);
        return true;
    }

    @Override
    public RelyingOnScientificResearchPlatform227 getScientificResearch(IdDto idDto) {
        RelyingOnScientificResearchPlatform227Example example=new RelyingOnScientificResearchPlatform227Example();
        RelyingOnScientificResearchPlatform227Example.Criteria criteria=example.createCriteria();
        if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<RelyingOnScientificResearchPlatform227> relyingOnScientificResearchPlatform227List = relyingOnScientificResearchPlatform227Mapper.selectByExample(example);
        if(relyingOnScientificResearchPlatform227List == null || relyingOnScientificResearchPlatform227List.size() < 1){
            return null;
        }else {
            return relyingOnScientificResearchPlatform227List.get(0);
        }
    }
}
