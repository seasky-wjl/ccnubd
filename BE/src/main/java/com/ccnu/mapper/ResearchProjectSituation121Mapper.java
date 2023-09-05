package com.ccnu.mapper;

import com.ccnu.pojo.ResearchProjectSituation121;
import com.ccnu.pojo.ResearchProjectSituation121Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.ResearchProjectSituation121Vo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResearchProjectSituation121Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(ResearchProjectSituation121Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(ResearchProjectSituation121Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(ResearchProjectSituation121 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(ResearchProjectSituation121 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<ResearchProjectSituation121> selectByExample(ResearchProjectSituation121Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    ResearchProjectSituation121 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") ResearchProjectSituation121 record, @Param("example") ResearchProjectSituation121Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") ResearchProjectSituation121 record, @Param("example") ResearchProjectSituation121Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(ResearchProjectSituation121 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(ResearchProjectSituation121 record);

    List<ResearchProjectSituation121Vo> getAllResearchProjectInfoBy121(DoctorInfosQueryDto doctorInfosQueryDto);
}