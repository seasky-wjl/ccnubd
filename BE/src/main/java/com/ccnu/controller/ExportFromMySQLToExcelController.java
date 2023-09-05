package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.dto.ExcelDto;

import com.ccnu.utils.JWTUtils;
import com.ccnu.utils.MySQLExcelUtil;
import com.ccnu.utils.ResultMessage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * @author 王新强
 * @version 1.0
 * @date 2021/1/4 13:15
 */

@Controller
@Scope("prototype")
public class ExportFromMySQLToExcelController {
   // MySQLExcelUtil mySQLExcelUtil;

    @ResponseBody
    @RequestMapping(value = "/ExportFromMySQLToExcel",method = RequestMethod.POST)
    public ResultMessage<ExcelDto> ExportFromMySQLToExcel(@RequestBody ExcelDto excelDto, HttpServletRequest request) throws SQLException {

            excelDto.setExcelstatus(0);
            String token = request.getHeader("token");
            DecodedJWT verify = JWTUtils.verify(token);
            excelDto.setExcelstatus(MySQLExcelUtil.exportFromMySQLToExcel(excelDto.getExcelPath()));
            return ResultMessage.success(excelDto);

    }


}
