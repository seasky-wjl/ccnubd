package com.ccnu.service;

import com.ccnu.pojo.ResearchProjectSituation121;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ResearchProjectSituation121Vo;
import com.ccnu.utils.PageUtils;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/23 20:23
 */
public interface ResearchProjectSituation121Service {

    public PageUtils<ResearchProjectSituation121Vo> getAllResearchProjectInfoBy121(DoctorInfosQueryDto doctorInfosQueryDto);


    Boolean addResearchProjectInfoBy121(ResearchProjectSituation121 researchProjectSituation121);


    ResearchProjectSituation121 updateResearchProjectInfoBy121(ResearchProjectSituation121 researchProjectSituation121);


    Boolean deleteResearchProjectInfoBy121(Integer id);


    ResearchProjectSituation121 getResearchProjectInfoBy121(IdDto idDto);
}
