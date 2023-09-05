package com.ccnu.pojo;

import java.io.Serializable;

public class ResearchAwards222 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 获奖级别
     */
    private String awardLevel;

    /**
     * 获奖名称
     */
    private String awardName;

    /**
     * 本单位是否为第一完成单位
     */
    private String whetherFirstCompletedUnit;

    /**
     * 获奖类别
     */
    private String awardCategory;

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
     * 获奖证书编号
     */
    private String awardCertificateNumber;

    /**
     * 完成单位排名
     */
    private String completeUnitRanking;

    /**
     * 本人排序
     */
    private String sortByName;

    /**
     * 最后更新时间
     */
    private String lastTime;

    /**
     * 是否删除
     */
    private String isdelete;

    /**
     * research_awards_2_2_2
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
     * 获奖名称
     * @return award_name 获奖名称
     */
    public String getAwardName() {
        return awardName;
    }

    /**
     * 获奖名称
     * @param awardName 获奖名称
     */
    public void setAwardName(String awardName) {
        this.awardName = awardName == null ? null : awardName.trim();
    }

    /**
     * 本单位是否为第一完成单位
     * @return whether_first_completed_unit 本单位是否为第一完成单位
     */
    public String getWhetherFirstCompletedUnit() {
        return whetherFirstCompletedUnit;
    }

    /**
     * 本单位是否为第一完成单位
     * @param whetherFirstCompletedUnit 本单位是否为第一完成单位
     */
    public void setWhetherFirstCompletedUnit(String whetherFirstCompletedUnit) {
        this.whetherFirstCompletedUnit = whetherFirstCompletedUnit == null ? null : whetherFirstCompletedUnit.trim();
    }

    /**
     * 获奖类别
     * @return award_category 获奖类别
     */
    public String getAwardCategory() {
        return awardCategory;
    }

    /**
     * 获奖类别
     * @param awardCategory 获奖类别
     */
    public void setAwardCategory(String awardCategory) {
        this.awardCategory = awardCategory == null ? null : awardCategory.trim();
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
     * 获奖证书编号
     * @return award_certificate_number 获奖证书编号
     */
    public String getAwardCertificateNumber() {
        return awardCertificateNumber;
    }

    /**
     * 获奖证书编号
     * @param awardCertificateNumber 获奖证书编号
     */
    public void setAwardCertificateNumber(String awardCertificateNumber) {
        this.awardCertificateNumber = awardCertificateNumber == null ? null : awardCertificateNumber.trim();
    }

    /**
     * 完成单位排名
     * @return complete_unit_ranking 完成单位排名
     */
    public String getCompleteUnitRanking() {
        return completeUnitRanking;
    }

    /**
     * 完成单位排名
     * @param completeUnitRanking 完成单位排名
     */
    public void setCompleteUnitRanking(String completeUnitRanking) {
        this.completeUnitRanking = completeUnitRanking == null ? null : completeUnitRanking.trim();
    }

    /**
     * 本人排序
     * @return sort_by_name 本人排序
     */
    public String getSortByName() {
        return sortByName;
    }

    /**
     * 本人排序
     * @param sortByName 本人排序
     */
    public void setSortByName(String sortByName) {
        this.sortByName = sortByName == null ? null : sortByName.trim();
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
        sb.append(", awardLevel=").append(awardLevel);
        sb.append(", awardName=").append(awardName);
        sb.append(", whetherFirstCompletedUnit=").append(whetherFirstCompletedUnit);
        sb.append(", awardCategory=").append(awardCategory);
        sb.append(", awardGrade=").append(awardGrade);
        sb.append(", awardDate=").append(awardDate);
        sb.append(", awardingUnit=").append(awardingUnit);
        sb.append(", awardCertificateNumber=").append(awardCertificateNumber);
        sb.append(", completeUnitRanking=").append(completeUnitRanking);
        sb.append(", sortByName=").append(sortByName);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}