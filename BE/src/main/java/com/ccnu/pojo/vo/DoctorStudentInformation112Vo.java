package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 表112前端展示数据
 * @author: lsc
 * @create: 2021-10-21 19:46
 **/
public class DoctorStudentInformation112Vo {

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
     * 导师姓名
     */
    private String doctorName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoctoralStudentIdentificationCode() {
        return doctoralStudentIdentificationCode;
    }

    public void setDoctoralStudentIdentificationCode(String doctoralStudentIdentificationCode) {
        this.doctoralStudentIdentificationCode = doctoralStudentIdentificationCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode;
    }

    public String getCooperativeGuidanceTutorIdentificationCode() {
        return cooperativeGuidanceTutorIdentificationCode;
    }

    public void setCooperativeGuidanceTutorIdentificationCode(String cooperativeGuidanceTutorIdentificationCode) {
        this.cooperativeGuidanceTutorIdentificationCode = cooperativeGuidanceTutorIdentificationCode;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    public String getWayOfLearning() {
        return wayOfLearning;
    }

    public void setWayOfLearning(String wayOfLearning) {
        this.wayOfLearning = wayOfLearning;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getFirstLevelSubject() {
        return firstLevelSubject;
    }

    public void setFirstLevelSubject(String firstLevelSubject) {
        this.firstLevelSubject = firstLevelSubject;
    }

    public String getSecondLevelSubject() {
        return secondLevelSubject;
    }

    public void setSecondLevelSubject(String secondLevelSubject) {
        this.secondLevelSubject = secondLevelSubject;
    }

    public String getCurrentProfessionalDegreeCategory() {
        return currentProfessionalDegreeCategory;
    }

    public void setCurrentProfessionalDegreeCategory(String currentProfessionalDegreeCategory) {
        this.currentProfessionalDegreeCategory = currentProfessionalDegreeCategory;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getHaveChangeInStudentStatus() {
        return haveChangeInStudentStatus;
    }

    public void setHaveChangeInStudentStatus(String haveChangeInStudentStatus) {
        this.haveChangeInStudentStatus = haveChangeInStudentStatus;
    }

    public String getReasonsForChangesInStudentStatus() {
        return reasonsForChangesInStudentStatus;
    }

    public void setReasonsForChangesInStudentStatus(String reasonsForChangesInStudentStatus) {
        this.reasonsForChangesInStudentStatus = reasonsForChangesInStudentStatus;
    }

    public String getWhetherToAwardDegree() {
        return whetherToAwardDegree;
    }

    public void setWhetherToAwardDegree(String whetherToAwardDegree) {
        this.whetherToAwardDegree = whetherToAwardDegree;
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

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
