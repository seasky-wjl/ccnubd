package com.ccnu.service;


import com.ccnu.pojo.GuidedDoctoralStudentsAwards215;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.GuidedDoctoralStudentsAwards215Vo;
import com.ccnu.utils.PageUtils;

public interface GuidedDoctoralStudentsAwards215Service {
    PageUtils<GuidedDoctoralStudentsAwards215Vo> getAllDoctorGuidedInfoBy215(DoctorInfosQueryDto dto);

    Boolean addGuidedInfoBy215(GuidedDoctoralStudentsAwards215 doctorTutorInformation111);

    GuidedDoctoralStudentsAwards215 updateGuidedInfoBy215(GuidedDoctoralStudentsAwards215 guidedDoctoralStudentsAwards215);

    Boolean deleteGuidedInfoBy215(Integer id);

    GuidedDoctoralStudentsAwards215 getDoctorGuidedInfoBy215(IdDto idDto);
}
