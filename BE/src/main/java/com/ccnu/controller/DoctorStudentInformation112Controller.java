package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.DoctorStudentInformation112;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.DoctorStudentInformation112Vo;
import com.ccnu.service.DoctorStudentInformation112Service;
import com.ccnu.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/23 20:20
 */
@Controller
@Scope("prototype")
public class DoctorStudentInformation112Controller {


   @Autowired
    DoctorStudentInformation112Service doctorStudentInformation112Service;

    @ResponseBody
    @RequestMapping(value = "/getAllDoctorStudentInfoBy112",method = RequestMethod.POST)
    public ResultMessage<PageUtils<DoctorStudentInformation112Vo>> getAllDoctorStudentInfoBy112(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(doctorStudentInformation112Service.getAllDoctorStudentInfoBy112(dto));

    }

    /*
    * 学生单独查询接口
    * */

    @ResponseBody
    @RequestMapping(value = "/getStudentInfoBy112",method = RequestMethod.POST)
    public ResultMessage<DoctorStudentInformation112> getStudentInfoBy112(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(doctorStudentInformation112Service.getStudentInfoBy112(dto));

    }









    @ResponseBody
    @RequestMapping(value = "/addDoctorStudentInfoBy112",method = RequestMethod.POST)
    public ResultMessage<Boolean> addDoctorStudentInfoBy112(@RequestBody DoctorStudentInformation112 doctorStudentInformation112, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(doctorStudentInformation112Service.addDoctorStudentInfoBy112(doctorStudentInformation112));
    }


    @ResponseBody
    @RequestMapping(value = "/updateDoctorStudentInfoBy112",method = RequestMethod.PUT)
    public ResultMessage<DoctorStudentInformation112> updateDoctorStudentInfoBy112(@RequestBody DoctorStudentInformation112 doctorStudentInformation112, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        DoctorStudentInformation112 DoctorStudentInformation1121 = doctorStudentInformation112Service.updateDoctorStudentInfoBy112(doctorStudentInformation112);
        return ResultMessage.success(DoctorStudentInformation1121);
    }


    @ResponseBody
    @RequestMapping(value = "/deleteDoctorStudentInfoBy112",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteDoctorStudentInfoBy112(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(doctorStudentInformation112Service.deleteDoctorStudentInfoBy112(dto.getId()));
    }






}




