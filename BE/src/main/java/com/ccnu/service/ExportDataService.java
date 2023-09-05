package com.ccnu.service;

import javax.servlet.http.HttpServletResponse;

/**
 * @program: ccnu-bd
 * @description: 导出数据至excel
 * @author: lsc
 * @create: 2021-11-02 14:31
 **/
public interface ExportDataService {

    /**
     * 导出个人数据
     */
    void exportPersonalData(String tutorId, HttpServletResponse response);

    /**
     * 导出所有博导数据
     */
    void exportCollectiveData(HttpServletResponse response);

    /**
     * 导出院系博导数据
     * @param facultyCode
     * @param response
     */
    void exportFacultyData(String facultyCode,HttpServletResponse response);

    /**
     * 导出未完成采集的博导数据
     * @param response
     */
    void exportFailData(HttpServletResponse response);

}
