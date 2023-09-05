package com.ccnu.mapper;

import com.ccnu.pojo.ResearchAwards222;
import com.ccnu.pojo.ResearchAwards222Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.ResearchAwards222Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResearchAwards222Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(ResearchAwards222Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(ResearchAwards222Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(ResearchAwards222 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(ResearchAwards222 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<ResearchAwards222> selectByExample(ResearchAwards222Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    ResearchAwards222 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") ResearchAwards222 record, @Param("example") ResearchAwards222Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") ResearchAwards222 record, @Param("example") ResearchAwards222Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(ResearchAwards222 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(ResearchAwards222 record);

    List<ResearchAwards222Vo> getAllDoctorAwardsInfoBy222(DoctorInfosQueryDto doctorInfosQueryDto);
}