package com.ccnu.service;

import com.ccnu.pojo.DoctorTutorInformation111Xu1;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.DoctorTutorInformation111Xu1Vo;
import com.ccnu.utils.PageUtils;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/22 21:31
 */
public interface DoctorTutorInformation111Xu1Service {


    public PageUtils<DoctorTutorInformation111Xu1Vo> getAllDoctorsInfoBy111xu1(DoctorInfosQueryDto doctorInfosQueryDto);


    Boolean addDoctorsInfoBy111xu1(DoctorTutorInformation111Xu1 doctorTutorInformation111Xu1);


    DoctorTutorInformation111Xu1 updateDoctorsInfoBy111xu1(DoctorTutorInformation111Xu1 doctorTutorInformation111Xu1);


    Boolean deleteDoctorsInfoBy111xu1(Integer id);

    DoctorTutorInformation111Xu1 getDoctorsInfoBy111Xu1(DoctorInfosQueryDto dto);
}
