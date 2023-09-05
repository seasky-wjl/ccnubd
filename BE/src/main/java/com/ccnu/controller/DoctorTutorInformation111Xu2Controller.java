package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.DoctorTutorInformation111Xu2;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.DoctorTutorInformation111Xu2Vo;
import com.ccnu.service.DoctorTutorInformation111Xu2Service;
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
 * @date 2020/12/23 20:17
 */
@Controller
@Scope("prototype")
public class DoctorTutorInformation111Xu2Controller {


    @Autowired
    DoctorTutorInformation111Xu2Service doctorTutorInformation111Xu2Service;

    @ResponseBody
    @RequestMapping(value = "/getAllDoctorsInfoBy111xu2",method = RequestMethod.POST)
    public ResultMessage<PageUtils<DoctorTutorInformation111Xu2Vo>> getAllDoctorsInfoBy111xu2(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(doctorTutorInformation111Xu2Service.getAllDoctorsInfoBy111xu2(dto));

    }

    @ResponseBody
    @RequestMapping(value = "/getDoctorsInfoBy111xu2",method = RequestMethod.POST)
    public ResultMessage<DoctorTutorInformation111Xu2> getDoctorsInfoBy111xu2(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(doctorTutorInformation111Xu2Service.getDoctorsInfoBy111xu2(dto));
    }


    @ResponseBody
    @RequestMapping(value = "/addDoctorsInfoBy111xu2",method = RequestMethod.POST)
    public ResultMessage<Boolean> addDoctorsInfoBy111xu2(@RequestBody DoctorTutorInformation111Xu2 doctorTutorInformation111Xu2, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(doctorTutorInformation111Xu2Service.addDoctorsInfoBy111xu2(doctorTutorInformation111Xu2));
    }


    @ResponseBody
    @RequestMapping(value = "/updateDoctorsInfoBy111xu2",method = RequestMethod.PUT)
    public ResultMessage<DoctorTutorInformation111Xu2> updateDoctorsInfoBy111xu2(@RequestBody DoctorTutorInformation111Xu2 doctorTutorInformation111Xu2, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        DoctorTutorInformation111Xu2 doctorTutorInformation111Xu21 = doctorTutorInformation111Xu2Service.updateDoctorsInfoBy111xu2(doctorTutorInformation111Xu2);
        return ResultMessage.success(doctorTutorInformation111Xu21);
    }


    @ResponseBody
    @RequestMapping(value = "/deleteDoctorsInfoBy111xu2",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteDoctorsInfoBy111xu2(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(doctorTutorInformation111Xu2Service.deleteDoctorsInfoBy111xu2(dto.getId()));
    }



}
