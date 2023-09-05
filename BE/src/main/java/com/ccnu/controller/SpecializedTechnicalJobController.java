package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.SpecializedTechnicalJob;
import com.ccnu.pojo.dto.DictionaryDto;
import com.ccnu.service.SpecializedTechnicalJobInfoService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.JWTUtils;
import com.ccnu.utils.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Scope("prototype")
public class SpecializedTechnicalJobController {

    @Autowired
    SpecializedTechnicalJobInfoService specializedTechnicalJobInfoService;

    @ResponseBody
    @RequestMapping(value = "/getSpecializedTechnicalJobInfo",method = RequestMethod.POST)
    public ResultMessage<List<SpecializedTechnicalJob>> getSpecializedTechnicalJobInfo(@RequestBody DictionaryDto dictionaryDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        if(dictionaryDto == null || dictionaryDto.getId_type()+"" == null){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(specializedTechnicalJobInfoService.getSpecializedTechnicalJobInfo(dictionaryDto));
    }
}

