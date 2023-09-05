package com.ccnu.pojo.vo;

public class CollegeStatisticsVo {

    // 学院总人数
    private Integer numberAcademy;

    // 总提交人数
    private Integer numberSubmissions;

    // 总未提交人数
    private Integer numberUnsubmissions;

    // 整体进度百分比
    private Double overallProgressPercentage;

    public Integer getNumberAcademy() {
        return numberAcademy;
    }

    public void setNumberAcademy(Integer numberAcademy) {
        this.numberAcademy = numberAcademy;
    }

    public Integer getNumberSubmissions() {
        return numberSubmissions;
    }

    public void setNumberSubmissions(Integer numberSubmissions) {
        this.numberSubmissions = numberSubmissions;
    }

    public Integer getNumberUnsubmissions() {
        return numberUnsubmissions;
    }

    public void setNumberUnsubmissions(Integer numberUnsubmissions) {
        this.numberUnsubmissions = numberUnsubmissions;
    }

    public Double getOverallProgressPercentage() {
        return overallProgressPercentage;
    }

    public void setOverallProgressPercentage(Double overallProgressPercentage) {
        this.overallProgressPercentage = overallProgressPercentage;
    }
}
