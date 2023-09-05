package com.ccnu.pojo.vo;

public class CollegeProgressVo {

    // 博导名称
    private String name;

    // 博导编号
    private String tutorIdentificationCode;

    // 进度
    private String PercentageProgress;

    // 提交时间
    private String SubmissionTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode;
    }

    public String getPercentageProgress() {
        return PercentageProgress;
    }

    public void setPercentageProgress(String percentageProgress) {
        PercentageProgress = percentageProgress;
    }

    public String getSubmissionTime() {
        return SubmissionTime;
    }

    public void setSubmissionTime(String submissionTime) {
        SubmissionTime = submissionTime;
    }
}
