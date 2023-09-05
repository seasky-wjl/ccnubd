package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.CollegeProgressVo;
import com.ccnu.pojo.vo.CollegeStatisticsVo;
import com.ccnu.service.CollegeProgressService;
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

@Controller
@Scope("prototype")
public class CollegeProgressController {

    @Autowired
    CollegeProgressService collegeProgressService;


    @ResponseBody
    @RequestMapping(value = "/collegePopulationStatistics",method = RequestMethod.POST)
    public ResultMessage<CollegeStatisticsVo> collegePopulationStatistics(@RequestBody DoctorInfosQueryDto doctorInfosQueryDto, HttpServletRequest request) {

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(collegeProgressService.collegePopulationStatistics(doctorInfosQueryDto));
    }

    @ResponseBody
    @RequestMapping(value = "/collegeOverallProgressList",method = RequestMethod.POST)
    public ResultMessage<List<CollegeProgressVo>> collegeOverallProgressList(@RequestBody DoctorInfosQueryDto doctorInfosQueryDto, HttpServletRequest request) {

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(collegeProgressService.collegeOverallProgressList(doctorInfosQueryDto));
    }

}
