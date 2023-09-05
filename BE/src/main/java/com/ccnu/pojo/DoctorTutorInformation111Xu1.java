package com.ccnu.pojo;

import java.io.Serializable;

public class DoctorTutorInformation111Xu1 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 参加工作日期
     */
    private String participationDate;

    /**
     * 首次具有博士生招生资格日期
     */
    private String firstDateOfAdmissionToDoctoralStudents;

    /**
     * 是否在编
     */
    private String inTheStaff;

    /**
     * 是否与填报单位签订聘用合同
     */
    private String signContractWithInstitution;

    /**
     * 聘用期限
     */
    private String employmentPeriod;

    /**
     * 是否于填报单位承担全职工作
     */
    private String fullTimeJobInUnit;

    /**
     * 全职工作单位
     */
    private String fullTimeJobUnit;

    /**
     * 是否为离退休人员
     */
    private String isRetire;

    /**
     * 聘任专业技术职务
     */
    private String professionalAndTechnicalPositions;

    /**
     * 岗位等级
     */
    private String postRating;

    /**
     * 党政职务
     */
    private String partyAndGovernmentDuties;

    /**
     * 海外研修（访学）经历
     */
    private String overseasTrainingExperience;

    /**
     * 入选人才项目名称及入选年份
     */
    private String nameOfSelectedTalentProjectAndYearOfSelection;

    /**
     * 是否具有其他行业技术职称
     */
    private String haveOtherIndustryTechnicalTitles;

    /**
     * 是否具有国内外学术兼职
     */
    private String haveAcademicPartTimeAtHomeAndAbroad;

    /**
     * 
     */
    private String lastTime;

    /**
     * 
     */
    private String isdelete;

    /**
     * doctor_tutor_information_1_1_1_xu1
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
     * 参加工作日期
     * @return participation_date 参加工作日期
     */
    public String getParticipationDate() {
        return participationDate;
    }

    /**
     * 参加工作日期
     * @param participationDate 参加工作日期
     */
    public void setParticipationDate(String participationDate) {
        this.participationDate = participationDate == null ? null : participationDate.trim();
    }

    /**
     * 首次具有博士生招生资格日期
     * @return first_date_of_admission_to_doctoral_students 首次具有博士生招生资格日期
     */
    public String getFirstDateOfAdmissionToDoctoralStudents() {
        return firstDateOfAdmissionToDoctoralStudents;
    }

    /**
     * 首次具有博士生招生资格日期
     * @param firstDateOfAdmissionToDoctoralStudents 首次具有博士生招生资格日期
     */
    public void setFirstDateOfAdmissionToDoctoralStudents(String firstDateOfAdmissionToDoctoralStudents) {
        this.firstDateOfAdmissionToDoctoralStudents = firstDateOfAdmissionToDoctoralStudents == null ? null : firstDateOfAdmissionToDoctoralStudents.trim();
    }

    /**
     * 是否在编
     * @return in_the_staff 是否在编
     */
    public String getInTheStaff() {
        return inTheStaff;
    }

    /**
     * 是否在编
     * @param inTheStaff 是否在编
     */
    public void setInTheStaff(String inTheStaff) {
        this.inTheStaff = inTheStaff == null ? null : inTheStaff.trim();
    }

    /**
     * 是否与填报单位签订聘用合同
     * @return sign_contract_with_institution 是否与填报单位签订聘用合同
     */
    public String getSignContractWithInstitution() {
        return signContractWithInstitution;
    }

    /**
     * 是否与填报单位签订聘用合同
     * @param signContractWithInstitution 是否与填报单位签订聘用合同
     */
    public void setSignContractWithInstitution(String signContractWithInstitution) {
        this.signContractWithInstitution = signContractWithInstitution == null ? null : signContractWithInstitution.trim();
    }

    /**
     * 聘用期限
     * @return employment_period 聘用期限
     */
    public String getEmploymentPeriod() {
        return employmentPeriod;
    }

    /**
     * 聘用期限
     * @param employmentPeriod 聘用期限
     */
    public void setEmploymentPeriod(String employmentPeriod) {
        this.employmentPeriod = employmentPeriod == null ? null : employmentPeriod.trim();
    }

    /**
     * 是否于填报单位承担全职工作
     * @return full_time_job_in_unit 是否于填报单位承担全职工作
     */
    public String getFullTimeJobInUnit() {
        return fullTimeJobInUnit;
    }

    /**
     * 是否于填报单位承担全职工作
     * @param fullTimeJobInUnit 是否于填报单位承担全职工作
     */
    public void setFullTimeJobInUnit(String fullTimeJobInUnit) {
        this.fullTimeJobInUnit = fullTimeJobInUnit == null ? null : fullTimeJobInUnit.trim();
    }

    /**
     * 全职工作单位
     * @return full_time_job_unit 全职工作单位
     */
    public String getFullTimeJobUnit() {
        return fullTimeJobUnit;
    }

    /**
     * 全职工作单位
     * @param fullTimeJobUnit 全职工作单位
     */
    public void setFullTimeJobUnit(String fullTimeJobUnit) {
        this.fullTimeJobUnit = fullTimeJobUnit == null ? null : fullTimeJobUnit.trim();
    }

    /**
     * 是否为离退休人员
     * @return is_retire 是否为离退休人员
     */
    public String getIsRetire() {
        return isRetire;
    }

    /**
     * 是否为离退休人员
     * @param isRetire 是否为离退休人员
     */
    public void setIsRetire(String isRetire) {
        this.isRetire = isRetire == null ? null : isRetire.trim();
    }

    /**
     * 聘任专业技术职务
     * @return professional_and_technical_positions 聘任专业技术职务
     */
    public String getProfessionalAndTechnicalPositions() {
        return professionalAndTechnicalPositions;
    }

    /**
     * 聘任专业技术职务
     * @param professionalAndTechnicalPositions 聘任专业技术职务
     */
    public void setProfessionalAndTechnicalPositions(String professionalAndTechnicalPositions) {
        this.professionalAndTechnicalPositions = professionalAndTechnicalPositions == null ? null : professionalAndTechnicalPositions.trim();
    }

    /**
     * 岗位等级
     * @return post_rating 岗位等级
     */
    public String getPostRating() {
        return postRating;
    }

    /**
     * 岗位等级
     * @param postRating 岗位等级
     */
    public void setPostRating(String postRating) {
        this.postRating = postRating == null ? null : postRating.trim();
    }

    /**
     * 党政职务
     * @return party_and_government_duties 党政职务
     */
    public String getPartyAndGovernmentDuties() {
        return partyAndGovernmentDuties;
    }

    /**
     * 党政职务
     * @param partyAndGovernmentDuties 党政职务
     */
    public void setPartyAndGovernmentDuties(String partyAndGovernmentDuties) {
        this.partyAndGovernmentDuties = partyAndGovernmentDuties == null ? null : partyAndGovernmentDuties.trim();
    }

    /**
     * 海外研修（访学）经历
     * @return overseas_training_experience 海外研修（访学）经历
     */
    public String getOverseasTrainingExperience() {
        return overseasTrainingExperience;
    }

    /**
     * 海外研修（访学）经历
     * @param overseasTrainingExperience 海外研修（访学）经历
     */
    public void setOverseasTrainingExperience(String overseasTrainingExperience) {
        this.overseasTrainingExperience = overseasTrainingExperience == null ? null : overseasTrainingExperience.trim();
    }

    /**
     * 入选人才项目名称及入选年份
     * @return name_of_selected_talent_project_and_year_of_selection 入选人才项目名称及入选年份
     */
    public String getNameOfSelectedTalentProjectAndYearOfSelection() {
        return nameOfSelectedTalentProjectAndYearOfSelection;
    }

    /**
     * 入选人才项目名称及入选年份
     * @param nameOfSelectedTalentProjectAndYearOfSelection 入选人才项目名称及入选年份
     */
    public void setNameOfSelectedTalentProjectAndYearOfSelection(String nameOfSelectedTalentProjectAndYearOfSelection) {
        this.nameOfSelectedTalentProjectAndYearOfSelection = nameOfSelectedTalentProjectAndYearOfSelection == null ? null : nameOfSelectedTalentProjectAndYearOfSelection.trim();
    }

    /**
     * 是否具有其他行业技术职称
     * @return have_other_industry_technical_titles 是否具有其他行业技术职称
     */
    public String getHaveOtherIndustryTechnicalTitles() {
        return haveOtherIndustryTechnicalTitles;
    }

    /**
     * 是否具有其他行业技术职称
     * @param haveOtherIndustryTechnicalTitles 是否具有其他行业技术职称
     */
    public void setHaveOtherIndustryTechnicalTitles(String haveOtherIndustryTechnicalTitles) {
        this.haveOtherIndustryTechnicalTitles = haveOtherIndustryTechnicalTitles == null ? null : haveOtherIndustryTechnicalTitles.trim();
    }

    /**
     * 是否具有国内外学术兼职
     * @return have_academic_part_time_at_home_and_abroad 是否具有国内外学术兼职
     */
    public String getHaveAcademicPartTimeAtHomeAndAbroad() {
        return haveAcademicPartTimeAtHomeAndAbroad;
    }

    /**
     * 是否具有国内外学术兼职
     * @param haveAcademicPartTimeAtHomeAndAbroad 是否具有国内外学术兼职
     */
    public void setHaveAcademicPartTimeAtHomeAndAbroad(String haveAcademicPartTimeAtHomeAndAbroad) {
        this.haveAcademicPartTimeAtHomeAndAbroad = haveAcademicPartTimeAtHomeAndAbroad == null ? null : haveAcademicPartTimeAtHomeAndAbroad.trim();
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
        sb.append(", participationDate=").append(participationDate);
        sb.append(", firstDateOfAdmissionToDoctoralStudents=").append(firstDateOfAdmissionToDoctoralStudents);
        sb.append(", inTheStaff=").append(inTheStaff);
        sb.append(", signContractWithInstitution=").append(signContractWithInstitution);
        sb.append(", employmentPeriod=").append(employmentPeriod);
        sb.append(", fullTimeJobInUnit=").append(fullTimeJobInUnit);
        sb.append(", fullTimeJobUnit=").append(fullTimeJobUnit);
        sb.append(", isRetire=").append(isRetire);
        sb.append(", professionalAndTechnicalPositions=").append(professionalAndTechnicalPositions);
        sb.append(", postRating=").append(postRating);
        sb.append(", partyAndGovernmentDuties=").append(partyAndGovernmentDuties);
        sb.append(", overseasTrainingExperience=").append(overseasTrainingExperience);
        sb.append(", nameOfSelectedTalentProjectAndYearOfSelection=").append(nameOfSelectedTalentProjectAndYearOfSelection);
        sb.append(", haveOtherIndustryTechnicalTitles=").append(haveOtherIndustryTechnicalTitles);
        sb.append(", haveAcademicPartTimeAtHomeAndAbroad=").append(haveAcademicPartTimeAtHomeAndAbroad);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}