package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class GuidedDoctoralStudentsAwards215Example {
    /**
     * guided_doctoral_students_awards_2_1_5
     */
    protected String orderByClause;

    /**
     * guided_doctoral_students_awards_2_1_5
     */
    protected boolean distinct;

    /**
     * guided_doctoral_students_awards_2_1_5
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public GuidedDoctoralStudentsAwards215Example() {
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
     * guided_doctoral_students_awards_2_1_5 2020-12-21
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

        public Criteria andAwardTopicIsNull() {
            addCriterion("award_topic is null");
            return (Criteria) this;
        }

        public Criteria andAwardTopicIsNotNull() {
            addCriterion("award_topic is not null");
            return (Criteria) this;
        }

        public Criteria andAwardTopicEqualTo(String value) {
            addCriterion("award_topic =", value, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardTopicNotEqualTo(String value) {
            addCriterion("award_topic <>", value, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardTopicGreaterThan(String value) {
            addCriterion("award_topic >", value, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardTopicGreaterThanOrEqualTo(String value) {
            addCriterion("award_topic >=", value, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardTopicLessThan(String value) {
            addCriterion("award_topic <", value, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardTopicLessThanOrEqualTo(String value) {
            addCriterion("award_topic <=", value, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardTopicLike(String value) {
            addCriterion("award_topic like", value, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardTopicNotLike(String value) {
            addCriterion("award_topic not like", value, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardTopicIn(List<String> values) {
            addCriterion("award_topic in", values, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardTopicNotIn(List<String> values) {
            addCriterion("award_topic not in", values, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardTopicBetween(String value1, String value2) {
            addCriterion("award_topic between", value1, value2, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardTopicNotBetween(String value1, String value2) {
            addCriterion("award_topic not between", value1, value2, "awardTopic");
            return (Criteria) this;
        }

        public Criteria andAwardNameIsNull() {
            addCriterion("award_name is null");
            return (Criteria) this;
        }

        public Criteria andAwardNameIsNotNull() {
            addCriterion("award_name is not null");
            return (Criteria) this;
        }

        public Criteria andAwardNameEqualTo(String value) {
            addCriterion("award_name =", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotEqualTo(String value) {
            addCriterion("award_name <>", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameGreaterThan(String value) {
            addCriterion("award_name >", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameGreaterThanOrEqualTo(String value) {
            addCriterion("award_name >=", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLessThan(String value) {
            addCriterion("award_name <", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLessThanOrEqualTo(String value) {
            addCriterion("award_name <=", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLike(String value) {
            addCriterion("award_name like", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotLike(String value) {
            addCriterion("award_name not like", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameIn(List<String> values) {
            addCriterion("award_name in", values, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotIn(List<String> values) {
            addCriterion("award_name not in", values, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameBetween(String value1, String value2) {
            addCriterion("award_name between", value1, value2, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotBetween(String value1, String value2) {
            addCriterion("award_name not between", value1, value2, "awardName");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIsNull() {
            addCriterion("certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIsNotNull() {
            addCriterion("certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberEqualTo(String value) {
            addCriterion("certificate_number =", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotEqualTo(String value) {
            addCriterion("certificate_number <>", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThan(String value) {
            addCriterion("certificate_number >", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_number >=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThan(String value) {
            addCriterion("certificate_number <", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("certificate_number <=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLike(String value) {
            addCriterion("certificate_number like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotLike(String value) {
            addCriterion("certificate_number not like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIn(List<String> values) {
            addCriterion("certificate_number in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotIn(List<String> values) {
            addCriterion("certificate_number not in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberBetween(String value1, String value2) {
            addCriterion("certificate_number between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("certificate_number not between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIsNull() {
            addCriterion("award_level is null");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIsNotNull() {
            addCriterion("award_level is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLevelEqualTo(String value) {
            addCriterion("award_level =", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotEqualTo(String value) {
            addCriterion("award_level <>", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelGreaterThan(String value) {
            addCriterion("award_level >", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelGreaterThanOrEqualTo(String value) {
            addCriterion("award_level >=", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLessThan(String value) {
            addCriterion("award_level <", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLessThanOrEqualTo(String value) {
            addCriterion("award_level <=", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLike(String value) {
            addCriterion("award_level like", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotLike(String value) {
            addCriterion("award_level not like", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIn(List<String> values) {
            addCriterion("award_level in", values, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotIn(List<String> values) {
            addCriterion("award_level not in", values, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelBetween(String value1, String value2) {
            addCriterion("award_level between", value1, value2, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotBetween(String value1, String value2) {
            addCriterion("award_level not between", value1, value2, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardGradeIsNull() {
            addCriterion("award_grade is null");
            return (Criteria) this;
        }

        public Criteria andAwardGradeIsNotNull() {
            addCriterion("award_grade is not null");
            return (Criteria) this;
        }

        public Criteria andAwardGradeEqualTo(String value) {
            addCriterion("award_grade =", value, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardGradeNotEqualTo(String value) {
            addCriterion("award_grade <>", value, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardGradeGreaterThan(String value) {
            addCriterion("award_grade >", value, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardGradeGreaterThanOrEqualTo(String value) {
            addCriterion("award_grade >=", value, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardGradeLessThan(String value) {
            addCriterion("award_grade <", value, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardGradeLessThanOrEqualTo(String value) {
            addCriterion("award_grade <=", value, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardGradeLike(String value) {
            addCriterion("award_grade like", value, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardGradeNotLike(String value) {
            addCriterion("award_grade not like", value, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardGradeIn(List<String> values) {
            addCriterion("award_grade in", values, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardGradeNotIn(List<String> values) {
            addCriterion("award_grade not in", values, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardGradeBetween(String value1, String value2) {
            addCriterion("award_grade between", value1, value2, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardGradeNotBetween(String value1, String value2) {
            addCriterion("award_grade not between", value1, value2, "awardGrade");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitIsNull() {
            addCriterion("awarding_unit is null");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitIsNotNull() {
            addCriterion("awarding_unit is not null");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitEqualTo(String value) {
            addCriterion("awarding_unit =", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitNotEqualTo(String value) {
            addCriterion("awarding_unit <>", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitGreaterThan(String value) {
            addCriterion("awarding_unit >", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("awarding_unit >=", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitLessThan(String value) {
            addCriterion("awarding_unit <", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitLessThanOrEqualTo(String value) {
            addCriterion("awarding_unit <=", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitLike(String value) {
            addCriterion("awarding_unit like", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitNotLike(String value) {
            addCriterion("awarding_unit not like", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitIn(List<String> values) {
            addCriterion("awarding_unit in", values, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitNotIn(List<String> values) {
            addCriterion("awarding_unit not in", values, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitBetween(String value1, String value2) {
            addCriterion("awarding_unit between", value1, value2, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitNotBetween(String value1, String value2) {
            addCriterion("awarding_unit not between", value1, value2, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeIsNull() {
            addCriterion("award_doctoral_student_identification_code is null");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeIsNotNull() {
            addCriterion("award_doctoral_student_identification_code is not null");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeEqualTo(String value) {
            addCriterion("award_doctoral_student_identification_code =", value, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeNotEqualTo(String value) {
            addCriterion("award_doctoral_student_identification_code <>", value, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeGreaterThan(String value) {
            addCriterion("award_doctoral_student_identification_code >", value, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("award_doctoral_student_identification_code >=", value, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeLessThan(String value) {
            addCriterion("award_doctoral_student_identification_code <", value, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeLessThanOrEqualTo(String value) {
            addCriterion("award_doctoral_student_identification_code <=", value, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeLike(String value) {
            addCriterion("award_doctoral_student_identification_code like", value, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeNotLike(String value) {
            addCriterion("award_doctoral_student_identification_code not like", value, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeIn(List<String> values) {
            addCriterion("award_doctoral_student_identification_code in", values, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeNotIn(List<String> values) {
            addCriterion("award_doctoral_student_identification_code not in", values, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeBetween(String value1, String value2) {
            addCriterion("award_doctoral_student_identification_code between", value1, value2, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andAwardDoctoralStudentIdentificationCodeNotBetween(String value1, String value2) {
            addCriterion("award_doctoral_student_identification_code not between", value1, value2, "awardDoctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderIsNull() {
            addCriterion("instructor_order is null");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderIsNotNull() {
            addCriterion("instructor_order is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderEqualTo(String value) {
            addCriterion("instructor_order =", value, "instructorOrder");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderNotEqualTo(String value) {
            addCriterion("instructor_order <>", value, "instructorOrder");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderGreaterThan(String value) {
            addCriterion("instructor_order >", value, "instructorOrder");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderGreaterThanOrEqualTo(String value) {
            addCriterion("instructor_order >=", value, "instructorOrder");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderLessThan(String value) {
            addCriterion("instructor_order <", value, "instructorOrder");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderLessThanOrEqualTo(String value) {
            addCriterion("instructor_order <=", value, "instructorOrder");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderLike(String value) {
            addCriterion("instructor_order like", value, "instructorOrder");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderNotLike(String value) {
            addCriterion("instructor_order not like", value, "instructorOrder");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderIn(List<String> values) {
            addCriterion("instructor_order in", values, "instructorOrder");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderNotIn(List<String> values) {
            addCriterion("instructor_order not in", values, "instructorOrder");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderBetween(String value1, String value2) {
            addCriterion("instructor_order between", value1, value2, "instructorOrder");
            return (Criteria) this;
        }

        public Criteria andInstructorOrderNotBetween(String value1, String value2) {
            addCriterion("instructor_order not between", value1, value2, "instructorOrder");
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
     * guided_doctoral_students_awards_2_1_5
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * guided_doctoral_students_awards_2_1_5 2020-12-21
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