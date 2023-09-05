package com.ccnu.mapper;

import com.ccnu.pojo.AwardsForGraduateTeachingAchievements214;
import com.ccnu.pojo.AwardsForGraduateTeachingAchievements214Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.AwardsForGraduateTeachingAchievements214Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AwardsForGraduateTeachingAchievements214Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(AwardsForGraduateTeachingAchievements214Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(AwardsForGraduateTeachingAchievements214Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(AwardsForGraduateTeachingAchievements214 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(AwardsForGraduateTeachingAchievements214 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<AwardsForGraduateTeachingAchievements214> selectByExample(AwardsForGraduateTeachingAchievements214Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    AwardsForGraduateTeachingAchievements214 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") AwardsForGraduateTeachingAchievements214 record, @Param("example") AwardsForGraduateTeachingAchievements214Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") AwardsForGraduateTeachingAchievements214 record, @Param("example") AwardsForGraduateTeachingAchievements214Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(AwardsForGraduateTeachingAchievements214 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(AwardsForGraduateTeachingAchievements214 record);

    List<AwardsForGraduateTeachingAchievements214Vo> getAllAwardsPapersInfoBy214(DoctorInfosQueryDto doctorInfosQueryDto);
}