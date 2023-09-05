package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.AcademicAppointment226;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.AcademicAppointment226Vo;
import com.ccnu.service.AcademicAppointment226Service;
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

@Controller
@Scope("prototype")
public class AcademicAppointment226Controller {
    @Autowired
    AcademicAppointment226Service academicAppointment226Service;

    /**
     *  获取表一所有博导信息
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAcademicAppointmentInfoBy226",method = RequestMethod.POST)
    public ResultMessage<PageUtils<AcademicAppointment226Vo>> getAcademicAppointmentInfoBy226(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(academicAppointment226Service.getAcademicAppointmentInfoBy226(dto));
    }

    @ResponseBody
    @RequestMapping(value = "/getAcademic",method = RequestMethod.POST)
    public ResultMessage<AcademicAppointment226> getAcademic(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(academicAppointment226Service.getAcademic(idDto));
    }


    /**
     *  新增表一博导信息
     * @param academicAppointment226
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addAcademicAppointmentInfoBy226",method = RequestMethod.POST)
    public ResultMessage<Boolean> addAcademicAppointmentInfoBy226(@RequestBody AcademicAppointment226 academicAppointment226, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(academicAppointment226Service.addAcademicAppointmentInfoBy226(academicAppointment226));
    }

    /**
     *  更新表一博导信息
     * @param academicAppointment226
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateAcademicAppointmentInfoBy226",method = RequestMethod.PUT)
    public ResultMessage<AcademicAppointment226> updateAcademicAppointmentInfoBy226(@RequestBody AcademicAppointment226 academicAppointment226, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(academicAppointment226Service.updateAcademicAppointmentInfoBy226(academicAppointment226));
    }

    /**
     *  删除表一博导信息(软删除)
     * @param dto 传输id专用dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAcademicAppointmentInfoBy226",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteAcademicAppointmentInfoBy226(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(academicAppointment226Service.deleteAcademicAppointmentInfoBy226(dto.getId()));
    }
}
