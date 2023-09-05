package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class RelyingOnScientificResearchPlatform227Example {
    /**
     * relying_on_scientific_research_platform_2_2_7
     */
    protected String orderByClause;

    /**
     * relying_on_scientific_research_platform_2_2_7
     */
    protected boolean distinct;

    /**
     * relying_on_scientific_research_platform_2_2_7
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public RelyingOnScientificResearchPlatform227Example() {
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
     * relying_on_scientific_research_platform_2_2_7 2020-12-21
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

        public Criteria andResearchPlatformNameIsNull() {
            addCriterion("research_platform_name is null");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameIsNotNull() {
            addCriterion("research_platform_name is not null");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameEqualTo(String value) {
            addCriterion("research_platform_name =", value, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameNotEqualTo(String value) {
            addCriterion("research_platform_name <>", value, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameGreaterThan(String value) {
            addCriterion("research_platform_name >", value, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameGreaterThanOrEqualTo(String value) {
            addCriterion("research_platform_name >=", value, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameLessThan(String value) {
            addCriterion("research_platform_name <", value, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameLessThanOrEqualTo(String value) {
            addCriterion("research_platform_name <=", value, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameLike(String value) {
            addCriterion("research_platform_name like", value, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameNotLike(String value) {
            addCriterion("research_platform_name not like", value, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameIn(List<String> values) {
            addCriterion("research_platform_name in", values, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameNotIn(List<String> values) {
            addCriterion("research_platform_name not in", values, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameBetween(String value1, String value2) {
            addCriterion("research_platform_name between", value1, value2, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformNameNotBetween(String value1, String value2) {
            addCriterion("research_platform_name not between", value1, value2, "researchPlatformName");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelIsNull() {
            addCriterion("research_platform_level is null");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelIsNotNull() {
            addCriterion("research_platform_level is not null");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelEqualTo(String value) {
            addCriterion("research_platform_level =", value, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelNotEqualTo(String value) {
            addCriterion("research_platform_level <>", value, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelGreaterThan(String value) {
            addCriterion("research_platform_level >", value, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelGreaterThanOrEqualTo(String value) {
            addCriterion("research_platform_level >=", value, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelLessThan(String value) {
            addCriterion("research_platform_level <", value, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelLessThanOrEqualTo(String value) {
            addCriterion("research_platform_level <=", value, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelLike(String value) {
            addCriterion("research_platform_level like", value, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelNotLike(String value) {
            addCriterion("research_platform_level not like", value, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelIn(List<String> values) {
            addCriterion("research_platform_level in", values, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelNotIn(List<String> values) {
            addCriterion("research_platform_level not in", values, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelBetween(String value1, String value2) {
            addCriterion("research_platform_level between", value1, value2, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformLevelNotBetween(String value1, String value2) {
            addCriterion("research_platform_level not between", value1, value2, "researchPlatformLevel");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryIsNull() {
            addCriterion("research_platform_category is null");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryIsNotNull() {
            addCriterion("research_platform_category is not null");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryEqualTo(String value) {
            addCriterion("research_platform_category =", value, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryNotEqualTo(String value) {
            addCriterion("research_platform_category <>", value, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryGreaterThan(String value) {
            addCriterion("research_platform_category >", value, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("research_platform_category >=", value, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryLessThan(String value) {
            addCriterion("research_platform_category <", value, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryLessThanOrEqualTo(String value) {
            addCriterion("research_platform_category <=", value, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryLike(String value) {
            addCriterion("research_platform_category like", value, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryNotLike(String value) {
            addCriterion("research_platform_category not like", value, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryIn(List<String> values) {
            addCriterion("research_platform_category in", values, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryNotIn(List<String> values) {
            addCriterion("research_platform_category not in", values, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryBetween(String value1, String value2) {
            addCriterion("research_platform_category between", value1, value2, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andResearchPlatformCategoryNotBetween(String value1, String value2) {
            addCriterion("research_platform_category not between", value1, value2, "researchPlatformCategory");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesIsNull() {
            addCriterion("provincial_and_ministerial_authorities is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesIsNotNull() {
            addCriterion("provincial_and_ministerial_authorities is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesEqualTo(String value) {
            addCriterion("provincial_and_ministerial_authorities =", value, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesNotEqualTo(String value) {
            addCriterion("provincial_and_ministerial_authorities <>", value, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesGreaterThan(String value) {
            addCriterion("provincial_and_ministerial_authorities >", value, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesGreaterThanOrEqualTo(String value) {
            addCriterion("provincial_and_ministerial_authorities >=", value, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesLessThan(String value) {
            addCriterion("provincial_and_ministerial_authorities <", value, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesLessThanOrEqualTo(String value) {
            addCriterion("provincial_and_ministerial_authorities <=", value, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesLike(String value) {
            addCriterion("provincial_and_ministerial_authorities like", value, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesNotLike(String value) {
            addCriterion("provincial_and_ministerial_authorities not like", value, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesIn(List<String> values) {
            addCriterion("provincial_and_ministerial_authorities in", values, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesNotIn(List<String> values) {
            addCriterion("provincial_and_ministerial_authorities not in", values, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesBetween(String value1, String value2) {
            addCriterion("provincial_and_ministerial_authorities between", value1, value2, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andProvincialAndMinisterialAuthoritiesNotBetween(String value1, String value2) {
            addCriterion("provincial_and_ministerial_authorities not between", value1, value2, "provincialAndMinisterialAuthorities");
            return (Criteria) this;
        }

        public Criteria andServeIsNull() {
            addCriterion("serve is null");
            return (Criteria) this;
        }

        public Criteria andServeIsNotNull() {
            addCriterion("serve is not null");
            return (Criteria) this;
        }

        public Criteria andServeEqualTo(String value) {
            addCriterion("serve =", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeNotEqualTo(String value) {
            addCriterion("serve <>", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeGreaterThan(String value) {
            addCriterion("serve >", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeGreaterThanOrEqualTo(String value) {
            addCriterion("serve >=", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeLessThan(String value) {
            addCriterion("serve <", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeLessThanOrEqualTo(String value) {
            addCriterion("serve <=", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeLike(String value) {
            addCriterion("serve like", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeNotLike(String value) {
            addCriterion("serve not like", value, "serve");
            return (Criteria) this;
        }

        public Criteria andServeIn(List<String> values) {
            addCriterion("serve in", values, "serve");
            return (Criteria) this;
        }

        public Criteria andServeNotIn(List<String> values) {
            addCriterion("serve not in", values, "serve");
            return (Criteria) this;
        }

        public Criteria andServeBetween(String value1, String value2) {
            addCriterion("serve between", value1, value2, "serve");
            return (Criteria) this;
        }

        public Criteria andServeNotBetween(String value1, String value2) {
            addCriterion("serve not between", value1, value2, "serve");
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
     * relying_on_scientific_research_platform_2_2_7
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * relying_on_scientific_research_platform_2_2_7 2020-12-21
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