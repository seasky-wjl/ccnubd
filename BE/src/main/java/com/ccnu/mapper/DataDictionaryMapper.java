package com.ccnu.mapper;

import com.ccnu.pojo.DataDictionary;
import com.ccnu.pojo.DataDictionaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataDictionaryMapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(DataDictionaryExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(DataDictionaryExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(DataDictionary record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(DataDictionary record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<DataDictionary> selectByExample(DataDictionaryExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    DataDictionary selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") DataDictionary record, @Param("example") DataDictionaryExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") DataDictionary record, @Param("example") DataDictionaryExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(DataDictionary record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(DataDictionary record);
}