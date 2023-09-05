package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 表111Xu2前端展示数据
 * @author: lsc
 * @create: 2021-10-21 19:33
 **/
public class DoctorTutorInformation111Xu2Vo {

    /**
     *
     */
    private Integer id;

    /**
     * 导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 导师类别
     */
    private String tutorCategory;

    /**
     * 是否有国际合作
     */
    private String haveInternationalCooperation;

    /**
     * 可指导博士生类型
     */
    private String guideDoctoralStudents;

    /**
     * 现所属一级学科
     */
    private String firstLevelSubject;

    /**
     * 现所属二级学科
     */
    private String secondLevelSubject;

    /**
     * 可指导专业学位类型
     */
    private String guideProfessionalDegreeTypes;

    /**
     * 所指导填报单位硕士生在读人数（人）
     */
    private String numberOfMasterStudentsEnrolledInTheUnit;

    /**
     *
     */
    private String lastTime;

    /**
     *
     */
    private String isdelete;

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

    public String getTutorCategory() {
        return tutorCategory;
    }

    public void setTutorCategory(String tutorCategory) {
        this.tutorCategory = tutorCategory;
    }

    public String getHaveInternationalCooperation() {
        return haveInternationalCooperation;
    }

    public void setHaveInternationalCooperation(String haveInternationalCooperation) {
        this.haveInternationalCooperation = haveInternationalCooperation;
    }

    public String getGuideDoctoralStudents() {
        return guideDoctoralStudents;
    }

    public void setGuideDoctoralStudents(String guideDoctoralStudents) {
        this.guideDoctoralStudents = guideDoctoralStudents;
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

    public String getGuideProfessionalDegreeTypes() {
        return guideProfessionalDegreeTypes;
    }

    public void setGuideProfessionalDegreeTypes(String guideProfessionalDegreeTypes) {
        this.guideProfessionalDegreeTypes = guideProfessionalDegreeTypes;
    }

    public String getNumberOfMasterStudentsEnrolledInTheUnit() {
        return numberOfMasterStudentsEnrolledInTheUnit;
    }

    public void setNumberOfMasterStudentsEnrolledInTheUnit(String numberOfMasterStudentsEnrolledInTheUnit) {
        this.numberOfMasterStudentsEnrolledInTheUnit = numberOfMasterStudentsEnrolledInTheUnit;
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
