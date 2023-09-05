package com.ccnu.mapper;

import com.ccnu.pojo.SpecializedTechnicalJob;
import com.ccnu.pojo.SpecializedTechnicalJobExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecializedTechnicalJobMapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(SpecializedTechnicalJobExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(SpecializedTechnicalJobExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(SpecializedTechnicalJob record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(SpecializedTechnicalJob record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<SpecializedTechnicalJob> selectByExample(SpecializedTechnicalJobExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    SpecializedTechnicalJob selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") SpecializedTechnicalJob record, @Param("example") SpecializedTechnicalJobExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") SpecializedTechnicalJob record, @Param("example") SpecializedTechnicalJobExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(SpecializedTechnicalJob record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(SpecializedTechnicalJob record);
}