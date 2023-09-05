package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.service.ExportDataService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.JWTUtils;
import com.ccnu.utils.ResultMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: ccnu-bd
 * @description: 导出数据控制层
 * @author: lsc
 * @create: 2021-11-02 21:49
 **/
@Controller
@Scope("prototype")
public class ExportDataController {

    @Autowired
    private ExportDataService exportDataService;

    /**
     * 导出博导个人数据
     * @param dto
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/exportPersonalData",method = RequestMethod.POST)
    public ResultMessage exportPersonalData(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request,
            HttpServletResponse response) {
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if (StringUtils.isEmpty(dto.getTutorIdentificationCode())) {
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        exportDataService.exportPersonalData(dto.getTutorIdentificationCode(), response);
        return ResultMessage.success(true);
    }

    /**
     * 导出所有博导数据
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/exportCollectiveData",method = RequestMethod.POST)
    public ResultMessage exportCollectiveData(HttpServletRequest request,
            HttpServletResponse response) {
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        exportDataService.exportCollectiveData(response);
        return ResultMessage.success(true);
    }

    /**
     * 导出院系博导数据
     * @param dto
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/exportFacultyData",method = RequestMethod.POST)
    public ResultMessage exportFacultyData(@RequestBody DoctorInfosQueryDto dto,HttpServletRequest request,
            HttpServletResponse response) {
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if (StringUtils.isEmpty(dto.getCollege())) {
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        exportDataService.exportFacultyData(dto.getCollege(),response);
        return ResultMessage.success(true);
    }

    @ResponseBody
    @RequestMapping(value = "/exportFailData",method = RequestMethod.POST)
    public ResultMessage exportFailData(HttpServletRequest request,
            HttpServletResponse response) {
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        exportDataService.exportFailData(response);
        return ResultMessage.success(true);
    }
}
