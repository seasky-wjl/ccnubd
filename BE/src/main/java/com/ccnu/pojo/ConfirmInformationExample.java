package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ConfirmInformationExample {
    /**
     * confirm_information
     */
    protected String orderByClause;

    /**
     * confirm_information
     */
    protected boolean distinct;

    /**
     * confirm_information
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public ConfirmInformationExample() {
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
     * confirm_information 2020-12-21
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

        public Criteria andTableConfirm111IsNull() {
            addCriterion("`table_ confirm111` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111IsNotNull() {
            addCriterion("`table_ confirm111` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111EqualTo(String value) {
            addCriterion("`table_ confirm111` =", value, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111NotEqualTo(String value) {
            addCriterion("`table_ confirm111` <>", value, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111GreaterThan(String value) {
            addCriterion("`table_ confirm111` >", value, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm111` >=", value, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111LessThan(String value) {
            addCriterion("`table_ confirm111` <", value, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm111` <=", value, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111Like(String value) {
            addCriterion("`table_ confirm111` like", value, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111NotLike(String value) {
            addCriterion("`table_ confirm111` not like", value, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111In(List<String> values) {
            addCriterion("`table_ confirm111` in", values, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111NotIn(List<String> values) {
            addCriterion("`table_ confirm111` not in", values, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111Between(String value1, String value2) {
            addCriterion("`table_ confirm111` between", value1, value2, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm111` not between", value1, value2, "tableConfirm111");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1IsNull() {
            addCriterion("`table_ confirm111xu1` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1IsNotNull() {
            addCriterion("`table_ confirm111xu1` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1EqualTo(String value) {
            addCriterion("`table_ confirm111xu1` =", value, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1NotEqualTo(String value) {
            addCriterion("`table_ confirm111xu1` <>", value, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1GreaterThan(String value) {
            addCriterion("`table_ confirm111xu1` >", value, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm111xu1` >=", value, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1LessThan(String value) {
            addCriterion("`table_ confirm111xu1` <", value, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm111xu1` <=", value, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1Like(String value) {
            addCriterion("`table_ confirm111xu1` like", value, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1NotLike(String value) {
            addCriterion("`table_ confirm111xu1` not like", value, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1In(List<String> values) {
            addCriterion("`table_ confirm111xu1` in", values, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1NotIn(List<String> values) {
            addCriterion("`table_ confirm111xu1` not in", values, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1Between(String value1, String value2) {
            addCriterion("`table_ confirm111xu1` between", value1, value2, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu1NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm111xu1` not between", value1, value2, "tableConfirm111xu1");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2IsNull() {
            addCriterion("`table_ confirm111xu2` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2IsNotNull() {
            addCriterion("`table_ confirm111xu2` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2EqualTo(String value) {
            addCriterion("`table_ confirm111xu2` =", value, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2NotEqualTo(String value) {
            addCriterion("`table_ confirm111xu2` <>", value, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2GreaterThan(String value) {
            addCriterion("`table_ confirm111xu2` >", value, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm111xu2` >=", value, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2LessThan(String value) {
            addCriterion("`table_ confirm111xu2` <", value, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm111xu2` <=", value, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2Like(String value) {
            addCriterion("`table_ confirm111xu2` like", value, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2NotLike(String value) {
            addCriterion("`table_ confirm111xu2` not like", value, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2In(List<String> values) {
            addCriterion("`table_ confirm111xu2` in", values, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2NotIn(List<String> values) {
            addCriterion("`table_ confirm111xu2` not in", values, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2Between(String value1, String value2) {
            addCriterion("`table_ confirm111xu2` between", value1, value2, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm111xu2NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm111xu2` not between", value1, value2, "tableConfirm111xu2");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112IsNull() {
            addCriterion("`table_ confirm112` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112IsNotNull() {
            addCriterion("`table_ confirm112` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112EqualTo(String value) {
            addCriterion("`table_ confirm112` =", value, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112NotEqualTo(String value) {
            addCriterion("`table_ confirm112` <>", value, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112GreaterThan(String value) {
            addCriterion("`table_ confirm112` >", value, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm112` >=", value, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112LessThan(String value) {
            addCriterion("`table_ confirm112` <", value, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm112` <=", value, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112Like(String value) {
            addCriterion("`table_ confirm112` like", value, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112NotLike(String value) {
            addCriterion("`table_ confirm112` not like", value, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112In(List<String> values) {
            addCriterion("`table_ confirm112` in", values, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112NotIn(List<String> values) {
            addCriterion("`table_ confirm112` not in", values, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112Between(String value1, String value2) {
            addCriterion("`table_ confirm112` between", value1, value2, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm112NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm112` not between", value1, value2, "tableConfirm112");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121IsNull() {
            addCriterion("`table_ confirm121` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121IsNotNull() {
            addCriterion("`table_ confirm121` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121EqualTo(String value) {
            addCriterion("`table_ confirm121` =", value, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121NotEqualTo(String value) {
            addCriterion("`table_ confirm121` <>", value, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121GreaterThan(String value) {
            addCriterion("`table_ confirm121` >", value, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm121` >=", value, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121LessThan(String value) {
            addCriterion("`table_ confirm121` <", value, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm121` <=", value, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121Like(String value) {
            addCriterion("`table_ confirm121` like", value, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121NotLike(String value) {
            addCriterion("`table_ confirm121` not like", value, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121In(List<String> values) {
            addCriterion("`table_ confirm121` in", values, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121NotIn(List<String> values) {
            addCriterion("`table_ confirm121` not in", values, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121Between(String value1, String value2) {
            addCriterion("`table_ confirm121` between", value1, value2, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm121NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm121` not between", value1, value2, "tableConfirm121");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211IsNull() {
            addCriterion("`table_ confirm211` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211IsNotNull() {
            addCriterion("`table_ confirm211` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211EqualTo(String value) {
            addCriterion("`table_ confirm211` =", value, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211NotEqualTo(String value) {
            addCriterion("`table_ confirm211` <>", value, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211GreaterThan(String value) {
            addCriterion("`table_ confirm211` >", value, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm211` >=", value, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211LessThan(String value) {
            addCriterion("`table_ confirm211` <", value, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm211` <=", value, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211Like(String value) {
            addCriterion("`table_ confirm211` like", value, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211NotLike(String value) {
            addCriterion("`table_ confirm211` not like", value, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211In(List<String> values) {
            addCriterion("`table_ confirm211` in", values, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211NotIn(List<String> values) {
            addCriterion("`table_ confirm211` not in", values, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211Between(String value1, String value2) {
            addCriterion("`table_ confirm211` between", value1, value2, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm211NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm211` not between", value1, value2, "tableConfirm211");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212IsNull() {
            addCriterion("`table_ confirm212` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212IsNotNull() {
            addCriterion("`table_ confirm212` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212EqualTo(String value) {
            addCriterion("`table_ confirm212` =", value, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212NotEqualTo(String value) {
            addCriterion("`table_ confirm212` <>", value, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212GreaterThan(String value) {
            addCriterion("`table_ confirm212` >", value, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm212` >=", value, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212LessThan(String value) {
            addCriterion("`table_ confirm212` <", value, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm212` <=", value, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212Like(String value) {
            addCriterion("`table_ confirm212` like", value, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212NotLike(String value) {
            addCriterion("`table_ confirm212` not like", value, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212In(List<String> values) {
            addCriterion("`table_ confirm212` in", values, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212NotIn(List<String> values) {
            addCriterion("`table_ confirm212` not in", values, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212Between(String value1, String value2) {
            addCriterion("`table_ confirm212` between", value1, value2, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm212NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm212` not between", value1, value2, "tableConfirm212");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213IsNull() {
            addCriterion("`table_ confirm213` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213IsNotNull() {
            addCriterion("`table_ confirm213` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213EqualTo(String value) {
            addCriterion("`table_ confirm213` =", value, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213NotEqualTo(String value) {
            addCriterion("`table_ confirm213` <>", value, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213GreaterThan(String value) {
            addCriterion("`table_ confirm213` >", value, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm213` >=", value, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213LessThan(String value) {
            addCriterion("`table_ confirm213` <", value, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm213` <=", value, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213Like(String value) {
            addCriterion("`table_ confirm213` like", value, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213NotLike(String value) {
            addCriterion("`table_ confirm213` not like", value, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213In(List<String> values) {
            addCriterion("`table_ confirm213` in", values, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213NotIn(List<String> values) {
            addCriterion("`table_ confirm213` not in", values, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213Between(String value1, String value2) {
            addCriterion("`table_ confirm213` between", value1, value2, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm213NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm213` not between", value1, value2, "tableConfirm213");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214IsNull() {
            addCriterion("`table_ confirm214` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214IsNotNull() {
            addCriterion("`table_ confirm214` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214EqualTo(String value) {
            addCriterion("`table_ confirm214` =", value, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214NotEqualTo(String value) {
            addCriterion("`table_ confirm214` <>", value, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214GreaterThan(String value) {
            addCriterion("`table_ confirm214` >", value, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm214` >=", value, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214LessThan(String value) {
            addCriterion("`table_ confirm214` <", value, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm214` <=", value, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214Like(String value) {
            addCriterion("`table_ confirm214` like", value, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214NotLike(String value) {
            addCriterion("`table_ confirm214` not like", value, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214In(List<String> values) {
            addCriterion("`table_ confirm214` in", values, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214NotIn(List<String> values) {
            addCriterion("`table_ confirm214` not in", values, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214Between(String value1, String value2) {
            addCriterion("`table_ confirm214` between", value1, value2, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm214NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm214` not between", value1, value2, "tableConfirm214");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215IsNull() {
            addCriterion("`table_ confirm215` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215IsNotNull() {
            addCriterion("`table_ confirm215` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215EqualTo(String value) {
            addCriterion("`table_ confirm215` =", value, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215NotEqualTo(String value) {
            addCriterion("`table_ confirm215` <>", value, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215GreaterThan(String value) {
            addCriterion("`table_ confirm215` >", value, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm215` >=", value, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215LessThan(String value) {
            addCriterion("`table_ confirm215` <", value, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm215` <=", value, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215Like(String value) {
            addCriterion("`table_ confirm215` like", value, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215NotLike(String value) {
            addCriterion("`table_ confirm215` not like", value, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215In(List<String> values) {
            addCriterion("`table_ confirm215` in", values, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215NotIn(List<String> values) {
            addCriterion("`table_ confirm215` not in", values, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215Between(String value1, String value2) {
            addCriterion("`table_ confirm215` between", value1, value2, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm215NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm215` not between", value1, value2, "tableConfirm215");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221IsNull() {
            addCriterion("`table_ confirm221` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221IsNotNull() {
            addCriterion("`table_ confirm221` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221EqualTo(String value) {
            addCriterion("`table_ confirm221` =", value, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221NotEqualTo(String value) {
            addCriterion("`table_ confirm221` <>", value, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221GreaterThan(String value) {
            addCriterion("`table_ confirm221` >", value, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm221` >=", value, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221LessThan(String value) {
            addCriterion("`table_ confirm221` <", value, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm221` <=", value, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221Like(String value) {
            addCriterion("`table_ confirm221` like", value, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221NotLike(String value) {
            addCriterion("`table_ confirm221` not like", value, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221In(List<String> values) {
            addCriterion("`table_ confirm221` in", values, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221NotIn(List<String> values) {
            addCriterion("`table_ confirm221` not in", values, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221Between(String value1, String value2) {
            addCriterion("`table_ confirm221` between", value1, value2, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm221NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm221` not between", value1, value2, "tableConfirm221");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222IsNull() {
            addCriterion("`table_ confirm222` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222IsNotNull() {
            addCriterion("`table_ confirm222` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222EqualTo(String value) {
            addCriterion("`table_ confirm222` =", value, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222NotEqualTo(String value) {
            addCriterion("`table_ confirm222` <>", value, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222GreaterThan(String value) {
            addCriterion("`table_ confirm222` >", value, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm222` >=", value, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222LessThan(String value) {
            addCriterion("`table_ confirm222` <", value, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm222` <=", value, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222Like(String value) {
            addCriterion("`table_ confirm222` like", value, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222NotLike(String value) {
            addCriterion("`table_ confirm222` not like", value, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222In(List<String> values) {
            addCriterion("`table_ confirm222` in", values, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222NotIn(List<String> values) {
            addCriterion("`table_ confirm222` not in", values, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222Between(String value1, String value2) {
            addCriterion("`table_ confirm222` between", value1, value2, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm222NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm222` not between", value1, value2, "tableConfirm222");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223IsNull() {
            addCriterion("`table_ confirm223` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223IsNotNull() {
            addCriterion("`table_ confirm223` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223EqualTo(String value) {
            addCriterion("`table_ confirm223` =", value, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223NotEqualTo(String value) {
            addCriterion("`table_ confirm223` <>", value, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223GreaterThan(String value) {
            addCriterion("`table_ confirm223` >", value, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm223` >=", value, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223LessThan(String value) {
            addCriterion("`table_ confirm223` <", value, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm223` <=", value, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223Like(String value) {
            addCriterion("`table_ confirm223` like", value, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223NotLike(String value) {
            addCriterion("`table_ confirm223` not like", value, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223In(List<String> values) {
            addCriterion("`table_ confirm223` in", values, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223NotIn(List<String> values) {
            addCriterion("`table_ confirm223` not in", values, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223Between(String value1, String value2) {
            addCriterion("`table_ confirm223` between", value1, value2, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm223NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm223` not between", value1, value2, "tableConfirm223");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224IsNull() {
            addCriterion("`table_ confirm224` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224IsNotNull() {
            addCriterion("`table_ confirm224` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224EqualTo(String value) {
            addCriterion("`table_ confirm224` =", value, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224NotEqualTo(String value) {
            addCriterion("`table_ confirm224` <>", value, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224GreaterThan(String value) {
            addCriterion("`table_ confirm224` >", value, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm224` >=", value, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224LessThan(String value) {
            addCriterion("`table_ confirm224` <", value, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm224` <=", value, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224Like(String value) {
            addCriterion("`table_ confirm224` like", value, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224NotLike(String value) {
            addCriterion("`table_ confirm224` not like", value, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224In(List<String> values) {
            addCriterion("`table_ confirm224` in", values, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224NotIn(List<String> values) {
            addCriterion("`table_ confirm224` not in", values, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224Between(String value1, String value2) {
            addCriterion("`table_ confirm224` between", value1, value2, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm224NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm224` not between", value1, value2, "tableConfirm224");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225IsNull() {
            addCriterion("`table_ confirm225` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225IsNotNull() {
            addCriterion("`table_ confirm225` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225EqualTo(String value) {
            addCriterion("`table_ confirm225` =", value, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225NotEqualTo(String value) {
            addCriterion("`table_ confirm225` <>", value, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225GreaterThan(String value) {
            addCriterion("`table_ confirm225` >", value, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm225` >=", value, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225LessThan(String value) {
            addCriterion("`table_ confirm225` <", value, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm225` <=", value, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225Like(String value) {
            addCriterion("`table_ confirm225` like", value, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225NotLike(String value) {
            addCriterion("`table_ confirm225` not like", value, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225In(List<String> values) {
            addCriterion("`table_ confirm225` in", values, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225NotIn(List<String> values) {
            addCriterion("`table_ confirm225` not in", values, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225Between(String value1, String value2) {
            addCriterion("`table_ confirm225` between", value1, value2, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm225NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm225` not between", value1, value2, "tableConfirm225");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226IsNull() {
            addCriterion("`table_ confirm226` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226IsNotNull() {
            addCriterion("`table_ confirm226` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226EqualTo(String value) {
            addCriterion("`table_ confirm226` =", value, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226NotEqualTo(String value) {
            addCriterion("`table_ confirm226` <>", value, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226GreaterThan(String value) {
            addCriterion("`table_ confirm226` >", value, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm226` >=", value, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226LessThan(String value) {
            addCriterion("`table_ confirm226` <", value, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm226` <=", value, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226Like(String value) {
            addCriterion("`table_ confirm226` like", value, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226NotLike(String value) {
            addCriterion("`table_ confirm226` not like", value, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226In(List<String> values) {
            addCriterion("`table_ confirm226` in", values, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226NotIn(List<String> values) {
            addCriterion("`table_ confirm226` not in", values, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226Between(String value1, String value2) {
            addCriterion("`table_ confirm226` between", value1, value2, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm226NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm226` not between", value1, value2, "tableConfirm226");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227IsNull() {
            addCriterion("`table_ confirm227` is null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227IsNotNull() {
            addCriterion("`table_ confirm227` is not null");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227EqualTo(String value) {
            addCriterion("`table_ confirm227` =", value, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227NotEqualTo(String value) {
            addCriterion("`table_ confirm227` <>", value, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227GreaterThan(String value) {
            addCriterion("`table_ confirm227` >", value, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227GreaterThanOrEqualTo(String value) {
            addCriterion("`table_ confirm227` >=", value, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227LessThan(String value) {
            addCriterion("`table_ confirm227` <", value, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227LessThanOrEqualTo(String value) {
            addCriterion("`table_ confirm227` <=", value, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227Like(String value) {
            addCriterion("`table_ confirm227` like", value, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227NotLike(String value) {
            addCriterion("`table_ confirm227` not like", value, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227In(List<String> values) {
            addCriterion("`table_ confirm227` in", values, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227NotIn(List<String> values) {
            addCriterion("`table_ confirm227` not in", values, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227Between(String value1, String value2) {
            addCriterion("`table_ confirm227` between", value1, value2, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTableConfirm227NotBetween(String value1, String value2) {
            addCriterion("`table_ confirm227` not between", value1, value2, "tableConfirm227");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmIsNull() {
            addCriterion("`total_ confirm` is null");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmIsNotNull() {
            addCriterion("`total_ confirm` is not null");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmEqualTo(String value) {
            addCriterion("`total_ confirm` =", value, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmNotEqualTo(String value) {
            addCriterion("`total_ confirm` <>", value, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmGreaterThan(String value) {
            addCriterion("`total_ confirm` >", value, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmGreaterThanOrEqualTo(String value) {
            addCriterion("`total_ confirm` >=", value, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmLessThan(String value) {
            addCriterion("`total_ confirm` <", value, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmLessThanOrEqualTo(String value) {
            addCriterion("`total_ confirm` <=", value, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmLike(String value) {
            addCriterion("`total_ confirm` like", value, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmNotLike(String value) {
            addCriterion("`total_ confirm` not like", value, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmIn(List<String> values) {
            addCriterion("`total_ confirm` in", values, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmNotIn(List<String> values) {
            addCriterion("`total_ confirm` not in", values, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmBetween(String value1, String value2) {
            addCriterion("`total_ confirm` between", value1, value2, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTotalConfirmNotBetween(String value1, String value2) {
            addCriterion("`total_ confirm` not between", value1, value2, "totalConfirm");
            return (Criteria) this;
        }

        public Criteria andTableTime111IsNull() {
            addCriterion("table_time111 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime111IsNotNull() {
            addCriterion("table_time111 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime111EqualTo(String value) {
            addCriterion("table_time111 =", value, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111NotEqualTo(String value) {
            addCriterion("table_time111 <>", value, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111GreaterThan(String value) {
            addCriterion("table_time111 >", value, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111GreaterThanOrEqualTo(String value) {
            addCriterion("table_time111 >=", value, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111LessThan(String value) {
            addCriterion("table_time111 <", value, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111LessThanOrEqualTo(String value) {
            addCriterion("table_time111 <=", value, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111Like(String value) {
            addCriterion("table_time111 like", value, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111NotLike(String value) {
            addCriterion("table_time111 not like", value, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111In(List<String> values) {
            addCriterion("table_time111 in", values, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111NotIn(List<String> values) {
            addCriterion("table_time111 not in", values, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111Between(String value1, String value2) {
            addCriterion("table_time111 between", value1, value2, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111NotBetween(String value1, String value2) {
            addCriterion("table_time111 not between", value1, value2, "tableTime111");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1IsNull() {
            addCriterion("table_time111xu1 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1IsNotNull() {
            addCriterion("table_time111xu1 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1EqualTo(String value) {
            addCriterion("table_time111xu1 =", value, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1NotEqualTo(String value) {
            addCriterion("table_time111xu1 <>", value, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1GreaterThan(String value) {
            addCriterion("table_time111xu1 >", value, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1GreaterThanOrEqualTo(String value) {
            addCriterion("table_time111xu1 >=", value, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1LessThan(String value) {
            addCriterion("table_time111xu1 <", value, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1LessThanOrEqualTo(String value) {
            addCriterion("table_time111xu1 <=", value, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1Like(String value) {
            addCriterion("table_time111xu1 like", value, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1NotLike(String value) {
            addCriterion("table_time111xu1 not like", value, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1In(List<String> values) {
            addCriterion("table_time111xu1 in", values, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1NotIn(List<String> values) {
            addCriterion("table_time111xu1 not in", values, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1Between(String value1, String value2) {
            addCriterion("table_time111xu1 between", value1, value2, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu1NotBetween(String value1, String value2) {
            addCriterion("table_time111xu1 not between", value1, value2, "tableTime111xu1");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2IsNull() {
            addCriterion("table_time111xu2 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2IsNotNull() {
            addCriterion("table_time111xu2 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2EqualTo(String value) {
            addCriterion("table_time111xu2 =", value, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2NotEqualTo(String value) {
            addCriterion("table_time111xu2 <>", value, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2GreaterThan(String value) {
            addCriterion("table_time111xu2 >", value, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2GreaterThanOrEqualTo(String value) {
            addCriterion("table_time111xu2 >=", value, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2LessThan(String value) {
            addCriterion("table_time111xu2 <", value, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2LessThanOrEqualTo(String value) {
            addCriterion("table_time111xu2 <=", value, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2Like(String value) {
            addCriterion("table_time111xu2 like", value, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2NotLike(String value) {
            addCriterion("table_time111xu2 not like", value, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2In(List<String> values) {
            addCriterion("table_time111xu2 in", values, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2NotIn(List<String> values) {
            addCriterion("table_time111xu2 not in", values, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2Between(String value1, String value2) {
            addCriterion("table_time111xu2 between", value1, value2, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime111xu2NotBetween(String value1, String value2) {
            addCriterion("table_time111xu2 not between", value1, value2, "tableTime111xu2");
            return (Criteria) this;
        }

        public Criteria andTableTime112IsNull() {
            addCriterion("table_time112 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime112IsNotNull() {
            addCriterion("table_time112 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime112EqualTo(String value) {
            addCriterion("table_time112 =", value, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime112NotEqualTo(String value) {
            addCriterion("table_time112 <>", value, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime112GreaterThan(String value) {
            addCriterion("table_time112 >", value, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime112GreaterThanOrEqualTo(String value) {
            addCriterion("table_time112 >=", value, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime112LessThan(String value) {
            addCriterion("table_time112 <", value, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime112LessThanOrEqualTo(String value) {
            addCriterion("table_time112 <=", value, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime112Like(String value) {
            addCriterion("table_time112 like", value, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime112NotLike(String value) {
            addCriterion("table_time112 not like", value, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime112In(List<String> values) {
            addCriterion("table_time112 in", values, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime112NotIn(List<String> values) {
            addCriterion("table_time112 not in", values, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime112Between(String value1, String value2) {
            addCriterion("table_time112 between", value1, value2, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime112NotBetween(String value1, String value2) {
            addCriterion("table_time112 not between", value1, value2, "tableTime112");
            return (Criteria) this;
        }

        public Criteria andTableTime121IsNull() {
            addCriterion("table_time121 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime121IsNotNull() {
            addCriterion("table_time121 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime121EqualTo(String value) {
            addCriterion("table_time121 =", value, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime121NotEqualTo(String value) {
            addCriterion("table_time121 <>", value, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime121GreaterThan(String value) {
            addCriterion("table_time121 >", value, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime121GreaterThanOrEqualTo(String value) {
            addCriterion("table_time121 >=", value, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime121LessThan(String value) {
            addCriterion("table_time121 <", value, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime121LessThanOrEqualTo(String value) {
            addCriterion("table_time121 <=", value, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime121Like(String value) {
            addCriterion("table_time121 like", value, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime121NotLike(String value) {
            addCriterion("table_time121 not like", value, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime121In(List<String> values) {
            addCriterion("table_time121 in", values, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime121NotIn(List<String> values) {
            addCriterion("table_time121 not in", values, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime121Between(String value1, String value2) {
            addCriterion("table_time121 between", value1, value2, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime121NotBetween(String value1, String value2) {
            addCriterion("table_time121 not between", value1, value2, "tableTime121");
            return (Criteria) this;
        }

        public Criteria andTableTime211IsNull() {
            addCriterion("table_time211 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime211IsNotNull() {
            addCriterion("table_time211 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime211EqualTo(String value) {
            addCriterion("table_time211 =", value, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime211NotEqualTo(String value) {
            addCriterion("table_time211 <>", value, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime211GreaterThan(String value) {
            addCriterion("table_time211 >", value, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime211GreaterThanOrEqualTo(String value) {
            addCriterion("table_time211 >=", value, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime211LessThan(String value) {
            addCriterion("table_time211 <", value, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime211LessThanOrEqualTo(String value) {
            addCriterion("table_time211 <=", value, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime211Like(String value) {
            addCriterion("table_time211 like", value, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime211NotLike(String value) {
            addCriterion("table_time211 not like", value, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime211In(List<String> values) {
            addCriterion("table_time211 in", values, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime211NotIn(List<String> values) {
            addCriterion("table_time211 not in", values, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime211Between(String value1, String value2) {
            addCriterion("table_time211 between", value1, value2, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime211NotBetween(String value1, String value2) {
            addCriterion("table_time211 not between", value1, value2, "tableTime211");
            return (Criteria) this;
        }

        public Criteria andTableTime212IsNull() {
            addCriterion("table_time212 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime212IsNotNull() {
            addCriterion("table_time212 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime212EqualTo(String value) {
            addCriterion("table_time212 =", value, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime212NotEqualTo(String value) {
            addCriterion("table_time212 <>", value, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime212GreaterThan(String value) {
            addCriterion("table_time212 >", value, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime212GreaterThanOrEqualTo(String value) {
            addCriterion("table_time212 >=", value, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime212LessThan(String value) {
            addCriterion("table_time212 <", value, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime212LessThanOrEqualTo(String value) {
            addCriterion("table_time212 <=", value, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime212Like(String value) {
            addCriterion("table_time212 like", value, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime212NotLike(String value) {
            addCriterion("table_time212 not like", value, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime212In(List<String> values) {
            addCriterion("table_time212 in", values, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime212NotIn(List<String> values) {
            addCriterion("table_time212 not in", values, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime212Between(String value1, String value2) {
            addCriterion("table_time212 between", value1, value2, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime212NotBetween(String value1, String value2) {
            addCriterion("table_time212 not between", value1, value2, "tableTime212");
            return (Criteria) this;
        }

        public Criteria andTableTime213IsNull() {
            addCriterion("table_time213 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime213IsNotNull() {
            addCriterion("table_time213 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime213EqualTo(String value) {
            addCriterion("table_time213 =", value, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime213NotEqualTo(String value) {
            addCriterion("table_time213 <>", value, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime213GreaterThan(String value) {
            addCriterion("table_time213 >", value, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime213GreaterThanOrEqualTo(String value) {
            addCriterion("table_time213 >=", value, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime213LessThan(String value) {
            addCriterion("table_time213 <", value, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime213LessThanOrEqualTo(String value) {
            addCriterion("table_time213 <=", value, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime213Like(String value) {
            addCriterion("table_time213 like", value, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime213NotLike(String value) {
            addCriterion("table_time213 not like", value, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime213In(List<String> values) {
            addCriterion("table_time213 in", values, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime213NotIn(List<String> values) {
            addCriterion("table_time213 not in", values, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime213Between(String value1, String value2) {
            addCriterion("table_time213 between", value1, value2, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime213NotBetween(String value1, String value2) {
            addCriterion("table_time213 not between", value1, value2, "tableTime213");
            return (Criteria) this;
        }

        public Criteria andTableTime214IsNull() {
            addCriterion("table_time214 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime214IsNotNull() {
            addCriterion("table_time214 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime214EqualTo(String value) {
            addCriterion("table_time214 =", value, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime214NotEqualTo(String value) {
            addCriterion("table_time214 <>", value, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime214GreaterThan(String value) {
            addCriterion("table_time214 >", value, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime214GreaterThanOrEqualTo(String value) {
            addCriterion("table_time214 >=", value, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime214LessThan(String value) {
            addCriterion("table_time214 <", value, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime214LessThanOrEqualTo(String value) {
            addCriterion("table_time214 <=", value, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime214Like(String value) {
            addCriterion("table_time214 like", value, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime214NotLike(String value) {
            addCriterion("table_time214 not like", value, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime214In(List<String> values) {
            addCriterion("table_time214 in", values, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime214NotIn(List<String> values) {
            addCriterion("table_time214 not in", values, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime214Between(String value1, String value2) {
            addCriterion("table_time214 between", value1, value2, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime214NotBetween(String value1, String value2) {
            addCriterion("table_time214 not between", value1, value2, "tableTime214");
            return (Criteria) this;
        }

        public Criteria andTableTime215IsNull() {
            addCriterion("table_time215 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime215IsNotNull() {
            addCriterion("table_time215 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime215EqualTo(String value) {
            addCriterion("table_time215 =", value, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime215NotEqualTo(String value) {
            addCriterion("table_time215 <>", value, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime215GreaterThan(String value) {
            addCriterion("table_time215 >", value, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime215GreaterThanOrEqualTo(String value) {
            addCriterion("table_time215 >=", value, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime215LessThan(String value) {
            addCriterion("table_time215 <", value, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime215LessThanOrEqualTo(String value) {
            addCriterion("table_time215 <=", value, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime215Like(String value) {
            addCriterion("table_time215 like", value, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime215NotLike(String value) {
            addCriterion("table_time215 not like", value, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime215In(List<String> values) {
            addCriterion("table_time215 in", values, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime215NotIn(List<String> values) {
            addCriterion("table_time215 not in", values, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime215Between(String value1, String value2) {
            addCriterion("table_time215 between", value1, value2, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime215NotBetween(String value1, String value2) {
            addCriterion("table_time215 not between", value1, value2, "tableTime215");
            return (Criteria) this;
        }

        public Criteria andTableTime221IsNull() {
            addCriterion("table_time221 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime221IsNotNull() {
            addCriterion("table_time221 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime221EqualTo(String value) {
            addCriterion("table_time221 =", value, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime221NotEqualTo(String value) {
            addCriterion("table_time221 <>", value, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime221GreaterThan(String value) {
            addCriterion("table_time221 >", value, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime221GreaterThanOrEqualTo(String value) {
            addCriterion("table_time221 >=", value, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime221LessThan(String value) {
            addCriterion("table_time221 <", value, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime221LessThanOrEqualTo(String value) {
            addCriterion("table_time221 <=", value, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime221Like(String value) {
            addCriterion("table_time221 like", value, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime221NotLike(String value) {
            addCriterion("table_time221 not like", value, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime221In(List<String> values) {
            addCriterion("table_time221 in", values, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime221NotIn(List<String> values) {
            addCriterion("table_time221 not in", values, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime221Between(String value1, String value2) {
            addCriterion("table_time221 between", value1, value2, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime221NotBetween(String value1, String value2) {
            addCriterion("table_time221 not between", value1, value2, "tableTime221");
            return (Criteria) this;
        }

        public Criteria andTableTime222IsNull() {
            addCriterion("table_time222 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime222IsNotNull() {
            addCriterion("table_time222 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime222EqualTo(String value) {
            addCriterion("table_time222 =", value, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime222NotEqualTo(String value) {
            addCriterion("table_time222 <>", value, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime222GreaterThan(String value) {
            addCriterion("table_time222 >", value, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime222GreaterThanOrEqualTo(String value) {
            addCriterion("table_time222 >=", value, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime222LessThan(String value) {
            addCriterion("table_time222 <", value, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime222LessThanOrEqualTo(String value) {
            addCriterion("table_time222 <=", value, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime222Like(String value) {
            addCriterion("table_time222 like", value, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime222NotLike(String value) {
            addCriterion("table_time222 not like", value, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime222In(List<String> values) {
            addCriterion("table_time222 in", values, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime222NotIn(List<String> values) {
            addCriterion("table_time222 not in", values, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime222Between(String value1, String value2) {
            addCriterion("table_time222 between", value1, value2, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime222NotBetween(String value1, String value2) {
            addCriterion("table_time222 not between", value1, value2, "tableTime222");
            return (Criteria) this;
        }

        public Criteria andTableTime223IsNull() {
            addCriterion("table_time223 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime223IsNotNull() {
            addCriterion("table_time223 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime223EqualTo(String value) {
            addCriterion("table_time223 =", value, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime223NotEqualTo(String value) {
            addCriterion("table_time223 <>", value, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime223GreaterThan(String value) {
            addCriterion("table_time223 >", value, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime223GreaterThanOrEqualTo(String value) {
            addCriterion("table_time223 >=", value, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime223LessThan(String value) {
            addCriterion("table_time223 <", value, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime223LessThanOrEqualTo(String value) {
            addCriterion("table_time223 <=", value, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime223Like(String value) {
            addCriterion("table_time223 like", value, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime223NotLike(String value) {
            addCriterion("table_time223 not like", value, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime223In(List<String> values) {
            addCriterion("table_time223 in", values, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime223NotIn(List<String> values) {
            addCriterion("table_time223 not in", values, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime223Between(String value1, String value2) {
            addCriterion("table_time223 between", value1, value2, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime223NotBetween(String value1, String value2) {
            addCriterion("table_time223 not between", value1, value2, "tableTime223");
            return (Criteria) this;
        }

        public Criteria andTableTime224IsNull() {
            addCriterion("table_time224 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime224IsNotNull() {
            addCriterion("table_time224 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime224EqualTo(String value) {
            addCriterion("table_time224 =", value, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime224NotEqualTo(String value) {
            addCriterion("table_time224 <>", value, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime224GreaterThan(String value) {
            addCriterion("table_time224 >", value, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime224GreaterThanOrEqualTo(String value) {
            addCriterion("table_time224 >=", value, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime224LessThan(String value) {
            addCriterion("table_time224 <", value, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime224LessThanOrEqualTo(String value) {
            addCriterion("table_time224 <=", value, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime224Like(String value) {
            addCriterion("table_time224 like", value, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime224NotLike(String value) {
            addCriterion("table_time224 not like", value, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime224In(List<String> values) {
            addCriterion("table_time224 in", values, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime224NotIn(List<String> values) {
            addCriterion("table_time224 not in", values, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime224Between(String value1, String value2) {
            addCriterion("table_time224 between", value1, value2, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime224NotBetween(String value1, String value2) {
            addCriterion("table_time224 not between", value1, value2, "tableTime224");
            return (Criteria) this;
        }

        public Criteria andTableTime225IsNull() {
            addCriterion("table_time225 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime225IsNotNull() {
            addCriterion("table_time225 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime225EqualTo(String value) {
            addCriterion("table_time225 =", value, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime225NotEqualTo(String value) {
            addCriterion("table_time225 <>", value, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime225GreaterThan(String value) {
            addCriterion("table_time225 >", value, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime225GreaterThanOrEqualTo(String value) {
            addCriterion("table_time225 >=", value, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime225LessThan(String value) {
            addCriterion("table_time225 <", value, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime225LessThanOrEqualTo(String value) {
            addCriterion("table_time225 <=", value, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime225Like(String value) {
            addCriterion("table_time225 like", value, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime225NotLike(String value) {
            addCriterion("table_time225 not like", value, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime225In(List<String> values) {
            addCriterion("table_time225 in", values, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime225NotIn(List<String> values) {
            addCriterion("table_time225 not in", values, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime225Between(String value1, String value2) {
            addCriterion("table_time225 between", value1, value2, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime225NotBetween(String value1, String value2) {
            addCriterion("table_time225 not between", value1, value2, "tableTime225");
            return (Criteria) this;
        }

        public Criteria andTableTime226IsNull() {
            addCriterion("table_time226 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime226IsNotNull() {
            addCriterion("table_time226 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime226EqualTo(String value) {
            addCriterion("table_time226 =", value, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime226NotEqualTo(String value) {
            addCriterion("table_time226 <>", value, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime226GreaterThan(String value) {
            addCriterion("table_time226 >", value, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime226GreaterThanOrEqualTo(String value) {
            addCriterion("table_time226 >=", value, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime226LessThan(String value) {
            addCriterion("table_time226 <", value, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime226LessThanOrEqualTo(String value) {
            addCriterion("table_time226 <=", value, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime226Like(String value) {
            addCriterion("table_time226 like", value, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime226NotLike(String value) {
            addCriterion("table_time226 not like", value, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime226In(List<String> values) {
            addCriterion("table_time226 in", values, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime226NotIn(List<String> values) {
            addCriterion("table_time226 not in", values, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime226Between(String value1, String value2) {
            addCriterion("table_time226 between", value1, value2, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime226NotBetween(String value1, String value2) {
            addCriterion("table_time226 not between", value1, value2, "tableTime226");
            return (Criteria) this;
        }

        public Criteria andTableTime227IsNull() {
            addCriterion("table_time227 is null");
            return (Criteria) this;
        }

        public Criteria andTableTime227IsNotNull() {
            addCriterion("table_time227 is not null");
            return (Criteria) this;
        }

        public Criteria andTableTime227EqualTo(String value) {
            addCriterion("table_time227 =", value, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTableTime227NotEqualTo(String value) {
            addCriterion("table_time227 <>", value, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTableTime227GreaterThan(String value) {
            addCriterion("table_time227 >", value, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTableTime227GreaterThanOrEqualTo(String value) {
            addCriterion("table_time227 >=", value, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTableTime227LessThan(String value) {
            addCriterion("table_time227 <", value, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTableTime227LessThanOrEqualTo(String value) {
            addCriterion("table_time227 <=", value, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTableTime227Like(String value) {
            addCriterion("table_time227 like", value, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTableTime227NotLike(String value) {
            addCriterion("table_time227 not like", value, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTableTime227In(List<String> values) {
            addCriterion("table_time227 in", values, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTableTime227NotIn(List<String> values) {
            addCriterion("table_time227 not in", values, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTableTime227Between(String value1, String value2) {
            addCriterion("table_time227 between", value1, value2, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTableTime227NotBetween(String value1, String value2) {
            addCriterion("table_time227 not between", value1, value2, "tableTime227");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNull() {
            addCriterion("total_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNotNull() {
            addCriterion("total_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeEqualTo(String value) {
            addCriterion("total_time =", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotEqualTo(String value) {
            addCriterion("total_time <>", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThan(String value) {
            addCriterion("total_time >", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThanOrEqualTo(String value) {
            addCriterion("total_time >=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThan(String value) {
            addCriterion("total_time <", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThanOrEqualTo(String value) {
            addCriterion("total_time <=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLike(String value) {
            addCriterion("total_time like", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotLike(String value) {
            addCriterion("total_time not like", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIn(List<String> values) {
            addCriterion("total_time in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotIn(List<String> values) {
            addCriterion("total_time not in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeBetween(String value1, String value2) {
            addCriterion("total_time between", value1, value2, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotBetween(String value1, String value2) {
            addCriterion("total_time not between", value1, value2, "totalTime");
            return (Criteria) this;
        }
    }

    /**
     * confirm_information
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * confirm_information 2020-12-21
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