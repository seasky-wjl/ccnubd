package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.RelyingOnScientificResearchPlatform227;
import com.ccnu.pojo.ResearchAwards222;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ResearchAwards222Vo;
import com.ccnu.service.ResearchAwards222Service;
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
public class ResearchAwards222Controller {
    @Autowired
    ResearchAwards222Service researchAwards222Service;

    /**
     *  获取表一所有博导信息
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllDoctorAwardsInfoBy222",method = RequestMethod.POST)
    public ResultMessage<PageUtils<ResearchAwards222Vo>> getAllDoctorAwardsInfoBy222(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(researchAwards222Service.getAllDoctorAwardsInfoBy222(dto));
    }


    @ResponseBody
    @RequestMapping(value = "/getDoctorAwardsInfoBy222",method = RequestMethod.POST)
    public ResultMessage<ResearchAwards222> getDoctorAwardsInfoBy222(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(researchAwards222Service.getDoctorAwardsInfoBy222(idDto));
    }



    /**
     *  新增表一博导信息
     * @param researchAwards222
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addAwardsInfoBy222",method = RequestMethod.POST)
    public ResultMessage<Boolean> addAwardsInfoBy222(@RequestBody ResearchAwards222 researchAwards222, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(researchAwards222Service.addAwardsInfoBy222(researchAwards222));
    }

    /**
     *  更新表一博导信息
     * @param researchAwards222
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateAwardsInfoBy222",method = RequestMethod.PUT)
    public ResultMessage<ResearchAwards222> updateAwardsInfoBy222(@RequestBody ResearchAwards222 researchAwards222, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(researchAwards222Service.updateAwardsInfoBy222(researchAwards222));
    }

    /**
     *  删除表一博导信息(软删除)
     * @param dto 传输id专用dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAwardsInfoBy222",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteAwardsInfoBy222(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(researchAwards222Service.deleteAwardsInfoBy222(dto.getId()));
    }
}
