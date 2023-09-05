package com.ccnu.service;

import com.ccnu.pojo.DoctorTutorInformation111Xu2;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.DoctorTutorInformation111Xu2Vo;
import com.ccnu.utils.PageUtils;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/23 20:18
 */
public interface DoctorTutorInformation111Xu2Service {


    public PageUtils<DoctorTutorInformation111Xu2Vo> getAllDoctorsInfoBy111xu2(DoctorInfosQueryDto doctorInfosQueryDto);


    Boolean addDoctorsInfoBy111xu2(DoctorTutorInformation111Xu2 doctorTutorInformation111Xu2);


    DoctorTutorInformation111Xu2 updateDoctorsInfoBy111xu2(DoctorTutorInformation111Xu2 doctorTutorInformation111Xu2);


    Boolean deleteDoctorsInfoBy111xu2(Integer id);

    DoctorTutorInformation111Xu2 getDoctorsInfoBy111xu2(DoctorInfosQueryDto dto);
}
