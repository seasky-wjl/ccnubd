package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 表214前端展示数据
 * @author: lsc
 * @create: 2021-10-21 22:17
 **/
public class AwardsForGraduateTeachingAchievements214Vo {
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

    public String getCompletionOrder() {
        return completionOrder;
    }

    public void setCompletionOrder(String completionOrder) {
        this.completionOrder = completionOrder;
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

    public String getWhetherFirstWinningUnitIsFillingUnit() {
        return whetherFirstWinningUnitIsFillingUnit;
    }

    public void setWhetherFirstWinningUnitIsFillingUnit(String whetherFirstWinningUnitIsFillingUnit) {
        this.whetherFirstWinningUnitIsFillingUnit = whetherFirstWinningUnitIsFillingUnit;
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

    public String getAwardDate() {
        return awardDate;
    }

    public void setAwardDate(String awardDate) {
        this.awardDate = awardDate;
    }

    public String getAwardingUnit() {
        return awardingUnit;
    }

    public void setAwardingUnit(String awardingUnit) {
        this.awardingUnit = awardingUnit;
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
