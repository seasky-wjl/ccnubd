package com.ccnu.service;

import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.CollegeProgressVo;
import com.ccnu.pojo.vo.CollegeStatisticsVo;

import java.util.List;

public interface CollegeProgressService {

    CollegeStatisticsVo collegePopulationStatistics(DoctorInfosQueryDto doctorInfosQueryDto);

    List<CollegeProgressVo> collegeOverallProgressList(DoctorInfosQueryDto doctorInfosQueryDto);

}
