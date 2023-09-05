package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class PublicationStatus223Example {
    /**
     * publication_status_2_2_3
     */
    protected String orderByClause;

    /**
     * publication_status_2_2_3
     */
    protected boolean distinct;

    /**
     * publication_status_2_2_3
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public PublicationStatus223Example() {
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
     * publication_status_2_2_3 2020-12-21
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

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookTypeIsNull() {
            addCriterion("book_type is null");
            return (Criteria) this;
        }

        public Criteria andBookTypeIsNotNull() {
            addCriterion("book_type is not null");
            return (Criteria) this;
        }

        public Criteria andBookTypeEqualTo(String value) {
            addCriterion("book_type =", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotEqualTo(String value) {
            addCriterion("book_type <>", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeGreaterThan(String value) {
            addCriterion("book_type >", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeGreaterThanOrEqualTo(String value) {
            addCriterion("book_type >=", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLessThan(String value) {
            addCriterion("book_type <", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLessThanOrEqualTo(String value) {
            addCriterion("book_type <=", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLike(String value) {
            addCriterion("book_type like", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotLike(String value) {
            addCriterion("book_type not like", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeIn(List<String> values) {
            addCriterion("book_type in", values, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotIn(List<String> values) {
            addCriterion("book_type not in", values, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeBetween(String value1, String value2) {
            addCriterion("book_type between", value1, value2, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotBetween(String value1, String value2) {
            addCriterion("book_type not between", value1, value2, "bookType");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseIsNull() {
            addCriterion("publishing_house is null");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseIsNotNull() {
            addCriterion("publishing_house is not null");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseEqualTo(String value) {
            addCriterion("publishing_house =", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotEqualTo(String value) {
            addCriterion("publishing_house <>", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseGreaterThan(String value) {
            addCriterion("publishing_house >", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseGreaterThanOrEqualTo(String value) {
            addCriterion("publishing_house >=", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseLessThan(String value) {
            addCriterion("publishing_house <", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseLessThanOrEqualTo(String value) {
            addCriterion("publishing_house <=", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseLike(String value) {
            addCriterion("publishing_house like", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotLike(String value) {
            addCriterion("publishing_house not like", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseIn(List<String> values) {
            addCriterion("publishing_house in", values, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotIn(List<String> values) {
            addCriterion("publishing_house not in", values, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseBetween(String value1, String value2) {
            addCriterion("publishing_house between", value1, value2, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotBetween(String value1, String value2) {
            addCriterion("publishing_house not between", value1, value2, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryIsNull() {
            addCriterion("publisher_country is null");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryIsNotNull() {
            addCriterion("publisher_country is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryEqualTo(String value) {
            addCriterion("publisher_country =", value, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryNotEqualTo(String value) {
            addCriterion("publisher_country <>", value, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryGreaterThan(String value) {
            addCriterion("publisher_country >", value, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_country >=", value, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryLessThan(String value) {
            addCriterion("publisher_country <", value, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryLessThanOrEqualTo(String value) {
            addCriterion("publisher_country <=", value, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryLike(String value) {
            addCriterion("publisher_country like", value, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryNotLike(String value) {
            addCriterion("publisher_country not like", value, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryIn(List<String> values) {
            addCriterion("publisher_country in", values, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryNotIn(List<String> values) {
            addCriterion("publisher_country not in", values, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryBetween(String value1, String value2) {
            addCriterion("publisher_country between", value1, value2, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andPublisherCountryNotBetween(String value1, String value2) {
            addCriterion("publisher_country not between", value1, value2, "publisherCountry");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsIsNull() {
            addCriterion("total_number_of_words is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsIsNotNull() {
            addCriterion("total_number_of_words is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsEqualTo(String value) {
            addCriterion("total_number_of_words =", value, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsNotEqualTo(String value) {
            addCriterion("total_number_of_words <>", value, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsGreaterThan(String value) {
            addCriterion("total_number_of_words >", value, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsGreaterThanOrEqualTo(String value) {
            addCriterion("total_number_of_words >=", value, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsLessThan(String value) {
            addCriterion("total_number_of_words <", value, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsLessThanOrEqualTo(String value) {
            addCriterion("total_number_of_words <=", value, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsLike(String value) {
            addCriterion("total_number_of_words like", value, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsNotLike(String value) {
            addCriterion("total_number_of_words not like", value, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsIn(List<String> values) {
            addCriterion("total_number_of_words in", values, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsNotIn(List<String> values) {
            addCriterion("total_number_of_words not in", values, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsBetween(String value1, String value2) {
            addCriterion("total_number_of_words between", value1, value2, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andTotalNumberOfWordsNotBetween(String value1, String value2) {
            addCriterion("total_number_of_words not between", value1, value2, "totalNumberOfWords");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesIsNull() {
            addCriterion("number_of_issues is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesIsNotNull() {
            addCriterion("number_of_issues is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesEqualTo(String value) {
            addCriterion("number_of_issues =", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesNotEqualTo(String value) {
            addCriterion("number_of_issues <>", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesGreaterThan(String value) {
            addCriterion("number_of_issues >", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesGreaterThanOrEqualTo(String value) {
            addCriterion("number_of_issues >=", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesLessThan(String value) {
            addCriterion("number_of_issues <", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesLessThanOrEqualTo(String value) {
            addCriterion("number_of_issues <=", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesLike(String value) {
            addCriterion("number_of_issues like", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesNotLike(String value) {
            addCriterion("number_of_issues not like", value, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesIn(List<String> values) {
            addCriterion("number_of_issues in", values, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesNotIn(List<String> values) {
            addCriterion("number_of_issues not in", values, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesBetween(String value1, String value2) {
            addCriterion("number_of_issues between", value1, value2, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andNumberOfIssuesNotBetween(String value1, String value2) {
            addCriterion("number_of_issues not between", value1, value2, "numberOfIssues");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIsNull() {
            addCriterion("publication_date is null");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIsNotNull() {
            addCriterion("publication_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationDateEqualTo(String value) {
            addCriterion("publication_date =", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotEqualTo(String value) {
            addCriterion("publication_date <>", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateGreaterThan(String value) {
            addCriterion("publication_date >", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateGreaterThanOrEqualTo(String value) {
            addCriterion("publication_date >=", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLessThan(String value) {
            addCriterion("publication_date <", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLessThanOrEqualTo(String value) {
            addCriterion("publication_date <=", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLike(String value) {
            addCriterion("publication_date like", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotLike(String value) {
            addCriterion("publication_date not like", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIn(List<String> values) {
            addCriterion("publication_date in", values, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotIn(List<String> values) {
            addCriterion("publication_date not in", values, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateBetween(String value1, String value2) {
            addCriterion("publication_date between", value1, value2, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotBetween(String value1, String value2) {
            addCriterion("publication_date not between", value1, value2, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andBookNumberIsNull() {
            addCriterion("book_number is null");
            return (Criteria) this;
        }

        public Criteria andBookNumberIsNotNull() {
            addCriterion("book_number is not null");
            return (Criteria) this;
        }

        public Criteria andBookNumberEqualTo(String value) {
            addCriterion("book_number =", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotEqualTo(String value) {
            addCriterion("book_number <>", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberGreaterThan(String value) {
            addCriterion("book_number >", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberGreaterThanOrEqualTo(String value) {
            addCriterion("book_number >=", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberLessThan(String value) {
            addCriterion("book_number <", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberLessThanOrEqualTo(String value) {
            addCriterion("book_number <=", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberLike(String value) {
            addCriterion("book_number like", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotLike(String value) {
            addCriterion("book_number not like", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberIn(List<String> values) {
            addCriterion("book_number in", values, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotIn(List<String> values) {
            addCriterion("book_number not in", values, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberBetween(String value1, String value2) {
            addCriterion("book_number between", value1, value2, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotBetween(String value1, String value2) {
            addCriterion("book_number not between", value1, value2, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("`language` is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("`language` is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("`language` =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("`language` <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("`language` >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("`language` >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("`language` <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("`language` <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("`language` like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("`language` not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("`language` in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("`language` not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("`language` between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("`language` not between", value1, value2, "language");
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
     * publication_status_2_2_3
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * publication_status_2_2_3 2020-12-21
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