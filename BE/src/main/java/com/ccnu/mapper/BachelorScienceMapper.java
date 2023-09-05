package com.ccnu.mapper;

import com.ccnu.pojo.BachelorScience;
import com.ccnu.pojo.BachelorScienceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BachelorScienceMapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(BachelorScienceExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(BachelorScienceExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(BachelorScience record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(BachelorScience record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<BachelorScience> selectByExample(BachelorScienceExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    BachelorScience selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") BachelorScience record, @Param("example") BachelorScienceExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") BachelorScience record, @Param("example") BachelorScienceExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(BachelorScience record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(BachelorScience record);
}