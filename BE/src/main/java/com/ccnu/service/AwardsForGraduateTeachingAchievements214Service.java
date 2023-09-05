package com.ccnu.service;

import com.ccnu.pojo.AwardsForGraduateTeachingAchievements214;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.AwardsForGraduateTeachingAchievements214Vo;
import com.ccnu.utils.PageUtils;

public interface AwardsForGraduateTeachingAchievements214Service {

    PageUtils<AwardsForGraduateTeachingAchievements214Vo> getAllAwardsPapersInfoBy214(DoctorInfosQueryDto dto);

    Boolean addAwardsInfoBy214(AwardsForGraduateTeachingAchievements214 awardsForGraduateTeachingAchievements214);

    AwardsForGraduateTeachingAchievements214 updateAwardsInfoBy214(AwardsForGraduateTeachingAchievements214 awardsForGraduateTeachingAchievements214);

    Boolean deleteAwardsInfoBy214(Integer id);

    AwardsForGraduateTeachingAchievements214 getAwardsPapersInfoBy214(IdDto idDto);
}
