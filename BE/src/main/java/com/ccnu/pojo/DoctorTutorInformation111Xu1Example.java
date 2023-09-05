package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class DoctorTutorInformation111Xu1Example {
    /**
     * doctor_tutor_information_1_1_1_xu1
     */
    protected String orderByClause;

    /**
     * doctor_tutor_information_1_1_1_xu1
     */
    protected boolean distinct;

    /**
     * doctor_tutor_information_1_1_1_xu1
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public DoctorTutorInformation111Xu1Example() {
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
     * doctor_tutor_information_1_1_1_xu1 2020-12-21
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

        public Criteria andParticipationDateIsNull() {
            addCriterion("participation_date is null");
            return (Criteria) this;
        }

        public Criteria andParticipationDateIsNotNull() {
            addCriterion("participation_date is not null");
            return (Criteria) this;
        }

        public Criteria andParticipationDateEqualTo(String value) {
            addCriterion("participation_date =", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateNotEqualTo(String value) {
            addCriterion("participation_date <>", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateGreaterThan(String value) {
            addCriterion("participation_date >", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateGreaterThanOrEqualTo(String value) {
            addCriterion("participation_date >=", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateLessThan(String value) {
            addCriterion("participation_date <", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateLessThanOrEqualTo(String value) {
            addCriterion("participation_date <=", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateLike(String value) {
            addCriterion("participation_date like", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateNotLike(String value) {
            addCriterion("participation_date not like", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateIn(List<String> values) {
            addCriterion("participation_date in", values, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateNotIn(List<String> values) {
            addCriterion("participation_date not in", values, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateBetween(String value1, String value2) {
            addCriterion("participation_date between", value1, value2, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateNotBetween(String value1, String value2) {
            addCriterion("participation_date not between", value1, value2, "participationDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsIsNull() {
            addCriterion("first_date_of_admission_to_doctoral_students is null");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsIsNotNull() {
            addCriterion("first_date_of_admission_to_doctoral_students is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsEqualTo(String value) {
            addCriterion("first_date_of_admission_to_doctoral_students =", value, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsNotEqualTo(String value) {
            addCriterion("first_date_of_admission_to_doctoral_students <>", value, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsGreaterThan(String value) {
            addCriterion("first_date_of_admission_to_doctoral_students >", value, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsGreaterThanOrEqualTo(String value) {
            addCriterion("first_date_of_admission_to_doctoral_students >=", value, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsLessThan(String value) {
            addCriterion("first_date_of_admission_to_doctoral_students <", value, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsLessThanOrEqualTo(String value) {
            addCriterion("first_date_of_admission_to_doctoral_students <=", value, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsLike(String value) {
            addCriterion("first_date_of_admission_to_doctoral_students like", value, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsNotLike(String value) {
            addCriterion("first_date_of_admission_to_doctoral_students not like", value, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsIn(List<String> values) {
            addCriterion("first_date_of_admission_to_doctoral_students in", values, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsNotIn(List<String> values) {
            addCriterion("first_date_of_admission_to_doctoral_students not in", values, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsBetween(String value1, String value2) {
            addCriterion("first_date_of_admission_to_doctoral_students between", value1, value2, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andFirstDateOfAdmissionToDoctoralStudentsNotBetween(String value1, String value2) {
            addCriterion("first_date_of_admission_to_doctoral_students not between", value1, value2, "firstDateOfAdmissionToDoctoralStudents");
            return (Criteria) this;
        }

        public Criteria andInTheStaffIsNull() {
            addCriterion("in_the_staff is null");
            return (Criteria) this;
        }

        public Criteria andInTheStaffIsNotNull() {
            addCriterion("in_the_staff is not null");
            return (Criteria) this;
        }

        public Criteria andInTheStaffEqualTo(String value) {
            addCriterion("in_the_staff =", value, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andInTheStaffNotEqualTo(String value) {
            addCriterion("in_the_staff <>", value, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andInTheStaffGreaterThan(String value) {
            addCriterion("in_the_staff >", value, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andInTheStaffGreaterThanOrEqualTo(String value) {
            addCriterion("in_the_staff >=", value, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andInTheStaffLessThan(String value) {
            addCriterion("in_the_staff <", value, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andInTheStaffLessThanOrEqualTo(String value) {
            addCriterion("in_the_staff <=", value, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andInTheStaffLike(String value) {
            addCriterion("in_the_staff like", value, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andInTheStaffNotLike(String value) {
            addCriterion("in_the_staff not like", value, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andInTheStaffIn(List<String> values) {
            addCriterion("in_the_staff in", values, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andInTheStaffNotIn(List<String> values) {
            addCriterion("in_the_staff not in", values, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andInTheStaffBetween(String value1, String value2) {
            addCriterion("in_the_staff between", value1, value2, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andInTheStaffNotBetween(String value1, String value2) {
            addCriterion("in_the_staff not between", value1, value2, "inTheStaff");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionIsNull() {
            addCriterion("sign_contract_with_institution is null");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionIsNotNull() {
            addCriterion("sign_contract_with_institution is not null");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionEqualTo(String value) {
            addCriterion("sign_contract_with_institution =", value, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionNotEqualTo(String value) {
            addCriterion("sign_contract_with_institution <>", value, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionGreaterThan(String value) {
            addCriterion("sign_contract_with_institution >", value, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("sign_contract_with_institution >=", value, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionLessThan(String value) {
            addCriterion("sign_contract_with_institution <", value, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionLessThanOrEqualTo(String value) {
            addCriterion("sign_contract_with_institution <=", value, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionLike(String value) {
            addCriterion("sign_contract_with_institution like", value, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionNotLike(String value) {
            addCriterion("sign_contract_with_institution not like", value, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionIn(List<String> values) {
            addCriterion("sign_contract_with_institution in", values, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionNotIn(List<String> values) {
            addCriterion("sign_contract_with_institution not in", values, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionBetween(String value1, String value2) {
            addCriterion("sign_contract_with_institution between", value1, value2, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andSignContractWithInstitutionNotBetween(String value1, String value2) {
            addCriterion("sign_contract_with_institution not between", value1, value2, "signContractWithInstitution");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodIsNull() {
            addCriterion("employment_period is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodIsNotNull() {
            addCriterion("employment_period is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodEqualTo(String value) {
            addCriterion("employment_period =", value, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodNotEqualTo(String value) {
            addCriterion("employment_period <>", value, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodGreaterThan(String value) {
            addCriterion("employment_period >", value, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("employment_period >=", value, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodLessThan(String value) {
            addCriterion("employment_period <", value, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodLessThanOrEqualTo(String value) {
            addCriterion("employment_period <=", value, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodLike(String value) {
            addCriterion("employment_period like", value, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodNotLike(String value) {
            addCriterion("employment_period not like", value, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodIn(List<String> values) {
            addCriterion("employment_period in", values, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodNotIn(List<String> values) {
            addCriterion("employment_period not in", values, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodBetween(String value1, String value2) {
            addCriterion("employment_period between", value1, value2, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andEmploymentPeriodNotBetween(String value1, String value2) {
            addCriterion("employment_period not between", value1, value2, "employmentPeriod");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitIsNull() {
            addCriterion("full_time_job_in_unit is null");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitIsNotNull() {
            addCriterion("full_time_job_in_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitEqualTo(String value) {
            addCriterion("full_time_job_in_unit =", value, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitNotEqualTo(String value) {
            addCriterion("full_time_job_in_unit <>", value, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitGreaterThan(String value) {
            addCriterion("full_time_job_in_unit >", value, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitGreaterThanOrEqualTo(String value) {
            addCriterion("full_time_job_in_unit >=", value, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitLessThan(String value) {
            addCriterion("full_time_job_in_unit <", value, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitLessThanOrEqualTo(String value) {
            addCriterion("full_time_job_in_unit <=", value, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitLike(String value) {
            addCriterion("full_time_job_in_unit like", value, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitNotLike(String value) {
            addCriterion("full_time_job_in_unit not like", value, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitIn(List<String> values) {
            addCriterion("full_time_job_in_unit in", values, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitNotIn(List<String> values) {
            addCriterion("full_time_job_in_unit not in", values, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitBetween(String value1, String value2) {
            addCriterion("full_time_job_in_unit between", value1, value2, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobInUnitNotBetween(String value1, String value2) {
            addCriterion("full_time_job_in_unit not between", value1, value2, "fullTimeJobInUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitIsNull() {
            addCriterion("full_time_job_unit is null");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitIsNotNull() {
            addCriterion("full_time_job_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitEqualTo(String value) {
            addCriterion("full_time_job_unit =", value, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitNotEqualTo(String value) {
            addCriterion("full_time_job_unit <>", value, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitGreaterThan(String value) {
            addCriterion("full_time_job_unit >", value, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitGreaterThanOrEqualTo(String value) {
            addCriterion("full_time_job_unit >=", value, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitLessThan(String value) {
            addCriterion("full_time_job_unit <", value, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitLessThanOrEqualTo(String value) {
            addCriterion("full_time_job_unit <=", value, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitLike(String value) {
            addCriterion("full_time_job_unit like", value, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitNotLike(String value) {
            addCriterion("full_time_job_unit not like", value, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitIn(List<String> values) {
            addCriterion("full_time_job_unit in", values, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitNotIn(List<String> values) {
            addCriterion("full_time_job_unit not in", values, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitBetween(String value1, String value2) {
            addCriterion("full_time_job_unit between", value1, value2, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andFullTimeJobUnitNotBetween(String value1, String value2) {
            addCriterion("full_time_job_unit not between", value1, value2, "fullTimeJobUnit");
            return (Criteria) this;
        }

        public Criteria andIsRetireIsNull() {
            addCriterion("is_retire is null");
            return (Criteria) this;
        }

        public Criteria andIsRetireIsNotNull() {
            addCriterion("is_retire is not null");
            return (Criteria) this;
        }

        public Criteria andIsRetireEqualTo(String value) {
            addCriterion("is_retire =", value, "isRetire");
            return (Criteria) this;
        }

        public Criteria andIsRetireNotEqualTo(String value) {
            addCriterion("is_retire <>", value, "isRetire");
            return (Criteria) this;
        }

        public Criteria andIsRetireGreaterThan(String value) {
            addCriterion("is_retire >", value, "isRetire");
            return (Criteria) this;
        }

        public Criteria andIsRetireGreaterThanOrEqualTo(String value) {
            addCriterion("is_retire >=", value, "isRetire");
            return (Criteria) this;
        }

        public Criteria andIsRetireLessThan(String value) {
            addCriterion("is_retire <", value, "isRetire");
            return (Criteria) this;
        }

        public Criteria andIsRetireLessThanOrEqualTo(String value) {
            addCriterion("is_retire <=", value, "isRetire");
            return (Criteria) this;
        }

        public Criteria andIsRetireLike(String value) {
            addCriterion("is_retire like", value, "isRetire");
            return (Criteria) this;
        }

        public Criteria andIsRetireNotLike(String value) {
            addCriterion("is_retire not like", value, "isRetire");
            return (Criteria) this;
        }

        public Criteria andIsRetireIn(List<String> values) {
            addCriterion("is_retire in", values, "isRetire");
            return (Criteria) this;
        }

        public Criteria andIsRetireNotIn(List<String> values) {
            addCriterion("is_retire not in", values, "isRetire");
            return (Criteria) this;
        }

        public Criteria andIsRetireBetween(String value1, String value2) {
            addCriterion("is_retire between", value1, value2, "isRetire");
            return (Criteria) this;
        }

        public Criteria andIsRetireNotBetween(String value1, String value2) {
            addCriterion("is_retire not between", value1, value2, "isRetire");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsIsNull() {
            addCriterion("professional_and_technical_positions is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsIsNotNull() {
            addCriterion("professional_and_technical_positions is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsEqualTo(String value) {
            addCriterion("professional_and_technical_positions =", value, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsNotEqualTo(String value) {
            addCriterion("professional_and_technical_positions <>", value, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsGreaterThan(String value) {
            addCriterion("professional_and_technical_positions >", value, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsGreaterThanOrEqualTo(String value) {
            addCriterion("professional_and_technical_positions >=", value, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsLessThan(String value) {
            addCriterion("professional_and_technical_positions <", value, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsLessThanOrEqualTo(String value) {
            addCriterion("professional_and_technical_positions <=", value, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsLike(String value) {
            addCriterion("professional_and_technical_positions like", value, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsNotLike(String value) {
            addCriterion("professional_and_technical_positions not like", value, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsIn(List<String> values) {
            addCriterion("professional_and_technical_positions in", values, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsNotIn(List<String> values) {
            addCriterion("professional_and_technical_positions not in", values, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsBetween(String value1, String value2) {
            addCriterion("professional_and_technical_positions between", value1, value2, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andProfessionalAndTechnicalPositionsNotBetween(String value1, String value2) {
            addCriterion("professional_and_technical_positions not between", value1, value2, "professionalAndTechnicalPositions");
            return (Criteria) this;
        }

        public Criteria andPostRatingIsNull() {
            addCriterion("post_rating is null");
            return (Criteria) this;
        }

        public Criteria andPostRatingIsNotNull() {
            addCriterion("post_rating is not null");
            return (Criteria) this;
        }

        public Criteria andPostRatingEqualTo(String value) {
            addCriterion("post_rating =", value, "postRating");
            return (Criteria) this;
        }

        public Criteria andPostRatingNotEqualTo(String value) {
            addCriterion("post_rating <>", value, "postRating");
            return (Criteria) this;
        }

        public Criteria andPostRatingGreaterThan(String value) {
            addCriterion("post_rating >", value, "postRating");
            return (Criteria) this;
        }

        public Criteria andPostRatingGreaterThanOrEqualTo(String value) {
            addCriterion("post_rating >=", value, "postRating");
            return (Criteria) this;
        }

        public Criteria andPostRatingLessThan(String value) {
            addCriterion("post_rating <", value, "postRating");
            return (Criteria) this;
        }

        public Criteria andPostRatingLessThanOrEqualTo(String value) {
            addCriterion("post_rating <=", value, "postRating");
            return (Criteria) this;
        }

        public Criteria andPostRatingLike(String value) {
            addCriterion("post_rating like", value, "postRating");
            return (Criteria) this;
        }

        public Criteria andPostRatingNotLike(String value) {
            addCriterion("post_rating not like", value, "postRating");
            return (Criteria) this;
        }

        public Criteria andPostRatingIn(List<String> values) {
            addCriterion("post_rating in", values, "postRating");
            return (Criteria) this;
        }

        public Criteria andPostRatingNotIn(List<String> values) {
            addCriterion("post_rating not in", values, "postRating");
            return (Criteria) this;
        }

        public Criteria andPostRatingBetween(String value1, String value2) {
            addCriterion("post_rating between", value1, value2, "postRating");
            return (Criteria) this;
        }

        public Criteria andPostRatingNotBetween(String value1, String value2) {
            addCriterion("post_rating not between", value1, value2, "postRating");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesIsNull() {
            addCriterion("party_and_government_duties is null");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesIsNotNull() {
            addCriterion("party_and_government_duties is not null");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesEqualTo(String value) {
            addCriterion("party_and_government_duties =", value, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesNotEqualTo(String value) {
            addCriterion("party_and_government_duties <>", value, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesGreaterThan(String value) {
            addCriterion("party_and_government_duties >", value, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("party_and_government_duties >=", value, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesLessThan(String value) {
            addCriterion("party_and_government_duties <", value, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesLessThanOrEqualTo(String value) {
            addCriterion("party_and_government_duties <=", value, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesLike(String value) {
            addCriterion("party_and_government_duties like", value, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesNotLike(String value) {
            addCriterion("party_and_government_duties not like", value, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesIn(List<String> values) {
            addCriterion("party_and_government_duties in", values, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesNotIn(List<String> values) {
            addCriterion("party_and_government_duties not in", values, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesBetween(String value1, String value2) {
            addCriterion("party_and_government_duties between", value1, value2, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andPartyAndGovernmentDutiesNotBetween(String value1, String value2) {
            addCriterion("party_and_government_duties not between", value1, value2, "partyAndGovernmentDuties");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceIsNull() {
            addCriterion("overseas_training_experience is null");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceIsNotNull() {
            addCriterion("overseas_training_experience is not null");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceEqualTo(String value) {
            addCriterion("overseas_training_experience =", value, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceNotEqualTo(String value) {
            addCriterion("overseas_training_experience <>", value, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceGreaterThan(String value) {
            addCriterion("overseas_training_experience >", value, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("overseas_training_experience >=", value, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceLessThan(String value) {
            addCriterion("overseas_training_experience <", value, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceLessThanOrEqualTo(String value) {
            addCriterion("overseas_training_experience <=", value, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceLike(String value) {
            addCriterion("overseas_training_experience like", value, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceNotLike(String value) {
            addCriterion("overseas_training_experience not like", value, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceIn(List<String> values) {
            addCriterion("overseas_training_experience in", values, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceNotIn(List<String> values) {
            addCriterion("overseas_training_experience not in", values, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceBetween(String value1, String value2) {
            addCriterion("overseas_training_experience between", value1, value2, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andOverseasTrainingExperienceNotBetween(String value1, String value2) {
            addCriterion("overseas_training_experience not between", value1, value2, "overseasTrainingExperience");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionIsNull() {
            addCriterion("name_of_selected_talent_project_and_year_of_selection is null");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionIsNotNull() {
            addCriterion("name_of_selected_talent_project_and_year_of_selection is not null");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionEqualTo(String value) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection =", value, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionNotEqualTo(String value) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection <>", value, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionGreaterThan(String value) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection >", value, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionGreaterThanOrEqualTo(String value) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection >=", value, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionLessThan(String value) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection <", value, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionLessThanOrEqualTo(String value) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection <=", value, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionLike(String value) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection like", value, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionNotLike(String value) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection not like", value, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionIn(List<String> values) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection in", values, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionNotIn(List<String> values) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection not in", values, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionBetween(String value1, String value2) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection between", value1, value2, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andNameOfSelectedTalentProjectAndYearOfSelectionNotBetween(String value1, String value2) {
            addCriterion("name_of_selected_talent_project_and_year_of_selection not between", value1, value2, "nameOfSelectedTalentProjectAndYearOfSelection");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesIsNull() {
            addCriterion("have_other_industry_technical_titles is null");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesIsNotNull() {
            addCriterion("have_other_industry_technical_titles is not null");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesEqualTo(String value) {
            addCriterion("have_other_industry_technical_titles =", value, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesNotEqualTo(String value) {
            addCriterion("have_other_industry_technical_titles <>", value, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesGreaterThan(String value) {
            addCriterion("have_other_industry_technical_titles >", value, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesGreaterThanOrEqualTo(String value) {
            addCriterion("have_other_industry_technical_titles >=", value, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesLessThan(String value) {
            addCriterion("have_other_industry_technical_titles <", value, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesLessThanOrEqualTo(String value) {
            addCriterion("have_other_industry_technical_titles <=", value, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesLike(String value) {
            addCriterion("have_other_industry_technical_titles like", value, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesNotLike(String value) {
            addCriterion("have_other_industry_technical_titles not like", value, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesIn(List<String> values) {
            addCriterion("have_other_industry_technical_titles in", values, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesNotIn(List<String> values) {
            addCriterion("have_other_industry_technical_titles not in", values, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesBetween(String value1, String value2) {
            addCriterion("have_other_industry_technical_titles between", value1, value2, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveOtherIndustryTechnicalTitlesNotBetween(String value1, String value2) {
            addCriterion("have_other_industry_technical_titles not between", value1, value2, "haveOtherIndustryTechnicalTitles");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadIsNull() {
            addCriterion("have_academic_part_time_at_home_and_abroad is null");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadIsNotNull() {
            addCriterion("have_academic_part_time_at_home_and_abroad is not null");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadEqualTo(String value) {
            addCriterion("have_academic_part_time_at_home_and_abroad =", value, "haveAcademicPartTimeAtHomeAndAbroad");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadNotEqualTo(String value) {
            addCriterion("have_academic_part_time_at_home_and_abroad <>", value, "haveAcademicPartTimeAtHomeAndAbroad");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadGreaterThan(String value) {
            addCriterion("have_academic_part_time_at_home_and_abroad >", value, "haveAcademicPartTimeAtHomeAndAbroad");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadGreaterThanOrEqualTo(String value) {
            addCriterion("have_academic_part_time_at_home_and_abroad >=", value, "haveAcademicPartTimeAtHomeAndAbroad");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadLessThan(String value) {
            addCriterion("have_academic_part_time_at_home_and_abroad <", value, "haveAcademicPartTimeAtHomeAndAbroad");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadLessThanOrEqualTo(String value) {
            addCriterion("have_academic_part_time_at_home_and_abroad <=", value, "haveAcademicPartTimeAtHomeAndAbroad");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadLike(String value) {
            addCriterion("have_academic_part_time_at_home_and_abroad like", value, "haveAcademicPartTimeAtHomeAndAbroad");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadNotLike(String value) {
            addCriterion("have_academic_part_time_at_home_and_abroad not like", value, "haveAcademicPartTimeAtHomeAndAbroad");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadIn(List<String> values) {
            addCriterion("have_academic_part_time_at_home_and_abroad in", values, "haveAcademicPartTimeAtHomeAndAbroad");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadNotIn(List<String> values) {
            addCriterion("have_academic_part_time_at_home_and_abroad not in", values, "haveAcademicPartTimeAtHomeAndAbroad");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadBetween(String value1, String value2) {
            addCriterion("have_academic_part_time_at_home_and_abroad between", value1, value2, "haveAcademicPartTimeAtHomeAndAbroad");
            return (Criteria) this;
        }

        public Criteria andHaveAcademicPartTimeAtHomeAndAbroadNotBetween(String value1, String value2) {
            addCriterion("have_academic_part_time_at_home_and_abroad not between", value1, value2, "haveAcademicPartTimeAtHomeAndAbroad");
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
     * doctor_tutor_information_1_1_1_xu1
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * doctor_tutor_information_1_1_1_xu1 2020-12-21
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