package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.ConfirmInformation;
import com.ccnu.pojo.dto.ConfirmInfosDto;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.service.ConfirmInformationService;
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
public class ConfirmInformationController {
    @Autowired
    ConfirmInformationService confirmInformationService;

    @ResponseBody
    @RequestMapping(value = "/updateConfirmInformation",method = RequestMethod.POST)
    public ResultMessage<ConfirmInformation> updateConfirmInformation(@RequestBody ConfirmInfosDto confirmInfosDto, HttpServletRequest request){
        String token = request.getHeader("token");



        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(confirmInformationService.updateConfirmInformation(confirmInfosDto));
    }
}
