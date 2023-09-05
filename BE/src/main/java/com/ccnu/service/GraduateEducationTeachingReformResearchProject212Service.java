package com.ccnu.service;

import com.ccnu.pojo.GraduateEducationTeachingReformResearchProject212;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.GraduateEducationTeachingReformResearchProject212Vo;
import com.ccnu.utils.PageUtils;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/23 20:26
 */
public interface GraduateEducationTeachingReformResearchProject212Service {



    public PageUtils<GraduateEducationTeachingReformResearchProject212Vo> getAllDoctoGraduateEducationInfoBy212(DoctorInfosQueryDto doctorInfosQueryDto);


    Boolean addGraduateEducationInfoBy212(GraduateEducationTeachingReformResearchProject212 graduateEducationTeachingReformResearchProject212);


    GraduateEducationTeachingReformResearchProject212 updateGraduateEducationInfoBy212(GraduateEducationTeachingReformResearchProject212 graduateEducationTeachingReformResearchProject212);


    Boolean deleteGraduateEducationInfoBy212(Integer id);


    GraduateEducationTeachingReformResearchProject212 getDoctoGraduateEducationInfoBy212(IdDto idDto);
}
