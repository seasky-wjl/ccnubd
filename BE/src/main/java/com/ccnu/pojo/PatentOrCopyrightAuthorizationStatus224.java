package com.ccnu.pojo;

import java.io.Serializable;

public class PatentOrCopyrightAuthorizationStatus224 implements Serializable {
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
     * patent_or_copyright_authorization_status_2_2_4
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
     * 专利或著作名称
     * @return patent_or_book_name 专利或著作名称
     */
    public String getPatentOrBookName() {
        return patentOrBookName;
    }

    /**
     * 专利或著作名称
     * @param patentOrBookName 专利或著作名称
     */
    public void setPatentOrBookName(String patentOrBookName) {
        this.patentOrBookName = patentOrBookName == null ? null : patentOrBookName.trim();
    }

    /**
     * 知识产权类别
     * @return intellectual_property_category 知识产权类别
     */
    public String getIntellectualPropertyCategory() {
        return intellectualPropertyCategory;
    }

    /**
     * 知识产权类别
     * @param intellectualPropertyCategory 知识产权类别
     */
    public void setIntellectualPropertyCategory(String intellectualPropertyCategory) {
        this.intellectualPropertyCategory = intellectualPropertyCategory == null ? null : intellectualPropertyCategory.trim();
    }

    /**
     * 授权号
     * @return authorization_number 授权号
     */
    public String getAuthorizationNumber() {
        return authorizationNumber;
    }

    /**
     * 授权号
     * @param authorizationNumber 授权号
     */
    public void setAuthorizationNumber(String authorizationNumber) {
        this.authorizationNumber = authorizationNumber == null ? null : authorizationNumber.trim();
    }

    /**
     * 授权日期
     * @return approved_date 授权日期
     */
    public String getApprovedDate() {
        return approvedDate;
    }

    /**
     * 授权日期
     * @param approvedDate 授权日期
     */
    public void setApprovedDate(String approvedDate) {
        this.approvedDate = approvedDate == null ? null : approvedDate.trim();
    }

    /**
     * 本人排序
     * @return sort_by_me 本人排序
     */
    public String getSortByMe() {
        return sortByMe;
    }

    /**
     * 本人排序
     * @param sortByMe 本人排序
     */
    public void setSortByMe(String sortByMe) {
        this.sortByMe = sortByMe == null ? null : sortByMe.trim();
    }

    /**
     * 本单位是否为第一申请单位
     * @return whether_unit_is_first_application_unit 本单位是否为第一申请单位
     */
    public String getWhetherUnitIsFirstApplicationUnit() {
        return whetherUnitIsFirstApplicationUnit;
    }

    /**
     * 本单位是否为第一申请单位
     * @param whetherUnitIsFirstApplicationUnit 本单位是否为第一申请单位
     */
    public void setWhetherUnitIsFirstApplicationUnit(String whetherUnitIsFirstApplicationUnit) {
        this.whetherUnitIsFirstApplicationUnit = whetherUnitIsFirstApplicationUnit == null ? null : whetherUnitIsFirstApplicationUnit.trim();
    }

    /**
     * 是否行业联合专利
     * @return whether_industry_joint_patent 是否行业联合专利
     */
    public String getWhetherIndustryJointPatent() {
        return whetherIndustryJointPatent;
    }

    /**
     * 是否行业联合专利
     * @param whetherIndustryJointPatent 是否行业联合专利
     */
    public void setWhetherIndustryJointPatent(String whetherIndustryJointPatent) {
        this.whetherIndustryJointPatent = whetherIndustryJointPatent == null ? null : whetherIndustryJointPatent.trim();
    }

    /**
     * 
     * @return last_time 
     */
    public String getLastTime() {
        return lastTime;
    }

    /**
     * 
     * @param lastTime 
     */
    public void setLastTime(String lastTime) {
        this.lastTime = lastTime == null ? null : lastTime.trim();
    }

    /**
     * 
     * @return isdelete 
     */
    public String getIsdelete() {
        return isdelete;
    }

    /**
     * 
     * @param isdelete 
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
        sb.append(", patentOrBookName=").append(patentOrBookName);
        sb.append(", intellectualPropertyCategory=").append(intellectualPropertyCategory);
        sb.append(", authorizationNumber=").append(authorizationNumber);
        sb.append(", approvedDate=").append(approvedDate);
        sb.append(", sortByMe=").append(sortByMe);
        sb.append(", whetherUnitIsFirstApplicationUnit=").append(whetherUnitIsFirstApplicationUnit);
        sb.append(", whetherIndustryJointPatent=").append(whetherIndustryJointPatent);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}