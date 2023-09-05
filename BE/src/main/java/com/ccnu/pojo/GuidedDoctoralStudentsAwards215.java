package com.ccnu.pojo;

import java.io.Serializable;

public class GuidedDoctoralStudentsAwards215 implements Serializable {
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
     * guided_doctoral_students_awards_2_1_5
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 导师唯一识别码
     * @return tutor_identification_code 导师唯一识别码
     */
    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    /**
     * 导师唯一识别码
     * @param tutorIdentificationCode 导师唯一识别码
     */
    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode == null ? null : tutorIdentificationCode.trim();
    }

    /**
     * 获奖题目
     * @return award_topic 获奖题目
     */
    public String getAwardTopic() {
        return awardTopic;
    }

    /**
     * 获奖题目
     * @param awardTopic 获奖题目
     */
    public void setAwardTopic(String awardTopic) {
        this.awardTopic = awardTopic == null ? null : awardTopic.trim();
    }

    /**
     * 奖项名称
     * @return award_name 奖项名称
     */
    public String getAwardName() {
        return awardName;
    }

    /**
     * 奖项名称
     * @param awardName 奖项名称
     */
    public void setAwardName(String awardName) {
        this.awardName = awardName == null ? null : awardName.trim();
    }

    /**
     * 证书号
     * @return certificate_number 证书号
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * 证书号
     * @param certificateNumber 证书号
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
    }

    /**
     * 获奖级别
     * @return award_level 获奖级别
     */
    public String getAwardLevel() {
        return awardLevel;
    }

    /**
     * 获奖级别
     * @param awardLevel 获奖级别
     */
    public void setAwardLevel(String awardLevel) {
        this.awardLevel = awardLevel == null ? null : awardLevel.trim();
    }

    /**
     * 获奖等级
     * @return award_grade 获奖等级
     */
    public String getAwardGrade() {
        return awardGrade;
    }

    /**
     * 获奖等级
     * @param awardGrade 获奖等级
     */
    public void setAwardGrade(String awardGrade) {
        this.awardGrade = awardGrade == null ? null : awardGrade.trim();
    }

    /**
     * 颁奖单位
     * @return awarding_unit 颁奖单位
     */
    public String getAwardingUnit() {
        return awardingUnit;
    }

    /**
     * 颁奖单位
     * @param awardingUnit 颁奖单位
     */
    public void setAwardingUnit(String awardingUnit) {
        this.awardingUnit = awardingUnit == null ? null : awardingUnit.trim();
    }

    /**
     * 获奖博士生唯一标识码
     * @return award_doctoral_student_identification_code 获奖博士生唯一标识码
     */
    public String getAwardDoctoralStudentIdentificationCode() {
        return awardDoctoralStudentIdentificationCode;
    }

    /**
     * 获奖博士生唯一标识码
     * @param awardDoctoralStudentIdentificationCode 获奖博士生唯一标识码
     */
    public void setAwardDoctoralStudentIdentificationCode(String awardDoctoralStudentIdentificationCode) {
        this.awardDoctoralStudentIdentificationCode = awardDoctoralStudentIdentificationCode == null ? null : awardDoctoralStudentIdentificationCode.trim();
    }

    /**
     * 指导教师序位
     * @return instructor_order 指导教师序位
     */
    public String getInstructorOrder() {
        return instructorOrder;
    }

    /**
     * 指导教师序位
     * @param instructorOrder 指导教师序位
     */
    public void setInstructorOrder(String instructorOrder) {
        this.instructorOrder = instructorOrder == null ? null : instructorOrder.trim();
    }

    /**
     * 最后更新时间
     * @return last_time 最后更新时间
     */
    public String getLastTime() {
        return lastTime;
    }

    /**
     * 最后更新时间
     * @param lastTime 最后更新时间
     */
    public void setLastTime(String lastTime) {
        this.lastTime = lastTime == null ? null : lastTime.trim();
    }

    /**
     * 是否删除
     * @return isdelete 是否删除
     */
    public String getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除
     * @param isdelete 是否删除
     */
    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tutorIdentificationCode=").append(tutorIdentificationCode);
        sb.append(", awardTopic=").append(awardTopic);
        sb.append(", awardName=").append(awardName);
        sb.append(", certificateNumber=").append(certificateNumber);
        sb.append(", awardLevel=").append(awardLevel);
        sb.append(", awardGrade=").append(awardGrade);
        sb.append(", awardingUnit=").append(awardingUnit);
        sb.append(", awardDoctoralStudentIdentificationCode=").append(awardDoctoralStudentIdentificationCode);
        sb.append(", instructorOrder=").append(instructorOrder);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}