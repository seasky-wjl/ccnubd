package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.GraduateEducationTeachingReformResearchProject212;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.GraduateEducationTeachingReformResearchProject212Vo;
import com.ccnu.service.GraduateEducationTeachingReformResearchProject212Service;
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
 * @date 2020/12/23 20:26
 */
@Controller
@Scope("prototype")
public class GraduateEducationTeachingReformResearchProject212Controller {

    @Autowired
    GraduateEducationTeachingReformResearchProject212Service graduateEducationTeachingReformResearchProject212Service;


    @ResponseBody
    @RequestMapping(value = "/getAllDoctoGraduateEducationInfoBy212",method = RequestMethod.POST)
    public ResultMessage<PageUtils<GraduateEducationTeachingReformResearchProject212Vo>> getAllDoctoGraduateEducationInfoBy212(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(graduateEducationTeachingReformResearchProject212Service.getAllDoctoGraduateEducationInfoBy212(dto));

    }

    @ResponseBody
    @RequestMapping(value = "/getDoctoGraduateEducationInfoBy212",method = RequestMethod.POST)
    public ResultMessage<GraduateEducationTeachingReformResearchProject212> getDoctoGraduateEducationInfoBy212(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(graduateEducationTeachingReformResearchProject212Service.getDoctoGraduateEducationInfoBy212(idDto));
    }


    @ResponseBody
    @RequestMapping(value = "/addGraduateEducationInfoBy212",method = RequestMethod.POST)
    public ResultMessage<Boolean> addGraduateEducationInfoBy212(@RequestBody GraduateEducationTeachingReformResearchProject212 graduateEducationTeachingReformResearchProject212, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(graduateEducationTeachingReformResearchProject212Service.addGraduateEducationInfoBy212(graduateEducationTeachingReformResearchProject212));
    }


    @ResponseBody
    @RequestMapping(value = "/updateGraduateEducationInfoBy212",method = RequestMethod.PUT)
    public ResultMessage<GraduateEducationTeachingReformResearchProject212> updateGraduateEducationInfoBy212(@RequestBody GraduateEducationTeachingReformResearchProject212 graduateEducationTeachingReformResearchProject212, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        GraduateEducationTeachingReformResearchProject212 GraduateEducationTeachingReformResearchProject2121 = graduateEducationTeachingReformResearchProject212Service.updateGraduateEducationInfoBy212(graduateEducationTeachingReformResearchProject212);
        return ResultMessage.success(GraduateEducationTeachingReformResearchProject2121);
    }


    @ResponseBody
    @RequestMapping(value = "/deleteGraduateEducationInfoBy212",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteGraduateEducationInfoBy212(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(graduateEducationTeachingReformResearchProject212Service.deleteGraduateEducationInfoBy212(dto.getId()));
    }



}
