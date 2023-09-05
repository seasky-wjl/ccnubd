package com.ccnu.service.impl;

import com.ccnu.mapper.PublishingTextbookSituation213Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.PublishingTextbookSituation213;
import com.ccnu.pojo.PublishingTextbookSituation213Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.PublishingTextbookSituation213Vo;
import com.ccnu.service.DoctorPublishingInfo213Service;
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

@Service
public class DoctorPublishingInfo213ServiceImpl implements DoctorPublishingInfo213Service {

    @Autowired
    PublishingTextbookSituation213Mapper publishingTextbookSituation213Mapper;

    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<PublishingTextbookSituation213Vo> getAllDoctorPublishingInfoBy213(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<PublishingTextbookSituation213Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<PublishingTextbookSituation213Vo> doctorsInfo = publishingTextbookSituation213Mapper.getAllDoctorPublishingInfoBy213(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<PublishingTextbookSituation213Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addPublishingInfoBy213(PublishingTextbookSituation213 publishingTextbookSituation213) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(publishingTextbookSituation213.getId() == null){
            //新增
            PublishingTextbookSituation213Example example = new PublishingTextbookSituation213Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(publishingTextbookSituation213.getTutorIdentificationCode());
            List<PublishingTextbookSituation213> doctorTutorInfos = publishingTextbookSituation213Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前博导信息已存在,请勿重复添加");
//            }
            publishingTextbookSituation213.setLastTime(sdf.format(new Date()));
            //默认未删除
            publishingTextbookSituation213.setIsdelete("0");
            publishingTextbookSituation213Mapper.insert(publishingTextbookSituation213);
        }
        return true;
    }

    @Override
    public PublishingTextbookSituation213 updatePublishingInfoBy213(PublishingTextbookSituation213 publishingTextbookSituation213) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        publishingTextbookSituation213.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(publishingTextbookSituation213.getIsdelete())){
            publishingTextbookSituation213.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(publishingTextbookSituation213.getId() == null || publishingTextbookSituation213.getId() < 1){
            if(StringUtils.isBlank(publishingTextbookSituation213.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {
                PublishingTextbookSituation213Example example = new PublishingTextbookSituation213Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(publishingTextbookSituation213.getTutorIdentificationCode());
                List<PublishingTextbookSituation213> doctorTutorInfos = publishingTextbookSituation213Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                publishingTextbookSituation213.setId(doctorTutorInfos.get(0).getId());
            }
        }
        publishingTextbookSituation213Mapper.updateByPrimaryKey(publishingTextbookSituation213);
        return publishingTextbookSituation213;
    }

    @Override
    public Boolean deletePublishingInfoBy213(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PublishingTextbookSituation213 publishingTextbookSituation213 = publishingTextbookSituation213Mapper.selectByPrimaryKey(id);
        if(publishingTextbookSituation213 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        publishingTextbookSituation213.setLastTime(sdf.format(new Date()));
        //1代表删除
        publishingTextbookSituation213.setIsdelete("1");
        publishingTextbookSituation213Mapper.updateByPrimaryKey(publishingTextbookSituation213);
        return true;
    }

    @Override
    public PublishingTextbookSituation213 getDoctorPublishingInfoBy213(IdDto idDto) {
        PublishingTextbookSituation213Example example = new PublishingTextbookSituation213Example();
        PublishingTextbookSituation213Example.Criteria criteria = example.createCriteria();
        if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<PublishingTextbookSituation213> publishingTextbookSituation213List = publishingTextbookSituation213Mapper.selectByExample(example);
        if(publishingTextbookSituation213List == null || publishingTextbookSituation213List.size() < 1){
            return null;
        }else {
            return publishingTextbookSituation213List.get(0);
        }
    }
}
