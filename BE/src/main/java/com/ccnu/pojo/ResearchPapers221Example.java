package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResearchPapers221Example {
    /**
     * research_papers_2_2_1
     */
    protected String orderByClause;

    /**
     * research_papers_2_2_1
     */
    protected boolean distinct;

    /**
     * research_papers_2_2_1
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public ResearchPapers221Example() {
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
     * research_papers_2_2_1 2020-12-21
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

        public Criteria andPaperNameIsNull() {
            addCriterion("paper_name is null");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNotNull() {
            addCriterion("paper_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNameEqualTo(String value) {
            addCriterion("paper_name =", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotEqualTo(String value) {
            addCriterion("paper_name <>", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThan(String value) {
            addCriterion("paper_name >", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("paper_name >=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThan(String value) {
            addCriterion("paper_name <", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThanOrEqualTo(String value) {
            addCriterion("paper_name <=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLike(String value) {
            addCriterion("paper_name like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotLike(String value) {
            addCriterion("paper_name not like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameIn(List<String> values) {
            addCriterion("paper_name in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotIn(List<String> values) {
            addCriterion("paper_name not in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameBetween(String value1, String value2) {
            addCriterion("paper_name between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotBetween(String value1, String value2) {
            addCriterion("paper_name not between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIsNull() {
            addCriterion("paper_type is null");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIsNotNull() {
            addCriterion("paper_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaperTypeEqualTo(String value) {
            addCriterion("paper_type =", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotEqualTo(String value) {
            addCriterion("paper_type <>", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeGreaterThan(String value) {
            addCriterion("paper_type >", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("paper_type >=", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLessThan(String value) {
            addCriterion("paper_type <", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLessThanOrEqualTo(String value) {
            addCriterion("paper_type <=", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLike(String value) {
            addCriterion("paper_type like", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotLike(String value) {
            addCriterion("paper_type not like", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIn(List<String> values) {
            addCriterion("paper_type in", values, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotIn(List<String> values) {
            addCriterion("paper_type not in", values, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeBetween(String value1, String value2) {
            addCriterion("paper_type between", value1, value2, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotBetween(String value1, String value2) {
            addCriterion("paper_type not between", value1, value2, "paperType");
            return (Criteria) this;
        }

        public Criteria andJournalNameIsNull() {
            addCriterion("journal_name is null");
            return (Criteria) this;
        }

        public Criteria andJournalNameIsNotNull() {
            addCriterion("journal_name is not null");
            return (Criteria) this;
        }

        public Criteria andJournalNameEqualTo(String value) {
            addCriterion("journal_name =", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameNotEqualTo(String value) {
            addCriterion("journal_name <>", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameGreaterThan(String value) {
            addCriterion("journal_name >", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameGreaterThanOrEqualTo(String value) {
            addCriterion("journal_name >=", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameLessThan(String value) {
            addCriterion("journal_name <", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameLessThanOrEqualTo(String value) {
            addCriterion("journal_name <=", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameLike(String value) {
            addCriterion("journal_name like", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameNotLike(String value) {
            addCriterion("journal_name not like", value, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameIn(List<String> values) {
            addCriterion("journal_name in", values, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameNotIn(List<String> values) {
            addCriterion("journal_name not in", values, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameBetween(String value1, String value2) {
            addCriterion("journal_name between", value1, value2, "journalName");
            return (Criteria) this;
        }

        public Criteria andJournalNameNotBetween(String value1, String value2) {
            addCriterion("journal_name not between", value1, value2, "journalName");
            return (Criteria) this;
        }

        public Criteria andIssueNumberIsNull() {
            addCriterion("issue_number is null");
            return (Criteria) this;
        }

        public Criteria andIssueNumberIsNotNull() {
            addCriterion("issue_number is not null");
            return (Criteria) this;
        }

        public Criteria andIssueNumberEqualTo(String value) {
            addCriterion("issue_number =", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberNotEqualTo(String value) {
            addCriterion("issue_number <>", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberGreaterThan(String value) {
            addCriterion("issue_number >", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberGreaterThanOrEqualTo(String value) {
            addCriterion("issue_number >=", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberLessThan(String value) {
            addCriterion("issue_number <", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberLessThanOrEqualTo(String value) {
            addCriterion("issue_number <=", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberLike(String value) {
            addCriterion("issue_number like", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberNotLike(String value) {
            addCriterion("issue_number not like", value, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberIn(List<String> values) {
            addCriterion("issue_number in", values, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberNotIn(List<String> values) {
            addCriterion("issue_number not in", values, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberBetween(String value1, String value2) {
            addCriterion("issue_number between", value1, value2, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andIssueNumberNotBetween(String value1, String value2) {
            addCriterion("issue_number not between", value1, value2, "issueNumber");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageIsNull() {
            addCriterion("publishing_language is null");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageIsNotNull() {
            addCriterion("publishing_language is not null");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageEqualTo(String value) {
            addCriterion("publishing_language =", value, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageNotEqualTo(String value) {
            addCriterion("publishing_language <>", value, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageGreaterThan(String value) {
            addCriterion("publishing_language >", value, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("publishing_language >=", value, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageLessThan(String value) {
            addCriterion("publishing_language <", value, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageLessThanOrEqualTo(String value) {
            addCriterion("publishing_language <=", value, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageLike(String value) {
            addCriterion("publishing_language like", value, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageNotLike(String value) {
            addCriterion("publishing_language not like", value, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageIn(List<String> values) {
            addCriterion("publishing_language in", values, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageNotIn(List<String> values) {
            addCriterion("publishing_language not in", values, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageBetween(String value1, String value2) {
            addCriterion("publishing_language between", value1, value2, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andPublishingLanguageNotBetween(String value1, String value2) {
            addCriterion("publishing_language not between", value1, value2, "publishingLanguage");
            return (Criteria) this;
        }

        public Criteria andDoiIsNull() {
            addCriterion("DOI is null");
            return (Criteria) this;
        }

        public Criteria andDoiIsNotNull() {
            addCriterion("DOI is not null");
            return (Criteria) this;
        }

        public Criteria andDoiEqualTo(String value) {
            addCriterion("DOI =", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotEqualTo(String value) {
            addCriterion("DOI <>", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiGreaterThan(String value) {
            addCriterion("DOI >", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiGreaterThanOrEqualTo(String value) {
            addCriterion("DOI >=", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLessThan(String value) {
            addCriterion("DOI <", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLessThanOrEqualTo(String value) {
            addCriterion("DOI <=", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLike(String value) {
            addCriterion("DOI like", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotLike(String value) {
            addCriterion("DOI not like", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiIn(List<String> values) {
            addCriterion("DOI in", values, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotIn(List<String> values) {
            addCriterion("DOI not in", values, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiBetween(String value1, String value2) {
            addCriterion("DOI between", value1, value2, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotBetween(String value1, String value2) {
            addCriterion("DOI not between", value1, value2, "doi");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedIsNull() {
            addCriterion("whether_esi_is_included is null");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedIsNotNull() {
            addCriterion("whether_esi_is_included is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedEqualTo(String value) {
            addCriterion("whether_esi_is_included =", value, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedNotEqualTo(String value) {
            addCriterion("whether_esi_is_included <>", value, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedGreaterThan(String value) {
            addCriterion("whether_esi_is_included >", value, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedGreaterThanOrEqualTo(String value) {
            addCriterion("whether_esi_is_included >=", value, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedLessThan(String value) {
            addCriterion("whether_esi_is_included <", value, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedLessThanOrEqualTo(String value) {
            addCriterion("whether_esi_is_included <=", value, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedLike(String value) {
            addCriterion("whether_esi_is_included like", value, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedNotLike(String value) {
            addCriterion("whether_esi_is_included not like", value, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedIn(List<String> values) {
            addCriterion("whether_esi_is_included in", values, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedNotIn(List<String> values) {
            addCriterion("whether_esi_is_included not in", values, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedBetween(String value1, String value2) {
            addCriterion("whether_esi_is_included between", value1, value2, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andWhetherEsiIsIncludedNotBetween(String value1, String value2) {
            addCriterion("whether_esi_is_included not between", value1, value2, "whetherEsiIsIncluded");
            return (Criteria) this;
        }

        public Criteria andIndexIsNull() {
            addCriterion("`index` is null");
            return (Criteria) this;
        }

        public Criteria andIndexIsNotNull() {
            addCriterion("`index` is not null");
            return (Criteria) this;
        }

        public Criteria andIndexEqualTo(String value) {
            addCriterion("`index` =", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotEqualTo(String value) {
            addCriterion("`index` <>", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThan(String value) {
            addCriterion("`index` >", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThanOrEqualTo(String value) {
            addCriterion("`index` >=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThan(String value) {
            addCriterion("`index` <", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThanOrEqualTo(String value) {
            addCriterion("`index` <=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLike(String value) {
            addCriterion("`index` like", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotLike(String value) {
            addCriterion("`index` not like", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexIn(List<String> values) {
            addCriterion("`index` in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotIn(List<String> values) {
            addCriterion("`index` not in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexBetween(String value1, String value2) {
            addCriterion("`index` between", value1, value2, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotBetween(String value1, String value2) {
            addCriterion("`index` not between", value1, value2, "index");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderIsNull() {
            addCriterion("author_order is null");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderIsNotNull() {
            addCriterion("author_order is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderEqualTo(String value) {
            addCriterion("author_order =", value, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderNotEqualTo(String value) {
            addCriterion("author_order <>", value, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderGreaterThan(String value) {
            addCriterion("author_order >", value, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderGreaterThanOrEqualTo(String value) {
            addCriterion("author_order >=", value, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderLessThan(String value) {
            addCriterion("author_order <", value, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderLessThanOrEqualTo(String value) {
            addCriterion("author_order <=", value, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderLike(String value) {
            addCriterion("author_order like", value, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderNotLike(String value) {
            addCriterion("author_order not like", value, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderIn(List<String> values) {
            addCriterion("author_order in", values, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderNotIn(List<String> values) {
            addCriterion("author_order not in", values, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderBetween(String value1, String value2) {
            addCriterion("author_order between", value1, value2, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andAuthorOrderNotBetween(String value1, String value2) {
            addCriterion("author_order not between", value1, value2, "authorOrder");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorIsNull() {
            addCriterion("whether_corresponding_author is null");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorIsNotNull() {
            addCriterion("whether_corresponding_author is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorEqualTo(String value) {
            addCriterion("whether_corresponding_author =", value, "whetherCorrespondingAuthor");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorNotEqualTo(String value) {
            addCriterion("whether_corresponding_author <>", value, "whetherCorrespondingAuthor");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorGreaterThan(String value) {
            addCriterion("whether_corresponding_author >", value, "whetherCorrespondingAuthor");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("whether_corresponding_author >=", value, "whetherCorrespondingAuthor");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorLessThan(String value) {
            addCriterion("whether_corresponding_author <", value, "whetherCorrespondingAuthor");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorLessThanOrEqualTo(String value) {
            addCriterion("whether_corresponding_author <=", value, "whetherCorrespondingAuthor");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorLike(String value) {
            addCriterion("whether_corresponding_author like", value, "whetherCorrespondingAuthor");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorNotLike(String value) {
            addCriterion("whether_corresponding_author not like", value, "whetherCorrespondingAuthor");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorIn(List<String> values) {
            addCriterion("whether_corresponding_author in", values, "whetherCorrespondingAuthor");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorNotIn(List<String> values) {
            addCriterion("whether_corresponding_author not in", values, "whetherCorrespondingAuthor");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorBetween(String value1, String value2) {
            addCriterion("whether_corresponding_author between", value1, value2, "whetherCorrespondingAuthor");
            return (Criteria) this;
        }

        public Criteria andWhetherCorrespondingAuthorNotBetween(String value1, String value2) {
            addCriterion("whether_corresponding_author not between", value1, value2, "whetherCorrespondingAuthor");
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
     * research_papers_2_2_1
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * research_papers_2_2_1 2020-12-21
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