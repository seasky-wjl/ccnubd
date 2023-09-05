package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class PatentOrCopyrightAuthorizationStatus224Example {
    /**
     * patent_or_copyright_authorization_status_2_2_4
     */
    protected String orderByClause;

    /**
     * patent_or_copyright_authorization_status_2_2_4
     */
    protected boolean distinct;

    /**
     * patent_or_copyright_authorization_status_2_2_4
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public PatentOrCopyrightAuthorizationStatus224Example() {
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
     * patent_or_copyright_authorization_status_2_2_4 2020-12-21
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

        public Criteria andPatentOrBookNameIsNull() {
            addCriterion("patent_or_book_name is null");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameIsNotNull() {
            addCriterion("patent_or_book_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameEqualTo(String value) {
            addCriterion("patent_or_book_name =", value, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameNotEqualTo(String value) {
            addCriterion("patent_or_book_name <>", value, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameGreaterThan(String value) {
            addCriterion("patent_or_book_name >", value, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("patent_or_book_name >=", value, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameLessThan(String value) {
            addCriterion("patent_or_book_name <", value, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameLessThanOrEqualTo(String value) {
            addCriterion("patent_or_book_name <=", value, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameLike(String value) {
            addCriterion("patent_or_book_name like", value, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameNotLike(String value) {
            addCriterion("patent_or_book_name not like", value, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameIn(List<String> values) {
            addCriterion("patent_or_book_name in", values, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameNotIn(List<String> values) {
            addCriterion("patent_or_book_name not in", values, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameBetween(String value1, String value2) {
            addCriterion("patent_or_book_name between", value1, value2, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andPatentOrBookNameNotBetween(String value1, String value2) {
            addCriterion("patent_or_book_name not between", value1, value2, "patentOrBookName");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryIsNull() {
            addCriterion("intellectual_property_category is null");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryIsNotNull() {
            addCriterion("intellectual_property_category is not null");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryEqualTo(String value) {
            addCriterion("intellectual_property_category =", value, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryNotEqualTo(String value) {
            addCriterion("intellectual_property_category <>", value, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryGreaterThan(String value) {
            addCriterion("intellectual_property_category >", value, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("intellectual_property_category >=", value, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryLessThan(String value) {
            addCriterion("intellectual_property_category <", value, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryLessThanOrEqualTo(String value) {
            addCriterion("intellectual_property_category <=", value, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryLike(String value) {
            addCriterion("intellectual_property_category like", value, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryNotLike(String value) {
            addCriterion("intellectual_property_category not like", value, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryIn(List<String> values) {
            addCriterion("intellectual_property_category in", values, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryNotIn(List<String> values) {
            addCriterion("intellectual_property_category not in", values, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryBetween(String value1, String value2) {
            addCriterion("intellectual_property_category between", value1, value2, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andIntellectualPropertyCategoryNotBetween(String value1, String value2) {
            addCriterion("intellectual_property_category not between", value1, value2, "intellectualPropertyCategory");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberIsNull() {
            addCriterion("authorization_number is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberIsNotNull() {
            addCriterion("authorization_number is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberEqualTo(String value) {
            addCriterion("authorization_number =", value, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberNotEqualTo(String value) {
            addCriterion("authorization_number <>", value, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberGreaterThan(String value) {
            addCriterion("authorization_number >", value, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("authorization_number >=", value, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberLessThan(String value) {
            addCriterion("authorization_number <", value, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberLessThanOrEqualTo(String value) {
            addCriterion("authorization_number <=", value, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberLike(String value) {
            addCriterion("authorization_number like", value, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberNotLike(String value) {
            addCriterion("authorization_number not like", value, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberIn(List<String> values) {
            addCriterion("authorization_number in", values, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberNotIn(List<String> values) {
            addCriterion("authorization_number not in", values, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberBetween(String value1, String value2) {
            addCriterion("authorization_number between", value1, value2, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andAuthorizationNumberNotBetween(String value1, String value2) {
            addCriterion("authorization_number not between", value1, value2, "authorizationNumber");
            return (Criteria) this;
        }

        public Criteria andApprovedDateIsNull() {
            addCriterion("approved_date is null");
            return (Criteria) this;
        }

        public Criteria andApprovedDateIsNotNull() {
            addCriterion("approved_date is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedDateEqualTo(String value) {
            addCriterion("approved_date =", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateNotEqualTo(String value) {
            addCriterion("approved_date <>", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateGreaterThan(String value) {
            addCriterion("approved_date >", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateGreaterThanOrEqualTo(String value) {
            addCriterion("approved_date >=", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateLessThan(String value) {
            addCriterion("approved_date <", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateLessThanOrEqualTo(String value) {
            addCriterion("approved_date <=", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateLike(String value) {
            addCriterion("approved_date like", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateNotLike(String value) {
            addCriterion("approved_date not like", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateIn(List<String> values) {
            addCriterion("approved_date in", values, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateNotIn(List<String> values) {
            addCriterion("approved_date not in", values, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateBetween(String value1, String value2) {
            addCriterion("approved_date between", value1, value2, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateNotBetween(String value1, String value2) {
            addCriterion("approved_date not between", value1, value2, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andSortByMeIsNull() {
            addCriterion("sort_by_me is null");
            return (Criteria) this;
        }

        public Criteria andSortByMeIsNotNull() {
            addCriterion("sort_by_me is not null");
            return (Criteria) this;
        }

        public Criteria andSortByMeEqualTo(String value) {
            addCriterion("sort_by_me =", value, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andSortByMeNotEqualTo(String value) {
            addCriterion("sort_by_me <>", value, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andSortByMeGreaterThan(String value) {
            addCriterion("sort_by_me >", value, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andSortByMeGreaterThanOrEqualTo(String value) {
            addCriterion("sort_by_me >=", value, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andSortByMeLessThan(String value) {
            addCriterion("sort_by_me <", value, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andSortByMeLessThanOrEqualTo(String value) {
            addCriterion("sort_by_me <=", value, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andSortByMeLike(String value) {
            addCriterion("sort_by_me like", value, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andSortByMeNotLike(String value) {
            addCriterion("sort_by_me not like", value, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andSortByMeIn(List<String> values) {
            addCriterion("sort_by_me in", values, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andSortByMeNotIn(List<String> values) {
            addCriterion("sort_by_me not in", values, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andSortByMeBetween(String value1, String value2) {
            addCriterion("sort_by_me between", value1, value2, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andSortByMeNotBetween(String value1, String value2) {
            addCriterion("sort_by_me not between", value1, value2, "sortByMe");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitIsNull() {
            addCriterion("whether_unit_is_first_application_unit is null");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitIsNotNull() {
            addCriterion("whether_unit_is_first_application_unit is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitEqualTo(String value) {
            addCriterion("whether_unit_is_first_application_unit =", value, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitNotEqualTo(String value) {
            addCriterion("whether_unit_is_first_application_unit <>", value, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitGreaterThan(String value) {
            addCriterion("whether_unit_is_first_application_unit >", value, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitGreaterThanOrEqualTo(String value) {
            addCriterion("whether_unit_is_first_application_unit >=", value, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitLessThan(String value) {
            addCriterion("whether_unit_is_first_application_unit <", value, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitLessThanOrEqualTo(String value) {
            addCriterion("whether_unit_is_first_application_unit <=", value, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitLike(String value) {
            addCriterion("whether_unit_is_first_application_unit like", value, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitNotLike(String value) {
            addCriterion("whether_unit_is_first_application_unit not like", value, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitIn(List<String> values) {
            addCriterion("whether_unit_is_first_application_unit in", values, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitNotIn(List<String> values) {
            addCriterion("whether_unit_is_first_application_unit not in", values, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitBetween(String value1, String value2) {
            addCriterion("whether_unit_is_first_application_unit between", value1, value2, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherUnitIsFirstApplicationUnitNotBetween(String value1, String value2) {
            addCriterion("whether_unit_is_first_application_unit not between", value1, value2, "whetherUnitIsFirstApplicationUnit");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentIsNull() {
            addCriterion("whether_industry_joint_patent is null");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentIsNotNull() {
            addCriterion("whether_industry_joint_patent is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentEqualTo(String value) {
            addCriterion("whether_industry_joint_patent =", value, "whetherIndustryJointPatent");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentNotEqualTo(String value) {
            addCriterion("whether_industry_joint_patent <>", value, "whetherIndustryJointPatent");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentGreaterThan(String value) {
            addCriterion("whether_industry_joint_patent >", value, "whetherIndustryJointPatent");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentGreaterThanOrEqualTo(String value) {
            addCriterion("whether_industry_joint_patent >=", value, "whetherIndustryJointPatent");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentLessThan(String value) {
            addCriterion("whether_industry_joint_patent <", value, "whetherIndustryJointPatent");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentLessThanOrEqualTo(String value) {
            addCriterion("whether_industry_joint_patent <=", value, "whetherIndustryJointPatent");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentLike(String value) {
            addCriterion("whether_industry_joint_patent like", value, "whetherIndustryJointPatent");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentNotLike(String value) {
            addCriterion("whether_industry_joint_patent not like", value, "whetherIndustryJointPatent");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentIn(List<String> values) {
            addCriterion("whether_industry_joint_patent in", values, "whetherIndustryJointPatent");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentNotIn(List<String> values) {
            addCriterion("whether_industry_joint_patent not in", values, "whetherIndustryJointPatent");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentBetween(String value1, String value2) {
            addCriterion("whether_industry_joint_patent between", value1, value2, "whetherIndustryJointPatent");
            return (Criteria) this;
        }

        public Criteria andWhetherIndustryJointPatentNotBetween(String value1, String value2) {
            addCriterion("whether_industry_joint_patent not between", value1, value2, "whetherIndustryJointPatent");
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
     * patent_or_copyright_authorization_status_2_2_4
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * patent_or_copyright_authorization_status_2_2_4 2020-12-21
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