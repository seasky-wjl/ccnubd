package com.ccnu.service.impl;

import com.ccnu.mapper.PublicationStatus223Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.PublicationStatus223;
import com.ccnu.pojo.PublicationStatus223Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.PublicationStatus223Vo;
import com.ccnu.service.PublicationStatus223Service;
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
public class PublicationStatus223ServiceImpl implements PublicationStatus223Service {

    @Autowired
    PublicationStatus223Mapper publicationStatus223Mapper;
    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<PublicationStatus223Vo> getAllDoctorPublicationInfoBy223(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<PublicationStatus223Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<PublicationStatus223Vo> doctorsInfo = publicationStatus223Mapper.getAllDoctorPublicationInfoBy223(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<PublicationStatus223Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addPublicationInfoBy223(PublicationStatus223 publicationStatus223) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(publicationStatus223.getId() == null){
            //新增
            PublicationStatus223Example example = new PublicationStatus223Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(publicationStatus223.getTutorIdentificationCode());
            List<PublicationStatus223> doctorTutorInfos = publicationStatus223Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前博导信息已存在,请勿重复添加");
//            }
            publicationStatus223.setLastTime(sdf.format(new Date()));
            //默认未删除
            publicationStatus223.setIsdelete("0");
            publicationStatus223Mapper.insert(publicationStatus223);
        }
        return true;
    }

    @Override
    public PublicationStatus223 updatePublicationInfoBy223(PublicationStatus223 publicationStatus223) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        publicationStatus223.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(publicationStatus223.getIsdelete())){
            publicationStatus223.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(publicationStatus223.getId() == null || publicationStatus223.getId() < 1){
            if(StringUtils.isBlank(publicationStatus223.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {
                PublicationStatus223Example example = new PublicationStatus223Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(publicationStatus223.getTutorIdentificationCode());
                List<PublicationStatus223> doctorTutorInfos = publicationStatus223Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                publicationStatus223.setId(doctorTutorInfos.get(0).getId());
            }
        }
        publicationStatus223Mapper.updateByPrimaryKey(publicationStatus223);
        return publicationStatus223;
    }

    @Override
    public Boolean deletePublicationInfoBy223(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PublicationStatus223 publicationStatus223 = publicationStatus223Mapper.selectByPrimaryKey(id);
        if(publicationStatus223 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        publicationStatus223.setLastTime(sdf.format(new Date()));
        //1代表删除
        publicationStatus223.setIsdelete("1");
        publicationStatus223Mapper.updateByPrimaryKey(publicationStatus223);
        return true;
    }

    @Override
    public PublicationStatus223 getDoctorPublicationInfoBy223(IdDto idDto) {
        PublicationStatus223Example example=new PublicationStatus223Example();
        PublicationStatus223Example.Criteria criteria=example.createCriteria();
        if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<PublicationStatus223> publicationStatus223List = publicationStatus223Mapper.selectByExample(example);
        if(publicationStatus223List == null || publicationStatus223List.size() < 1){
            return null;
        }else {
            return publicationStatus223List.get(0);
        }
    }
}
