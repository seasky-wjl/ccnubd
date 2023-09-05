package com.ccnu.service.impl;

import com.ccnu.mapper.GuidedDoctoralStudentsAwards215Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.GuidedDoctoralStudentsAwards215;
import com.ccnu.pojo.GuidedDoctoralStudentsAwards215Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.GuidedDoctoralStudentsAwards215Vo;
import com.ccnu.service.GuidedDoctoralStudentsAwards215Service;
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
public class GuidedDoctoralStudentsAwards215ServiceImpl implements GuidedDoctoralStudentsAwards215Service {

    @Autowired
    GuidedDoctoralStudentsAwards215Mapper guidedDoctoralStudentsAwards215Mapper;

    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<GuidedDoctoralStudentsAwards215Vo> getAllDoctorGuidedInfoBy215(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<GuidedDoctoralStudentsAwards215Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<GuidedDoctoralStudentsAwards215Vo> doctorsInfo = guidedDoctoralStudentsAwards215Mapper.getAllDoctorGuidedInfoBy215(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<GuidedDoctoralStudentsAwards215Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addGuidedInfoBy215(GuidedDoctoralStudentsAwards215 doctorTutorInformation111) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(doctorTutorInformation111.getId() == null){
            //新增
            GuidedDoctoralStudentsAwards215Example example = new GuidedDoctoralStudentsAwards215Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(doctorTutorInformation111.getTutorIdentificationCode());
            List<GuidedDoctoralStudentsAwards215> doctorTutorInfos = guidedDoctoralStudentsAwards215Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前博导信息已存在,请勿重复添加");
//            }
            doctorTutorInformation111.setLastTime(sdf.format(new Date()));
            //默认未删除
            doctorTutorInformation111.setIsdelete("0");
            guidedDoctoralStudentsAwards215Mapper.insert(doctorTutorInformation111);
        }
        return true;
    }

    @Override
    public GuidedDoctoralStudentsAwards215 updateGuidedInfoBy215(GuidedDoctoralStudentsAwards215 guidedDoctoralStudentsAwards215) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        guidedDoctoralStudentsAwards215.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(guidedDoctoralStudentsAwards215.getIsdelete())){
            guidedDoctoralStudentsAwards215.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(guidedDoctoralStudentsAwards215.getId() == null || guidedDoctoralStudentsAwards215.getId() < 1){
            if(StringUtils.isBlank(guidedDoctoralStudentsAwards215.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {
                GuidedDoctoralStudentsAwards215Example example = new GuidedDoctoralStudentsAwards215Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(guidedDoctoralStudentsAwards215.getTutorIdentificationCode());
                List<GuidedDoctoralStudentsAwards215> doctorTutorInfos = guidedDoctoralStudentsAwards215Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                guidedDoctoralStudentsAwards215.setId(doctorTutorInfos.get(0).getId());
            }
        }
        guidedDoctoralStudentsAwards215Mapper.updateByPrimaryKey(guidedDoctoralStudentsAwards215);
        return guidedDoctoralStudentsAwards215;
    }

    @Override
    public Boolean deleteGuidedInfoBy215(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        GuidedDoctoralStudentsAwards215 doctorTutorInformation111 = guidedDoctoralStudentsAwards215Mapper.selectByPrimaryKey(id);
        if(doctorTutorInformation111 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        doctorTutorInformation111.setLastTime(sdf.format(new Date()));
        //1代表删除
        doctorTutorInformation111.setIsdelete("1");
        guidedDoctoralStudentsAwards215Mapper.updateByPrimaryKey(doctorTutorInformation111);
        return true;
    }

    @Override
    public GuidedDoctoralStudentsAwards215 getDoctorGuidedInfoBy215(IdDto idDto) {
        GuidedDoctoralStudentsAwards215Example example = new GuidedDoctoralStudentsAwards215Example();
        GuidedDoctoralStudentsAwards215Example.Criteria criteria = example.createCriteria();
        if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<GuidedDoctoralStudentsAwards215> guidedDoctoralStudentsAwards215List = guidedDoctoralStudentsAwards215Mapper.selectByExample(example);
        if(guidedDoctoralStudentsAwards215List == null || guidedDoctoralStudentsAwards215List.size() < 1){
            return null;
        }else {
            return guidedDoctoralStudentsAwards215List.get(0);
        }
    }
}
