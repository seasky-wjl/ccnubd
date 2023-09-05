package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class DoctorStudentInformation112Example {
    /**
     * doctor_student_information_1_1_2
     */
    protected String orderByClause;

    /**
     * doctor_student_information_1_1_2
     */
    protected boolean distinct;

    /**
     * doctor_student_information_1_1_2
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public DoctorStudentInformation112Example() {
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
     * doctor_student_information_1_1_2 2020-12-21
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

        public Criteria andDoctoralStudentIdentificationCodeIsNull() {
            addCriterion("doctoral_student_identification_code is null");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeIsNotNull() {
            addCriterion("doctoral_student_identification_code is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeEqualTo(String value) {
            addCriterion("doctoral_student_identification_code =", value, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeNotEqualTo(String value) {
            addCriterion("doctoral_student_identification_code <>", value, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeGreaterThan(String value) {
            addCriterion("doctoral_student_identification_code >", value, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("doctoral_student_identification_code >=", value, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeLessThan(String value) {
            addCriterion("doctoral_student_identification_code <", value, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeLessThanOrEqualTo(String value) {
            addCriterion("doctoral_student_identification_code <=", value, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeLike(String value) {
            addCriterion("doctoral_student_identification_code like", value, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeNotLike(String value) {
            addCriterion("doctoral_student_identification_code not like", value, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeIn(List<String> values) {
            addCriterion("doctoral_student_identification_code in", values, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeNotIn(List<String> values) {
            addCriterion("doctoral_student_identification_code not in", values, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeBetween(String value1, String value2) {
            addCriterion("doctoral_student_identification_code between", value1, value2, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andDoctoralStudentIdentificationCodeNotBetween(String value1, String value2) {
            addCriterion("doctoral_student_identification_code not between", value1, value2, "doctoralStudentIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
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

        public Criteria andCooperativeGuidanceTutorIdentificationCodeIsNull() {
            addCriterion("cooperative_guidance_tutor_identification_code is null");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeIsNotNull() {
            addCriterion("cooperative_guidance_tutor_identification_code is not null");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeEqualTo(String value) {
            addCriterion("cooperative_guidance_tutor_identification_code =", value, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeNotEqualTo(String value) {
            addCriterion("cooperative_guidance_tutor_identification_code <>", value, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeGreaterThan(String value) {
            addCriterion("cooperative_guidance_tutor_identification_code >", value, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cooperative_guidance_tutor_identification_code >=", value, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeLessThan(String value) {
            addCriterion("cooperative_guidance_tutor_identification_code <", value, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeLessThanOrEqualTo(String value) {
            addCriterion("cooperative_guidance_tutor_identification_code <=", value, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeLike(String value) {
            addCriterion("cooperative_guidance_tutor_identification_code like", value, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeNotLike(String value) {
            addCriterion("cooperative_guidance_tutor_identification_code not like", value, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeIn(List<String> values) {
            addCriterion("cooperative_guidance_tutor_identification_code in", values, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeNotIn(List<String> values) {
            addCriterion("cooperative_guidance_tutor_identification_code not in", values, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeBetween(String value1, String value2) {
            addCriterion("cooperative_guidance_tutor_identification_code between", value1, value2, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andCooperativeGuidanceTutorIdentificationCodeNotBetween(String value1, String value2) {
            addCriterion("cooperative_guidance_tutor_identification_code not between", value1, value2, "cooperativeGuidanceTutorIdentificationCode");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIsNull() {
            addCriterion("student_type is null");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIsNotNull() {
            addCriterion("student_type is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTypeEqualTo(String value) {
            addCriterion("student_type =", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotEqualTo(String value) {
            addCriterion("student_type <>", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeGreaterThan(String value) {
            addCriterion("student_type >", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("student_type >=", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLessThan(String value) {
            addCriterion("student_type <", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLessThanOrEqualTo(String value) {
            addCriterion("student_type <=", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeLike(String value) {
            addCriterion("student_type like", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotLike(String value) {
            addCriterion("student_type not like", value, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeIn(List<String> values) {
            addCriterion("student_type in", values, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotIn(List<String> values) {
            addCriterion("student_type not in", values, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeBetween(String value1, String value2) {
            addCriterion("student_type between", value1, value2, "studentType");
            return (Criteria) this;
        }

        public Criteria andStudentTypeNotBetween(String value1, String value2) {
            addCriterion("student_type not between", value1, value2, "studentType");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningIsNull() {
            addCriterion("way_of_learning is null");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningIsNotNull() {
            addCriterion("way_of_learning is not null");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningEqualTo(String value) {
            addCriterion("way_of_learning =", value, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningNotEqualTo(String value) {
            addCriterion("way_of_learning <>", value, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningGreaterThan(String value) {
            addCriterion("way_of_learning >", value, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningGreaterThanOrEqualTo(String value) {
            addCriterion("way_of_learning >=", value, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningLessThan(String value) {
            addCriterion("way_of_learning <", value, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningLessThanOrEqualTo(String value) {
            addCriterion("way_of_learning <=", value, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningLike(String value) {
            addCriterion("way_of_learning like", value, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningNotLike(String value) {
            addCriterion("way_of_learning not like", value, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningIn(List<String> values) {
            addCriterion("way_of_learning in", values, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningNotIn(List<String> values) {
            addCriterion("way_of_learning not in", values, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningBetween(String value1, String value2) {
            addCriterion("way_of_learning between", value1, value2, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andWayOfLearningNotBetween(String value1, String value2) {
            addCriterion("way_of_learning not between", value1, value2, "wayOfLearning");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeIsNull() {
            addCriterion("degree_type is null");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeIsNotNull() {
            addCriterion("degree_type is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeEqualTo(String value) {
            addCriterion("degree_type =", value, "degreeType");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeNotEqualTo(String value) {
            addCriterion("degree_type <>", value, "degreeType");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeGreaterThan(String value) {
            addCriterion("degree_type >", value, "degreeType");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("degree_type >=", value, "degreeType");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeLessThan(String value) {
            addCriterion("degree_type <", value, "degreeType");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeLessThanOrEqualTo(String value) {
            addCriterion("degree_type <=", value, "degreeType");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeLike(String value) {
            addCriterion("degree_type like", value, "degreeType");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeNotLike(String value) {
            addCriterion("degree_type not like", value, "degreeType");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeIn(List<String> values) {
            addCriterion("degree_type in", values, "degreeType");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeNotIn(List<String> values) {
            addCriterion("degree_type not in", values, "degreeType");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeBetween(String value1, String value2) {
            addCriterion("degree_type between", value1, value2, "degreeType");
            return (Criteria) this;
        }

        public Criteria andDegreeTypeNotBetween(String value1, String value2) {
            addCriterion("degree_type not between", value1, value2, "degreeType");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectIsNull() {
            addCriterion("first_level_subject is null");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectIsNotNull() {
            addCriterion("first_level_subject is not null");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectEqualTo(String value) {
            addCriterion("first_level_subject =", value, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectNotEqualTo(String value) {
            addCriterion("first_level_subject <>", value, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectGreaterThan(String value) {
            addCriterion("first_level_subject >", value, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("first_level_subject >=", value, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectLessThan(String value) {
            addCriterion("first_level_subject <", value, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectLessThanOrEqualTo(String value) {
            addCriterion("first_level_subject <=", value, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectLike(String value) {
            addCriterion("first_level_subject like", value, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectNotLike(String value) {
            addCriterion("first_level_subject not like", value, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectIn(List<String> values) {
            addCriterion("first_level_subject in", values, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectNotIn(List<String> values) {
            addCriterion("first_level_subject not in", values, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectBetween(String value1, String value2) {
            addCriterion("first_level_subject between", value1, value2, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andFirstLevelSubjectNotBetween(String value1, String value2) {
            addCriterion("first_level_subject not between", value1, value2, "firstLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectIsNull() {
            addCriterion("second_level_subject is null");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectIsNotNull() {
            addCriterion("second_level_subject is not null");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectEqualTo(String value) {
            addCriterion("second_level_subject =", value, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectNotEqualTo(String value) {
            addCriterion("second_level_subject <>", value, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectGreaterThan(String value) {
            addCriterion("second_level_subject >", value, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("second_level_subject >=", value, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectLessThan(String value) {
            addCriterion("second_level_subject <", value, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectLessThanOrEqualTo(String value) {
            addCriterion("second_level_subject <=", value, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectLike(String value) {
            addCriterion("second_level_subject like", value, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectNotLike(String value) {
            addCriterion("second_level_subject not like", value, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectIn(List<String> values) {
            addCriterion("second_level_subject in", values, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectNotIn(List<String> values) {
            addCriterion("second_level_subject not in", values, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectBetween(String value1, String value2) {
            addCriterion("second_level_subject between", value1, value2, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andSecondLevelSubjectNotBetween(String value1, String value2) {
            addCriterion("second_level_subject not between", value1, value2, "secondLevelSubject");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryIsNull() {
            addCriterion("current_professional_degree_category is null");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryIsNotNull() {
            addCriterion("current_professional_degree_category is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryEqualTo(String value) {
            addCriterion("current_professional_degree_category =", value, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryNotEqualTo(String value) {
            addCriterion("current_professional_degree_category <>", value, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryGreaterThan(String value) {
            addCriterion("current_professional_degree_category >", value, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("current_professional_degree_category >=", value, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryLessThan(String value) {
            addCriterion("current_professional_degree_category <", value, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryLessThanOrEqualTo(String value) {
            addCriterion("current_professional_degree_category <=", value, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryLike(String value) {
            addCriterion("current_professional_degree_category like", value, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryNotLike(String value) {
            addCriterion("current_professional_degree_category not like", value, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryIn(List<String> values) {
            addCriterion("current_professional_degree_category in", values, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryNotIn(List<String> values) {
            addCriterion("current_professional_degree_category not in", values, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryBetween(String value1, String value2) {
            addCriterion("current_professional_degree_category between", value1, value2, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andCurrentProfessionalDegreeCategoryNotBetween(String value1, String value2) {
            addCriterion("current_professional_degree_category not between", value1, value2, "currentProfessionalDegreeCategory");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNull() {
            addCriterion("entry_date is null");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNotNull() {
            addCriterion("entry_date is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDateEqualTo(String value) {
            addCriterion("entry_date =", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotEqualTo(String value) {
            addCriterion("entry_date <>", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThan(String value) {
            addCriterion("entry_date >", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThanOrEqualTo(String value) {
            addCriterion("entry_date >=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThan(String value) {
            addCriterion("entry_date <", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThanOrEqualTo(String value) {
            addCriterion("entry_date <=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLike(String value) {
            addCriterion("entry_date like", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotLike(String value) {
            addCriterion("entry_date not like", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateIn(List<String> values) {
            addCriterion("entry_date in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotIn(List<String> values) {
            addCriterion("entry_date not in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateBetween(String value1, String value2) {
            addCriterion("entry_date between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotBetween(String value1, String value2) {
            addCriterion("entry_date not between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusIsNull() {
            addCriterion("have_change_in_student_status is null");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusIsNotNull() {
            addCriterion("have_change_in_student_status is not null");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusEqualTo(String value) {
            addCriterion("have_change_in_student_status =", value, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusNotEqualTo(String value) {
            addCriterion("have_change_in_student_status <>", value, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusGreaterThan(String value) {
            addCriterion("have_change_in_student_status >", value, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("have_change_in_student_status >=", value, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusLessThan(String value) {
            addCriterion("have_change_in_student_status <", value, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusLessThanOrEqualTo(String value) {
            addCriterion("have_change_in_student_status <=", value, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusLike(String value) {
            addCriterion("have_change_in_student_status like", value, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusNotLike(String value) {
            addCriterion("have_change_in_student_status not like", value, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusIn(List<String> values) {
            addCriterion("have_change_in_student_status in", values, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusNotIn(List<String> values) {
            addCriterion("have_change_in_student_status not in", values, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusBetween(String value1, String value2) {
            addCriterion("have_change_in_student_status between", value1, value2, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andHaveChangeInStudentStatusNotBetween(String value1, String value2) {
            addCriterion("have_change_in_student_status not between", value1, value2, "haveChangeInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusIsNull() {
            addCriterion("reasons_for_changes_in_student_status is null");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusIsNotNull() {
            addCriterion("reasons_for_changes_in_student_status is not null");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusEqualTo(String value) {
            addCriterion("reasons_for_changes_in_student_status =", value, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusNotEqualTo(String value) {
            addCriterion("reasons_for_changes_in_student_status <>", value, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusGreaterThan(String value) {
            addCriterion("reasons_for_changes_in_student_status >", value, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("reasons_for_changes_in_student_status >=", value, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusLessThan(String value) {
            addCriterion("reasons_for_changes_in_student_status <", value, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusLessThanOrEqualTo(String value) {
            addCriterion("reasons_for_changes_in_student_status <=", value, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusLike(String value) {
            addCriterion("reasons_for_changes_in_student_status like", value, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusNotLike(String value) {
            addCriterion("reasons_for_changes_in_student_status not like", value, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusIn(List<String> values) {
            addCriterion("reasons_for_changes_in_student_status in", values, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusNotIn(List<String> values) {
            addCriterion("reasons_for_changes_in_student_status not in", values, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusBetween(String value1, String value2) {
            addCriterion("reasons_for_changes_in_student_status between", value1, value2, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsForChangesInStudentStatusNotBetween(String value1, String value2) {
            addCriterion("reasons_for_changes_in_student_status not between", value1, value2, "reasonsForChangesInStudentStatus");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeIsNull() {
            addCriterion("whether_to_award_degree is null");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeIsNotNull() {
            addCriterion("whether_to_award_degree is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeEqualTo(String value) {
            addCriterion("whether_to_award_degree =", value, "whetherToAwardDegree");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeNotEqualTo(String value) {
            addCriterion("whether_to_award_degree <>", value, "whetherToAwardDegree");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeGreaterThan(String value) {
            addCriterion("whether_to_award_degree >", value, "whetherToAwardDegree");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("whether_to_award_degree >=", value, "whetherToAwardDegree");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeLessThan(String value) {
            addCriterion("whether_to_award_degree <", value, "whetherToAwardDegree");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeLessThanOrEqualTo(String value) {
            addCriterion("whether_to_award_degree <=", value, "whetherToAwardDegree");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeLike(String value) {
            addCriterion("whether_to_award_degree like", value, "whetherToAwardDegree");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeNotLike(String value) {
            addCriterion("whether_to_award_degree not like", value, "whetherToAwardDegree");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeIn(List<String> values) {
            addCriterion("whether_to_award_degree in", values, "whetherToAwardDegree");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeNotIn(List<String> values) {
            addCriterion("whether_to_award_degree not in", values, "whetherToAwardDegree");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeBetween(String value1, String value2) {
            addCriterion("whether_to_award_degree between", value1, value2, "whetherToAwardDegree");
            return (Criteria) this;
        }

        public Criteria andWhetherToAwardDegreeNotBetween(String value1, String value2) {
            addCriterion("whether_to_award_degree not between", value1, value2, "whetherToAwardDegree");
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
     * doctor_student_information_1_1_2
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * doctor_student_information_1_1_2 2020-12-21
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