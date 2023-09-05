package com.ccnu.mapper;

import com.ccnu.pojo.LogTracker;
import com.ccnu.pojo.LogTrackerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogTrackerMapper {
    /**
     *
     * @mbggenerated 2021-10-28
     */
    int countByExample(LogTrackerExample example);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int deleteByExample(LogTrackerExample example);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int insert(LogTracker record);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int insertSelective(LogTracker record);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    List<LogTracker> selectByExample(LogTrackerExample example);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    LogTracker selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int updateByExampleSelective(@Param("record") LogTracker record, @Param("example") LogTrackerExample example);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int updateByExample(@Param("record") LogTracker record, @Param("example") LogTrackerExample example);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int updateByPrimaryKeySelective(LogTracker record);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int updateByPrimaryKey(LogTracker record);
}