package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.PublicationStatus223;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.PublicationStatus223Vo;
import com.ccnu.service.PublicationStatus223Service;
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

@Controller
@Scope("prototype")
public class PublicationStatus223Controller {
    @Autowired
    PublicationStatus223Service publicationStatus223Service;

    /**
     *  获取表一所有博导信息
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllDoctorPublicationInfoBy223",method = RequestMethod.POST)
    public ResultMessage<PageUtils<PublicationStatus223Vo>> getAllDoctorPublicationInfoBy223(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(publicationStatus223Service.getAllDoctorPublicationInfoBy223(dto));
    }


    @ResponseBody
    @RequestMapping(value = "/getDoctorPublicationInfoBy223",method = RequestMethod.POST)
    public ResultMessage<PublicationStatus223> getDoctorPublicationInfoBy223(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(publicationStatus223Service.getDoctorPublicationInfoBy223(idDto));
    }

    /**
     *  新增表一博导信息
     * @param publicationStatus223
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addPublicationInfoBy223",method = RequestMethod.POST)
    public ResultMessage<Boolean> addPublicationInfoBy223(@RequestBody PublicationStatus223 publicationStatus223, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(publicationStatus223Service.addPublicationInfoBy223(publicationStatus223));
    }

    /**
     *  更新表一博导信息
     * @param publicationStatus223
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updatePublicationInfoBy223",method = RequestMethod.PUT)
    public ResultMessage<PublicationStatus223> updatePublicationInfoBy223(@RequestBody PublicationStatus223 publicationStatus223, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(publicationStatus223Service.updatePublicationInfoBy223(publicationStatus223));
    }

    /**
     *  删除表一博导信息(软删除)
     * @param dto 传输id专用dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deletePublicationInfoBy223",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deletePublicationInfoBy223(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(publicationStatus223Service.deletePublicationInfoBy223(dto.getId()));
    }
}
