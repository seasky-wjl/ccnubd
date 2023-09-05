package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResearchProjectSituation121Example {
    /**
     * research_project_situation_1_2_1
     */
    protected String orderByClause;

    /**
     * research_project_situation_1_2_1
     */
    protected boolean distinct;

    /**
     * research_project_situation_1_2_1
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public ResearchProjectSituation121Example() {
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
     * research_project_situation_1_2_1 2020-12-21
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

        public Criteria andProjectNumberIsNull() {
            addCriterion("project_number is null");
            return (Criteria) this;
        }

        public Criteria andProjectNumberIsNotNull() {
            addCriterion("project_number is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNumberEqualTo(String value) {
            addCriterion("project_number =", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotEqualTo(String value) {
            addCriterion("project_number <>", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberGreaterThan(String value) {
            addCriterion("project_number >", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberGreaterThanOrEqualTo(String value) {
            addCriterion("project_number >=", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberLessThan(String value) {
            addCriterion("project_number <", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberLessThanOrEqualTo(String value) {
            addCriterion("project_number <=", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberLike(String value) {
            addCriterion("project_number like", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotLike(String value) {
            addCriterion("project_number not like", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberIn(List<String> values) {
            addCriterion("project_number in", values, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotIn(List<String> values) {
            addCriterion("project_number not in", values, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberBetween(String value1, String value2) {
            addCriterion("project_number between", value1, value2, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotBetween(String value1, String value2) {
            addCriterion("project_number not between", value1, value2, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(String value) {
            addCriterion("project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(String value) {
            addCriterion("project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(String value) {
            addCriterion("project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(String value) {
            addCriterion("project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(String value) {
            addCriterion("project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLike(String value) {
            addCriterion("project_type like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotLike(String value) {
            addCriterion("project_type not like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<String> values) {
            addCriterion("project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<String> values) {
            addCriterion("project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(String value1, String value2) {
            addCriterion("project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(String value1, String value2) {
            addCriterion("project_type not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeIsNull() {
            addCriterion("vertical_project_type is null");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeIsNotNull() {
            addCriterion("vertical_project_type is not null");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeEqualTo(String value) {
            addCriterion("vertical_project_type =", value, "verticalProjectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeNotEqualTo(String value) {
            addCriterion("vertical_project_type <>", value, "verticalProjectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeGreaterThan(String value) {
            addCriterion("vertical_project_type >", value, "verticalProjectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vertical_project_type >=", value, "verticalProjectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeLessThan(String value) {
            addCriterion("vertical_project_type <", value, "verticalProjectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeLessThanOrEqualTo(String value) {
            addCriterion("vertical_project_type <=", value, "verticalProjectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeLike(String value) {
            addCriterion("vertical_project_type like", value, "verticalProjectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeNotLike(String value) {
            addCriterion("vertical_project_type not like", value, "verticalProjectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeIn(List<String> values) {
            addCriterion("vertical_project_type in", values, "verticalProjectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeNotIn(List<String> values) {
            addCriterion("vertical_project_type not in", values, "verticalProjectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeBetween(String value1, String value2) {
            addCriterion("vertical_project_type between", value1, value2, "verticalProjectType");
            return (Criteria) this;
        }

        public Criteria andVerticalProjectTypeNotBetween(String value1, String value2) {
            addCriterion("vertical_project_type not between", value1, value2, "verticalProjectType");
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

        public Criteria andSortUnitByFillInFormIsNull() {
            addCriterion("sort_unit_by_fill_in_form is null");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormIsNotNull() {
            addCriterion("sort_unit_by_fill_in_form is not null");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormEqualTo(String value) {
            addCriterion("sort_unit_by_fill_in_form =", value, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormNotEqualTo(String value) {
            addCriterion("sort_unit_by_fill_in_form <>", value, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormGreaterThan(String value) {
            addCriterion("sort_unit_by_fill_in_form >", value, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormGreaterThanOrEqualTo(String value) {
            addCriterion("sort_unit_by_fill_in_form >=", value, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormLessThan(String value) {
            addCriterion("sort_unit_by_fill_in_form <", value, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormLessThanOrEqualTo(String value) {
            addCriterion("sort_unit_by_fill_in_form <=", value, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormLike(String value) {
            addCriterion("sort_unit_by_fill_in_form like", value, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormNotLike(String value) {
            addCriterion("sort_unit_by_fill_in_form not like", value, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormIn(List<String> values) {
            addCriterion("sort_unit_by_fill_in_form in", values, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormNotIn(List<String> values) {
            addCriterion("sort_unit_by_fill_in_form not in", values, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormBetween(String value1, String value2) {
            addCriterion("sort_unit_by_fill_in_form between", value1, value2, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andSortUnitByFillInFormNotBetween(String value1, String value2) {
            addCriterion("sort_unit_by_fill_in_form not between", value1, value2, "sortUnitByFillInForm");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountIsNull() {
            addCriterion("domestic_project_contract_amount is null");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountIsNotNull() {
            addCriterion("domestic_project_contract_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountEqualTo(String value) {
            addCriterion("domestic_project_contract_amount =", value, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountNotEqualTo(String value) {
            addCriterion("domestic_project_contract_amount <>", value, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountGreaterThan(String value) {
            addCriterion("domestic_project_contract_amount >", value, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountGreaterThanOrEqualTo(String value) {
            addCriterion("domestic_project_contract_amount >=", value, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountLessThan(String value) {
            addCriterion("domestic_project_contract_amount <", value, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountLessThanOrEqualTo(String value) {
            addCriterion("domestic_project_contract_amount <=", value, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountLike(String value) {
            addCriterion("domestic_project_contract_amount like", value, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountNotLike(String value) {
            addCriterion("domestic_project_contract_amount not like", value, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountIn(List<String> values) {
            addCriterion("domestic_project_contract_amount in", values, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountNotIn(List<String> values) {
            addCriterion("domestic_project_contract_amount not in", values, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountBetween(String value1, String value2) {
            addCriterion("domestic_project_contract_amount between", value1, value2, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andDomesticProjectContractAmountNotBetween(String value1, String value2) {
            addCriterion("domestic_project_contract_amount not between", value1, value2, "domesticProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountIsNull() {
            addCriterion("abroad_project_contract_amount is null");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountIsNotNull() {
            addCriterion("abroad_project_contract_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountEqualTo(String value) {
            addCriterion("abroad_project_contract_amount =", value, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountNotEqualTo(String value) {
            addCriterion("abroad_project_contract_amount <>", value, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountGreaterThan(String value) {
            addCriterion("abroad_project_contract_amount >", value, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountGreaterThanOrEqualTo(String value) {
            addCriterion("abroad_project_contract_amount >=", value, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountLessThan(String value) {
            addCriterion("abroad_project_contract_amount <", value, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountLessThanOrEqualTo(String value) {
            addCriterion("abroad_project_contract_amount <=", value, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountLike(String value) {
            addCriterion("abroad_project_contract_amount like", value, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountNotLike(String value) {
            addCriterion("abroad_project_contract_amount not like", value, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountIn(List<String> values) {
            addCriterion("abroad_project_contract_amount in", values, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountNotIn(List<String> values) {
            addCriterion("abroad_project_contract_amount not in", values, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountBetween(String value1, String value2) {
            addCriterion("abroad_project_contract_amount between", value1, value2, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAbroadProjectContractAmountNotBetween(String value1, String value2) {
            addCriterion("abroad_project_contract_amount not between", value1, value2, "abroadProjectContractAmount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsIsNull() {
            addCriterion("accumulated_items is null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsIsNotNull() {
            addCriterion("accumulated_items is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsEqualTo(String value) {
            addCriterion("accumulated_items =", value, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsNotEqualTo(String value) {
            addCriterion("accumulated_items <>", value, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsGreaterThan(String value) {
            addCriterion("accumulated_items >", value, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsGreaterThanOrEqualTo(String value) {
            addCriterion("accumulated_items >=", value, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsLessThan(String value) {
            addCriterion("accumulated_items <", value, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsLessThanOrEqualTo(String value) {
            addCriterion("accumulated_items <=", value, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsLike(String value) {
            addCriterion("accumulated_items like", value, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsNotLike(String value) {
            addCriterion("accumulated_items not like", value, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsIn(List<String> values) {
            addCriterion("accumulated_items in", values, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsNotIn(List<String> values) {
            addCriterion("accumulated_items not in", values, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsBetween(String value1, String value2) {
            addCriterion("accumulated_items between", value1, value2, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andAccumulatedItemsNotBetween(String value1, String value2) {
            addCriterion("accumulated_items not between", value1, value2, "accumulatedItems");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentIsNull() {
            addCriterion("project_year_to_payment is null");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentIsNotNull() {
            addCriterion("project_year_to_payment is not null");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentEqualTo(String value) {
            addCriterion("project_year_to_payment =", value, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentNotEqualTo(String value) {
            addCriterion("project_year_to_payment <>", value, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentGreaterThan(String value) {
            addCriterion("project_year_to_payment >", value, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("project_year_to_payment >=", value, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentLessThan(String value) {
            addCriterion("project_year_to_payment <", value, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentLessThanOrEqualTo(String value) {
            addCriterion("project_year_to_payment <=", value, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentLike(String value) {
            addCriterion("project_year_to_payment like", value, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentNotLike(String value) {
            addCriterion("project_year_to_payment not like", value, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentIn(List<String> values) {
            addCriterion("project_year_to_payment in", values, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentNotIn(List<String> values) {
            addCriterion("project_year_to_payment not in", values, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentBetween(String value1, String value2) {
            addCriterion("project_year_to_payment between", value1, value2, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andProjectYearToPaymentNotBetween(String value1, String value2) {
            addCriterion("project_year_to_payment not between", value1, value2, "projectYearToPayment");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeIsNull() {
            addCriterion("final_acceptance_or_identification_time is null");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeIsNotNull() {
            addCriterion("final_acceptance_or_identification_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeEqualTo(String value) {
            addCriterion("final_acceptance_or_identification_time =", value, "finalAcceptanceOrIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeNotEqualTo(String value) {
            addCriterion("final_acceptance_or_identification_time <>", value, "finalAcceptanceOrIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeGreaterThan(String value) {
            addCriterion("final_acceptance_or_identification_time >", value, "finalAcceptanceOrIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("final_acceptance_or_identification_time >=", value, "finalAcceptanceOrIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeLessThan(String value) {
            addCriterion("final_acceptance_or_identification_time <", value, "finalAcceptanceOrIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeLessThanOrEqualTo(String value) {
            addCriterion("final_acceptance_or_identification_time <=", value, "finalAcceptanceOrIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeLike(String value) {
            addCriterion("final_acceptance_or_identification_time like", value, "finalAcceptanceOrIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeNotLike(String value) {
            addCriterion("final_acceptance_or_identification_time not like", value, "finalAcceptanceOrIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeIn(List<String> values) {
            addCriterion("final_acceptance_or_identification_time in", values, "finalAcceptanceOrIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeNotIn(List<String> values) {
            addCriterion("final_acceptance_or_identification_time not in", values, "finalAcceptanceOrIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeBetween(String value1, String value2) {
            addCriterion("final_acceptance_or_identification_time between", value1, value2, "finalAcceptanceOrIdentificationTime");
            return (Criteria) this;
        }

        public Criteria andFinalAcceptanceOrIdentificationTimeNotBetween(String value1, String value2) {
            addCriterion("final_acceptance_or_identification_time not between", value1, value2, "finalAcceptanceOrIdentificationTime");
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
     * research_project_situation_1_2_1
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * research_project_situation_1_2_1 2020-12-21
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