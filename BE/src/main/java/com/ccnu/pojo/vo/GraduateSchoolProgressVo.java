package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 学院整体进度
 * @author: lsc
 * @create: 2021-01-04 12:22
 **/
public class GraduateSchoolProgressVo {

    //学院名
    private String college;

    //学院编号
    private String tutorIdentificationCode;

    //学院整体进度
    private Double percentageProgress;

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode;
    }

    public Double getPercentageProgress() {
        return percentageProgress;
    }

    public void setPercentageProgress(Double percentageProgress) {
        this.percentageProgress = percentageProgress;
    }
}
