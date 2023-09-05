package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.ResearchProjectSituation121;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ResearchProjectSituation121Vo;
import com.ccnu.service.ResearchProjectSituation121Service;
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
 * @date 2020/12/23 20:21
 */
@Controller
@Scope("prototype")
public class ResearchProjectSituation121Controller {

    @Autowired
    ResearchProjectSituation121Service researchProjectSituation121Service;

    @ResponseBody
    @RequestMapping(value = "/getAllResearchProjectInfoBy121",method = RequestMethod.POST)
    public ResultMessage<PageUtils<ResearchProjectSituation121Vo>> getAllResearchProjectInfoBy121(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(researchProjectSituation121Service.getAllResearchProjectInfoBy121(dto));

    }

    @ResponseBody
    @RequestMapping(value = "/getResearchProjectInfoBy121",method = RequestMethod.POST)
    public ResultMessage<ResearchProjectSituation121> getResearchProjectInfoBy121(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(researchProjectSituation121Service.getResearchProjectInfoBy121(idDto));
    }


    @ResponseBody
    @RequestMapping(value = "/addResearchProjectInfoBy121",method = RequestMethod.POST)
    public ResultMessage<Boolean> addResearchProjectInfoBy121(@RequestBody ResearchProjectSituation121 researchProjectSituation121, HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(researchProjectSituation121Service.addResearchProjectInfoBy121(researchProjectSituation121));
    }


    @ResponseBody
    @RequestMapping(value = "/updateResearchProjectInfoBy121",method = RequestMethod.PUT)
    public ResultMessage<ResearchProjectSituation121> updateResearchProjectInfoBy121(@RequestBody ResearchProjectSituation121 researchProjectSituation121, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        ResearchProjectSituation121 ResearchProjectSituation1211 = researchProjectSituation121Service.updateResearchProjectInfoBy121(researchProjectSituation121);
        return ResultMessage.success(ResearchProjectSituation1211);
    }


    @ResponseBody
    @RequestMapping(value = "/deleteResearchProjectInfoBy121",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteResearchProjectInfoBy121(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(researchProjectSituation121Service.deleteResearchProjectInfoBy121(dto.getId()));
    }




}
