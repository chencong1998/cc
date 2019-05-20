package com.springmvc.bean;

import java.util.ArrayList;
import java.util.List;

public class PaidtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaidtypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andPaididIsNull() {
            addCriterion("paidID is null");
            return (Criteria) this;
        }

        public Criteria andPaididIsNotNull() {
            addCriterion("paidID is not null");
            return (Criteria) this;
        }

        public Criteria andPaididEqualTo(Integer value) {
            addCriterion("paidID =", value, "paidid");
            return (Criteria) this;
        }

        public Criteria andPaididNotEqualTo(Integer value) {
            addCriterion("paidID <>", value, "paidid");
            return (Criteria) this;
        }

        public Criteria andPaididGreaterThan(Integer value) {
            addCriterion("paidID >", value, "paidid");
            return (Criteria) this;
        }

        public Criteria andPaididGreaterThanOrEqualTo(Integer value) {
            addCriterion("paidID >=", value, "paidid");
            return (Criteria) this;
        }

        public Criteria andPaididLessThan(Integer value) {
            addCriterion("paidID <", value, "paidid");
            return (Criteria) this;
        }

        public Criteria andPaididLessThanOrEqualTo(Integer value) {
            addCriterion("paidID <=", value, "paidid");
            return (Criteria) this;
        }

        public Criteria andPaididIn(List<Integer> values) {
            addCriterion("paidID in", values, "paidid");
            return (Criteria) this;
        }

        public Criteria andPaididNotIn(List<Integer> values) {
            addCriterion("paidID not in", values, "paidid");
            return (Criteria) this;
        }

        public Criteria andPaididBetween(Integer value1, Integer value2) {
            addCriterion("paidID between", value1, value2, "paidid");
            return (Criteria) this;
        }

        public Criteria andPaididNotBetween(Integer value1, Integer value2) {
            addCriterion("paidID not between", value1, value2, "paidid");
            return (Criteria) this;
        }

        public Criteria andPaidnameIsNull() {
            addCriterion("paidName is null");
            return (Criteria) this;
        }

        public Criteria andPaidnameIsNotNull() {
            addCriterion("paidName is not null");
            return (Criteria) this;
        }

        public Criteria andPaidnameEqualTo(String value) {
            addCriterion("paidName =", value, "paidname");
            return (Criteria) this;
        }

        public Criteria andPaidnameNotEqualTo(String value) {
            addCriterion("paidName <>", value, "paidname");
            return (Criteria) this;
        }

        public Criteria andPaidnameGreaterThan(String value) {
            addCriterion("paidName >", value, "paidname");
            return (Criteria) this;
        }

        public Criteria andPaidnameGreaterThanOrEqualTo(String value) {
            addCriterion("paidName >=", value, "paidname");
            return (Criteria) this;
        }

        public Criteria andPaidnameLessThan(String value) {
            addCriterion("paidName <", value, "paidname");
            return (Criteria) this;
        }

        public Criteria andPaidnameLessThanOrEqualTo(String value) {
            addCriterion("paidName <=", value, "paidname");
            return (Criteria) this;
        }

        public Criteria andPaidnameLike(String value) {
            addCriterion("paidName like", value, "paidname");
            return (Criteria) this;
        }

        public Criteria andPaidnameNotLike(String value) {
            addCriterion("paidName not like", value, "paidname");
            return (Criteria) this;
        }

        public Criteria andPaidnameIn(List<String> values) {
            addCriterion("paidName in", values, "paidname");
            return (Criteria) this;
        }

        public Criteria andPaidnameNotIn(List<String> values) {
            addCriterion("paidName not in", values, "paidname");
            return (Criteria) this;
        }

        public Criteria andPaidnameBetween(String value1, String value2) {
            addCriterion("paidName between", value1, value2, "paidname");
            return (Criteria) this;
        }

        public Criteria andPaidnameNotBetween(String value1, String value2) {
            addCriterion("paidName not between", value1, value2, "paidname");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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