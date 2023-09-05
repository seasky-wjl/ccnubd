package com.ccnu.service;

import com.ccnu.pojo.ResearchAwards222;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ResearchAwards222Vo;
import com.ccnu.utils.PageUtils;

public interface ResearchAwards222Service {
    PageUtils<ResearchAwards222Vo> getAllDoctorAwardsInfoBy222(DoctorInfosQueryDto dto);

    Boolean addAwardsInfoBy222(ResearchAwards222 researchAwards222);

    ResearchAwards222 updateAwardsInfoBy222(ResearchAwards222 researchAwards222);

    Boolean deleteAwardsInfoBy222(Integer id);

    ResearchAwards222 getDoctorAwardsInfoBy222(IdDto idDto);
}
