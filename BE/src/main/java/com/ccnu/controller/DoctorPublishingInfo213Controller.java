package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.PublishingTextbookSituation213;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.PublishingTextbookSituation213Vo;
import com.ccnu.service.DoctorPublishingInfo213Service;
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
 * @date 2020/12/4 13:48
 */
@Controller
@Scope("prototype")
public class DoctorPublishingInfo213Controller {
    @Autowired
    DoctorPublishingInfo213Service doctorPublishingInfo213Service;

    /**
     *  获取表一所有博导信息
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllDoctorPublishingInfoBy213",method = RequestMethod.POST)
    public ResultMessage<PageUtils<PublishingTextbookSituation213Vo>> getAllDoctorPublishingInfoBy213(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(doctorPublishingInfo213Service.getAllDoctorPublishingInfoBy213(dto));
    }

    @ResponseBody
    @RequestMapping(value = "/getDoctorPublishingInfoBy213",method = RequestMethod.POST)
    public ResultMessage<PublishingTextbookSituation213> getDoctorPublishingInfoBy213(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(doctorPublishingInfo213Service.getDoctorPublishingInfoBy213(idDto));
    }

    /**
     *  新增表一博导信息
     * @param publishingTextbookSituation213
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addPublishingInfoBy213",method = RequestMethod.POST)
    public ResultMessage<Boolean> addPublishingInfoBy213(@RequestBody PublishingTextbookSituation213 publishingTextbookSituation213, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(doctorPublishingInfo213Service.addPublishingInfoBy213(publishingTextbookSituation213));
    }

    /**
     *  更新表一博导信息
     * @param publishingTextbookSituation213
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updatePublishingInfoBy213",method = RequestMethod.PUT)
    public ResultMessage<PublishingTextbookSituation213> updatePublishingInfoBy213(@RequestBody PublishingTextbookSituation213 publishingTextbookSituation213, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(doctorPublishingInfo213Service.updatePublishingInfoBy213(publishingTextbookSituation213));
    }

    /**
     *  删除表一博导信息(软删除)
     * @param dto 传输id专用dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deletePublishingInfoBy213",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deletePublishingInfoBy213(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(doctorPublishingInfo213Service.deletePublishingInfoBy213(dto.getId()));
    }

}
