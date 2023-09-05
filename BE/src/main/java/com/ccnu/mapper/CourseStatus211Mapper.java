package com.ccnu.mapper;

import com.ccnu.pojo.CourseStatus211;
import com.ccnu.pojo.CourseStatus211Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.CourseStatus211Vo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseStatus211Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(CourseStatus211Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(CourseStatus211Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(CourseStatus211 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(CourseStatus211 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<CourseStatus211> selectByExample(CourseStatus211Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    CourseStatus211 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") CourseStatus211 record, @Param("example") CourseStatus211Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") CourseStatus211 record, @Param("example") CourseStatus211Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(CourseStatus211 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(CourseStatus211 record);

    List<CourseStatus211Vo> getAllDoctorCourseInfoBy211(DoctorInfosQueryDto doctorInfosQueryDto);
}