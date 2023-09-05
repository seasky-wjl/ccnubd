package com.ccnu.service.impl;

import com.ccnu.mapper.AwardsForGraduateTeachingAchievements214Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.AwardsForGraduateTeachingAchievements214;
import com.ccnu.pojo.AwardsForGraduateTeachingAchievements214Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.AwardsForGraduateTeachingAchievements214Vo;
import com.ccnu.service.AwardsForGraduateTeachingAchievements214Service;
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
public class AwardsForGraduateTeachingAchievements214ServiceImpl implements AwardsForGraduateTeachingAchievements214Service {

    @Autowired
    AwardsForGraduateTeachingAchievements214Mapper awardsForGraduateTeachingAchievements214Mapper;

    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<AwardsForGraduateTeachingAchievements214Vo> getAllAwardsPapersInfoBy214(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<AwardsForGraduateTeachingAchievements214Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<AwardsForGraduateTeachingAchievements214Vo> doctorsInfo = awardsForGraduateTeachingAchievements214Mapper.getAllAwardsPapersInfoBy214(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<AwardsForGraduateTeachingAchievements214Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addAwardsInfoBy214(AwardsForGraduateTeachingAchievements214 awardsForGraduateTeachingAchievements214) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(awardsForGraduateTeachingAchievements214.getId() == null){
            //新增
            AwardsForGraduateTeachingAchievements214Example example = new AwardsForGraduateTeachingAchievements214Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(awardsForGraduateTeachingAchievements214.getTutorIdentificationCode());
            List<AwardsForGraduateTeachingAchievements214> doctorTutorInfos = awardsForGraduateTeachingAchievements214Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前博导信息已存在,请勿重复添加");
//            }
            awardsForGraduateTeachingAchievements214.setLastTime(sdf.format(new Date()));
            //默认未删除
            awardsForGraduateTeachingAchievements214.setIsdelete("0");
            awardsForGraduateTeachingAchievements214Mapper.insert(awardsForGraduateTeachingAchievements214);
        }
        return true;
    }

    @Override
    public AwardsForGraduateTeachingAchievements214 updateAwardsInfoBy214(AwardsForGraduateTeachingAchievements214 awardsForGraduateTeachingAchievements214) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        awardsForGraduateTeachingAchievements214.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(awardsForGraduateTeachingAchievements214.getIsdelete())){
            awardsForGraduateTeachingAchievements214.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(awardsForGraduateTeachingAchievements214.getId() == null || awardsForGraduateTeachingAchievements214.getId() < 1){
            if(StringUtils.isBlank(awardsForGraduateTeachingAchievements214.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {
                AwardsForGraduateTeachingAchievements214Example example = new AwardsForGraduateTeachingAchievements214Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(awardsForGraduateTeachingAchievements214.getTutorIdentificationCode());
                List<AwardsForGraduateTeachingAchievements214> doctorTutorInfos = awardsForGraduateTeachingAchievements214Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                awardsForGraduateTeachingAchievements214.setId(doctorTutorInfos.get(0).getId());
            }
        }
        awardsForGraduateTeachingAchievements214Mapper.updateByPrimaryKey(awardsForGraduateTeachingAchievements214);
        return awardsForGraduateTeachingAchievements214;
    }

    @Override
    public Boolean deleteAwardsInfoBy214(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        AwardsForGraduateTeachingAchievements214 doctorTutorInformation111 = awardsForGraduateTeachingAchievements214Mapper.selectByPrimaryKey(id);
        if(doctorTutorInformation111 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        doctorTutorInformation111.setLastTime(sdf.format(new Date()));
        //1代表删除
        doctorTutorInformation111.setIsdelete("1");
        awardsForGraduateTeachingAchievements214Mapper.updateByPrimaryKey(doctorTutorInformation111);
        return true;
    }

    @Override
    public AwardsForGraduateTeachingAchievements214 getAwardsPapersInfoBy214(IdDto idDto) {
        AwardsForGraduateTeachingAchievements214Example example = new AwardsForGraduateTeachingAchievements214Example();
        AwardsForGraduateTeachingAchievements214Example.Criteria criteria = example.createCriteria();
        if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<AwardsForGraduateTeachingAchievements214> awardsForGraduateTeachingAchievements214List = awardsForGraduateTeachingAchievements214Mapper.selectByExample(example);
        if(awardsForGraduateTeachingAchievements214List == null || awardsForGraduateTeachingAchievements214List.size() < 1){
            return null;
        }else {
            return awardsForGraduateTeachingAchievements214List.get(0);
        }
    }
}
