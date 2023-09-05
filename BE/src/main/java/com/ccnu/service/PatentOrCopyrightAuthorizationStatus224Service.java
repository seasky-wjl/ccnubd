package com.ccnu.service;

import com.ccnu.pojo.PatentOrCopyrightAuthorizationStatus224;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.PatentOrCopyrightAuthorizationStatus224Vo;
import com.ccnu.utils.PageUtils;

public interface PatentOrCopyrightAuthorizationStatus224Service {
    PageUtils<PatentOrCopyrightAuthorizationStatus224Vo> getAllDoctorPatentInfoBy224(DoctorInfosQueryDto dto);

    Boolean addPatentInfoBy224(PatentOrCopyrightAuthorizationStatus224 patentOrCopyrightAuthorizationStatus224);

    PatentOrCopyrightAuthorizationStatus224 updatePatentInfoBy224(PatentOrCopyrightAuthorizationStatus224 patentOrCopyrightAuthorizationStatus224);

    Boolean deletePatentInfoBy224(Integer id);

    PatentOrCopyrightAuthorizationStatus224 getDoctorPatentInfoBy224(IdDto idDto);
}
