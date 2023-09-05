package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.DoctorTutorInformation111;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.service.DoctorTutorInformation111Service;
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
 * @date 2020/12/4 13:48
 */
@Controller
@Scope("prototype")
public class DoctorTutorInformation111Controller {
    @Autowired
    DoctorTutorInformation111Service doctorTutorInformation111Service;

    /**
      * @param dto
     * @return
     */
    @ResponseBody
   @RequestMapping(value = "/getAllDoctorsInfoBy111",method = RequestMethod.POST)
    public ResultMessage<PageUtils<DoctorTutorInformation111>> getAllDoctorsInfoBy111(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
       return ResultMessage.success(doctorTutorInformation111Service.getAllDoctorsInfoBy111(dto));
   }

    /**
     *  新增表一博导信息
     * @param doctorTutorInformation111
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addDoctorsInfoBy111",method = RequestMethod.POST)
    public ResultMessage<Boolean> addDoctorsInfoBy111(@RequestBody DoctorTutorInformation111 doctorTutorInformation111, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(doctorTutorInformation111Service.addDoctorsInfoBy111(doctorTutorInformation111));
    }

    /**
     *  更新表一博导信息
     * @param doctorTutorInformation111
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateDoctorsInfoBy111",method = RequestMethod.PUT)
    public ResultMessage<DoctorTutorInformation111> updateDoctorsInfoBy111(@RequestBody DoctorTutorInformation111 doctorTutorInformation111, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        DoctorTutorInformation111 doctorTutorInformation1111 = doctorTutorInformation111Service.updateDoctorsInfoBy111(doctorTutorInformation111);
        return ResultMessage.success(doctorTutorInformation1111);
    }

    @ResponseBody
    @RequestMapping(value = "/getDoctorsInfoBy111",method = RequestMethod.POST)
    public ResultMessage<DoctorTutorInformation111> getDoctorsInfoBy111(@RequestBody DoctorTutorInformation111 doctorTutorInformation111, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(doctorTutorInformation111Service.getDoctorsInfoBy111(doctorTutorInformation111));
    }

    /**
     *  删除表一博导信息(软删除)
     * @param dto 传输id专用dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteDoctorsInfoBy111",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteDoctorsInfoBy111(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(doctorTutorInformation111Service.deleteDoctorsInfoBy111(dto.getId()));
    }
}
