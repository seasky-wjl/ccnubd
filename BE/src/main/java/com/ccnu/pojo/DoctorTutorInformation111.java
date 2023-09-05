package com.ccnu.pojo;

import java.io.Serializable;

public class DoctorTutorInformation111 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 导师唯一标识码
     */
    private String tutorIdentificationCode;

    /**
     * 姓名
     */
    private String name;

    /**
     * 所属学院（单位）
     */
    private String college;

    /**
     * 国家（地区）
     */
    private String country;

    /**
     * 证件类型
     */
    private String typeOfCertificate;

    /**
     * 证件号码
     */
    private String certificateNumber;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private String age;

    /**
     * 民族
     */
    private String nationality;

    /**
     * 政治面貌
     */
    private String politicalStatus;

    /**
     * 最高学历
     */
    private String highestEducation;

    /**
     * 获得最高学历国家
     */
    private String obtainHighestEducationCountry;

    /**
     * 获得最高学历的院校或机构
     */
    private String institutionWithHighestDegree;

    /**
     * 获最高学历所学专业
     */
    private String majorHighestDegree;

    /**
     * 最高学位层次
     */
    private String highestDegreeLevel;

    /**
     * 最高学位名称
     */
    private String nameByHighestDegree;

    /**
     * 获最高学位的国家(地区)
     */
    private String countryWithTheHighestDegree;

    /**
     * 获最高学位的院校或机构
     */
    private String highestDegreeInstitution;

    /**
     * 
     */
    private String lastTime;

    /**
     * 
     */
    private String isdelete;

    /**
     * doctor_tutor_information_1_1_1
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
     * 所属学院（单位）
     * @return college 所属学院（单位）
     */
    public String getCollege() {
        return college;
    }

    /**
     * 所属学院（单位）
     * @param college 所属学院（单位）
     */
    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
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
     * 证件类型
     * @return type_of_certificate 证件类型
     */
    public String getTypeOfCertificate() {
        return typeOfCertificate;
    }

    /**
     * 证件类型
     * @param typeOfCertificate 证件类型
     */
    public void setTypeOfCertificate(String typeOfCertificate) {
        this.typeOfCertificate = typeOfCertificate == null ? null : typeOfCertificate.trim();
    }

    /**
     * 证件号码
     * @return certificate_number 证件号码
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * 证件号码
     * @param certificateNumber 证件号码
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
    }

    /**
     * 出生日期
     * @return birthday 出生日期
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 出生日期
     * @param birthday 出生日期
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 性别
     * @return sex 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
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
     * 政治面貌
     * @return political_status 政治面貌
     */
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    /**
     * 政治面貌
     * @param politicalStatus 政治面貌
     */
    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    /**
     * 最高学历
     * @return highest_education 最高学历
     */
    public String getHighestEducation() {
        return highestEducation;
    }

    /**
     * 最高学历
     * @param highestEducation 最高学历
     */
    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation == null ? null : highestEducation.trim();
    }

    /**
     * 获得最高学历国家
     * @return obtain_highest_education_country 获得最高学历国家
     */
    public String getObtainHighestEducationCountry() {
        return obtainHighestEducationCountry;
    }

    /**
     * 获得最高学历国家
     * @param obtainHighestEducationCountry 获得最高学历国家
     */
    public void setObtainHighestEducationCountry(String obtainHighestEducationCountry) {
        this.obtainHighestEducationCountry = obtainHighestEducationCountry == null ? null : obtainHighestEducationCountry.trim();
    }

    /**
     * 获得最高学历的院校或机构
     * @return institution_with_highest_degree 获得最高学历的院校或机构
     */
    public String getInstitutionWithHighestDegree() {
        return institutionWithHighestDegree;
    }

    /**
     * 获得最高学历的院校或机构
     * @param institutionWithHighestDegree 获得最高学历的院校或机构
     */
    public void setInstitutionWithHighestDegree(String institutionWithHighestDegree) {
        this.institutionWithHighestDegree = institutionWithHighestDegree == null ? null : institutionWithHighestDegree.trim();
    }

    /**
     * 获最高学历所学专业
     * @return major_highest_degree 获最高学历所学专业
     */
    public String getMajorHighestDegree() {
        return majorHighestDegree;
    }

    /**
     * 获最高学历所学专业
     * @param majorHighestDegree 获最高学历所学专业
     */
    public void setMajorHighestDegree(String majorHighestDegree) {
        this.majorHighestDegree = majorHighestDegree == null ? null : majorHighestDegree.trim();
    }

    /**
     * 最高学位层次
     * @return highest_degree_level 最高学位层次
     */
    public String getHighestDegreeLevel() {
        return highestDegreeLevel;
    }

    /**
     * 最高学位层次
     * @param highestDegreeLevel 最高学位层次
     */
    public void setHighestDegreeLevel(String highestDegreeLevel) {
        this.highestDegreeLevel = highestDegreeLevel == null ? null : highestDegreeLevel.trim();
    }

    /**
     * 最高学位名称
     * @return name_by_highest_degree 最高学位名称
     */
    public String getNameByHighestDegree() {
        return nameByHighestDegree;
    }

    /**
     * 最高学位名称
     * @param nameByHighestDegree 最高学位名称
     */
    public void setNameByHighestDegree(String nameByHighestDegree) {
        this.nameByHighestDegree = nameByHighestDegree == null ? null : nameByHighestDegree.trim();
    }

    /**
     * 获最高学位的国家(地区)
     * @return country_with_the_highest_degree 获最高学位的国家(地区)
     */
    public String getCountryWithTheHighestDegree() {
        return countryWithTheHighestDegree;
    }

    /**
     * 获最高学位的国家(地区)
     * @param countryWithTheHighestDegree 获最高学位的国家(地区)
     */
    public void setCountryWithTheHighestDegree(String countryWithTheHighestDegree) {
        this.countryWithTheHighestDegree = countryWithTheHighestDegree == null ? null : countryWithTheHighestDegree.trim();
    }

    /**
     * 获最高学位的院校或机构
     * @return highest_degree_institution 获最高学位的院校或机构
     */
    public String getHighestDegreeInstitution() {
        return highestDegreeInstitution;
    }

    /**
     * 获最高学位的院校或机构
     * @param highestDegreeInstitution 获最高学位的院校或机构
     */
    public void setHighestDegreeInstitution(String highestDegreeInstitution) {
        this.highestDegreeInstitution = highestDegreeInstitution == null ? null : highestDegreeInstitution.trim();
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
        sb.append(", name=").append(name);
        sb.append(", college=").append(college);
        sb.append(", country=").append(country);
        sb.append(", typeOfCertificate=").append(typeOfCertificate);
        sb.append(", certificateNumber=").append(certificateNumber);
        sb.append(", birthday=").append(birthday);
        sb.append(", sex=").append(sex);
        sb.append(", nationality=").append(nationality);
        sb.append(", politicalStatus=").append(politicalStatus);
        sb.append(", highestEducation=").append(highestEducation);
        sb.append(", obtainHighestEducationCountry=").append(obtainHighestEducationCountry);
        sb.append(", institutionWithHighestDegree=").append(institutionWithHighestDegree);
        sb.append(", majorHighestDegree=").append(majorHighestDegree);
        sb.append(", highestDegreeLevel=").append(highestDegreeLevel);
        sb.append(", nameByHighestDegree=").append(nameByHighestDegree);
        sb.append(", countryWithTheHighestDegree=").append(countryWithTheHighestDegree);
        sb.append(", highestDegreeInstitution=").append(highestDegreeInstitution);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}