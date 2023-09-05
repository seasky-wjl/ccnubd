package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 研究生院统计返参
 * @author: lsc
 * @create: 2021-01-04 10:08
 **/
public class GraduateSchoolStatisticsVo {

    //博导总人数
    private Integer graduateNumberAcademy;

    //总提交人数
    private Integer graduateNumberSubmissions;

    //总未提交人数
    private Integer graduateNumberUnsubmissions;

    //整体进度百分比
    private Double graduateOverallProgressPercentage;

    public Integer getGraduateNumberAcademy() {
        return graduateNumberAcademy;
    }

    public void setGraduateNumberAcademy(Integer graduateNumberAcademy) {
        this.graduateNumberAcademy = graduateNumberAcademy;
    }

    public Integer getGraduateNumberSubmissions() {
        return graduateNumberSubmissions;
    }

    public void setGraduateNumberSubmissions(Integer graduateNumberSubmissions) {
        this.graduateNumberSubmissions = graduateNumberSubmissions;
    }

    public Integer getGraduateNumberUnsubmissions() {
        return graduateNumberUnsubmissions;
    }

    public void setGraduateNumberUnsubmissions(Integer graduateNumberUnsubmissions) {
        this.graduateNumberUnsubmissions = graduateNumberUnsubmissions;
    }

    public Double getGraduateOverallProgressPercentage() {
        return graduateOverallProgressPercentage;
    }

    public void setGraduateOverallProgressPercentage(Double graduateOverallProgressPercentage) {
        this.graduateOverallProgressPercentage = graduateOverallProgressPercentage;
    }
}
