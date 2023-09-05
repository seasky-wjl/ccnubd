package com.ccnu.pojo;

import java.io.Serializable;

public class AwardsForGraduateTeachingAchievements214 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 导师唯一标识码
     */
    private String tutorIdentificationCode;

    /**
     * 完成人序位
     */
    private String completionOrder;

    /**
     * 奖项名称
     */
    private String awardName;

    /**
     * 证书号
     */
    private String certificateNumber;

    /**
     * 第一获奖单位是否为填表单位
     */
    private String whetherFirstWinningUnitIsFillingUnit;

    /**
     * 获奖级别
     */
    private String awardLevel;

    /**
     * 获奖等级
     */
    private String awardGrade;

    /**
     * 获奖日期
     */
    private String awardDate;

    /**
     * 颁奖单位
     */
    private String awardingUnit;

    /**
     * 最后更新时间
     */
    private String lastTime;

    /**
     * 是否删除
     */
    private String isdelete;

    /**
     * awards_for_graduate_teaching_achievements_2_1_4
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
     * 导师唯一标识码
     * @return tutor_identification_code 导师唯一标识码
     */
    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    /**
     * 导师唯一标识码
     * @param tutorIdentificationCode 导师唯一标识码
     */
    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode == null ? null : tutorIdentificationCode.trim();
    }

    /**
     * 完成人序位
     * @return completion_order 完成人序位
     */
    public String getCompletionOrder() {
        return completionOrder;
    }

    /**
     * 完成人序位
     * @param completionOrder 完成人序位
     */
    public void setCompletionOrder(String completionOrder) {
        this.completionOrder = completionOrder == null ? null : completionOrder.trim();
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
     * 第一获奖单位是否为填表单位
     * @return whether_first_winning_unit_is_filling_unit 第一获奖单位是否为填表单位
     */
    public String getWhetherFirstWinningUnitIsFillingUnit() {
        return whetherFirstWinningUnitIsFillingUnit;
    }

    /**
     * 第一获奖单位是否为填表单位
     * @param whetherFirstWinningUnitIsFillingUnit 第一获奖单位是否为填表单位
     */
    public void setWhetherFirstWinningUnitIsFillingUnit(String whetherFirstWinningUnitIsFillingUnit) {
        this.whetherFirstWinningUnitIsFillingUnit = whetherFirstWinningUnitIsFillingUnit == null ? null : whetherFirstWinningUnitIsFillingUnit.trim();
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
     * 获奖日期
     * @return award_date 获奖日期
     */
    public String getAwardDate() {
        return awardDate;
    }

    /**
     * 获奖日期
     * @param awardDate 获奖日期
     */
    public void setAwardDate(String awardDate) {
        this.awardDate = awardDate == null ? null : awardDate.trim();
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
        sb.append(", completionOrder=").append(completionOrder);
        sb.append(", awardName=").append(awardName);
        sb.append(", certificateNumber=").append(certificateNumber);
        sb.append(", whetherFirstWinningUnitIsFillingUnit=").append(whetherFirstWinningUnitIsFillingUnit);
        sb.append(", awardLevel=").append(awardLevel);
        sb.append(", awardGrade=").append(awardGrade);
        sb.append(", awardDate=").append(awardDate);
        sb.append(", awardingUnit=").append(awardingUnit);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}