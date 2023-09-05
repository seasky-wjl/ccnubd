package com.ccnu.mapper;

import com.ccnu.pojo.AcademicAppointment226;
import com.ccnu.pojo.AcademicAppointment226Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.AcademicAppointment226Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AcademicAppointment226Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(AcademicAppointment226Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(AcademicAppointment226Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(AcademicAppointment226 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(AcademicAppointment226 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<AcademicAppointment226> selectByExample(AcademicAppointment226Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    AcademicAppointment226 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") AcademicAppointment226 record, @Param("example") AcademicAppointment226Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") AcademicAppointment226 record, @Param("example") AcademicAppointment226Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(AcademicAppointment226 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(AcademicAppointment226 record);

    List<AcademicAppointment226Vo> getAcademicAppointmentInfoBy226(DoctorInfosQueryDto doctorInfosQueryDto);
}