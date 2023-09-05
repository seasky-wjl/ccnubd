package com.ccnu.service;

import com.ccnu.pojo.CourseStatus211;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.CourseStatus211Vo;
import com.ccnu.utils.PageUtils;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/23 20:24
 */
public interface CourseStatus211Service {


    public PageUtils<CourseStatus211Vo> getAllDoctorCourseInfoBy211(DoctorInfosQueryDto doctorInfosQueryDto);


    Boolean addCourseInfoBy211(CourseStatus211 courseStatus211);


    CourseStatus211 updateCourseInfoBy211(CourseStatus211 courseStatus211);


    Boolean deleteCourseInfoBy211(Integer id);

    CourseStatus211 getDoctorCourseInfoBy211(IdDto idDto);
}
