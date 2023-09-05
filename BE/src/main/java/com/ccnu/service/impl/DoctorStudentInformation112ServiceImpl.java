package com.ccnu.service.impl;

import com.ccnu.mapper.DoctorStudentInformation112Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.DoctorStudentInformation112;
import com.ccnu.pojo.DoctorStudentInformation112Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.DoctorStudentInformation112Vo;
import com.ccnu.service.DoctorStudentInformation112Service;
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

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/23 20:22
 */
@Service
public class DoctorStudentInformation112ServiceImpl implements DoctorStudentInformation112Service {

    @Autowired
    DoctorStudentInformation112Mapper doctorStudentInformation112Mapper;
    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<DoctorStudentInformation112Vo> getAllDoctorStudentInfoBy112(
            DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<DoctorStudentInformation112Vo> page = PageHelper
                .startPage(doctorInfosQueryDto.getPageNo(), doctorInfosQueryDto.getPageSize());
        List<DoctorStudentInformation112Vo> doctorsInfo = doctorStudentInformation112Mapper.getAllDoctorStudentInfoBy112(doctorInfosQueryDto);
        if (doctorsInfo == null || doctorsInfo.size() < 1) {
            return null;
        }
        PageUtils<DoctorStudentInformation112Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addDoctorStudentInfoBy112(DoctorStudentInformation112 doctorStudentInformation112) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (doctorStudentInformation112.getId() == null) {
            //新增
            DoctorStudentInformation112Example example = new DoctorStudentInformation112Example();
            example.createCriteria()
                    .andTutorIdentificationCodeEqualTo(doctorStudentInformation112.getTutorIdentificationCode());

            List<DoctorStudentInformation112> doctorTutorInfos = doctorStudentInformation112Mapper
                    .selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前信息已存在,请勿重复添加");
//            }
            doctorStudentInformation112.setLastTime(sdf.format(new Date()));

            //默认未删除
            doctorStudentInformation112.setIsdelete("0");
            doctorStudentInformation112Mapper.insert(doctorStudentInformation112);
        }
        return true;
    }

    @Override
    public DoctorStudentInformation112 updateDoctorStudentInfoBy112(
            DoctorStudentInformation112 doctorStudentInformation112) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        doctorStudentInformation112.setLastTime(sdf.format(new Date()));
        //默认未删除
        if (StringUtils.isBlank(doctorStudentInformation112.getIsdelete())) {
            doctorStudentInformation112.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if (doctorStudentInformation112.getId() == null || doctorStudentInformation112.getId() < 1) {
            if (StringUtils.isBlank(doctorStudentInformation112.getTutorIdentificationCode())) {
                throw new AppException(ErrorCode.ERR_PARAM);
            } else {

                DoctorStudentInformation112Example example = new DoctorStudentInformation112Example();
                example.createCriteria()
                        .andTutorIdentificationCodeEqualTo(doctorStudentInformation112.getTutorIdentificationCode());
                List<DoctorStudentInformation112> doctorTutorInfos = doctorStudentInformation112Mapper
                        .selectByExample(example);
                if (doctorTutorInfos == null || doctorTutorInfos.size() < 1) {
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                doctorStudentInformation112.setId(doctorTutorInfos.get(0).getId());
            }
        }
        doctorStudentInformation112Mapper.updateByPrimaryKey(doctorStudentInformation112);
        return doctorStudentInformation112;

    }

    @Override
    public Boolean deleteDoctorStudentInfoBy112(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DoctorStudentInformation112 DoctorStudentInformation112 = doctorStudentInformation112Mapper
                .selectByPrimaryKey(id);
        if (DoctorStudentInformation112 == null) {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        DoctorStudentInformation112.setLastTime(sdf.format(new Date()));
        //1代表删除
        DoctorStudentInformation112.setIsdelete("1");
        doctorStudentInformation112Mapper.updateByPrimaryKey(DoctorStudentInformation112);
        return true;
    }

    /*
    查询单个学生
    * */
    @Override
    public DoctorStudentInformation112 getStudentInfoBy112(DoctorInfosQueryDto dto) {

        DoctorStudentInformation112Example example = new DoctorStudentInformation112Example();
        DoctorStudentInformation112Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(dto.getTutorIdentificationCode())) {

            criteria.andDoctoralStudentIdentificationCodeEqualTo(dto.getTutorIdentificationCode());

        }
        criteria.andIsdeleteEqualTo("0");
        List<DoctorStudentInformation112> doctorsInfoList = doctorStudentInformation112Mapper.selectByExample(example);
        if(doctorsInfoList == null || doctorsInfoList.size() < 1){
            return null;
        }else {
            return doctorsInfoList.get(0);
        }
    }
}
