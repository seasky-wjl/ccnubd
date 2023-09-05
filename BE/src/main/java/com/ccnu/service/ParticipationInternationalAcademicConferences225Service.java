package com.ccnu.service;

import com.ccnu.pojo.ParticipationInternationalAcademicConferences225;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ParticipationInternationalAcademicConferences225Vo;
import com.ccnu.utils.PageUtils;

public interface ParticipationInternationalAcademicConferences225Service {
    PageUtils<ParticipationInternationalAcademicConferences225Vo> getAllDoctorConferenceInfoBy225(DoctorInfosQueryDto dto);

    Boolean addConferenceInfoBy225(ParticipationInternationalAcademicConferences225 participationInternationalAcademicConferences225);

    ParticipationInternationalAcademicConferences225 updateConferenceInfoBy225(ParticipationInternationalAcademicConferences225 participationInternationalAcademicConferences225);

    Boolean deleteConferenceInfoBy225(Integer id);

    ParticipationInternationalAcademicConferences225 getDoctorConferenceInfoBy225(IdDto idDto);
}
