package com.ccnu.service;

import com.ccnu.pojo.RelyingOnScientificResearchPlatform227;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.RelyingOnScientificResearchPlatform227Vo;
import com.ccnu.utils.PageUtils;

public interface RelyingOnScientificResearchPlatform227Service {
    PageUtils<RelyingOnScientificResearchPlatform227Vo> getScientificResearchPlatformInfoBy227(DoctorInfosQueryDto dto);

    Boolean addScientificResearchPlatformInfoBy227(RelyingOnScientificResearchPlatform227 relyingOnScientificResearchPlatform227);

    RelyingOnScientificResearchPlatform227 updateScientificResearchPlatformInfoBy227(RelyingOnScientificResearchPlatform227 relyingOnScientificResearchPlatform227);

    Boolean deleteScientificResearchPlatformInfoBy227(Integer id);

    RelyingOnScientificResearchPlatform227 getScientificResearch(IdDto idDto);
}
