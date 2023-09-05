package com.ccnu.pojo;

import java.io.Serializable;

public class DoctorTutorInformation111Xu2 implements Serializable {
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

    /**
     * doctor_tutor_information_1_1_1_xu2
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
     * 导师类别
     * @return tutor_category 导师类别
     */
    public String getTutorCategory() {
        return tutorCategory;
    }

    /**
     * 导师类别
     * @param tutorCategory 导师类别
     */
    public void setTutorCategory(String tutorCategory) {
        this.tutorCategory = tutorCategory == null ? null : tutorCategory.trim();
    }

    /**
     * 是否有国际合作
     * @return have_international_cooperation 是否有国际合作
     */
    public String getHaveInternationalCooperation() {
        return haveInternationalCooperation;
    }

    /**
     * 是否有国际合作
     * @param haveInternationalCooperation 是否有国际合作
     */
    public void setHaveInternationalCooperation(String haveInternationalCooperation) {
        this.haveInternationalCooperation = haveInternationalCooperation == null ? null : haveInternationalCooperation.trim();
    }

    /**
     * 可指导博士生类型
     * @return guide_doctoral_students 可指导博士生类型
     */
    public String getGuideDoctoralStudents() {
        return guideDoctoralStudents;
    }

    /**
     * 可指导博士生类型
     * @param guideDoctoralStudents 可指导博士生类型
     */
    public void setGuideDoctoralStudents(String guideDoctoralStudents) {
        this.guideDoctoralStudents = guideDoctoralStudents == null ? null : guideDoctoralStudents.trim();
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
     * 可指导专业学位类型
     * @return guide_professional_degree_types 可指导专业学位类型
     */
    public String getGuideProfessionalDegreeTypes() {
        return guideProfessionalDegreeTypes;
    }

    /**
     * 可指导专业学位类型
     * @param guideProfessionalDegreeTypes 可指导专业学位类型
     */
    public void setGuideProfessionalDegreeTypes(String guideProfessionalDegreeTypes) {
        this.guideProfessionalDegreeTypes = guideProfessionalDegreeTypes == null ? null : guideProfessionalDegreeTypes.trim();
    }

    /**
     * 所指导填报单位硕士生在读人数（人）
     * @return number_of_master_students_enrolled_in_the_unit 所指导填报单位硕士生在读人数（人）
     */
    public String getNumberOfMasterStudentsEnrolledInTheUnit() {
        return numberOfMasterStudentsEnrolledInTheUnit;
    }

    /**
     * 所指导填报单位硕士生在读人数（人）
     * @param numberOfMasterStudentsEnrolledInTheUnit 所指导填报单位硕士生在读人数（人）
     */
    public void setNumberOfMasterStudentsEnrolledInTheUnit(String numberOfMasterStudentsEnrolledInTheUnit) {
        this.numberOfMasterStudentsEnrolledInTheUnit = numberOfMasterStudentsEnrolledInTheUnit == null ? null : numberOfMasterStudentsEnrolledInTheUnit.trim();
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
        sb.append(", tutorCategory=").append(tutorCategory);
        sb.append(", haveInternationalCooperation=").append(haveInternationalCooperation);
        sb.append(", guideDoctoralStudents=").append(guideDoctoralStudents);
        sb.append(", firstLevelSubject=").append(firstLevelSubject);
        sb.append(", secondLevelSubject=").append(secondLevelSubject);
        sb.append(", guideProfessionalDegreeTypes=").append(guideProfessionalDegreeTypes);
        sb.append(", numberOfMasterStudentsEnrolledInTheUnit=").append(numberOfMasterStudentsEnrolledInTheUnit);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}