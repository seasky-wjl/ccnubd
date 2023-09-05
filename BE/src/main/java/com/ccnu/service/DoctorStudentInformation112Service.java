package com.ccnu.service;

import com.ccnu.pojo.DoctorStudentInformation112;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.DoctorStudentInformation112Vo;
import com.ccnu.utils.PageUtils;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/23 20:22
 */
public interface DoctorStudentInformation112Service {

    public PageUtils<DoctorStudentInformation112Vo> getAllDoctorStudentInfoBy112(DoctorInfosQueryDto doctorInfosQueryDto);


    Boolean addDoctorStudentInfoBy112(DoctorStudentInformation112 doctorStudentInformation112);


    DoctorStudentInformation112 updateDoctorStudentInfoBy112(DoctorStudentInformation112 doctorStudentInformation112);


    Boolean deleteDoctorStudentInfoBy112(Integer id);


    DoctorStudentInformation112 getStudentInfoBy112(DoctorInfosQueryDto dto);
}
