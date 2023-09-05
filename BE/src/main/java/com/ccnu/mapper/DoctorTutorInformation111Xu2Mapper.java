package com.ccnu.mapper;

import com.ccnu.pojo.DoctorTutorInformation111Xu2;
import com.ccnu.pojo.DoctorTutorInformation111Xu2Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.DoctorTutorInformation111Xu2Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorTutorInformation111Xu2Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(DoctorTutorInformation111Xu2Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(DoctorTutorInformation111Xu2Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(DoctorTutorInformation111Xu2 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(DoctorTutorInformation111Xu2 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<DoctorTutorInformation111Xu2> selectByExample(DoctorTutorInformation111Xu2Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    DoctorTutorInformation111Xu2 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") DoctorTutorInformation111Xu2 record, @Param("example") DoctorTutorInformation111Xu2Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") DoctorTutorInformation111Xu2 record, @Param("example") DoctorTutorInformation111Xu2Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(DoctorTutorInformation111Xu2 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(DoctorTutorInformation111Xu2 record);

    List<DoctorTutorInformation111Xu2Vo> getAllDoctorsInfoBy111xu2(DoctorInfosQueryDto doctorInfosQueryDto);
}