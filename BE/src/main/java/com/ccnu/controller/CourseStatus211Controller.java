package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.CourseStatus211;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.CourseStatus211Vo;
import com.ccnu.service.CourseStatus211Service;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.JWTUtils;
import com.ccnu.utils.PageUtils;
import com.ccnu.utils.ResultMessage;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/23 20:24
 */
@Controller
@Scope("prototype")
public class CourseStatus211Controller {

    @Autowired
    CourseStatus211Service courseStatus211Service;

    @ResponseBody
    @RequestMapping(value = "/getAllDoctorCourseInfoBy211",method = RequestMethod.POST)
    public ResultMessage<PageUtils<CourseStatus211Vo>> getAllDoctorCourseInfoBy211(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(courseStatus211Service.getAllDoctorCourseInfoBy211(dto));

    }

    @ResponseBody
    @RequestMapping(value = "/getDoctorCourseInfoBy211",method = RequestMethod.POST)
    public ResultMessage<CourseStatus211> getDoctorCourseInfoBy211(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(courseStatus211Service.getDoctorCourseInfoBy211(idDto));
    }


    @ResponseBody
    @RequestMapping(value = "/addCourseInfoBy211",method = RequestMethod.POST)
    public ResultMessage<Boolean> addCourseInfoBy211(@RequestBody CourseStatus211 CourseStatus211, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(courseStatus211Service.addCourseInfoBy211(CourseStatus211));
    }


    @ResponseBody
    @RequestMapping(value = "/updateCourseInfoBy211",method = RequestMethod.PUT)
    public ResultMessage<CourseStatus211> updateCourseInfoBy211(@RequestBody CourseStatus211 CourseStatus211, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        CourseStatus211 CourseStatus2111 = courseStatus211Service.updateCourseInfoBy211(CourseStatus211);
        return ResultMessage.success(CourseStatus2111);
    }


    @ResponseBody
    @RequestMapping(value = "/deleteCourseInfoBy211",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteCourseInfoBy211(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(courseStatus211Service.deleteCourseInfoBy211(dto.getId()));
    }




}
