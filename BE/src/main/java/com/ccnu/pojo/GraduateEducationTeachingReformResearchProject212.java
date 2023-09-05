package com.ccnu.pojo;

import java.io.Serializable;

public class GraduateEducationTeachingReformResearchProject212 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 导师唯一标识码
     */
    private String tutorIdentificationCode;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 立项日期
     */
    private String projectDate;

    /**
     * 项目状态
     */
    private String projectStatus;

    /**
     * 结束日期
     */
    private String endOfDate;

    /**
     * 项目等级
     */
    private String projectLevel;

    /**
     * 立项经费
     */
    private String projectFunding;

    /**
     * 经费来源
     */
    private String sourcesOfFunding;

    /**
     * 本人角色
     */
    private String role;

    /**
     * 最后更新时间
     */
    private String lastTime;

    /**
     * 是否删除
     */
    private String isdelete;

    /**
     * graduate_education_teaching_reform_research_project_2_1_2
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
     * 项目名称
     * @return project_name 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 项目名称
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * 立项日期
     * @return project_date 立项日期
     */
    public String getProjectDate() {
        return projectDate;
    }

    /**
     * 立项日期
     * @param projectDate 立项日期
     */
    public void setProjectDate(String projectDate) {
        this.projectDate = projectDate == null ? null : projectDate.trim();
    }

    /**
     * 项目状态
     * @return project_status 项目状态
     */
    public String getProjectStatus() {
        return projectStatus;
    }

    /**
     * 项目状态
     * @param projectStatus 项目状态
     */
    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus == null ? null : projectStatus.trim();
    }

    /**
     * 结束日期
     * @return end_of_date 结束日期
     */
    public String getEndOfDate() {
        return endOfDate;
    }

    /**
     * 结束日期
     * @param endOfDate 结束日期
     */
    public void setEndOfDate(String endOfDate) {
        this.endOfDate = endOfDate == null ? null : endOfDate.trim();
    }

    /**
     * 项目等级
     * @return project_level 项目等级
     */
    public String getProjectLevel() {
        return projectLevel;
    }

    /**
     * 项目等级
     * @param projectLevel 项目等级
     */
    public void setProjectLevel(String projectLevel) {
        this.projectLevel = projectLevel == null ? null : projectLevel.trim();
    }

    /**
     * 立项经费
     * @return project_funding 立项经费
     */
    public String getProjectFunding() {
        return projectFunding;
    }

    /**
     * 立项经费
     * @param projectFunding 立项经费
     */
    public void setProjectFunding(String projectFunding) {
        this.projectFunding = projectFunding == null ? null : projectFunding.trim();
    }

    /**
     * 经费来源
     * @return sources_of_funding 经费来源
     */
    public String getSourcesOfFunding() {
        return sourcesOfFunding;
    }

    /**
     * 经费来源
     * @param sourcesOfFunding 经费来源
     */
    public void setSourcesOfFunding(String sourcesOfFunding) {
        this.sourcesOfFunding = sourcesOfFunding == null ? null : sourcesOfFunding.trim();
    }

    /**
     * 本人角色
     * @return role 本人角色
     */
    public String getRole() {
        return role;
    }

    /**
     * 本人角色
     * @param role 本人角色
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
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
        sb.append(", projectName=").append(projectName);
        sb.append(", projectDate=").append(projectDate);
        sb.append(", projectStatus=").append(projectStatus);
        sb.append(", endOfDate=").append(endOfDate);
        sb.append(", projectLevel=").append(projectLevel);
        sb.append(", projectFunding=").append(projectFunding);
        sb.append(", sourcesOfFunding=").append(sourcesOfFunding);
        sb.append(", role=").append(role);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}