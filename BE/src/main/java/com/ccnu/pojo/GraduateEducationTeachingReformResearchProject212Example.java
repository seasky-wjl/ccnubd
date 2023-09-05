package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class GraduateEducationTeachingReformResearchProject212Example {
    /**
     * graduate_education_teaching_reform_research_project_2_1_2
     */
    protected String orderByClause;

    /**
     * graduate_education_teaching_reform_research_project_2_1_2
     */
    protected boolean distinct;

    /**
     * graduate_education_teaching_reform_research_project_2_1_2
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public GraduateEducationTeachingReformResearchProject212Example() {
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
     * graduate_education_teaching_reform_research_project_2_1_2 2020-12-21
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectDateIsNull() {
            addCriterion("project_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectDateIsNotNull() {
            addCriterion("project_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDateEqualTo(String value) {
            addCriterion("project_date =", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateNotEqualTo(String value) {
            addCriterion("project_date <>", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateGreaterThan(String value) {
            addCriterion("project_date >", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateGreaterThanOrEqualTo(String value) {
            addCriterion("project_date >=", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateLessThan(String value) {
            addCriterion("project_date <", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateLessThanOrEqualTo(String value) {
            addCriterion("project_date <=", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateLike(String value) {
            addCriterion("project_date like", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateNotLike(String value) {
            addCriterion("project_date not like", value, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateIn(List<String> values) {
            addCriterion("project_date in", values, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateNotIn(List<String> values) {
            addCriterion("project_date not in", values, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateBetween(String value1, String value2) {
            addCriterion("project_date between", value1, value2, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectDateNotBetween(String value1, String value2) {
            addCriterion("project_date not between", value1, value2, "projectDate");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNull() {
            addCriterion("project_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNotNull() {
            addCriterion("project_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualTo(String value) {
            addCriterion("project_status =", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualTo(String value) {
            addCriterion("project_status <>", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThan(String value) {
            addCriterion("project_status >", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualTo(String value) {
            addCriterion("project_status >=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThan(String value) {
            addCriterion("project_status <", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualTo(String value) {
            addCriterion("project_status <=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLike(String value) {
            addCriterion("project_status like", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotLike(String value) {
            addCriterion("project_status not like", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIn(List<String> values) {
            addCriterion("project_status in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotIn(List<String> values) {
            addCriterion("project_status not in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusBetween(String value1, String value2) {
            addCriterion("project_status between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotBetween(String value1, String value2) {
            addCriterion("project_status not between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andEndOfDateIsNull() {
            addCriterion("end_of_date is null");
            return (Criteria) this;
        }

        public Criteria andEndOfDateIsNotNull() {
            addCriterion("end_of_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndOfDateEqualTo(String value) {
            addCriterion("end_of_date =", value, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andEndOfDateNotEqualTo(String value) {
            addCriterion("end_of_date <>", value, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andEndOfDateGreaterThan(String value) {
            addCriterion("end_of_date >", value, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andEndOfDateGreaterThanOrEqualTo(String value) {
            addCriterion("end_of_date >=", value, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andEndOfDateLessThan(String value) {
            addCriterion("end_of_date <", value, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andEndOfDateLessThanOrEqualTo(String value) {
            addCriterion("end_of_date <=", value, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andEndOfDateLike(String value) {
            addCriterion("end_of_date like", value, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andEndOfDateNotLike(String value) {
            addCriterion("end_of_date not like", value, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andEndOfDateIn(List<String> values) {
            addCriterion("end_of_date in", values, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andEndOfDateNotIn(List<String> values) {
            addCriterion("end_of_date not in", values, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andEndOfDateBetween(String value1, String value2) {
            addCriterion("end_of_date between", value1, value2, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andEndOfDateNotBetween(String value1, String value2) {
            addCriterion("end_of_date not between", value1, value2, "endOfDate");
            return (Criteria) this;
        }

        public Criteria andProjectLevelIsNull() {
            addCriterion("project_level is null");
            return (Criteria) this;
        }

        public Criteria andProjectLevelIsNotNull() {
            addCriterion("project_level is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLevelEqualTo(String value) {
            addCriterion("project_level =", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotEqualTo(String value) {
            addCriterion("project_level <>", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThan(String value) {
            addCriterion("project_level >", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThanOrEqualTo(String value) {
            addCriterion("project_level >=", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThan(String value) {
            addCriterion("project_level <", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThanOrEqualTo(String value) {
            addCriterion("project_level <=", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelLike(String value) {
            addCriterion("project_level like", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotLike(String value) {
            addCriterion("project_level not like", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelIn(List<String> values) {
            addCriterion("project_level in", values, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotIn(List<String> values) {
            addCriterion("project_level not in", values, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelBetween(String value1, String value2) {
            addCriterion("project_level between", value1, value2, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotBetween(String value1, String value2) {
            addCriterion("project_level not between", value1, value2, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectFundingIsNull() {
            addCriterion("project_funding is null");
            return (Criteria) this;
        }

        public Criteria andProjectFundingIsNotNull() {
            addCriterion("project_funding is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFundingEqualTo(String value) {
            addCriterion("project_funding =", value, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andProjectFundingNotEqualTo(String value) {
            addCriterion("project_funding <>", value, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andProjectFundingGreaterThan(String value) {
            addCriterion("project_funding >", value, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andProjectFundingGreaterThanOrEqualTo(String value) {
            addCriterion("project_funding >=", value, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andProjectFundingLessThan(String value) {
            addCriterion("project_funding <", value, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andProjectFundingLessThanOrEqualTo(String value) {
            addCriterion("project_funding <=", value, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andProjectFundingLike(String value) {
            addCriterion("project_funding like", value, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andProjectFundingNotLike(String value) {
            addCriterion("project_funding not like", value, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andProjectFundingIn(List<String> values) {
            addCriterion("project_funding in", values, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andProjectFundingNotIn(List<String> values) {
            addCriterion("project_funding not in", values, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andProjectFundingBetween(String value1, String value2) {
            addCriterion("project_funding between", value1, value2, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andProjectFundingNotBetween(String value1, String value2) {
            addCriterion("project_funding not between", value1, value2, "projectFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingIsNull() {
            addCriterion("sources_of_funding is null");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingIsNotNull() {
            addCriterion("sources_of_funding is not null");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingEqualTo(String value) {
            addCriterion("sources_of_funding =", value, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingNotEqualTo(String value) {
            addCriterion("sources_of_funding <>", value, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingGreaterThan(String value) {
            addCriterion("sources_of_funding >", value, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingGreaterThanOrEqualTo(String value) {
            addCriterion("sources_of_funding >=", value, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingLessThan(String value) {
            addCriterion("sources_of_funding <", value, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingLessThanOrEqualTo(String value) {
            addCriterion("sources_of_funding <=", value, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingLike(String value) {
            addCriterion("sources_of_funding like", value, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingNotLike(String value) {
            addCriterion("sources_of_funding not like", value, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingIn(List<String> values) {
            addCriterion("sources_of_funding in", values, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingNotIn(List<String> values) {
            addCriterion("sources_of_funding not in", values, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingBetween(String value1, String value2) {
            addCriterion("sources_of_funding between", value1, value2, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andSourcesOfFundingNotBetween(String value1, String value2) {
            addCriterion("sources_of_funding not between", value1, value2, "sourcesOfFunding");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("`role` is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("`role` is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("`role` =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("`role` <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("`role` >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("`role` >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("`role` <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("`role` <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("`role` like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("`role` not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("`role` in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("`role` not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("`role` between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("`role` not between", value1, value2, "role");
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
     * graduate_education_teaching_reform_research_project_2_1_2
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * graduate_education_teaching_reform_research_project_2_1_2 2020-12-21
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