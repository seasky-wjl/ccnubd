package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 表224前端展示数据
 * @author: lsc
 * @create: 2021-10-21 22:49
 **/
public class PatentOrCopyrightAuthorizationStatus224Vo {
    /**
     *
     */
    private Integer id;

    /**
     * 导师唯一标识码
     */
    private String tutorIdentificationCode;

    /**
     * 专利或著作名称
     */
    private String patentOrBookName;

    /**
     * 知识产权类别
     */
    private String intellectualPropertyCategory;

    /**
     * 授权号
     */
    private String authorizationNumber;

    /**
     * 授权日期
     */
    private String approvedDate;

    /**
     * 本人排序
     */
    private String sortByMe;

    /**
     * 本单位是否为第一申请单位
     */
    private String whetherUnitIsFirstApplicationUnit;

    /**
     * 是否行业联合专利
     */
    private String whetherIndustryJointPatent;

    /**
     *
     */
    private String lastTime;

    /**
     *
     */
    private String isdelete;

    /**
     * 博导姓名
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

    public String getPatentOrBookName() {
        return patentOrBookName;
    }

    public void setPatentOrBookName(String patentOrBookName) {
        this.patentOrBookName = patentOrBookName;
    }

    public String getIntellectualPropertyCategory() {
        return intellectualPropertyCategory;
    }

    public void setIntellectualPropertyCategory(String intellectualPropertyCategory) {
        this.intellectualPropertyCategory = intellectualPropertyCategory;
    }

    public String getAuthorizationNumber() {
        return authorizationNumber;
    }

    public void setAuthorizationNumber(String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }

    public String getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(String approvedDate) {
        this.approvedDate = approvedDate;
    }

    public String getSortByMe() {
        return sortByMe;
    }

    public void setSortByMe(String sortByMe) {
        this.sortByMe = sortByMe;
    }

    public String getWhetherUnitIsFirstApplicationUnit() {
        return whetherUnitIsFirstApplicationUnit;
    }

    public void setWhetherUnitIsFirstApplicationUnit(String whetherUnitIsFirstApplicationUnit) {
        this.whetherUnitIsFirstApplicationUnit = whetherUnitIsFirstApplicationUnit;
    }

    public String getWhetherIndustryJointPatent() {
        return whetherIndustryJointPatent;
    }

    public void setWhetherIndustryJointPatent(String whetherIndustryJointPatent) {
        this.whetherIndustryJointPatent = whetherIndustryJointPatent;
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
