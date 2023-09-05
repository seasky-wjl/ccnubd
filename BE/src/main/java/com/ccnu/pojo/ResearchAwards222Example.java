package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResearchAwards222Example {
    /**
     * research_awards_2_2_2
     */
    protected String orderByClause;

    /**
     * research_awards_2_2_2
     */
    protected boolean distinct;

    /**
     * research_awards_2_2_2
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public ResearchAwards222Example() {
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
     * research_awards_2_2_2 2020-12-21
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

        public Criteria andWhetherFirstCompletedUnitIsNull() {
            addCriterion("whether_first_completed_unit is null");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitIsNotNull() {
            addCriterion("whether_first_completed_unit is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitEqualTo(String value) {
            addCriterion("whether_first_completed_unit =", value, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitNotEqualTo(String value) {
            addCriterion("whether_first_completed_unit <>", value, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitGreaterThan(String value) {
            addCriterion("whether_first_completed_unit >", value, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitGreaterThanOrEqualTo(String value) {
            addCriterion("whether_first_completed_unit >=", value, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitLessThan(String value) {
            addCriterion("whether_first_completed_unit <", value, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitLessThanOrEqualTo(String value) {
            addCriterion("whether_first_completed_unit <=", value, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitLike(String value) {
            addCriterion("whether_first_completed_unit like", value, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitNotLike(String value) {
            addCriterion("whether_first_completed_unit not like", value, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitIn(List<String> values) {
            addCriterion("whether_first_completed_unit in", values, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitNotIn(List<String> values) {
            addCriterion("whether_first_completed_unit not in", values, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitBetween(String value1, String value2) {
            addCriterion("whether_first_completed_unit between", value1, value2, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherFirstCompletedUnitNotBetween(String value1, String value2) {
            addCriterion("whether_first_completed_unit not between", value1, value2, "whetherFirstCompletedUnit");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryIsNull() {
            addCriterion("award_category is null");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryIsNotNull() {
            addCriterion("award_category is not null");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryEqualTo(String value) {
            addCriterion("award_category =", value, "awardCategory");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryNotEqualTo(String value) {
            addCriterion("award_category <>", value, "awardCategory");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryGreaterThan(String value) {
            addCriterion("award_category >", value, "awardCategory");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("award_category >=", value, "awardCategory");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryLessThan(String value) {
            addCriterion("award_category <", value, "awardCategory");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryLessThanOrEqualTo(String value) {
            addCriterion("award_category <=", value, "awardCategory");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryLike(String value) {
            addCriterion("award_category like", value, "awardCategory");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryNotLike(String value) {
            addCriterion("award_category not like", value, "awardCategory");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryIn(List<String> values) {
            addCriterion("award_category in", values, "awardCategory");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryNotIn(List<String> values) {
            addCriterion("award_category not in", values, "awardCategory");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryBetween(String value1, String value2) {
            addCriterion("award_category between", value1, value2, "awardCategory");
            return (Criteria) this;
        }

        public Criteria andAwardCategoryNotBetween(String value1, String value2) {
            addCriterion("award_category not between", value1, value2, "awardCategory");
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

        public Criteria andAwardDateIsNull() {
            addCriterion("award_date is null");
            return (Criteria) this;
        }

        public Criteria andAwardDateIsNotNull() {
            addCriterion("award_date is not null");
            return (Criteria) this;
        }

        public Criteria andAwardDateEqualTo(String value) {
            addCriterion("award_date =", value, "awardDate");
            return (Criteria) this;
        }

        public Criteria andAwardDateNotEqualTo(String value) {
            addCriterion("award_date <>", value, "awardDate");
            return (Criteria) this;
        }

        public Criteria andAwardDateGreaterThan(String value) {
            addCriterion("award_date >", value, "awardDate");
            return (Criteria) this;
        }

        public Criteria andAwardDateGreaterThanOrEqualTo(String value) {
            addCriterion("award_date >=", value, "awardDate");
            return (Criteria) this;
        }

        public Criteria andAwardDateLessThan(String value) {
            addCriterion("award_date <", value, "awardDate");
            return (Criteria) this;
        }

        public Criteria andAwardDateLessThanOrEqualTo(String value) {
            addCriterion("award_date <=", value, "awardDate");
            return (Criteria) this;
        }

        public Criteria andAwardDateLike(String value) {
            addCriterion("award_date like", value, "awardDate");
            return (Criteria) this;
        }

        public Criteria andAwardDateNotLike(String value) {
            addCriterion("award_date not like", value, "awardDate");
            return (Criteria) this;
        }

        public Criteria andAwardDateIn(List<String> values) {
            addCriterion("award_date in", values, "awardDate");
            return (Criteria) this;
        }

        public Criteria andAwardDateNotIn(List<String> values) {
            addCriterion("award_date not in", values, "awardDate");
            return (Criteria) this;
        }

        public Criteria andAwardDateBetween(String value1, String value2) {
            addCriterion("award_date between", value1, value2, "awardDate");
            return (Criteria) this;
        }

        public Criteria andAwardDateNotBetween(String value1, String value2) {
            addCriterion("award_date not between", value1, value2, "awardDate");
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

        public Criteria andAwardCertificateNumberIsNull() {
            addCriterion("award_certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberIsNotNull() {
            addCriterion("award_certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberEqualTo(String value) {
            addCriterion("award_certificate_number =", value, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberNotEqualTo(String value) {
            addCriterion("award_certificate_number <>", value, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberGreaterThan(String value) {
            addCriterion("award_certificate_number >", value, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("award_certificate_number >=", value, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberLessThan(String value) {
            addCriterion("award_certificate_number <", value, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("award_certificate_number <=", value, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberLike(String value) {
            addCriterion("award_certificate_number like", value, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberNotLike(String value) {
            addCriterion("award_certificate_number not like", value, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberIn(List<String> values) {
            addCriterion("award_certificate_number in", values, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberNotIn(List<String> values) {
            addCriterion("award_certificate_number not in", values, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberBetween(String value1, String value2) {
            addCriterion("award_certificate_number between", value1, value2, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andAwardCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("award_certificate_number not between", value1, value2, "awardCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingIsNull() {
            addCriterion("complete_unit_ranking is null");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingIsNotNull() {
            addCriterion("complete_unit_ranking is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingEqualTo(String value) {
            addCriterion("complete_unit_ranking =", value, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingNotEqualTo(String value) {
            addCriterion("complete_unit_ranking <>", value, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingGreaterThan(String value) {
            addCriterion("complete_unit_ranking >", value, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingGreaterThanOrEqualTo(String value) {
            addCriterion("complete_unit_ranking >=", value, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingLessThan(String value) {
            addCriterion("complete_unit_ranking <", value, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingLessThanOrEqualTo(String value) {
            addCriterion("complete_unit_ranking <=", value, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingLike(String value) {
            addCriterion("complete_unit_ranking like", value, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingNotLike(String value) {
            addCriterion("complete_unit_ranking not like", value, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingIn(List<String> values) {
            addCriterion("complete_unit_ranking in", values, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingNotIn(List<String> values) {
            addCriterion("complete_unit_ranking not in", values, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingBetween(String value1, String value2) {
            addCriterion("complete_unit_ranking between", value1, value2, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andCompleteUnitRankingNotBetween(String value1, String value2) {
            addCriterion("complete_unit_ranking not between", value1, value2, "completeUnitRanking");
            return (Criteria) this;
        }

        public Criteria andSortByNameIsNull() {
            addCriterion("sort_by_name is null");
            return (Criteria) this;
        }

        public Criteria andSortByNameIsNotNull() {
            addCriterion("sort_by_name is not null");
            return (Criteria) this;
        }

        public Criteria andSortByNameEqualTo(String value) {
            addCriterion("sort_by_name =", value, "sortByName");
            return (Criteria) this;
        }

        public Criteria andSortByNameNotEqualTo(String value) {
            addCriterion("sort_by_name <>", value, "sortByName");
            return (Criteria) this;
        }

        public Criteria andSortByNameGreaterThan(String value) {
            addCriterion("sort_by_name >", value, "sortByName");
            return (Criteria) this;
        }

        public Criteria andSortByNameGreaterThanOrEqualTo(String value) {
            addCriterion("sort_by_name >=", value, "sortByName");
            return (Criteria) this;
        }

        public Criteria andSortByNameLessThan(String value) {
            addCriterion("sort_by_name <", value, "sortByName");
            return (Criteria) this;
        }

        public Criteria andSortByNameLessThanOrEqualTo(String value) {
            addCriterion("sort_by_name <=", value, "sortByName");
            return (Criteria) this;
        }

        public Criteria andSortByNameLike(String value) {
            addCriterion("sort_by_name like", value, "sortByName");
            return (Criteria) this;
        }

        public Criteria andSortByNameNotLike(String value) {
            addCriterion("sort_by_name not like", value, "sortByName");
            return (Criteria) this;
        }

        public Criteria andSortByNameIn(List<String> values) {
            addCriterion("sort_by_name in", values, "sortByName");
            return (Criteria) this;
        }

        public Criteria andSortByNameNotIn(List<String> values) {
            addCriterion("sort_by_name not in", values, "sortByName");
            return (Criteria) this;
        }

        public Criteria andSortByNameBetween(String value1, String value2) {
            addCriterion("sort_by_name between", value1, value2, "sortByName");
            return (Criteria) this;
        }

        public Criteria andSortByNameNotBetween(String value1, String value2) {
            addCriterion("sort_by_name not between", value1, value2, "sortByName");
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
     * research_awards_2_2_2
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * research_awards_2_2_2 2020-12-21
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