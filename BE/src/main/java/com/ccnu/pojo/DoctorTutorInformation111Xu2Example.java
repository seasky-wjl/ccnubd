package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class DoctorTutorInformation111Xu2Example {
    /**
     * doctor_tutor_information_1_1_1_xu2
     */
    protected String orderByClause;

    /**
     * doctor_tutor_information_1_1_1_xu2
     */
    protected boolean distinct;

    /**
     * doctor_tutor_information_1_1_1_xu2
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public DoctorTutorInformation111Xu2Example() {
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
     * doctor_tutor_information_1_1_1_xu2 2020-12-21
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

        public Criteria andTutorCategoryIsNull() {
            addCriterion("tutor_category is null");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryIsNotNull() {
            addCriterion("tutor_category is not null");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryEqualTo(String value) {
            addCriterion("tutor_category =", value, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryNotEqualTo(String value) {
            addCriterion("tutor_category <>", value, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryGreaterThan(String value) {
            addCriterion("tutor_category >", value, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_category >=", value, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryLessThan(String value) {
            addCriterion("tutor_category <", value, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryLessThanOrEqualTo(String value) {
            addCriterion("tutor_category <=", value, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryLike(String value) {
            addCriterion("tutor_category like", value, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryNotLike(String value) {
            addCriterion("tutor_category not like", value, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryIn(List<String> values) {
            addCriterion("tutor_category in", values, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryNotIn(List<String> values) {
            addCriterion("tutor_category not in", values, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryBetween(String value1, String value2) {
            addCriterion("tutor_category between", value1, value2, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andTutorCategoryNotBetween(String value1, String value2) {
            addCriterion("tutor_category not between", value1, value2, "tutorCategory");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationIsNull() {
            addCriterion("have_international_cooperation is null");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationIsNotNull() {
            addCriterion("have_international_cooperation is not null");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationEqualTo(String value) {
            addCriterion("have_international_cooperation =", value, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationNotEqualTo(String value) {
            addCriterion("have_international_cooperation <>", value, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationGreaterThan(String value) {
            addCriterion("have_international_cooperation >", value, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationGreaterThanOrEqualTo(String value) {
            addCriterion("have_international_cooperation >=", value, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationLessThan(String value) {
            addCriterion("have_international_cooperation <", value, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationLessThanOrEqualTo(String value) {
            addCriterion("have_international_cooperation <=", value, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationLike(String value) {
            addCriterion("have_international_cooperation like", value, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationNotLike(String value) {
            addCriterion("have_international_cooperation not like", value, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationIn(List<String> values) {
            addCriterion("have_international_cooperation in", values, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationNotIn(List<String> values) {
            addCriterion("have_international_cooperation not in", values, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationBetween(String value1, String value2) {
            addCriterion("have_international_cooperation between", value1, value2, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andHaveInternationalCooperationNotBetween(String value1, String value2) {
            addCriterion("have_international_cooperation not between", value1, value2, "haveInternationalCooperation");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsIsNull() {
            addCriterion("guide_doctoral_students is null");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsIsNotNull() {
            addCriterion("guide_doctoral_students is not null");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsEqualTo(String value) {
            addCriterion("guide_doctoral_students =", value, "guideDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsNotEqualTo(String value) {
            addCriterion("guide_doctoral_students <>", value, "guideDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsGreaterThan(String value) {
            addCriterion("guide_doctoral_students >", value, "guideDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsGreaterThanOrEqualTo(String value) {
            addCriterion("guide_doctoral_students >=", value, "guideDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsLessThan(String value) {
            addCriterion("guide_doctoral_students <", value, "guideDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsLessThanOrEqualTo(String value) {
            addCriterion("guide_doctoral_students <=", value, "guideDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsLike(String value) {
            addCriterion("guide_doctoral_students like", value, "guideDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsNotLike(String value) {
            addCriterion("guide_doctoral_students not like", value, "guideDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsIn(List<String> values) {
            addCriterion("guide_doctoral_students in", values, "guideDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsNotIn(List<String> values) {
            addCriterion("guide_doctoral_students not in", values, "guideDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsBetween(String value1, String value2) {
            addCriterion("guide_doctoral_students between", value1, value2, "guideDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andGuideDoctoralStudentsNotBetween(String value1, String value2) {
            addCriterion("guide_doctoral_students not between", value1, value2, "guideDoctoralStudents");
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

        public Criteria andGuideProfessionalDegreeTypesIsNull() {
            addCriterion("guide_professional_degree_types is null");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesIsNotNull() {
            addCriterion("guide_professional_degree_types is not null");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesEqualTo(String value) {
            addCriterion("guide_professional_degree_types =", value, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesNotEqualTo(String value) {
            addCriterion("guide_professional_degree_types <>", value, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesGreaterThan(String value) {
            addCriterion("guide_professional_degree_types >", value, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesGreaterThanOrEqualTo(String value) {
            addCriterion("guide_professional_degree_types >=", value, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesLessThan(String value) {
            addCriterion("guide_professional_degree_types <", value, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesLessThanOrEqualTo(String value) {
            addCriterion("guide_professional_degree_types <=", value, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesLike(String value) {
            addCriterion("guide_professional_degree_types like", value, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesNotLike(String value) {
            addCriterion("guide_professional_degree_types not like", value, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesIn(List<String> values) {
            addCriterion("guide_professional_degree_types in", values, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesNotIn(List<String> values) {
            addCriterion("guide_professional_degree_types not in", values, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesBetween(String value1, String value2) {
            addCriterion("guide_professional_degree_types between", value1, value2, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andGuideProfessionalDegreeTypesNotBetween(String value1, String value2) {
            addCriterion("guide_professional_degree_types not between", value1, value2, "guideProfessionalDegreeTypes");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitIsNull() {
            addCriterion("number_of_master_students_enrolled_in_the_unit is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitIsNotNull() {
            addCriterion("number_of_master_students_enrolled_in_the_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitEqualTo(String value) {
            addCriterion("number_of_master_students_enrolled_in_the_unit =", value, "numberOfMasterStudentsEnrolledInTheUnit");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitNotEqualTo(String value) {
            addCriterion("number_of_master_students_enrolled_in_the_unit <>", value, "numberOfMasterStudentsEnrolledInTheUnit");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitGreaterThan(String value) {
            addCriterion("number_of_master_students_enrolled_in_the_unit >", value, "numberOfMasterStudentsEnrolledInTheUnit");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitGreaterThanOrEqualTo(String value) {
            addCriterion("number_of_master_students_enrolled_in_the_unit >=", value, "numberOfMasterStudentsEnrolledInTheUnit");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitLessThan(String value) {
            addCriterion("number_of_master_students_enrolled_in_the_unit <", value, "numberOfMasterStudentsEnrolledInTheUnit");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitLessThanOrEqualTo(String value) {
            addCriterion("number_of_master_students_enrolled_in_the_unit <=", value, "numberOfMasterStudentsEnrolledInTheUnit");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitLike(String value) {
            addCriterion("number_of_master_students_enrolled_in_the_unit like", value, "numberOfMasterStudentsEnrolledInTheUnit");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitNotLike(String value) {
            addCriterion("number_of_master_students_enrolled_in_the_unit not like", value, "numberOfMasterStudentsEnrolledInTheUnit");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitIn(List<String> values) {
            addCriterion("number_of_master_students_enrolled_in_the_unit in", values, "numberOfMasterStudentsEnrolledInTheUnit");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitNotIn(List<String> values) {
            addCriterion("number_of_master_students_enrolled_in_the_unit not in", values, "numberOfMasterStudentsEnrolledInTheUnit");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitBetween(String value1, String value2) {
            addCriterion("number_of_master_students_enrolled_in_the_unit between", value1, value2, "numberOfMasterStudentsEnrolledInTheUnit");
            return (Criteria) this;
        }

        public Criteria andNumberOfMasterStudentsEnrolledInTheUnitNotBetween(String value1, String value2) {
            addCriterion("number_of_master_students_enrolled_in_the_unit not between", value1, value2, "numberOfMasterStudentsEnrolledInTheUnit");
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
     * doctor_tutor_information_1_1_1_xu2
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * doctor_tutor_information_1_1_1_xu2 2020-12-21
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