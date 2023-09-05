package com.ccnu.mapper;

import com.ccnu.pojo.RelyingOnScientificResearchPlatform227;
import com.ccnu.pojo.RelyingOnScientificResearchPlatform227Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.RelyingOnScientificResearchPlatform227Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RelyingOnScientificResearchPlatform227Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(RelyingOnScientificResearchPlatform227Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(RelyingOnScientificResearchPlatform227Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(RelyingOnScientificResearchPlatform227 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(RelyingOnScientificResearchPlatform227 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<RelyingOnScientificResearchPlatform227> selectByExample(RelyingOnScientificResearchPlatform227Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    RelyingOnScientificResearchPlatform227 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") RelyingOnScientificResearchPlatform227 record, @Param("example") RelyingOnScientificResearchPlatform227Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") RelyingOnScientificResearchPlatform227 record, @Param("example") RelyingOnScientificResearchPlatform227Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(RelyingOnScientificResearchPlatform227 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(RelyingOnScientificResearchPlatform227 record);

    List<RelyingOnScientificResearchPlatform227Vo> getScientificResearchPlatformInfoBy227(DoctorInfosQueryDto doctorInfosQueryDto);
}