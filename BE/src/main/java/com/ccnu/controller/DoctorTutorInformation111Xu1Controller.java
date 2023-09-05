package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.DoctorTutorInformation111Xu1;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.DoctorTutorInformation111Xu1Vo;
import com.ccnu.service.DoctorTutorInformation111Xu1Service;
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
 * @date 2020/12/22 21:30
 */
@Controller
@Scope("prototype")
public class DoctorTutorInformation111Xu1Controller {

    @Autowired
    DoctorTutorInformation111Xu1Service doctorTutorInformation111Xu1Service;

    @ResponseBody
    @RequestMapping(value = "/getAllDoctorsInfoBy111Xu1",method = RequestMethod.POST)
    public ResultMessage<PageUtils<DoctorTutorInformation111Xu1Vo>> getAllDoctorsInfoBy111Xu1(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(doctorTutorInformation111Xu1Service.getAllDoctorsInfoBy111xu1(dto));

    }

    @ResponseBody
    @RequestMapping(value = "/getDoctorsInfoBy111Xu1",method = RequestMethod.POST)
    public ResultMessage<DoctorTutorInformation111Xu1> getDoctorsInfoBy111Xu1(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(doctorTutorInformation111Xu1Service.getDoctorsInfoBy111Xu1(dto));
    }

    @ResponseBody
    @RequestMapping(value = "/addDoctorsInfoBy111xu1",method = RequestMethod.POST)
    public ResultMessage<Boolean> addDoctorsInfoBy111xu1(@RequestBody DoctorTutorInformation111Xu1 doctorTutorInformation111Xu1, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(doctorTutorInformation111Xu1Service.addDoctorsInfoBy111xu1(doctorTutorInformation111Xu1));
    }


    @ResponseBody
    @RequestMapping(value = "/updateDoctorsInfoBy111xu1",method = RequestMethod.PUT)
    public ResultMessage<DoctorTutorInformation111Xu1> updateDoctorsInfoBy111xu1(@RequestBody DoctorTutorInformation111Xu1 doctorTutorInformation111Xu1, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        DoctorTutorInformation111Xu1 doctorTutorInformation111Xu11 = doctorTutorInformation111Xu1Service.updateDoctorsInfoBy111xu1(doctorTutorInformation111Xu1);
        return ResultMessage.success(doctorTutorInformation111Xu11);
    }


    @ResponseBody
    @RequestMapping(value = "/deleteDoctorsInfoBy111xu1",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteDoctorsInfoBy111xu1(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(doctorTutorInformation111Xu1Service.deleteDoctorsInfoBy111xu1(dto.getId()));
    }




}
