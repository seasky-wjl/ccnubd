package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseStatus211Example {
    /**
     * course_status_2_1_1
     */
    protected String orderByClause;

    /**
     * course_status_2_1_1
     */
    protected boolean distinct;

    /**
     * course_status_2_1_1
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public CourseStatus211Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * course_status_2_1_1 2020-12-21
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeIsNull() {
            addCriterion("tutor_identification_code is null");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeIsNotNull() {
            addCriterion("tutor_identification_code is not null");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeEqualTo(String value) {
            addCriterion("tutor_identification_code =", value, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeNotEqualTo(String value) {
            addCriterion("tutor_identification_code <>", value, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeGreaterThan(String value) {
            addCriterion("tutor_identification_code >", value, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_identification_code >=", value, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeLessThan(String value) {
            addCriterion("tutor_identification_code <", value, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeLessThanOrEqualTo(String value) {
            addCriterion("tutor_identification_code <=", value, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeLike(String value) {
            addCriterion("tutor_identification_code like", value, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeNotLike(String value) {
            addCriterion("tutor_identification_code not like", value, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeIn(List<String> values) {
            addCriterion("tutor_identification_code in", values, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeNotIn(List<String> values) {
            addCriterion("tutor_identification_code not in", values, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeBetween(String value1, String value2) {
            addCriterion("tutor_identification_code between", value1, value2, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andTutorIdentificationCodeNotBetween(String value1, String value2) {
            addCriterion("tutor_identification_code not between", value1, value2, "tutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCourseNumberIsNull() {
            addCriterion("course_number is null");
            return (Criteria) this;
        }

        public Criteria andCourseNumberIsNotNull() {
            addCriterion("course_number is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNumberEqualTo(String value) {
            addCriterion("course_number =", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberNotEqualTo(String value) {
            addCriterion("course_number <>", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberGreaterThan(String value) {
            addCriterion("course_number >", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("course_number >=", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLessThan(String value) {
            addCriterion("course_number <", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLessThanOrEqualTo(String value) {
            addCriterion("course_number <=", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLike(String value) {
            addCriterion("course_number like", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberNotLike(String value) {
            addCriterion("course_number not like", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberIn(List<String> values) {
            addCriterion("course_number in", values, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberNotIn(List<String> values) {
            addCriterion("course_number not in", values, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberBetween(String value1, String value2) {
            addCriterion("course_number between", value1, value2, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberNotBetween(String value1, String value2) {
            addCriterion("course_number not between", value1, value2, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNull() {
            addCriterion("course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(String value) {
            addCriterion("course_type =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(String value) {
            addCriterion("course_type <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(String value) {
            addCriterion("course_type >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("course_type >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(String value) {
            addCriterion("course_type <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(String value) {
            addCriterion("course_type <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLike(String value) {
            addCriterion("course_type like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotLike(String value) {
            addCriterion("course_type not like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<String> values) {
            addCriterion("course_type in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<String> values) {
            addCriterion("course_type not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(String value1, String value2) {
            addCriterion("course_type between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(String value1, String value2) {
            addCriterion("course_type not between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseNatureIsNull() {
            addCriterion("course_nature is null");
            return (Criteria) this;
        }

        public Criteria andCourseNatureIsNotNull() {
            addCriterion("course_nature is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNatureEqualTo(String value) {
            addCriterion("course_nature =", value, "courseNature");
            return (Criteria) this;
        }

        public Criteria andCourseNatureNotEqualTo(String value) {
            addCriterion("course_nature <>", value, "courseNature");
            return (Criteria) this;
        }

        public Criteria andCourseNatureGreaterThan(String value) {
            addCriterion("course_nature >", value, "courseNature");
            return (Criteria) this;
        }

        public Criteria andCourseNatureGreaterThanOrEqualTo(String value) {
            addCriterion("course_nature >=", value, "courseNature");
            return (Criteria) this;
        }

        public Criteria andCourseNatureLessThan(String value) {
            addCriterion("course_nature <", value, "courseNature");
            return (Criteria) this;
        }

        public Criteria andCourseNatureLessThanOrEqualTo(String value) {
            addCriterion("course_nature <=", value, "courseNature");
            return (Criteria) this;
        }

        public Criteria andCourseNatureLike(String value) {
            addCriterion("course_nature like", value, "courseNature");
            return (Criteria) this;
        }

        public Criteria andCourseNatureNotLike(String value) {
            addCriterion("course_nature not like", value, "courseNature");
            return (Criteria) this;
        }

        public Criteria andCourseNatureIn(List<String> values) {
            addCriterion("course_nature in", values, "courseNature");
            return (Criteria) this;
        }

        public Criteria andCourseNatureNotIn(List<String> values) {
            addCriterion("course_nature not in", values, "courseNature");
            return (Criteria) this;
        }

        public Criteria andCourseNatureBetween(String value1, String value2) {
            addCriterion("course_nature between", value1, value2, "courseNature");
            return (Criteria) this;
        }

        public Criteria andCourseNatureNotBetween(String value1, String value2) {
            addCriterion("course_nature not between", value1, value2, "courseNature");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursIsNull() {
            addCriterion("teaching_hours is null");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursIsNotNull() {
            addCriterion("teaching_hours is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursEqualTo(String value) {
            addCriterion("teaching_hours =", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursNotEqualTo(String value) {
            addCriterion("teaching_hours <>", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursGreaterThan(String value) {
            addCriterion("teaching_hours >", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_hours >=", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursLessThan(String value) {
            addCriterion("teaching_hours <", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursLessThanOrEqualTo(String value) {
            addCriterion("teaching_hours <=", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursLike(String value) {
            addCriterion("teaching_hours like", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursNotLike(String value) {
            addCriterion("teaching_hours not like", value, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursIn(List<String> values) {
            addCriterion("teaching_hours in", values, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursNotIn(List<String> values) {
            addCriterion("teaching_hours not in", values, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursBetween(String value1, String value2) {
            addCriterion("teaching_hours between", value1, value2, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andTeachingHoursNotBetween(String value1, String value2) {
            addCriterion("teaching_hours not between", value1, value2, "teachingHours");
            return (Criteria) this;
        }

        public Criteria andCourseObjectIsNull() {
            addCriterion("course_object is null");
            return (Criteria) this;
        }

        public Criteria andCourseObjectIsNotNull() {
            addCriterion("course_object is not null");
            return (Criteria) this;
        }

        public Criteria andCourseObjectEqualTo(String value) {
            addCriterion("course_object =", value, "courseObject");
            return (Criteria) this;
        }

        public Criteria andCourseObjectNotEqualTo(String value) {
            addCriterion("course_object <>", value, "courseObject");
            return (Criteria) this;
        }

        public Criteria andCourseObjectGreaterThan(String value) {
            addCriterion("course_object >", value, "courseObject");
            return (Criteria) this;
        }

        public Criteria andCourseObjectGreaterThanOrEqualTo(String value) {
            addCriterion("course_object >=", value, "courseObject");
            return (Criteria) this;
        }

        public Criteria andCourseObjectLessThan(String value) {
            addCriterion("course_object <", value, "courseObject");
            return (Criteria) this;
        }

        public Criteria andCourseObjectLessThanOrEqualTo(String value) {
            addCriterion("course_object <=", value, "courseObject");
            return (Criteria) this;
        }

        public Criteria andCourseObjectLike(String value) {
            addCriterion("course_object like", value, "courseObject");
            return (Criteria) this;
        }

        public Criteria andCourseObjectNotLike(String value) {
            addCriterion("course_object not like", value, "courseObject");
            return (Criteria) this;
        }

        public Criteria andCourseObjectIn(List<String> values) {
            addCriterion("course_object in", values, "courseObject");
            return (Criteria) this;
        }

        public Criteria andCourseObjectNotIn(List<String> values) {
            addCriterion("course_object not in", values, "courseObject");
            return (Criteria) this;
        }

        public Criteria andCourseObjectBetween(String value1, String value2) {
            addCriterion("course_object between", value1, value2, "courseObject");
            return (Criteria) this;
        }

        public Criteria andCourseObjectNotBetween(String value1, String value2) {
            addCriterion("course_object not between", value1, value2, "courseObject");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsIsNull() {
            addCriterion("number_of_students is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsIsNotNull() {
            addCriterion("number_of_students is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsEqualTo(String value) {
            addCriterion("number_of_students =", value, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsNotEqualTo(String value) {
            addCriterion("number_of_students <>", value, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsGreaterThan(String value) {
            addCriterion("number_of_students >", value, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsGreaterThanOrEqualTo(String value) {
            addCriterion("number_of_students >=", value, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsLessThan(String value) {
            addCriterion("number_of_students <", value, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsLessThanOrEqualTo(String value) {
            addCriterion("number_of_students <=", value, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsLike(String value) {
            addCriterion("number_of_students like", value, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsNotLike(String value) {
            addCriterion("number_of_students not like", value, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsIn(List<String> values) {
            addCriterion("number_of_students in", values, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsNotIn(List<String> values) {
            addCriterion("number_of_students not in", values, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsBetween(String value1, String value2) {
            addCriterion("number_of_students between", value1, value2, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andNumberOfStudentsNotBetween(String value1, String value2) {
            addCriterion("number_of_students not between", value1, value2, "numberOfStudents");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(String value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(String value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(String value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(String value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(String value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(String value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLike(String value) {
            addCriterion("last_time like", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotLike(String value) {
            addCriterion("last_time not like", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<String> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<String> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(String value1, String value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(String value1, String value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(String value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(String value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(String value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(String value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(String value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(String value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLike(String value) {
            addCriterion("isdelete like", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotLike(String value) {
            addCriterion("isdelete not like", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<String> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<String> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(String value1, String value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(String value1, String value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }
    }

    /**
     * course_status_2_1_1
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * course_status_2_1_1 2020-12-21
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}