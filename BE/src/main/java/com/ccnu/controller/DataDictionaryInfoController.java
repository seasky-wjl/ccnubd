package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.DataDictionary;
import com.ccnu.pojo.dto.DictionaryDto;
import com.ccnu.service.DataDictionaryInfoService;
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
 * @date 2020/12/31 11:52
 */

@Controller
@Scope("prototype")
public class DataDictionaryInfoController {

    @Autowired
    DataDictionaryInfoService dataDictionaryInfoService;

    @ResponseBody
    @RequestMapping(value = "/DataDictionaryInfo",method = RequestMethod.POST)
    public ResultMessage<List<DataDictionary>>DataDictionaryInfo(@RequestBody DictionaryDto dictionaryDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        if(dictionaryDto == null || dictionaryDto.getDatatype() == null){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(dataDictionaryInfoService.getDataDictionaryInfo(dictionaryDto));
    }


}
