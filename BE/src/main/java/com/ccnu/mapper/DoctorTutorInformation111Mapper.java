package com.ccnu.mapper;

import com.ccnu.pojo.DoctorTutorInformation111;
import com.ccnu.pojo.DoctorTutorInformation111Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorTutorInformation111Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(DoctorTutorInformation111Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(DoctorTutorInformation111Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(DoctorTutorInformation111 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(DoctorTutorInformation111 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<DoctorTutorInformation111> selectByExample(DoctorTutorInformation111Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    DoctorTutorInformation111 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") DoctorTutorInformation111 record, @Param("example") DoctorTutorInformation111Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") DoctorTutorInformation111 record, @Param("example") DoctorTutorInformation111Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(DoctorTutorInformation111 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(DoctorTutorInformation111 record);
}