package com.ccnu.mapper;

import com.ccnu.pojo.DoctorTutorInformation111Xu1;
import com.ccnu.pojo.DoctorTutorInformation111Xu1Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.DoctorTutorInformation111Xu1Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorTutorInformation111Xu1Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(DoctorTutorInformation111Xu1Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(DoctorTutorInformation111Xu1Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(DoctorTutorInformation111Xu1 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(DoctorTutorInformation111Xu1 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<DoctorTutorInformation111Xu1> selectByExample(DoctorTutorInformation111Xu1Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    DoctorTutorInformation111Xu1 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") DoctorTutorInformation111Xu1 record, @Param("example") DoctorTutorInformation111Xu1Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") DoctorTutorInformation111Xu1 record, @Param("example") DoctorTutorInformation111Xu1Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(DoctorTutorInformation111Xu1 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(DoctorTutorInformation111Xu1 record);

    List<DoctorTutorInformation111Xu1Vo> getAllDoctorsInfoBy111xu1(DoctorInfosQueryDto doctorInfosQueryDto);
}