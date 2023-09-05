package com.ccnu.service.impl;

import com.ccnu.mapper.DoctorTutorInformation111Xu2Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.DoctorTutorInformation111Xu2;
import com.ccnu.pojo.DoctorTutorInformation111Xu2Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.DoctorTutorInformation111Xu2Vo;
import com.ccnu.service.DoctorTutorInformation111Xu2Service;
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
 * @date 2020/12/23 20:19
 */
@Service
public class DoctorTutorInformation111Xu2ServiceImpl implements DoctorTutorInformation111Xu2Service {

    @Autowired
    DoctorTutorInformation111Xu2Mapper doctorTutorInformation111Xu2Mapper;
    @Autowired
    UserAccountMapper userAccountMapper;


    @Override
    public PageUtils<DoctorTutorInformation111Xu2Vo> getAllDoctorsInfoBy111xu2(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<DoctorTutorInformation111Xu2Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<DoctorTutorInformation111Xu2Vo> doctorsInfo = doctorTutorInformation111Xu2Mapper.getAllDoctorsInfoBy111xu2(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<DoctorTutorInformation111Xu2Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addDoctorsInfoBy111xu2(DoctorTutorInformation111Xu2 doctorTutorInformation111Xu2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(doctorTutorInformation111Xu2.getId() == null){
            //新增
            DoctorTutorInformation111Xu2Example example = new DoctorTutorInformation111Xu2Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(doctorTutorInformation111Xu2.getTutorIdentificationCode());

            List<DoctorTutorInformation111Xu2> doctorTutorInfos = doctorTutorInformation111Xu2Mapper.selectByExample(example);
            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
                throw new AppException(ErrorCode.ERR_EXISTED,"当前信息已存在,请勿重复添加");
            }
            doctorTutorInformation111Xu2.setLastTime(sdf.format(new Date()));

            //默认未删除
            doctorTutorInformation111Xu2.setIsdelete("0");
            doctorTutorInformation111Xu2Mapper.insert(doctorTutorInformation111Xu2);
        }
        return true;
    }

    @Override
    public DoctorTutorInformation111Xu2 updateDoctorsInfoBy111xu2(DoctorTutorInformation111Xu2 doctorTutorInformation111Xu2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        doctorTutorInformation111Xu2.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(doctorTutorInformation111Xu2.getIsdelete())){
            doctorTutorInformation111Xu2.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(doctorTutorInformation111Xu2.getId() == null || doctorTutorInformation111Xu2.getId() < 1){
            if(StringUtils.isBlank(doctorTutorInformation111Xu2.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {

                DoctorTutorInformation111Xu2Example example = new DoctorTutorInformation111Xu2Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(doctorTutorInformation111Xu2.getTutorIdentificationCode());
                List<DoctorTutorInformation111Xu2> doctorTutorInfos = doctorTutorInformation111Xu2Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
               doctorTutorInformation111Xu2.setId(doctorTutorInfos.get(0).getId());
            }
        }
        doctorTutorInformation111Xu2Mapper.updateByPrimaryKey(doctorTutorInformation111Xu2);
        return doctorTutorInformation111Xu2;
    }

    @Override
    public Boolean deleteDoctorsInfoBy111xu2(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DoctorTutorInformation111Xu2 DoctorTutorInformation111Xu2 = doctorTutorInformation111Xu2Mapper.selectByPrimaryKey(id);
        if(DoctorTutorInformation111Xu2 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        DoctorTutorInformation111Xu2.setLastTime(sdf.format(new Date()));
        //1代表删除
        DoctorTutorInformation111Xu2.setIsdelete("1");
        doctorTutorInformation111Xu2Mapper.updateByPrimaryKey(DoctorTutorInformation111Xu2);
        return true;
    }

    @Override
    public DoctorTutorInformation111Xu2 getDoctorsInfoBy111xu2(DoctorInfosQueryDto dto) {
        DoctorTutorInformation111Xu2Example example = new DoctorTutorInformation111Xu2Example();
        DoctorTutorInformation111Xu2Example.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(dto.getTutorIdentificationCode())){
            criteria.andTutorIdentificationCodeEqualTo(dto.getTutorIdentificationCode());
        }
        criteria.andIsdeleteEqualTo("0");
        List<DoctorTutorInformation111Xu2> xu2List = doctorTutorInformation111Xu2Mapper.selectByExample(example);
        if(xu2List == null || xu2List.size() < 1){
            return null;
        }else {
            return xu2List.get(0);
        }
    }
}
