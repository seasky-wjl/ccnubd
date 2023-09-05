package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.ResearchPapers221;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ResearchPapers221Vo;
import com.ccnu.service.ResearchPapers221Service;
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
public class ResearchPapers221Controller {
    @Autowired
    ResearchPapers221Service researchPapers221Service;

    /**
     *  获取表一所有博导信息
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllDoctorPapersInfoBy221",method = RequestMethod.POST)
    public ResultMessage<PageUtils<ResearchPapers221Vo>> getAllDoctorPapersInfoBy221(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(researchPapers221Service.getAllDoctorPapersInfoBy221(dto));
    }

    @ResponseBody
    @RequestMapping(value = "/getDoctorPapersInfoBy221",method = RequestMethod.POST)
    public ResultMessage<ResearchPapers221> getDoctorPapersInfoBy221(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(researchPapers221Service.getDoctorPapersInfoBy221(idDto));
    }

    /**
     *  新增表一博导信息
     * @param researchPapers221
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addPapersInfoBy221",method = RequestMethod.POST)
    public ResultMessage<Boolean> addPapersInfoBy221(@RequestBody ResearchPapers221 researchPapers221, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(researchPapers221Service.addPapersInfoBy221(researchPapers221));
    }

    /**
     *  更新表一博导信息
     * @param researchPapers221
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updatePapersInfoBy221",method = RequestMethod.PUT)
    public ResultMessage<ResearchPapers221> updatePapersInfoBy221(@RequestBody ResearchPapers221 researchPapers221, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(researchPapers221Service.updatePapersInfoBy221(researchPapers221));
    }

    /**
     *  删除表一博导信息(软删除)
     * @param dto 传输id专用dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deletePapersInfoBy221",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deletePapersInfoBy221(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(researchPapers221Service.deletePapersInfoBy221(dto.getId()));
    }
}
