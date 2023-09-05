package com.ccnu.pojo;

import java.io.Serializable;

public class ResearchProjectSituation121 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 导师唯一识别码
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
     * 立项编号
     */
    private String projectNumber;

    /**
     * 项目类型
     */
    private String projectType;

    /**
     * 纵向项目类型
     */
    private String verticalProjectType;

    /**
     * 项目状态
     */
    private String projectStatus;

    /**
     * 填表单位排序
     */
    private String sortUnitByFillInForm;

    /**
     * 国内项目合同金额
     */
    private String domesticProjectContractAmount;

    /**
     * 国外项目合同金额
     */
    private String abroadProjectContractAmount;

    /**
     * 项目累计到款
     */
    private String accumulatedItems;

    /**
     * 项目年度到款
     */
    private String projectYearToPayment;

    /**
     * 结题验收或鉴定时间
     */
    private String finalAcceptanceOrIdentificationTime;

    /**
     * 角色
     */
    private String role;

    /**
     * 最后更新时间
     */
    private String lastTime;

    /**
     * 删除
     */
    private String isdelete;

    /**
     * research_project_situation_1_2_1
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
     * 立项编号
     * @return project_number 立项编号
     */
    public String getProjectNumber() {
        return projectNumber;
    }

    /**
     * 立项编号
     * @param projectNumber 立项编号
     */
    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber == null ? null : projectNumber.trim();
    }

    /**
     * 项目类型
     * @return project_type 项目类型
     */
    public String getProjectType() {
        return projectType;
    }

    /**
     * 项目类型
     * @param projectType 项目类型
     */
    public void setProjectType(String projectType) {
        this.projectType = projectType == null ? null : projectType.trim();
    }

    /**
     * 纵向项目类型
     * @return vertical_project_type 纵向项目类型
     */
    public String getVerticalProjectType() {
        return verticalProjectType;
    }

    /**
     * 纵向项目类型
     * @param verticalProjectType 纵向项目类型
     */
    public void setVerticalProjectType(String verticalProjectType) {
        this.verticalProjectType = verticalProjectType == null ? null : verticalProjectType.trim();
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
     * 填表单位排序
     * @return sort_unit_by_fill_in_form 填表单位排序
     */
    public String getSortUnitByFillInForm() {
        return sortUnitByFillInForm;
    }

    /**
     * 填表单位排序
     * @param sortUnitByFillInForm 填表单位排序
     */
    public void setSortUnitByFillInForm(String sortUnitByFillInForm) {
        this.sortUnitByFillInForm = sortUnitByFillInForm == null ? null : sortUnitByFillInForm.trim();
    }

    /**
     * 国内项目合同金额
     * @return domestic_project_contract_amount 国内项目合同金额
     */
    public String getDomesticProjectContractAmount() {
        return domesticProjectContractAmount;
    }

    /**
     * 国内项目合同金额
     * @param domesticProjectContractAmount 国内项目合同金额
     */
    public void setDomesticProjectContractAmount(String domesticProjectContractAmount) {
        this.domesticProjectContractAmount = domesticProjectContractAmount == null ? null : domesticProjectContractAmount.trim();
    }

    /**
     * 国外项目合同金额
     * @return abroad_project_contract_amount 国外项目合同金额
     */
    public String getAbroadProjectContractAmount() {
        return abroadProjectContractAmount;
    }

    /**
     * 国外项目合同金额
     * @param abroadProjectContractAmount 国外项目合同金额
     */
    public void setAbroadProjectContractAmount(String abroadProjectContractAmount) {
        this.abroadProjectContractAmount = abroadProjectContractAmount == null ? null : abroadProjectContractAmount.trim();
    }

    /**
     * 项目累计到款
     * @return accumulated_items 项目累计到款
     */
    public String getAccumulatedItems() {
        return accumulatedItems;
    }

    /**
     * 项目累计到款
     * @param accumulatedItems 项目累计到款
     */
    public void setAccumulatedItems(String accumulatedItems) {
        this.accumulatedItems = accumulatedItems == null ? null : accumulatedItems.trim();
    }

    /**
     * 项目年度到款
     * @return project_year_to_payment 项目年度到款
     */
    public String getProjectYearToPayment() {
        return projectYearToPayment;
    }

    /**
     * 项目年度到款
     * @param projectYearToPayment 项目年度到款
     */
    public void setProjectYearToPayment(String projectYearToPayment) {
        this.projectYearToPayment = projectYearToPayment == null ? null : projectYearToPayment.trim();
    }

    /**
     * 结题验收或鉴定时间
     * @return final_acceptance_or_identification_time 结题验收或鉴定时间
     */
    public String getFinalAcceptanceOrIdentificationTime() {
        return finalAcceptanceOrIdentificationTime;
    }

    /**
     * 结题验收或鉴定时间
     * @param finalAcceptanceOrIdentificationTime 结题验收或鉴定时间
     */
    public void setFinalAcceptanceOrIdentificationTime(String finalAcceptanceOrIdentificationTime) {
        this.finalAcceptanceOrIdentificationTime = finalAcceptanceOrIdentificationTime == null ? null : finalAcceptanceOrIdentificationTime.trim();
    }

    /**
     * 角色
     * @return role 角色
     */
    public String getRole() {
        return role;
    }

    /**
     * 角色
     * @param role 角色
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
     * 删除
     * @return isdelete 删除
     */
    public String getIsdelete() {
        return isdelete;
    }

    /**
     * 删除
     * @param isdelete 删除
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
        sb.append(", projectNumber=").append(projectNumber);
        sb.append(", projectType=").append(projectType);
        sb.append(", verticalProjectType=").append(verticalProjectType);
        sb.append(", projectStatus=").append(projectStatus);
        sb.append(", sortUnitByFillInForm=").append(sortUnitByFillInForm);
        sb.append(", domesticProjectContractAmount=").append(domesticProjectContractAmount);
        sb.append(", abroadProjectContractAmount=").append(abroadProjectContractAmount);
        sb.append(", accumulatedItems=").append(accumulatedItems);
        sb.append(", projectYearToPayment=").append(projectYearToPayment);
        sb.append(", finalAcceptanceOrIdentificationTime=").append(finalAcceptanceOrIdentificationTime);
        sb.append(", role=").append(role);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}