package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 表227前端展示数据
 * @author: lsc
 * @create: 2021-10-21 23:08
 **/
public class RelyingOnScientificResearchPlatform227Vo {

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

    public String getResearchPlatformName() {
        return researchPlatformName;
    }

    public void setResearchPlatformName(String researchPlatformName) {
        this.researchPlatformName = researchPlatformName;
    }

    public String getResearchPlatformLevel() {
        return researchPlatformLevel;
    }

    public void setResearchPlatformLevel(String researchPlatformLevel) {
        this.researchPlatformLevel = researchPlatformLevel;
    }

    public String getResearchPlatformCategory() {
        return researchPlatformCategory;
    }

    public void setResearchPlatformCategory(String researchPlatformCategory) {
        this.researchPlatformCategory = researchPlatformCategory;
    }

    public String getProvincialAndMinisterialAuthorities() {
        return provincialAndMinisterialAuthorities;
    }

    public void setProvincialAndMinisterialAuthorities(String provincialAndMinisterialAuthorities) {
        this.provincialAndMinisterialAuthorities = provincialAndMinisterialAuthorities;
    }

    public String getServe() {
        return serve;
    }

    public void setServe(String serve) {
        this.serve = serve;
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
