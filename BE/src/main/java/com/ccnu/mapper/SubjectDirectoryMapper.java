package com.ccnu.mapper;

import com.ccnu.pojo.SubjectDirectory;
import com.ccnu.pojo.SubjectDirectoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectDirectoryMapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(SubjectDirectoryExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(SubjectDirectoryExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(SubjectDirectory record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(SubjectDirectory record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<SubjectDirectory> selectByExample(SubjectDirectoryExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    SubjectDirectory selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") SubjectDirectory record, @Param("example") SubjectDirectoryExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") SubjectDirectory record, @Param("example") SubjectDirectoryExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(SubjectDirectory record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(SubjectDirectory record);
}