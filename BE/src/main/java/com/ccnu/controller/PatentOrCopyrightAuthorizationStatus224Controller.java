package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.PatentOrCopyrightAuthorizationStatus224;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.PatentOrCopyrightAuthorizationStatus224Vo;
import com.ccnu.service.PatentOrCopyrightAuthorizationStatus224Service;
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
public class PatentOrCopyrightAuthorizationStatus224Controller {
    @Autowired
    PatentOrCopyrightAuthorizationStatus224Service patentOrCopyrightAuthorizationStatus224Service;

    /**
     *  获取表一所有博导信息
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllDoctorPatentInfoBy224",method = RequestMethod.POST)
    public ResultMessage<PageUtils<PatentOrCopyrightAuthorizationStatus224Vo>> getAllDoctorPatentInfoBy224(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(patentOrCopyrightAuthorizationStatus224Service.getAllDoctorPatentInfoBy224(dto));
    }


    @ResponseBody
    @RequestMapping(value = "/getDoctorPatentInfoBy224",method = RequestMethod.POST)
    public ResultMessage<PatentOrCopyrightAuthorizationStatus224> getDoctorPatentInfoBy224(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(patentOrCopyrightAuthorizationStatus224Service.getDoctorPatentInfoBy224(idDto));
    }

    /**
     *  新增表一博导信息
     * @param patentOrCopyrightAuthorizationStatus224
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addPatentInfoBy224",method = RequestMethod.POST)
    public ResultMessage<Boolean> addPatentInfoBy224(@RequestBody PatentOrCopyrightAuthorizationStatus224 patentOrCopyrightAuthorizationStatus224, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(patentOrCopyrightAuthorizationStatus224Service.addPatentInfoBy224(patentOrCopyrightAuthorizationStatus224));
    }

    /**
     *  更新表一博导信息
     * @param patentOrCopyrightAuthorizationStatus224
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updatePatentInfoBy224",method = RequestMethod.PUT)
    public ResultMessage<PatentOrCopyrightAuthorizationStatus224> updatePatentInfoBy224(@RequestBody PatentOrCopyrightAuthorizationStatus224 patentOrCopyrightAuthorizationStatus224, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(patentOrCopyrightAuthorizationStatus224Service.updatePatentInfoBy224(patentOrCopyrightAuthorizationStatus224));
    }

    /**
     *  删除表一博导信息(软删除)
     * @param dto 传输id专用dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deletePatentInfoBy224",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deletePatentInfoBy224(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(patentOrCopyrightAuthorizationStatus224Service.deletePatentInfoBy224(dto.getId()));
    }
}
