package com.springmvc.bean;

import java.util.ArrayList;
import java.util.List;

public class SendtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SendtypeExample() {
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

        public Criteria andSendtypeidIsNull() {
            addCriterion("sendTypeID is null");
            return (Criteria) this;
        }

        public Criteria andSendtypeidIsNotNull() {
            addCriterion("sendTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andSendtypeidEqualTo(Integer value) {
            addCriterion("sendTypeID =", value, "sendtypeid");
            return (Criteria) this;
        }

        public Criteria andSendtypeidNotEqualTo(Integer value) {
            addCriterion("sendTypeID <>", value, "sendtypeid");
            return (Criteria) this;
        }

        public Criteria andSendtypeidGreaterThan(Integer value) {
            addCriterion("sendTypeID >", value, "sendtypeid");
            return (Criteria) this;
        }

        public Criteria andSendtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendTypeID >=", value, "sendtypeid");
            return (Criteria) this;
        }

        public Criteria andSendtypeidLessThan(Integer value) {
            addCriterion("sendTypeID <", value, "sendtypeid");
            return (Criteria) this;
        }

        public Criteria andSendtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("sendTypeID <=", value, "sendtypeid");
            return (Criteria) this;
        }

        public Criteria andSendtypeidIn(List<Integer> values) {
            addCriterion("sendTypeID in", values, "sendtypeid");
            return (Criteria) this;
        }

        public Criteria andSendtypeidNotIn(List<Integer> values) {
            addCriterion("sendTypeID not in", values, "sendtypeid");
            return (Criteria) this;
        }

        public Criteria andSendtypeidBetween(Integer value1, Integer value2) {
            addCriterion("sendTypeID between", value1, value2, "sendtypeid");
            return (Criteria) this;
        }

        public Criteria andSendtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("sendTypeID not between", value1, value2, "sendtypeid");
            return (Criteria) this;
        }

        public Criteria andSendtypenameIsNull() {
            addCriterion("sendTypeName is null");
            return (Criteria) this;
        }

        public Criteria andSendtypenameIsNotNull() {
            addCriterion("sendTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andSendtypenameEqualTo(String value) {
            addCriterion("sendTypeName =", value, "sendtypename");
            return (Criteria) this;
        }

        public Criteria andSendtypenameNotEqualTo(String value) {
            addCriterion("sendTypeName <>", value, "sendtypename");
            return (Criteria) this;
        }

        public Criteria andSendtypenameGreaterThan(String value) {
            addCriterion("sendTypeName >", value, "sendtypename");
            return (Criteria) this;
        }

        public Criteria andSendtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("sendTypeName >=", value, "sendtypename");
            return (Criteria) this;
        }

        public Criteria andSendtypenameLessThan(String value) {
            addCriterion("sendTypeName <", value, "sendtypename");
            return (Criteria) this;
        }

        public Criteria andSendtypenameLessThanOrEqualTo(String value) {
            addCriterion("sendTypeName <=", value, "sendtypename");
            return (Criteria) this;
        }

        public Criteria andSendtypenameLike(String value) {
            addCriterion("sendTypeName like", value, "sendtypename");
            return (Criteria) this;
        }

        public Criteria andSendtypenameNotLike(String value) {
            addCriterion("sendTypeName not like", value, "sendtypename");
            return (Criteria) this;
        }

        public Criteria andSendtypenameIn(List<String> values) {
            addCriterion("sendTypeName in", values, "sendtypename");
            return (Criteria) this;
        }

        public Criteria andSendtypenameNotIn(List<String> values) {
            addCriterion("sendTypeName not in", values, "sendtypename");
            return (Criteria) this;
        }

        public Criteria andSendtypenameBetween(String value1, String value2) {
            addCriterion("sendTypeName between", value1, value2, "sendtypename");
            return (Criteria) this;
        }

        public Criteria andSendtypenameNotBetween(String value1, String value2) {
            addCriterion("sendTypeName not between", value1, value2, "sendtypename");
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