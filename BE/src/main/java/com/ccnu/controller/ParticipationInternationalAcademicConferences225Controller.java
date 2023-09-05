package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.ParticipationInternationalAcademicConferences225;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ParticipationInternationalAcademicConferences225Vo;
import com.ccnu.service.ParticipationInternationalAcademicConferences225Service;
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
public class ParticipationInternationalAcademicConferences225Controller {
    @Autowired
    ParticipationInternationalAcademicConferences225Service participationInternationalAcademicConferences225Service;

    /**
     *  获取表一所有博导信息
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllDoctorConferenceInfoBy225",method = RequestMethod.POST)
    public ResultMessage<PageUtils<ParticipationInternationalAcademicConferences225Vo>> getAllDoctorConferenceInfoBy225(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(participationInternationalAcademicConferences225Service.getAllDoctorConferenceInfoBy225(dto));
    }

    @ResponseBody
    @RequestMapping(value = "/getDoctorConferenceInfoBy225",method = RequestMethod.POST)
    public ResultMessage<ParticipationInternationalAcademicConferences225> getDoctorConferenceInfoBy225(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(participationInternationalAcademicConferences225Service.getDoctorConferenceInfoBy225(idDto));
    }


    /**
     *  新增表一博导信息
     * @param participationInternationalAcademicConferences225
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addConferenceInfoBy225",method = RequestMethod.POST)
    public ResultMessage<Boolean> addConferenceInfoBy225(@RequestBody ParticipationInternationalAcademicConferences225 participationInternationalAcademicConferences225, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(participationInternationalAcademicConferences225Service.addConferenceInfoBy225(participationInternationalAcademicConferences225));
    }

    /**
     *  更新表一博导信息
     * @param participationInternationalAcademicConferences225
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateConferenceInfoBy225",method = RequestMethod.PUT)
    public ResultMessage<ParticipationInternationalAcademicConferences225> updateConferenceInfoBy225(@RequestBody ParticipationInternationalAcademicConferences225 participationInternationalAcademicConferences225, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(participationInternationalAcademicConferences225Service.updateConferenceInfoBy225(participationInternationalAcademicConferences225));
    }

    /**
     *  删除表一博导信息(软删除)
     * @param dto 传输id专用dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteConferenceInfoBy225",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteConferenceInfoBy225(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(participationInternationalAcademicConferences225Service.deleteConferenceInfoBy225(dto.getId()));
    }
}
