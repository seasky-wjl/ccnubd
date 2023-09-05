package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class DoctorTutorInformation111Example {
    /**
     * doctor_tutor_information_1_1_1
     */
    protected String orderByClause;

    /**
     * doctor_tutor_information_1_1_1
     */
    protected boolean distinct;

    /**
     * doctor_tutor_information_1_1_1
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public DoctorTutorInformation111Example() {
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
     * doctor_tutor_information_1_1_1 2020-12-21
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

        public Criteria andTypeOfCertificateIsNull() {
            addCriterion("type_of_certificate is null");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateIsNotNull() {
            addCriterion("type_of_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateEqualTo(String value) {
            addCriterion("type_of_certificate =", value, "typeOfCertificate");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateNotEqualTo(String value) {
            addCriterion("type_of_certificate <>", value, "typeOfCertificate");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateGreaterThan(String value) {
            addCriterion("type_of_certificate >", value, "typeOfCertificate");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("type_of_certificate >=", value, "typeOfCertificate");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateLessThan(String value) {
            addCriterion("type_of_certificate <", value, "typeOfCertificate");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateLessThanOrEqualTo(String value) {
            addCriterion("type_of_certificate <=", value, "typeOfCertificate");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateLike(String value) {
            addCriterion("type_of_certificate like", value, "typeOfCertificate");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateNotLike(String value) {
            addCriterion("type_of_certificate not like", value, "typeOfCertificate");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateIn(List<String> values) {
            addCriterion("type_of_certificate in", values, "typeOfCertificate");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateNotIn(List<String> values) {
            addCriterion("type_of_certificate not in", values, "typeOfCertificate");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateBetween(String value1, String value2) {
            addCriterion("type_of_certificate between", value1, value2, "typeOfCertificate");
            return (Criteria) this;
        }

        public Criteria andTypeOfCertificateNotBetween(String value1, String value2) {
            addCriterion("type_of_certificate not between", value1, value2, "typeOfCertificate");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
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

        public Criteria andPoliticalStatusIsNull() {
            addCriterion("political_status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNotNull() {
            addCriterion("political_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusEqualTo(String value) {
            addCriterion("political_status =", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotEqualTo(String value) {
            addCriterion("political_status <>", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThan(String value) {
            addCriterion("political_status >", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("political_status >=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThan(String value) {
            addCriterion("political_status <", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThanOrEqualTo(String value) {
            addCriterion("political_status <=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLike(String value) {
            addCriterion("political_status like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotLike(String value) {
            addCriterion("political_status not like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIn(List<String> values) {
            addCriterion("political_status in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotIn(List<String> values) {
            addCriterion("political_status not in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusBetween(String value1, String value2) {
            addCriterion("political_status between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotBetween(String value1, String value2) {
            addCriterion("political_status not between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIsNull() {
            addCriterion("highest_education is null");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIsNotNull() {
            addCriterion("highest_education is not null");
            return (Criteria) this;
        }

        public Criteria andHighestEducationEqualTo(String value) {
            addCriterion("highest_education =", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotEqualTo(String value) {
            addCriterion("highest_education <>", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationGreaterThan(String value) {
            addCriterion("highest_education >", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationGreaterThanOrEqualTo(String value) {
            addCriterion("highest_education >=", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationLessThan(String value) {
            addCriterion("highest_education <", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationLessThanOrEqualTo(String value) {
            addCriterion("highest_education <=", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationLike(String value) {
            addCriterion("highest_education like", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotLike(String value) {
            addCriterion("highest_education not like", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIn(List<String> values) {
            addCriterion("highest_education in", values, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotIn(List<String> values) {
            addCriterion("highest_education not in", values, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationBetween(String value1, String value2) {
            addCriterion("highest_education between", value1, value2, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotBetween(String value1, String value2) {
            addCriterion("highest_education not between", value1, value2, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryIsNull() {
            addCriterion("obtain_highest_education_country is null");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryIsNotNull() {
            addCriterion("obtain_highest_education_country is not null");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryEqualTo(String value) {
            addCriterion("obtain_highest_education_country =", value, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryNotEqualTo(String value) {
            addCriterion("obtain_highest_education_country <>", value, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryGreaterThan(String value) {
            addCriterion("obtain_highest_education_country >", value, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryGreaterThanOrEqualTo(String value) {
            addCriterion("obtain_highest_education_country >=", value, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryLessThan(String value) {
            addCriterion("obtain_highest_education_country <", value, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryLessThanOrEqualTo(String value) {
            addCriterion("obtain_highest_education_country <=", value, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryLike(String value) {
            addCriterion("obtain_highest_education_country like", value, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryNotLike(String value) {
            addCriterion("obtain_highest_education_country not like", value, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryIn(List<String> values) {
            addCriterion("obtain_highest_education_country in", values, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryNotIn(List<String> values) {
            addCriterion("obtain_highest_education_country not in", values, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryBetween(String value1, String value2) {
            addCriterion("obtain_highest_education_country between", value1, value2, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andObtainHighestEducationCountryNotBetween(String value1, String value2) {
            addCriterion("obtain_highest_education_country not between", value1, value2, "obtainHighestEducationCountry");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeIsNull() {
            addCriterion("institution_with_highest_degree is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeIsNotNull() {
            addCriterion("institution_with_highest_degree is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeEqualTo(String value) {
            addCriterion("institution_with_highest_degree =", value, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeNotEqualTo(String value) {
            addCriterion("institution_with_highest_degree <>", value, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeGreaterThan(String value) {
            addCriterion("institution_with_highest_degree >", value, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("institution_with_highest_degree >=", value, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeLessThan(String value) {
            addCriterion("institution_with_highest_degree <", value, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeLessThanOrEqualTo(String value) {
            addCriterion("institution_with_highest_degree <=", value, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeLike(String value) {
            addCriterion("institution_with_highest_degree like", value, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeNotLike(String value) {
            addCriterion("institution_with_highest_degree not like", value, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeIn(List<String> values) {
            addCriterion("institution_with_highest_degree in", values, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeNotIn(List<String> values) {
            addCriterion("institution_with_highest_degree not in", values, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeBetween(String value1, String value2) {
            addCriterion("institution_with_highest_degree between", value1, value2, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andInstitutionWithHighestDegreeNotBetween(String value1, String value2) {
            addCriterion("institution_with_highest_degree not between", value1, value2, "institutionWithHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeIsNull() {
            addCriterion("major_highest_degree is null");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeIsNotNull() {
            addCriterion("major_highest_degree is not null");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeEqualTo(String value) {
            addCriterion("major_highest_degree =", value, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeNotEqualTo(String value) {
            addCriterion("major_highest_degree <>", value, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeGreaterThan(String value) {
            addCriterion("major_highest_degree >", value, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("major_highest_degree >=", value, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeLessThan(String value) {
            addCriterion("major_highest_degree <", value, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeLessThanOrEqualTo(String value) {
            addCriterion("major_highest_degree <=", value, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeLike(String value) {
            addCriterion("major_highest_degree like", value, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeNotLike(String value) {
            addCriterion("major_highest_degree not like", value, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeIn(List<String> values) {
            addCriterion("major_highest_degree in", values, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeNotIn(List<String> values) {
            addCriterion("major_highest_degree not in", values, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeBetween(String value1, String value2) {
            addCriterion("major_highest_degree between", value1, value2, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andMajorHighestDegreeNotBetween(String value1, String value2) {
            addCriterion("major_highest_degree not between", value1, value2, "majorHighestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelIsNull() {
            addCriterion("highest_degree_level is null");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelIsNotNull() {
            addCriterion("highest_degree_level is not null");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelEqualTo(String value) {
            addCriterion("highest_degree_level =", value, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelNotEqualTo(String value) {
            addCriterion("highest_degree_level <>", value, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelGreaterThan(String value) {
            addCriterion("highest_degree_level >", value, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelGreaterThanOrEqualTo(String value) {
            addCriterion("highest_degree_level >=", value, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelLessThan(String value) {
            addCriterion("highest_degree_level <", value, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelLessThanOrEqualTo(String value) {
            addCriterion("highest_degree_level <=", value, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelLike(String value) {
            addCriterion("highest_degree_level like", value, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelNotLike(String value) {
            addCriterion("highest_degree_level not like", value, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelIn(List<String> values) {
            addCriterion("highest_degree_level in", values, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelNotIn(List<String> values) {
            addCriterion("highest_degree_level not in", values, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelBetween(String value1, String value2) {
            addCriterion("highest_degree_level between", value1, value2, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLevelNotBetween(String value1, String value2) {
            addCriterion("highest_degree_level not between", value1, value2, "highestDegreeLevel");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeIsNull() {
            addCriterion("name_by_highest_degree is null");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeIsNotNull() {
            addCriterion("name_by_highest_degree is not null");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeEqualTo(String value) {
            addCriterion("name_by_highest_degree =", value, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeNotEqualTo(String value) {
            addCriterion("name_by_highest_degree <>", value, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeGreaterThan(String value) {
            addCriterion("name_by_highest_degree >", value, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("name_by_highest_degree >=", value, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeLessThan(String value) {
            addCriterion("name_by_highest_degree <", value, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeLessThanOrEqualTo(String value) {
            addCriterion("name_by_highest_degree <=", value, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeLike(String value) {
            addCriterion("name_by_highest_degree like", value, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeNotLike(String value) {
            addCriterion("name_by_highest_degree not like", value, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeIn(List<String> values) {
            addCriterion("name_by_highest_degree in", values, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeNotIn(List<String> values) {
            addCriterion("name_by_highest_degree not in", values, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeBetween(String value1, String value2) {
            addCriterion("name_by_highest_degree between", value1, value2, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andNameByHighestDegreeNotBetween(String value1, String value2) {
            addCriterion("name_by_highest_degree not between", value1, value2, "nameByHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeIsNull() {
            addCriterion("country_with_the_highest_degree is null");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeIsNotNull() {
            addCriterion("country_with_the_highest_degree is not null");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeEqualTo(String value) {
            addCriterion("country_with_the_highest_degree =", value, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeNotEqualTo(String value) {
            addCriterion("country_with_the_highest_degree <>", value, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeGreaterThan(String value) {
            addCriterion("country_with_the_highest_degree >", value, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("country_with_the_highest_degree >=", value, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeLessThan(String value) {
            addCriterion("country_with_the_highest_degree <", value, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeLessThanOrEqualTo(String value) {
            addCriterion("country_with_the_highest_degree <=", value, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeLike(String value) {
            addCriterion("country_with_the_highest_degree like", value, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeNotLike(String value) {
            addCriterion("country_with_the_highest_degree not like", value, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeIn(List<String> values) {
            addCriterion("country_with_the_highest_degree in", values, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeNotIn(List<String> values) {
            addCriterion("country_with_the_highest_degree not in", values, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeBetween(String value1, String value2) {
            addCriterion("country_with_the_highest_degree between", value1, value2, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andCountryWithTheHighestDegreeNotBetween(String value1, String value2) {
            addCriterion("country_with_the_highest_degree not between", value1, value2, "countryWithTheHighestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionIsNull() {
            addCriterion("highest_degree_institution is null");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionIsNotNull() {
            addCriterion("highest_degree_institution is not null");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionEqualTo(String value) {
            addCriterion("highest_degree_institution =", value, "highestDegreeInstitution");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionNotEqualTo(String value) {
            addCriterion("highest_degree_institution <>", value, "highestDegreeInstitution");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionGreaterThan(String value) {
            addCriterion("highest_degree_institution >", value, "highestDegreeInstitution");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("highest_degree_institution >=", value, "highestDegreeInstitution");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionLessThan(String value) {
            addCriterion("highest_degree_institution <", value, "highestDegreeInstitution");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionLessThanOrEqualTo(String value) {
            addCriterion("highest_degree_institution <=", value, "highestDegreeInstitution");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionLike(String value) {
            addCriterion("highest_degree_institution like", value, "highestDegreeInstitution");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionNotLike(String value) {
            addCriterion("highest_degree_institution not like", value, "highestDegreeInstitution");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionIn(List<String> values) {
            addCriterion("highest_degree_institution in", values, "highestDegreeInstitution");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionNotIn(List<String> values) {
            addCriterion("highest_degree_institution not in", values, "highestDegreeInstitution");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionBetween(String value1, String value2) {
            addCriterion("highest_degree_institution between", value1, value2, "highestDegreeInstitution");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeInstitutionNotBetween(String value1, String value2) {
            addCriterion("highest_degree_institution not between", value1, value2, "highestDegreeInstitution");
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
     * doctor_tutor_information_1_1_1
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * doctor_tutor_information_1_1_1 2020-12-21
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