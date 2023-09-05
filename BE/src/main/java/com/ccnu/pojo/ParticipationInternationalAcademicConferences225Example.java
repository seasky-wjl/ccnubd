package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ParticipationInternationalAcademicConferences225Example {
    /**
     * participation_international_academic_conferences_2_2_5
     */
    protected String orderByClause;

    /**
     * participation_international_academic_conferences_2_2_5
     */
    protected boolean distinct;

    /**
     * participation_international_academic_conferences_2_2_5
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public ParticipationInternationalAcademicConferences225Example() {
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
     * participation_international_academic_conferences_2_2_5 2020-12-21
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

        public Criteria andAcademicConferenceNameIsNull() {
            addCriterion("academic_conference_name is null");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameIsNotNull() {
            addCriterion("academic_conference_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameEqualTo(String value) {
            addCriterion("academic_conference_name =", value, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameNotEqualTo(String value) {
            addCriterion("academic_conference_name <>", value, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameGreaterThan(String value) {
            addCriterion("academic_conference_name >", value, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameGreaterThanOrEqualTo(String value) {
            addCriterion("academic_conference_name >=", value, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameLessThan(String value) {
            addCriterion("academic_conference_name <", value, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameLessThanOrEqualTo(String value) {
            addCriterion("academic_conference_name <=", value, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameLike(String value) {
            addCriterion("academic_conference_name like", value, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameNotLike(String value) {
            addCriterion("academic_conference_name not like", value, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameIn(List<String> values) {
            addCriterion("academic_conference_name in", values, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameNotIn(List<String> values) {
            addCriterion("academic_conference_name not in", values, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameBetween(String value1, String value2) {
            addCriterion("academic_conference_name between", value1, value2, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andAcademicConferenceNameNotBetween(String value1, String value2) {
            addCriterion("academic_conference_name not between", value1, value2, "academicConferenceName");
            return (Criteria) this;
        }

        public Criteria andOrganizerIsNull() {
            addCriterion("organizer is null");
            return (Criteria) this;
        }

        public Criteria andOrganizerIsNotNull() {
            addCriterion("organizer is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizerEqualTo(String value) {
            addCriterion("organizer =", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotEqualTo(String value) {
            addCriterion("organizer <>", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerGreaterThan(String value) {
            addCriterion("organizer >", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerGreaterThanOrEqualTo(String value) {
            addCriterion("organizer >=", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLessThan(String value) {
            addCriterion("organizer <", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLessThanOrEqualTo(String value) {
            addCriterion("organizer <=", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLike(String value) {
            addCriterion("organizer like", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotLike(String value) {
            addCriterion("organizer not like", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerIn(List<String> values) {
            addCriterion("organizer in", values, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotIn(List<String> values) {
            addCriterion("organizer not in", values, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerBetween(String value1, String value2) {
            addCriterion("organizer between", value1, value2, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotBetween(String value1, String value2) {
            addCriterion("organizer not between", value1, value2, "organizer");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionIsNull() {
            addCriterion("conference_held_country_or_region is null");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionIsNotNull() {
            addCriterion("conference_held_country_or_region is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionEqualTo(String value) {
            addCriterion("conference_held_country_or_region =", value, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionNotEqualTo(String value) {
            addCriterion("conference_held_country_or_region <>", value, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionGreaterThan(String value) {
            addCriterion("conference_held_country_or_region >", value, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionGreaterThanOrEqualTo(String value) {
            addCriterion("conference_held_country_or_region >=", value, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionLessThan(String value) {
            addCriterion("conference_held_country_or_region <", value, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionLessThanOrEqualTo(String value) {
            addCriterion("conference_held_country_or_region <=", value, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionLike(String value) {
            addCriterion("conference_held_country_or_region like", value, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionNotLike(String value) {
            addCriterion("conference_held_country_or_region not like", value, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionIn(List<String> values) {
            addCriterion("conference_held_country_or_region in", values, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionNotIn(List<String> values) {
            addCriterion("conference_held_country_or_region not in", values, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionBetween(String value1, String value2) {
            addCriterion("conference_held_country_or_region between", value1, value2, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceHeldCountryOrRegionNotBetween(String value1, String value2) {
            addCriterion("conference_held_country_or_region not between", value1, value2, "conferenceHeldCountryOrRegion");
            return (Criteria) this;
        }

        public Criteria andConferenceCityIsNull() {
            addCriterion("conference_city is null");
            return (Criteria) this;
        }

        public Criteria andConferenceCityIsNotNull() {
            addCriterion("conference_city is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceCityEqualTo(String value) {
            addCriterion("conference_city =", value, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andConferenceCityNotEqualTo(String value) {
            addCriterion("conference_city <>", value, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andConferenceCityGreaterThan(String value) {
            addCriterion("conference_city >", value, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andConferenceCityGreaterThanOrEqualTo(String value) {
            addCriterion("conference_city >=", value, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andConferenceCityLessThan(String value) {
            addCriterion("conference_city <", value, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andConferenceCityLessThanOrEqualTo(String value) {
            addCriterion("conference_city <=", value, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andConferenceCityLike(String value) {
            addCriterion("conference_city like", value, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andConferenceCityNotLike(String value) {
            addCriterion("conference_city not like", value, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andConferenceCityIn(List<String> values) {
            addCriterion("conference_city in", values, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andConferenceCityNotIn(List<String> values) {
            addCriterion("conference_city not in", values, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andConferenceCityBetween(String value1, String value2) {
            addCriterion("conference_city between", value1, value2, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andConferenceCityNotBetween(String value1, String value2) {
            addCriterion("conference_city not between", value1, value2, "conferenceCity");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingIsNull() {
            addCriterion("opening_date_of_meeting is null");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingIsNotNull() {
            addCriterion("opening_date_of_meeting is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingEqualTo(String value) {
            addCriterion("opening_date_of_meeting =", value, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingNotEqualTo(String value) {
            addCriterion("opening_date_of_meeting <>", value, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingGreaterThan(String value) {
            addCriterion("opening_date_of_meeting >", value, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingGreaterThanOrEqualTo(String value) {
            addCriterion("opening_date_of_meeting >=", value, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingLessThan(String value) {
            addCriterion("opening_date_of_meeting <", value, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingLessThanOrEqualTo(String value) {
            addCriterion("opening_date_of_meeting <=", value, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingLike(String value) {
            addCriterion("opening_date_of_meeting like", value, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingNotLike(String value) {
            addCriterion("opening_date_of_meeting not like", value, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingIn(List<String> values) {
            addCriterion("opening_date_of_meeting in", values, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingNotIn(List<String> values) {
            addCriterion("opening_date_of_meeting not in", values, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingBetween(String value1, String value2) {
            addCriterion("opening_date_of_meeting between", value1, value2, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andOpeningDateOfMeetingNotBetween(String value1, String value2) {
            addCriterion("opening_date_of_meeting not between", value1, value2, "openingDateOfMeeting");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceIsNull() {
            addCriterion("whether_chairman_of_conference is null");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceIsNotNull() {
            addCriterion("whether_chairman_of_conference is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceEqualTo(String value) {
            addCriterion("whether_chairman_of_conference =", value, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceNotEqualTo(String value) {
            addCriterion("whether_chairman_of_conference <>", value, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceGreaterThan(String value) {
            addCriterion("whether_chairman_of_conference >", value, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceGreaterThanOrEqualTo(String value) {
            addCriterion("whether_chairman_of_conference >=", value, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceLessThan(String value) {
            addCriterion("whether_chairman_of_conference <", value, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceLessThanOrEqualTo(String value) {
            addCriterion("whether_chairman_of_conference <=", value, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceLike(String value) {
            addCriterion("whether_chairman_of_conference like", value, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceNotLike(String value) {
            addCriterion("whether_chairman_of_conference not like", value, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceIn(List<String> values) {
            addCriterion("whether_chairman_of_conference in", values, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceNotIn(List<String> values) {
            addCriterion("whether_chairman_of_conference not in", values, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceBetween(String value1, String value2) {
            addCriterion("whether_chairman_of_conference between", value1, value2, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andWhetherChairmanOfConferenceNotBetween(String value1, String value2) {
            addCriterion("whether_chairman_of_conference not between", value1, value2, "whetherChairmanOfConference");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNull() {
            addCriterion("report_type is null");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNotNull() {
            addCriterion("report_type is not null");
            return (Criteria) this;
        }

        public Criteria andReportTypeEqualTo(String value) {
            addCriterion("report_type =", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotEqualTo(String value) {
            addCriterion("report_type <>", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThan(String value) {
            addCriterion("report_type >", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("report_type >=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThan(String value) {
            addCriterion("report_type <", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThanOrEqualTo(String value) {
            addCriterion("report_type <=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLike(String value) {
            addCriterion("report_type like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotLike(String value) {
            addCriterion("report_type not like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIn(List<String> values) {
            addCriterion("report_type in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotIn(List<String> values) {
            addCriterion("report_type not in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeBetween(String value1, String value2) {
            addCriterion("report_type between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotBetween(String value1, String value2) {
            addCriterion("report_type not between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNull() {
            addCriterion("report_name is null");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNotNull() {
            addCriterion("report_name is not null");
            return (Criteria) this;
        }

        public Criteria andReportNameEqualTo(String value) {
            addCriterion("report_name =", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotEqualTo(String value) {
            addCriterion("report_name <>", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThan(String value) {
            addCriterion("report_name >", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThanOrEqualTo(String value) {
            addCriterion("report_name >=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThan(String value) {
            addCriterion("report_name <", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThanOrEqualTo(String value) {
            addCriterion("report_name <=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLike(String value) {
            addCriterion("report_name like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotLike(String value) {
            addCriterion("report_name not like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameIn(List<String> values) {
            addCriterion("report_name in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotIn(List<String> values) {
            addCriterion("report_name not in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameBetween(String value1, String value2) {
            addCriterion("report_name between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotBetween(String value1, String value2) {
            addCriterion("report_name not between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNull() {
            addCriterion("report_date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("report_date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(String value) {
            addCriterion("report_date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(String value) {
            addCriterion("report_date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(String value) {
            addCriterion("report_date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(String value) {
            addCriterion("report_date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(String value) {
            addCriterion("report_date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(String value) {
            addCriterion("report_date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLike(String value) {
            addCriterion("report_date like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotLike(String value) {
            addCriterion("report_date not like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<String> values) {
            addCriterion("report_date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<String> values) {
            addCriterion("report_date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(String value1, String value2) {
            addCriterion("report_date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(String value1, String value2) {
            addCriterion("report_date not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReporterIsNull() {
            addCriterion("reporter is null");
            return (Criteria) this;
        }

        public Criteria andReporterIsNotNull() {
            addCriterion("reporter is not null");
            return (Criteria) this;
        }

        public Criteria andReporterEqualTo(String value) {
            addCriterion("reporter =", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotEqualTo(String value) {
            addCriterion("reporter <>", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThan(String value) {
            addCriterion("reporter >", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThanOrEqualTo(String value) {
            addCriterion("reporter >=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThan(String value) {
            addCriterion("reporter <", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThanOrEqualTo(String value) {
            addCriterion("reporter <=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLike(String value) {
            addCriterion("reporter like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotLike(String value) {
            addCriterion("reporter not like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterIn(List<String> values) {
            addCriterion("reporter in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotIn(List<String> values) {
            addCriterion("reporter not in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterBetween(String value1, String value2) {
            addCriterion("reporter between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotBetween(String value1, String value2) {
            addCriterion("reporter not between", value1, value2, "reporter");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("is_delete like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("is_delete not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    /**
     * participation_international_academic_conferences_2_2_5
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * participation_international_academic_conferences_2_2_5 2020-12-21
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