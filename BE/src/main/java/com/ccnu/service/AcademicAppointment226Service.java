package com.ccnu.service;

import com.ccnu.pojo.AcademicAppointment226;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.AcademicAppointment226Vo;
import com.ccnu.utils.PageUtils;

public interface AcademicAppointment226Service {
    PageUtils<AcademicAppointment226Vo> getAcademicAppointmentInfoBy226(DoctorInfosQueryDto dto);

    Boolean addAcademicAppointmentInfoBy226(AcademicAppointment226 academicAppointment226);

    AcademicAppointment226 updateAcademicAppointmentInfoBy226(AcademicAppointment226 academicAppointment226);

    Boolean deleteAcademicAppointmentInfoBy226(Integer id);

    AcademicAppointment226 getAcademic(IdDto idDto);
}
