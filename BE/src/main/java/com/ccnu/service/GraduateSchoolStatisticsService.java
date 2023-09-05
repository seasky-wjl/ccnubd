package com.ccnu.service;

import com.ccnu.pojo.vo.GraduateSchoolProgressVo;
import com.ccnu.pojo.vo.GraduateSchoolStatisticsVo;
import java.util.List;

/**
 * @program: ccnu-bd
 * @description: 研究生院统计
 * @author: lsc
 * @create: 2021-01-04 10:04
 **/
public interface GraduateSchoolStatisticsService {

    /**
     * 获取研究生院统计信息
     * @return
     */
    GraduateSchoolStatisticsVo getGraduateSchoolStatistics();

    List<GraduateSchoolProgressVo> getGraduateSchoolProgress();

}
