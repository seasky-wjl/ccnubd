package com.ccnu.pojo;

import java.io.Serializable;

public class AcademicAppointment226 implements Serializable {
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
     * academic_appointment_2_2_6
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
     * 职务名称
     * @return job_title 职务名称
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 职务名称
     * @param jobTitle 职务名称
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle == null ? null : jobTitle.trim();
    }

    /**
     * 职务级别
     * @return job_level 职务级别
     */
    public String getJobLevel() {
        return jobLevel;
    }

    /**
     * 职务级别
     * @param jobLevel 职务级别
     */
    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel == null ? null : jobLevel.trim();
    }

    /**
     * 任职组织
     * @return employment_organization 任职组织
     */
    public String getEmploymentOrganization() {
        return employmentOrganization;
    }

    /**
     * 任职组织
     * @param employmentOrganization 任职组织
     */
    public void setEmploymentOrganization(String employmentOrganization) {
        this.employmentOrganization = employmentOrganization == null ? null : employmentOrganization.trim();
    }

    /**
     * 组织类型
     * @return organization_type 组织类型
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * 组织类型
     * @param organizationType 组织类型
     */
    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType == null ? null : organizationType.trim();
    }

    /**
     * 开始任职年月
     * @return start_of_office 开始任职年月
     */
    public String getStartOfOffice() {
        return startOfOffice;
    }

    /**
     * 开始任职年月
     * @param startOfOffice 开始任职年月
     */
    public void setStartOfOffice(String startOfOffice) {
        this.startOfOffice = startOfOffice == null ? null : startOfOffice.trim();
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
        sb.append(", jobTitle=").append(jobTitle);
        sb.append(", jobLevel=").append(jobLevel);
        sb.append(", employmentOrganization=").append(employmentOrganization);
        sb.append(", organizationType=").append(organizationType);
        sb.append(", startOfOffice=").append(startOfOffice);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}