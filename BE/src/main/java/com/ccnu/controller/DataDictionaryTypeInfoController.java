package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.DataDictionaryType;
import com.ccnu.pojo.dto.DictionaryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.service.DataDictionaryTypeInfoService;
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

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/29 12:49
 */

@Controller
@Scope("prototype")
public class DataDictionaryTypeInfoController {


    @Autowired
    DataDictionaryTypeInfoService dataDictionaryTypeInfoService;

    @ResponseBody
    @RequestMapping(value = "/getDataDictionaryTypeInfo",method = RequestMethod.POST)
    public ResultMessage<List<DataDictionaryType>> getDataDictionaryTypeInfo(@RequestBody DictionaryDto dictionaryDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        if(dictionaryDto == null || dictionaryDto.getTypename() == null){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(dataDictionaryTypeInfoService.getDataDictionaryTypeInfo(dictionaryDto));
    }


}
