package com.ccnu.pojo;

import java.io.Serializable;

public class DoctorStudentInformation112 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 博士生唯一识别码
     */
    private String doctoralStudentIdentificationCode;

    /**
     * 姓名
     */
    private String name;

    /**
     * 
     */
    private String college;

    /**
     * 博士导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 合作指导导师唯一识别码
     */
    private String cooperativeGuidanceTutorIdentificationCode;

    /**
     * 学生类型
     */
    private String studentType;

    /**
     * 学习方式
     */
    private String wayOfLearning;

    /**
     * 国家（地区）
     */
    private String country;

    /**
     * 民族
     */
    private String nationality;

    /**
     * 学位类型
     */
    private String degreeType;

    /**
     * 现所属一级学科
     */
    private String firstLevelSubject;

    /**
     * 现所属二级学科
     */
    private String secondLevelSubject;

    /**
     * 现所属专业学位类别
     */
    private String currentProfessionalDegreeCategory;

    /**
     * 入学日期
     */
    private String entryDate;

    /**
     * 是否存在学籍变动
     */
    private String haveChangeInStudentStatus;

    /**
     * 学籍变动原因
     */
    private String reasonsForChangesInStudentStatus;

    /**
     * 是否授予学位
     */
    private String whetherToAwardDegree;

    /**
     * 
     */
    private String lastTime;

    /**
     * 
     */
    private String isdelete;

    /**
     * doctor_student_information_1_1_2
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
     * 博士生唯一识别码
     * @return doctoral_student_identification_code 博士生唯一识别码
     */
    public String getDoctoralStudentIdentificationCode() {
        return doctoralStudentIdentificationCode;
    }

    /**
     * 博士生唯一识别码
     * @param doctoralStudentIdentificationCode 博士生唯一识别码
     */
    public void setDoctoralStudentIdentificationCode(String doctoralStudentIdentificationCode) {
        this.doctoralStudentIdentificationCode = doctoralStudentIdentificationCode == null ? null : doctoralStudentIdentificationCode.trim();
    }

    /**
     * 姓名
     * @return name 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return college 
     */
    public String getCollege() {
        return college;
    }

    /**
     * 
     * @param college 
     */
    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    /**
     * 博士导师唯一识别码
     * @return tutor_identification_code 博士导师唯一识别码
     */
    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    /**
     * 博士导师唯一识别码
     * @param tutorIdentificationCode 博士导师唯一识别码
     */
    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode == null ? null : tutorIdentificationCode.trim();
    }

    /**
     * 合作指导导师唯一识别码
     * @return cooperative_guidance_tutor_identification_code 合作指导导师唯一识别码
     */
    public String getCooperativeGuidanceTutorIdentificationCode() {
        return cooperativeGuidanceTutorIdentificationCode;
    }

    /**
     * 合作指导导师唯一识别码
     * @param cooperativeGuidanceTutorIdentificationCode 合作指导导师唯一识别码
     */
    public void setCooperativeGuidanceTutorIdentificationCode(String cooperativeGuidanceTutorIdentificationCode) {
        this.cooperativeGuidanceTutorIdentificationCode = cooperativeGuidanceTutorIdentificationCode == null ? null : cooperativeGuidanceTutorIdentificationCode.trim();
    }

    /**
     * 学生类型
     * @return student_type 学生类型
     */
    public String getStudentType() {
        return studentType;
    }

    /**
     * 学生类型
     * @param studentType 学生类型
     */
    public void setStudentType(String studentType) {
        this.studentType = studentType == null ? null : studentType.trim();
    }

    /**
     * 学习方式
     * @return way_of_learning 学习方式
     */
    public String getWayOfLearning() {
        return wayOfLearning;
    }

    /**
     * 学习方式
     * @param wayOfLearning 学习方式
     */
    public void setWayOfLearning(String wayOfLearning) {
        this.wayOfLearning = wayOfLearning == null ? null : wayOfLearning.trim();
    }

    /**
     * 国家（地区）
     * @return country 国家（地区）
     */
    public String getCountry() {
        return country;
    }

    /**
     * 国家（地区）
     * @param country 国家（地区）
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 民族
     * @return nationality 民族
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 民族
     * @param nationality 民族
     */
    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    /**
     * 学位类型
     * @return degree_type 学位类型
     */
    public String getDegreeType() {
        return degreeType;
    }

    /**
     * 学位类型
     * @param degreeType 学位类型
     */
    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType == null ? null : degreeType.trim();
    }

    /**
     * 现所属一级学科
     * @return first_level_subject 现所属一级学科
     */
    public String getFirstLevelSubject() {
        return firstLevelSubject;
    }

    /**
     * 现所属一级学科
     * @param firstLevelSubject 现所属一级学科
     */
    public void setFirstLevelSubject(String firstLevelSubject) {
        this.firstLevelSubject = firstLevelSubject == null ? null : firstLevelSubject.trim();
    }

    /**
     * 现所属二级学科
     * @return second_level_subject 现所属二级学科
     */
    public String getSecondLevelSubject() {
        return secondLevelSubject;
    }

    /**
     * 现所属二级学科
     * @param secondLevelSubject 现所属二级学科
     */
    public void setSecondLevelSubject(String secondLevelSubject) {
        this.secondLevelSubject = secondLevelSubject == null ? null : secondLevelSubject.trim();
    }

    /**
     * 现所属专业学位类别
     * @return current_professional_degree_category 现所属专业学位类别
     */
    public String getCurrentProfessionalDegreeCategory() {
        return currentProfessionalDegreeCategory;
    }

    /**
     * 现所属专业学位类别
     * @param currentProfessionalDegreeCategory 现所属专业学位类别
     */
    public void setCurrentProfessionalDegreeCategory(String currentProfessionalDegreeCategory) {
        this.currentProfessionalDegreeCategory = currentProfessionalDegreeCategory == null ? null : currentProfessionalDegreeCategory.trim();
    }

    /**
     * 入学日期
     * @return entry_date 入学日期
     */
    public String getEntryDate() {
        return entryDate;
    }

    /**
     * 入学日期
     * @param entryDate 入学日期
     */
    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate == null ? null : entryDate.trim();
    }

    /**
     * 是否存在学籍变动
     * @return have_change_in_student_status 是否存在学籍变动
     */
    public String getHaveChangeInStudentStatus() {
        return haveChangeInStudentStatus;
    }

    /**
     * 是否存在学籍变动
     * @param haveChangeInStudentStatus 是否存在学籍变动
     */
    public void setHaveChangeInStudentStatus(String haveChangeInStudentStatus) {
        this.haveChangeInStudentStatus = haveChangeInStudentStatus == null ? null : haveChangeInStudentStatus.trim();
    }

    /**
     * 学籍变动原因
     * @return reasons_for_changes_in_student_status 学籍变动原因
     */
    public String getReasonsForChangesInStudentStatus() {
        return reasonsForChangesInStudentStatus;
    }

    /**
     * 学籍变动原因
     * @param reasonsForChangesInStudentStatus 学籍变动原因
     */
    public void setReasonsForChangesInStudentStatus(String reasonsForChangesInStudentStatus) {
        this.reasonsForChangesInStudentStatus = reasonsForChangesInStudentStatus == null ? null : reasonsForChangesInStudentStatus.trim();
    }

    /**
     * 是否授予学位
     * @return whether_to_award_degree 是否授予学位
     */
    public String getWhetherToAwardDegree() {
        return whetherToAwardDegree;
    }

    /**
     * 是否授予学位
     * @param whetherToAwardDegree 是否授予学位
     */
    public void setWhetherToAwardDegree(String whetherToAwardDegree) {
        this.whetherToAwardDegree = whetherToAwardDegree == null ? null : whetherToAwardDegree.trim();
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
        sb.append(", doctoralStudentIdentificationCode=").append(doctoralStudentIdentificationCode);
        sb.append(", name=").append(name);
        sb.append(", college=").append(college);
        sb.append(", tutorIdentificationCode=").append(tutorIdentificationCode);
        sb.append(", cooperativeGuidanceTutorIdentificationCode=").append(cooperativeGuidanceTutorIdentificationCode);
        sb.append(", studentType=").append(studentType);
        sb.append(", wayOfLearning=").append(wayOfLearning);
        sb.append(", country=").append(country);
        sb.append(", nationality=").append(nationality);
        sb.append(", degreeType=").append(degreeType);
        sb.append(", firstLevelSubject=").append(firstLevelSubject);
        sb.append(", secondLevelSubject=").append(secondLevelSubject);
        sb.append(", currentProfessionalDegreeCategory=").append(currentProfessionalDegreeCategory);
        sb.append(", entryDate=").append(entryDate);
        sb.append(", haveChangeInStudentStatus=").append(haveChangeInStudentStatus);
        sb.append(", reasonsForChangesInStudentStatus=").append(reasonsForChangesInStudentStatus);
        sb.append(", whetherToAwardDegree=").append(whetherToAwardDegree);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}