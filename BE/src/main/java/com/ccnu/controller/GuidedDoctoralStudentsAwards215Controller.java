package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.GuidedDoctoralStudentsAwards215;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.GuidedDoctoralStudentsAwards215Vo;
import com.ccnu.service.GuidedDoctoralStudentsAwards215Service;
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
public class GuidedDoctoralStudentsAwards215Controller<guidedDoctoralStudentsAwards215> {
    @Autowired
    GuidedDoctoralStudentsAwards215Service guidedDoctoralStudentsAwards215Service;

    /**
     *  获取表一所有博导信息
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllDoctorGuidedInfoBy215",method = RequestMethod.POST)
    public ResultMessage<PageUtils<GuidedDoctoralStudentsAwards215Vo>> getAllDoctorGuidedInfoBy215(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(guidedDoctoralStudentsAwards215Service.getAllDoctorGuidedInfoBy215(dto));
    }

    @ResponseBody
    @RequestMapping(value = "/getDoctorGuidedInfoBy215",method = RequestMethod.POST)
    public ResultMessage<GuidedDoctoralStudentsAwards215> getDoctorGuidedInfoBy215(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(guidedDoctoralStudentsAwards215Service.getDoctorGuidedInfoBy215(idDto));
    }

    /**
     *  新增表一博导信息
     * @param guidedDoctoralStudentsAwards215
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addGuidedInfoBy215",method = RequestMethod.POST)
    public ResultMessage<Boolean> addGuidedInfoBy215(@RequestBody GuidedDoctoralStudentsAwards215 guidedDoctoralStudentsAwards215, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(guidedDoctoralStudentsAwards215Service.addGuidedInfoBy215(guidedDoctoralStudentsAwards215));
    }

    /**
     *  更新表一博导信息
     * @param guidedDoctoralStudentsAwards215
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateGuidedInfoBy215",method = RequestMethod.PUT)
    public ResultMessage<GuidedDoctoralStudentsAwards215> updateGuidedInfoBy215(@RequestBody GuidedDoctoralStudentsAwards215 guidedDoctoralStudentsAwards215, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(guidedDoctoralStudentsAwards215Service.updateGuidedInfoBy215(guidedDoctoralStudentsAwards215));
    }

    /**
     *  删除表一博导信息(软删除)
     * @param dto 传输id专用dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteGuidedInfoBy215",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteGuidedInfoBy215(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(guidedDoctoralStudentsAwards215Service.deleteGuidedInfoBy215(dto.getId()));
    }

}
