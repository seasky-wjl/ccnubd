package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.AcademicAppointment226;
import com.ccnu.pojo.RelyingOnScientificResearchPlatform227;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.RelyingOnScientificResearchPlatform227Vo;
import com.ccnu.service.RelyingOnScientificResearchPlatform227Service;
import com.ccnu.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@Scope("prototype")
public class RelyingOnScientificResearchPlatform227Controller {
    @Autowired
    RelyingOnScientificResearchPlatform227Service relyingOnScientificResearchPlatform227Service;

    /**
     *  获取表一所有博导信息
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getScientificResearchPlatformInfoBy227",method = RequestMethod.POST)
    public ResultMessage<PageUtils<RelyingOnScientificResearchPlatform227Vo>> getScientificResearchPlatformInfoBy227(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(relyingOnScientificResearchPlatform227Service.getScientificResearchPlatformInfoBy227(dto));
    }



    @ResponseBody
    @RequestMapping(value = "/getScientificResearch",method = RequestMethod.POST)
    public ResultMessage<RelyingOnScientificResearchPlatform227> getScientificResearch(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(relyingOnScientificResearchPlatform227Service.getScientificResearch(idDto));
    }


    /**
     *  新增表一博导信息
     * @param relyingOnScientificResearchPlatform227
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addScientificResearchPlatformInfoBy227",method = RequestMethod.POST)
    public ResultMessage<Boolean> addScientificResearchPlatformInfoBy227(@RequestBody RelyingOnScientificResearchPlatform227 relyingOnScientificResearchPlatform227, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(relyingOnScientificResearchPlatform227Service.addScientificResearchPlatformInfoBy227(relyingOnScientificResearchPlatform227));
    }

    /**
     *  更新表一博导信息
     * @param relyingOnScientificResearchPlatform227
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateScientificResearchPlatformInfoBy227",method = RequestMethod.PUT)
    public ResultMessage<RelyingOnScientificResearchPlatform227> updateScientificResearchPlatformInfoBy227(@RequestBody RelyingOnScientificResearchPlatform227 relyingOnScientificResearchPlatform227, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(relyingOnScientificResearchPlatform227Service.updateScientificResearchPlatformInfoBy227(relyingOnScientificResearchPlatform227));
    }

    /**
     *  删除表一博导信息(软删除)
     * @param dto 传输id专用dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteScientificResearchPlatformInfoBy227",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteScientificResearchPlatformInfoBy227(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(relyingOnScientificResearchPlatform227Service.deleteScientificResearchPlatformInfoBy227(dto.getId()));
    }
}
