package com.ccnu.pojo;

import java.io.Serializable;

public class CourseStatus211 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 课程编号
     */
    private String courseNumber;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程类别
     */
    private String courseType;

    /**
     * 课程性质
     */
    private String courseNature;

    /**
     * 教学学时
     */
    private String teachingHours;

    /**
     * 开课对象
     */
    private String courseObject;

    /**
     * 上课人数
     */
    private String numberOfStudents;

    /**
     * 最后更新时间
     */
    private String lastTime;

    /**
     * 是否删除
     */
    private String isdelete;

    /**
     * course_status_2_1_1
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
     * 课程编号
     * @return course_number 课程编号
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * 课程编号
     * @param courseNumber 课程编号
     */
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber == null ? null : courseNumber.trim();
    }

    /**
     * 课程名称
     * @return course_name 课程名称
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * 课程名称
     * @param courseName 课程名称
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    /**
     * 课程类别
     * @return course_type 课程类别
     */
    public String getCourseType() {
        return courseType;
    }

    /**
     * 课程类别
     * @param courseType 课程类别
     */
    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    /**
     * 课程性质
     * @return course_nature 课程性质
     */
    public String getCourseNature() {
        return courseNature;
    }

    /**
     * 课程性质
     * @param courseNature 课程性质
     */
    public void setCourseNature(String courseNature) {
        this.courseNature = courseNature == null ? null : courseNature.trim();
    }

    /**
     * 教学学时
     * @return teaching_hours 教学学时
     */
    public String getTeachingHours() {
        return teachingHours;
    }

    /**
     * 教学学时
     * @param teachingHours 教学学时
     */
    public void setTeachingHours(String teachingHours) {
        this.teachingHours = teachingHours == null ? null : teachingHours.trim();
    }

    /**
     * 开课对象
     * @return course_object 开课对象
     */
    public String getCourseObject() {
        return courseObject;
    }

    /**
     * 开课对象
     * @param courseObject 开课对象
     */
    public void setCourseObject(String courseObject) {
        this.courseObject = courseObject == null ? null : courseObject.trim();
    }

    /**
     * 上课人数
     * @return number_of_students 上课人数
     */
    public String getNumberOfStudents() {
        return numberOfStudents;
    }

    /**
     * 上课人数
     * @param numberOfStudents 上课人数
     */
    public void setNumberOfStudents(String numberOfStudents) {
        this.numberOfStudents = numberOfStudents == null ? null : numberOfStudents.trim();
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
        sb.append(", courseNumber=").append(courseNumber);
        sb.append(", courseName=").append(courseName);
        sb.append(", courseType=").append(courseType);
        sb.append(", courseNature=").append(courseNature);
        sb.append(", teachingHours=").append(teachingHours);
        sb.append(", courseObject=").append(courseObject);
        sb.append(", numberOfStudents=").append(numberOfStudents);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}