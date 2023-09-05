package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 导师个人进度
 * @author: lsc
 * @create: 2021-01-12 16:58
 **/
public class DoctorProgressVo {

    //导师唯一标识码
    private String tutorIdentificationCode;
    //导师真实姓名
    private String realName;
    //学院名
    private String college;
    //总体确认时间
    private String totalTime;
    //导师确认进度
    private Double doctorProgress;

    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public Double getDoctorProgress() {
        return doctorProgress;
    }

    public void setDoctorProgress(Double doctorProgress) {
        this.doctorProgress = doctorProgress;
    }
}
