package com.ccnu.mapper;

import com.ccnu.pojo.GuidedDoctoralStudentsAwards215;
import com.ccnu.pojo.GuidedDoctoralStudentsAwards215Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.GuidedDoctoralStudentsAwards215Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuidedDoctoralStudentsAwards215Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(GuidedDoctoralStudentsAwards215Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(GuidedDoctoralStudentsAwards215Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(GuidedDoctoralStudentsAwards215 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(GuidedDoctoralStudentsAwards215 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<GuidedDoctoralStudentsAwards215> selectByExample(GuidedDoctoralStudentsAwards215Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    GuidedDoctoralStudentsAwards215 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") GuidedDoctoralStudentsAwards215 record, @Param("example") GuidedDoctoralStudentsAwards215Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") GuidedDoctoralStudentsAwards215 record, @Param("example") GuidedDoctoralStudentsAwards215Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(GuidedDoctoralStudentsAwards215 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(GuidedDoctoralStudentsAwards215 record);

    List<GuidedDoctoralStudentsAwards215Vo> getAllDoctorGuidedInfoBy215(DoctorInfosQueryDto doctorInfosQueryDto);
}