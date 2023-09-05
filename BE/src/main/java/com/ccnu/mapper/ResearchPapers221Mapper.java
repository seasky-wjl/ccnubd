package com.ccnu.mapper;

import com.ccnu.pojo.ResearchPapers221;
import com.ccnu.pojo.ResearchPapers221Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.ResearchPapers221Vo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResearchPapers221Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(ResearchPapers221Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(ResearchPapers221Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(ResearchPapers221 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(ResearchPapers221 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<ResearchPapers221> selectByExample(ResearchPapers221Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    ResearchPapers221 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") ResearchPapers221 record, @Param("example") ResearchPapers221Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") ResearchPapers221 record, @Param("example") ResearchPapers221Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(ResearchPapers221 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(ResearchPapers221 record);

    List<ResearchPapers221Vo> getAllDoctorPapersInfoBy221(DoctorInfosQueryDto doctorInfosQueryDto);
}