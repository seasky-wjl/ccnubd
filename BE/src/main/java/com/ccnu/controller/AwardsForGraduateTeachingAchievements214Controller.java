package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.AwardsForGraduateTeachingAchievements214;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.AwardsForGraduateTeachingAchievements214Vo;
import com.ccnu.service.AwardsForGraduateTeachingAchievements214Service;
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
public class AwardsForGraduateTeachingAchievements214Controller {
    @Autowired
    AwardsForGraduateTeachingAchievements214Service awardsForGraduateTeachingAchievements214Service;

    /**
     *  获取表一所有博导信息
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllAwardsPapersInfoBy214",method = RequestMethod.POST)
    public ResultMessage<PageUtils<AwardsForGraduateTeachingAchievements214Vo>> getAllAwardsPapersInfoBy214(@RequestBody DoctorInfosQueryDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(awardsForGraduateTeachingAchievements214Service.getAllAwardsPapersInfoBy214(dto));
    }

    @ResponseBody
    @RequestMapping(value = "/getAwardsPapersInfoBy214",method = RequestMethod.POST)
    public ResultMessage<AwardsForGraduateTeachingAchievements214> getAwardsPapersInfoBy214(@RequestBody IdDto idDto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(awardsForGraduateTeachingAchievements214Service.getAwardsPapersInfoBy214(idDto));
    }

    /**
     *  新增表一博导信息
     * @param awardsForGraduateTeachingAchievements214
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addAwardsInfoBy214",method = RequestMethod.POST)
    public ResultMessage<Boolean> addAwardsInfoBy214(@RequestBody AwardsForGraduateTeachingAchievements214 awardsForGraduateTeachingAchievements214, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(awardsForGraduateTeachingAchievements214Service.addAwardsInfoBy214(awardsForGraduateTeachingAchievements214));
    }

    /**
     *  更新表一博导信息
     * @param awardsForGraduateTeachingAchievements214
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateAwardsInfoBy214",method = RequestMethod.PUT)
    public ResultMessage<AwardsForGraduateTeachingAchievements214> updateAwardsInfoBy214(@RequestBody AwardsForGraduateTeachingAchievements214 awardsForGraduateTeachingAchievements214, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(awardsForGraduateTeachingAchievements214Service.updateAwardsInfoBy214(awardsForGraduateTeachingAchievements214));
    }

    /**
     *  删除表一博导信息(软删除)
     * @param dto 传输id专用dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAwardsInfoBy214",method = RequestMethod.PUT)
    public ResultMessage<Boolean> deleteAwardsInfoBy214(@RequestBody IdDto dto, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        if(dto == null || dto.getId() == null || dto.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        return ResultMessage.success(awardsForGraduateTeachingAchievements214Service.deleteAwardsInfoBy214(dto.getId()));
    }
}
