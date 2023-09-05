package com.ccnu.mapper;

import com.ccnu.pojo.DoctorStudentInformation112;
import com.ccnu.pojo.DoctorStudentInformation112Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.DoctorStudentInformation112Vo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorStudentInformation112Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(DoctorStudentInformation112Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(DoctorStudentInformation112Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(DoctorStudentInformation112 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(DoctorStudentInformation112 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<DoctorStudentInformation112> selectByExample(DoctorStudentInformation112Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    DoctorStudentInformation112 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") DoctorStudentInformation112 record, @Param("example") DoctorStudentInformation112Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") DoctorStudentInformation112 record, @Param("example") DoctorStudentInformation112Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(DoctorStudentInformation112 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(DoctorStudentInformation112 record);

    List<DoctorStudentInformation112Vo> getAllDoctorStudentInfoBy112(DoctorInfosQueryDto doctorInfosQueryDto);
}