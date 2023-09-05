package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.vo.GraduateSchoolProgressVo;
import com.ccnu.pojo.vo.GraduateSchoolStatisticsVo;
import com.ccnu.service.GraduateSchoolStatisticsService;
import com.ccnu.utils.JWTUtils;
import com.ccnu.utils.ResultMessage;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: ccnu-bd
 * @description: 研究生院统计接口
 * @author: lsc
 * @create: 2021-01-04 09:47
 **/
@Controller
@Scope("prototype")
public class GraduateSchoolStatisticsController {

    @Autowired
    private GraduateSchoolStatisticsService graduateSchoolStatisticsService;

    /**
     * 获取研究生院统计信息
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getGraduateSchoolStatistics",method = RequestMethod.POST)
    public ResultMessage<GraduateSchoolStatisticsVo> getGraduateSchoolStatistics(HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(graduateSchoolStatisticsService.getGraduateSchoolStatistics());
    }

    @ResponseBody
    @RequestMapping(value = "/getGraduateSchoolProgress",method = RequestMethod.POST)
    public ResultMessage<List<GraduateSchoolProgressVo>> getGraduateSchoolProgress(HttpServletRequest request){

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        return ResultMessage.success(graduateSchoolStatisticsService.getGraduateSchoolProgress());
    }

}
