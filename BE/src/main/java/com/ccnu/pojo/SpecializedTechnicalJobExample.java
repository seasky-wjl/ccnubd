package com.ccnu.pojo;

import java.util.ArrayList;
import java.util.List;

public class SpecializedTechnicalJobExample {
    /**
     * specialized_technical_job
     */
    protected String orderByClause;

    /**
     * specialized_technical_job
     */
    protected boolean distinct;

    /**
     * specialized_technical_job
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2020-12-21
     */
    public SpecializedTechnicalJobExample() {
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
     * specialized_technical_job 2020-12-21
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

        public Criteria andSpecializedTechnicalJobIsNull() {
            addCriterion("specialized_technical_job is null");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobIsNotNull() {
            addCriterion("specialized_technical_job is not null");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobEqualTo(String value) {
            addCriterion("specialized_technical_job =", value, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobNotEqualTo(String value) {
            addCriterion("specialized_technical_job <>", value, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobGreaterThan(String value) {
            addCriterion("specialized_technical_job >", value, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobGreaterThanOrEqualTo(String value) {
            addCriterion("specialized_technical_job >=", value, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobLessThan(String value) {
            addCriterion("specialized_technical_job <", value, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobLessThanOrEqualTo(String value) {
            addCriterion("specialized_technical_job <=", value, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobLike(String value) {
            addCriterion("specialized_technical_job like", value, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobNotLike(String value) {
            addCriterion("specialized_technical_job not like", value, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobIn(List<String> values) {
            addCriterion("specialized_technical_job in", values, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobNotIn(List<String> values) {
            addCriterion("specialized_technical_job not in", values, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobBetween(String value1, String value2) {
            addCriterion("specialized_technical_job between", value1, value2, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andSpecializedTechnicalJobNotBetween(String value1, String value2) {
            addCriterion("specialized_technical_job not between", value1, value2, "specializedTechnicalJob");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("id_type is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("id_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(Integer value) {
            addCriterion("id_type =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(Integer value) {
            addCriterion("id_type <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(Integer value) {
            addCriterion("id_type >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_type >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(Integer value) {
            addCriterion("id_type <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("id_type <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<Integer> values) {
            addCriterion("id_type in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<Integer> values) {
            addCriterion("id_type not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(Integer value1, Integer value2) {
            addCriterion("id_type between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("id_type not between", value1, value2, "idType");
            return (Criteria) this;
        }
    }

    /**
     * specialized_technical_job
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * specialized_technical_job 2020-12-21
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