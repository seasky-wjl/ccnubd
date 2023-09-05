package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 表215前端展示数据
 * @author: lsc
 * @create: 2021-10-21 22:24
 **/
public class GuidedDoctoralStudentsAwards215Vo {

    /**
     *
     */
    private Integer id;

    /**
     * 导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 获奖题目
     */
    private String awardTopic;

    /**
     * 奖项名称
     */
    private String awardName;

    /**
     * 证书号
     */
    private String certificateNumber;

    /**
     * 获奖级别
     */
    private String awardLevel;

    /**
     * 获奖等级
     */
    private String awardGrade;

    /**
     * 颁奖单位
     */
    private String awardingUnit;

    /**
     * 获奖博士生唯一标识码
     */
    private String awardDoctoralStudentIdentificationCode;

    /**
     * 指导教师序位
     */
    private String instructorOrder;

    /**
     * 最后更新时间
     */
    private String lastTime;

    /**
     * 是否删除
     */
    private String isdelete;

    /**
     * 导师姓名
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode;
    }

    public String getAwardTopic() {
        return awardTopic;
    }

    public void setAwardTopic(String awardTopic) {
        this.awardTopic = awardTopic;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getAwardLevel() {
        return awardLevel;
    }

    public void setAwardLevel(String awardLevel) {
        this.awardLevel = awardLevel;
    }

    public String getAwardGrade() {
        return awardGrade;
    }

    public void setAwardGrade(String awardGrade) {
        this.awardGrade = awardGrade;
    }

    public String getAwardingUnit() {
        return awardingUnit;
    }

    public void setAwardingUnit(String awardingUnit) {
        this.awardingUnit = awardingUnit;
    }

    public String getAwardDoctoralStudentIdentificationCode() {
        return awardDoctoralStudentIdentificationCode;
    }

    public void setAwardDoctoralStudentIdentificationCode(String awardDoctoralStudentIdentificationCode) {
        this.awardDoctoralStudentIdentificationCode = awardDoctoralStudentIdentificationCode;
    }

    public String getInstructorOrder() {
        return instructorOrder;
    }

    public void setInstructorOrder(String instructorOrder) {
        this.instructorOrder = instructorOrder;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
