package com.ccnu.mapper;

import com.ccnu.pojo.GraduateEducationTeachingReformResearchProject212;
import com.ccnu.pojo.GraduateEducationTeachingReformResearchProject212Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.GraduateEducationTeachingReformResearchProject212Vo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GraduateEducationTeachingReformResearchProject212Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(GraduateEducationTeachingReformResearchProject212Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(GraduateEducationTeachingReformResearchProject212Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(GraduateEducationTeachingReformResearchProject212 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(GraduateEducationTeachingReformResearchProject212 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<GraduateEducationTeachingReformResearchProject212> selectByExample(GraduateEducationTeachingReformResearchProject212Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    GraduateEducationTeachingReformResearchProject212 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") GraduateEducationTeachingReformResearchProject212 record, @Param("example") GraduateEducationTeachingReformResearchProject212Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") GraduateEducationTeachingReformResearchProject212 record, @Param("example") GraduateEducationTeachingReformResearchProject212Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(GraduateEducationTeachingReformResearchProject212 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(GraduateEducationTeachingReformResearchProject212 record);

    List<GraduateEducationTeachingReformResearchProject212Vo> getAllDoctoGraduateEducationInfoBy212(
            DoctorInfosQueryDto doctorInfosQueryDto);
}