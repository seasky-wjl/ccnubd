package com.ccnu.service.impl;

import com.ccnu.mapper.DoctorTutorInformation111Xu1Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.DoctorTutorInformation111Xu1;
import com.ccnu.pojo.DoctorTutorInformation111Xu1Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.DoctorTutorInformation111Xu1Vo;
import com.ccnu.service.DoctorTutorInformation111Xu1Service;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.PageUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/22 21:31
 */
@Service
public class DoctorTutorInformation111Xu1ServiceImpl implements DoctorTutorInformation111Xu1Service {

    @Autowired
    DoctorTutorInformation111Xu1Mapper doctorTutorInformation111Xu1Mapper;
    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<DoctorTutorInformation111Xu1Vo> getAllDoctorsInfoBy111xu1(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<DoctorTutorInformation111Xu1Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<DoctorTutorInformation111Xu1Vo> doctorsInfo = doctorTutorInformation111Xu1Mapper.getAllDoctorsInfoBy111xu1(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<DoctorTutorInformation111Xu1Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(),doctorsInfo);
        return pageUtils;
    }



    @Override
    public Boolean addDoctorsInfoBy111xu1(DoctorTutorInformation111Xu1 doctorTutorInformation111Xu1) {



        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(doctorTutorInformation111Xu1.getId() == null){
            //新增
            DoctorTutorInformation111Xu1Example example = new DoctorTutorInformation111Xu1Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(doctorTutorInformation111Xu1.getTutorIdentificationCode());

            List<DoctorTutorInformation111Xu1> doctorTutorInfos = doctorTutorInformation111Xu1Mapper.selectByExample(example);
            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
                throw new AppException(ErrorCode.ERR_EXISTED,"当前信息已存在,请勿重复添加");
            }
            doctorTutorInformation111Xu1.setLastTime(sdf.format(new Date()));

            //默认未删除
            doctorTutorInformation111Xu1.setIsdelete("0");
            doctorTutorInformation111Xu1Mapper.insert(doctorTutorInformation111Xu1);
        }
        return true;



    }



    @Override
    public DoctorTutorInformation111Xu1 updateDoctorsInfoBy111xu1(DoctorTutorInformation111Xu1 doctorTutorInformation111Xu1) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        doctorTutorInformation111Xu1.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(doctorTutorInformation111Xu1.getIsdelete())){
            doctorTutorInformation111Xu1.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(doctorTutorInformation111Xu1.getId() == null || doctorTutorInformation111Xu1.getId() < 1){
            if(StringUtils.isBlank(doctorTutorInformation111Xu1.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {

                DoctorTutorInformation111Xu1Example example = new DoctorTutorInformation111Xu1Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(doctorTutorInformation111Xu1.getTutorIdentificationCode());
                List<DoctorTutorInformation111Xu1> doctorTutorInfos = doctorTutorInformation111Xu1Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                doctorTutorInformation111Xu1.setId(doctorTutorInfos.get(0).getId());
            }
        }
        doctorTutorInformation111Xu1Mapper.updateByPrimaryKey(doctorTutorInformation111Xu1);
        return doctorTutorInformation111Xu1;
    }


    @Override
    public Boolean deleteDoctorsInfoBy111xu1(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DoctorTutorInformation111Xu1 doctorTutorInformation111Xu1 = doctorTutorInformation111Xu1Mapper.selectByPrimaryKey(id);
        if(doctorTutorInformation111Xu1 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        doctorTutorInformation111Xu1.setLastTime(sdf.format(new Date()));
        //1代表删除
        doctorTutorInformation111Xu1.setIsdelete("1");
        doctorTutorInformation111Xu1Mapper.updateByPrimaryKey(doctorTutorInformation111Xu1);
//        doctorTutorInformation111Xu1Mapper.deleteByPrimaryKey(id);
        return true;
    }

    @Override
    public DoctorTutorInformation111Xu1 getDoctorsInfoBy111Xu1(DoctorInfosQueryDto dto) {
        DoctorTutorInformation111Xu1Example example = new DoctorTutorInformation111Xu1Example();
        DoctorTutorInformation111Xu1Example.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(dto.getTutorIdentificationCode())){
            criteria.andTutorIdentificationCodeEqualTo(dto.getTutorIdentificationCode());
        }
        criteria.andIsdeleteEqualTo("0");
        List<DoctorTutorInformation111Xu1> xu1List = doctorTutorInformation111Xu1Mapper.selectByExample(example);
        if(xu1List == null || xu1List.size() < 1){
            return null;
        }else {
            return xu1List.get(0);
        }
    }

}



