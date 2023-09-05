package com.ccnu.pojo;

import java.io.Serializable;

public class RelyingOnScientificResearchPlatform227 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 科研平台名称
     */
    private String researchPlatformName;

    /**
     * 科研平台级别
     */
    private String researchPlatformLevel;

    /**
     * 科研平台类别
     */
    private String researchPlatformCategory;

    /**
     * 省部级主管部门
     */
    private String provincialAndMinisterialAuthorities;

    /**
     * 任职
     */
    private String serve;

    /**
     * 
     */
    private String lastTime;

    /**
     * 
     */
    private String isdelete;

    /**
     * relying_on_scientific_research_platform_2_2_7
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
     * 科研平台名称
     * @return research_platform_name 科研平台名称
     */
    public String getResearchPlatformName() {
        return researchPlatformName;
    }

    /**
     * 科研平台名称
     * @param researchPlatformName 科研平台名称
     */
    public void setResearchPlatformName(String researchPlatformName) {
        this.researchPlatformName = researchPlatformName == null ? null : researchPlatformName.trim();
    }

    /**
     * 科研平台级别
     * @return research_platform_level 科研平台级别
     */
    public String getResearchPlatformLevel() {
        return researchPlatformLevel;
    }

    /**
     * 科研平台级别
     * @param researchPlatformLevel 科研平台级别
     */
    public void setResearchPlatformLevel(String researchPlatformLevel) {
        this.researchPlatformLevel = researchPlatformLevel == null ? null : researchPlatformLevel.trim();
    }

    /**
     * 科研平台类别
     * @return research_platform_category 科研平台类别
     */
    public String getResearchPlatformCategory() {
        return researchPlatformCategory;
    }

    /**
     * 科研平台类别
     * @param researchPlatformCategory 科研平台类别
     */
    public void setResearchPlatformCategory(String researchPlatformCategory) {
        this.researchPlatformCategory = researchPlatformCategory == null ? null : researchPlatformCategory.trim();
    }

    /**
     * 省部级主管部门
     * @return provincial_and_ministerial_authorities 省部级主管部门
     */
    public String getProvincialAndMinisterialAuthorities() {
        return provincialAndMinisterialAuthorities;
    }

    /**
     * 省部级主管部门
     * @param provincialAndMinisterialAuthorities 省部级主管部门
     */
    public void setProvincialAndMinisterialAuthorities(String provincialAndMinisterialAuthorities) {
        this.provincialAndMinisterialAuthorities = provincialAndMinisterialAuthorities == null ? null : provincialAndMinisterialAuthorities.trim();
    }

    /**
     * 任职
     * @return serve 任职
     */
    public String getServe() {
        return serve;
    }

    /**
     * 任职
     * @param serve 任职
     */
    public void setServe(String serve) {
        this.serve = serve == null ? null : serve.trim();
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
        sb.append(", researchPlatformName=").append(researchPlatformName);
        sb.append(", researchPlatformLevel=").append(researchPlatformLevel);
        sb.append(", researchPlatformCategory=").append(researchPlatformCategory);
        sb.append(", provincialAndMinisterialAuthorities=").append(provincialAndMinisterialAuthorities);
        sb.append(", serve=").append(serve);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}