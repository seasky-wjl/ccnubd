package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 表226前端展示数据
 * @author: lsc
 * @create: 2021-10-21 23:02
 **/
public class AcademicAppointment226Vo {
    /**
     *
     */
    private Integer id;

    /**
     * 导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 职务名称
     */
    private String jobTitle;

    /**
     * 职务级别
     */
    private String jobLevel;

    /**
     * 任职组织
     */
    private String employmentOrganization;

    /**
     * 组织类型
     */
    private String organizationType;

    /**
     * 开始任职年月
     */
    private String startOfOffice;

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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getEmploymentOrganization() {
        return employmentOrganization;
    }

    public void setEmploymentOrganization(String employmentOrganization) {
        this.employmentOrganization = employmentOrganization;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getStartOfOffice() {
        return startOfOffice;
    }

    public void setStartOfOffice(String startOfOffice) {
        this.startOfOffice = startOfOffice;
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
