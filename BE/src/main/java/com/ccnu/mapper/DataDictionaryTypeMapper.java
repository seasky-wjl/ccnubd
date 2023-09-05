package com.ccnu.mapper;

import com.ccnu.pojo.DataDictionaryType;
import com.ccnu.pojo.DataDictionaryTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataDictionaryTypeMapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(DataDictionaryTypeExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(DataDictionaryTypeExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(DataDictionaryType record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(DataDictionaryType record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<DataDictionaryType> selectByExample(DataDictionaryTypeExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    DataDictionaryType selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") DataDictionaryType record, @Param("example") DataDictionaryTypeExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") DataDictionaryType record, @Param("example") DataDictionaryTypeExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(DataDictionaryType record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(DataDictionaryType record);
}