package com.ccnu.mapper;

import com.ccnu.pojo.PatentOrCopyrightAuthorizationStatus224;
import com.ccnu.pojo.PatentOrCopyrightAuthorizationStatus224Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.PatentOrCopyrightAuthorizationStatus224Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatentOrCopyrightAuthorizationStatus224Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(PatentOrCopyrightAuthorizationStatus224Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(PatentOrCopyrightAuthorizationStatus224Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(PatentOrCopyrightAuthorizationStatus224 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(PatentOrCopyrightAuthorizationStatus224 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<PatentOrCopyrightAuthorizationStatus224> selectByExample(PatentOrCopyrightAuthorizationStatus224Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    PatentOrCopyrightAuthorizationStatus224 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") PatentOrCopyrightAuthorizationStatus224 record, @Param("example") PatentOrCopyrightAuthorizationStatus224Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") PatentOrCopyrightAuthorizationStatus224 record, @Param("example") PatentOrCopyrightAuthorizationStatus224Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(PatentOrCopyrightAuthorizationStatus224 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(PatentOrCopyrightAuthorizationStatus224 record);

    List<PatentOrCopyrightAuthorizationStatus224Vo> getAllDoctorPatentInfoBy224(DoctorInfosQueryDto doctorInfosQueryDto);
}