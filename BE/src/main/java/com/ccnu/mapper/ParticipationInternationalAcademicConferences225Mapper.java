package com.ccnu.mapper;

import com.ccnu.pojo.ParticipationInternationalAcademicConferences225;
import com.ccnu.pojo.ParticipationInternationalAcademicConferences225Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.ParticipationInternationalAcademicConferences225Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ParticipationInternationalAcademicConferences225Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(ParticipationInternationalAcademicConferences225Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(ParticipationInternationalAcademicConferences225Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(ParticipationInternationalAcademicConferences225 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(ParticipationInternationalAcademicConferences225 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<ParticipationInternationalAcademicConferences225> selectByExample(ParticipationInternationalAcademicConferences225Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    ParticipationInternationalAcademicConferences225 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") ParticipationInternationalAcademicConferences225 record, @Param("example") ParticipationInternationalAcademicConferences225Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") ParticipationInternationalAcademicConferences225 record, @Param("example") ParticipationInternationalAcademicConferences225Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(ParticipationInternationalAcademicConferences225 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(ParticipationInternationalAcademicConferences225 record);

    List<ParticipationInternationalAcademicConferences225Vo> getAllDoctorConferenceInfoBy225(
            DoctorInfosQueryDto doctorInfosQueryDto);
}