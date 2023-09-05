package com.ccnu.mapper;

import com.ccnu.pojo.TalentSelectionProject;
import com.ccnu.pojo.TalentSelectionProjectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TalentSelectionProjectMapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(TalentSelectionProjectExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(TalentSelectionProjectExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(TalentSelectionProject record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(TalentSelectionProject record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<TalentSelectionProject> selectByExample(TalentSelectionProjectExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    TalentSelectionProject selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") TalentSelectionProject record, @Param("example") TalentSelectionProjectExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") TalentSelectionProject record, @Param("example") TalentSelectionProjectExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(TalentSelectionProject record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(TalentSelectionProject record);
}