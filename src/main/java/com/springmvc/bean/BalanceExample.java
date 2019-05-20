package com.springmvc.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BalanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BalanceExample() {
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

        public Criteria andBalanceidIsNull() {
            addCriterion("balanceID is null");
            return (Criteria) this;
        }

        public Criteria andBalanceidIsNotNull() {
            addCriterion("balanceID is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceidEqualTo(Integer value) {
            addCriterion("balanceID =", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidNotEqualTo(Integer value) {
            addCriterion("balanceID <>", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidGreaterThan(Integer value) {
            addCriterion("balanceID >", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("balanceID >=", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidLessThan(Integer value) {
            addCriterion("balanceID <", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidLessThanOrEqualTo(Integer value) {
            addCriterion("balanceID <=", value, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidIn(List<Integer> values) {
            addCriterion("balanceID in", values, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidNotIn(List<Integer> values) {
            addCriterion("balanceID not in", values, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidBetween(Integer value1, Integer value2) {
            addCriterion("balanceID between", value1, value2, "balanceid");
            return (Criteria) this;
        }

        public Criteria andBalanceidNotBetween(Integer value1, Integer value2) {
            addCriterion("balanceID not between", value1, value2, "balanceid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andFacefeeIsNull() {
            addCriterion("faceFee is null");
            return (Criteria) this;
        }

        public Criteria andFacefeeIsNotNull() {
            addCriterion("faceFee is not null");
            return (Criteria) this;
        }

        public Criteria andFacefeeEqualTo(BigDecimal value) {
            addCriterion("faceFee =", value, "facefee");
            return (Criteria) this;
        }

        public Criteria andFacefeeNotEqualTo(BigDecimal value) {
            addCriterion("faceFee <>", value, "facefee");
            return (Criteria) this;
        }

        public Criteria andFacefeeGreaterThan(BigDecimal value) {
            addCriterion("faceFee >", value, "facefee");
            return (Criteria) this;
        }

        public Criteria andFacefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("faceFee >=", value, "facefee");
            return (Criteria) this;
        }

        public Criteria andFacefeeLessThan(BigDecimal value) {
            addCriterion("faceFee <", value, "facefee");
            return (Criteria) this;
        }

        public Criteria andFacefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("faceFee <=", value, "facefee");
            return (Criteria) this;
        }

        public Criteria andFacefeeIn(List<BigDecimal> values) {
            addCriterion("faceFee in", values, "facefee");
            return (Criteria) this;
        }

        public Criteria andFacefeeNotIn(List<BigDecimal> values) {
            addCriterion("faceFee not in", values, "facefee");
            return (Criteria) this;
        }

        public Criteria andFacefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("faceFee between", value1, value2, "facefee");
            return (Criteria) this;
        }

        public Criteria andFacefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("faceFee not between", value1, value2, "facefee");
            return (Criteria) this;
        }

        public Criteria andPaidtypeIsNull() {
            addCriterion("paidType is null");
            return (Criteria) this;
        }

        public Criteria andPaidtypeIsNotNull() {
            addCriterion("paidType is not null");
            return (Criteria) this;
        }

        public Criteria andPaidtypeEqualTo(String value) {
            addCriterion("paidType =", value, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtypeNotEqualTo(String value) {
            addCriterion("paidType <>", value, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtypeGreaterThan(String value) {
            addCriterion("paidType >", value, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtypeGreaterThanOrEqualTo(String value) {
            addCriterion("paidType >=", value, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtypeLessThan(String value) {
            addCriterion("paidType <", value, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtypeLessThanOrEqualTo(String value) {
            addCriterion("paidType <=", value, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtypeLike(String value) {
            addCriterion("paidType like", value, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtypeNotLike(String value) {
            addCriterion("paidType not like", value, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtypeIn(List<String> values) {
            addCriterion("paidType in", values, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtypeNotIn(List<String> values) {
            addCriterion("paidType not in", values, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtypeBetween(String value1, String value2) {
            addCriterion("paidType between", value1, value2, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtypeNotBetween(String value1, String value2) {
            addCriterion("paidType not between", value1, value2, "paidtype");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIsNull() {
            addCriterion("paidTime is null");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIsNotNull() {
            addCriterion("paidTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaidtimeEqualTo(Date value) {
            addCriterion("paidTime =", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotEqualTo(Date value) {
            addCriterion("paidTime <>", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeGreaterThan(Date value) {
            addCriterion("paidTime >", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paidTime >=", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeLessThan(Date value) {
            addCriterion("paidTime <", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeLessThanOrEqualTo(Date value) {
            addCriterion("paidTime <=", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIn(List<Date> values) {
            addCriterion("paidTime in", values, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotIn(List<Date> values) {
            addCriterion("paidTime not in", values, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeBetween(Date value1, Date value2) {
            addCriterion("paidTime between", value1, value2, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotBetween(Date value1, Date value2) {
            addCriterion("paidTime not between", value1, value2, "paidtime");
            return (Criteria) this;
        }

        public Criteria andOprtimeIsNull() {
            addCriterion("oprTime is null");
            return (Criteria) this;
        }

        public Criteria andOprtimeIsNotNull() {
            addCriterion("oprTime is not null");
            return (Criteria) this;
        }

        public Criteria andOprtimeEqualTo(Date value) {
            addCriterion("oprTime =", value, "oprtime");
            return (Criteria) this;
        }

        public Criteria andOprtimeNotEqualTo(Date value) {
            addCriterion("oprTime <>", value, "oprtime");
            return (Criteria) this;
        }

        public Criteria andOprtimeGreaterThan(Date value) {
            addCriterion("oprTime >", value, "oprtime");
            return (Criteria) this;
        }

        public Criteria andOprtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("oprTime >=", value, "oprtime");
            return (Criteria) this;
        }

        public Criteria andOprtimeLessThan(Date value) {
            addCriterion("oprTime <", value, "oprtime");
            return (Criteria) this;
        }

        public Criteria andOprtimeLessThanOrEqualTo(Date value) {
            addCriterion("oprTime <=", value, "oprtime");
            return (Criteria) this;
        }

        public Criteria andOprtimeIn(List<Date> values) {
            addCriterion("oprTime in", values, "oprtime");
            return (Criteria) this;
        }

        public Criteria andOprtimeNotIn(List<Date> values) {
            addCriterion("oprTime not in", values, "oprtime");
            return (Criteria) this;
        }

        public Criteria andOprtimeBetween(Date value1, Date value2) {
            addCriterion("oprTime between", value1, value2, "oprtime");
            return (Criteria) this;
        }

        public Criteria andOprtimeNotBetween(Date value1, Date value2) {
            addCriterion("oprTime not between", value1, value2, "oprtime");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("isvalID is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("isvalID is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(String value) {
            addCriterion("isvalID =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(String value) {
            addCriterion("isvalID <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(String value) {
            addCriterion("isvalID >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(String value) {
            addCriterion("isvalID >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(String value) {
            addCriterion("isvalID <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(String value) {
            addCriterion("isvalID <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLike(String value) {
            addCriterion("isvalID like", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotLike(String value) {
            addCriterion("isvalID not like", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<String> values) {
            addCriterion("isvalID in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<String> values) {
            addCriterion("isvalID not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(String value1, String value2) {
            addCriterion("isvalID between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(String value1, String value2) {
            addCriterion("isvalID not between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andDemoIsNull() {
            addCriterion("demo is null");
            return (Criteria) this;
        }

        public Criteria andDemoIsNotNull() {
            addCriterion("demo is not null");
            return (Criteria) this;
        }

        public Criteria andDemoEqualTo(String value) {
            addCriterion("demo =", value, "demo");
            return (Criteria) this;
        }

        public Criteria andDemoNotEqualTo(String value) {
            addCriterion("demo <>", value, "demo");
            return (Criteria) this;
        }

        public Criteria andDemoGreaterThan(String value) {
            addCriterion("demo >", value, "demo");
            return (Criteria) this;
        }

        public Criteria andDemoGreaterThanOrEqualTo(String value) {
            addCriterion("demo >=", value, "demo");
            return (Criteria) this;
        }

        public Criteria andDemoLessThan(String value) {
            addCriterion("demo <", value, "demo");
            return (Criteria) this;
        }

        public Criteria andDemoLessThanOrEqualTo(String value) {
            addCriterion("demo <=", value, "demo");
            return (Criteria) this;
        }

        public Criteria andDemoLike(String value) {
            addCriterion("demo like", value, "demo");
            return (Criteria) this;
        }

        public Criteria andDemoNotLike(String value) {
            addCriterion("demo not like", value, "demo");
            return (Criteria) this;
        }

        public Criteria andDemoIn(List<String> values) {
            addCriterion("demo in", values, "demo");
            return (Criteria) this;
        }

        public Criteria andDemoNotIn(List<String> values) {
            addCriterion("demo not in", values, "demo");
            return (Criteria) this;
        }

        public Criteria andDemoBetween(String value1, String value2) {
            addCriterion("demo between", value1, value2, "demo");
            return (Criteria) this;
        }

        public Criteria andDemoNotBetween(String value1, String value2) {
            addCriterion("demo not between", value1, value2, "demo");
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