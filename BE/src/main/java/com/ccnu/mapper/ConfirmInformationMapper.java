package com.ccnu.mapper;

import com.ccnu.pojo.ConfirmInformation;
import com.ccnu.pojo.ConfirmInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConfirmInformationMapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(ConfirmInformationExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(ConfirmInformationExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(ConfirmInformation record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(ConfirmInformation record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<ConfirmInformation> selectByExample(ConfirmInformationExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    ConfirmInformation selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") ConfirmInformation record, @Param("example") ConfirmInformationExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") ConfirmInformation record, @Param("example") ConfirmInformationExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(ConfirmInformation record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(ConfirmInformation record);
}