package com.springmvc.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomernameIsNull() {
            addCriterion("customerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andContactnameIsNull() {
            addCriterion("contactName is null");
            return (Criteria) this;
        }

        public Criteria andContactnameIsNotNull() {
            addCriterion("contactName is not null");
            return (Criteria) this;
        }

        public Criteria andContactnameEqualTo(String value) {
            addCriterion("contactName =", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotEqualTo(String value) {
            addCriterion("contactName <>", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameGreaterThan(String value) {
            addCriterion("contactName >", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameGreaterThanOrEqualTo(String value) {
            addCriterion("contactName >=", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLessThan(String value) {
            addCriterion("contactName <", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLessThanOrEqualTo(String value) {
            addCriterion("contactName <=", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLike(String value) {
            addCriterion("contactName like", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotLike(String value) {
            addCriterion("contactName not like", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameIn(List<String> values) {
            addCriterion("contactName in", values, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotIn(List<String> values) {
            addCriterion("contactName not in", values, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameBetween(String value1, String value2) {
            addCriterion("contactName between", value1, value2, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotBetween(String value1, String value2) {
            addCriterion("contactName not between", value1, value2, "contactname");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
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

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaID is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("areaID =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("areaID <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("areaID >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("areaID >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("areaID <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("areaID <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("areaID in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("areaID not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("areaID between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("areaID not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidIsNull() {
            addCriterion("customerTypeID is null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidIsNotNull() {
            addCriterion("customerTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidEqualTo(Integer value) {
            addCriterion("customerTypeID =", value, "customertypeid");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidNotEqualTo(Integer value) {
            addCriterion("customerTypeID <>", value, "customertypeid");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidGreaterThan(Integer value) {
            addCriterion("customerTypeID >", value, "customertypeid");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerTypeID >=", value, "customertypeid");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidLessThan(Integer value) {
            addCriterion("customerTypeID <", value, "customertypeid");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidLessThanOrEqualTo(Integer value) {
            addCriterion("customerTypeID <=", value, "customertypeid");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidIn(List<Integer> values) {
            addCriterion("customerTypeID in", values, "customertypeid");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidNotIn(List<Integer> values) {
            addCriterion("customerTypeID not in", values, "customertypeid");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidBetween(Integer value1, Integer value2) {
            addCriterion("customerTypeID between", value1, value2, "customertypeid");
            return (Criteria) this;
        }

        public Criteria andCustomertypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("customerTypeID not between", value1, value2, "customertypeid");
            return (Criteria) this;
        }

        public Criteria andFactmoneyIsNull() {
            addCriterion("factMoney is null");
            return (Criteria) this;
        }

        public Criteria andFactmoneyIsNotNull() {
            addCriterion("factMoney is not null");
            return (Criteria) this;
        }

        public Criteria andFactmoneyEqualTo(BigDecimal value) {
            addCriterion("factMoney =", value, "factmoney");
            return (Criteria) this;
        }

        public Criteria andFactmoneyNotEqualTo(BigDecimal value) {
            addCriterion("factMoney <>", value, "factmoney");
            return (Criteria) this;
        }

        public Criteria andFactmoneyGreaterThan(BigDecimal value) {
            addCriterion("factMoney >", value, "factmoney");
            return (Criteria) this;
        }

        public Criteria andFactmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("factMoney >=", value, "factmoney");
            return (Criteria) this;
        }

        public Criteria andFactmoneyLessThan(BigDecimal value) {
            addCriterion("factMoney <", value, "factmoney");
            return (Criteria) this;
        }

        public Criteria andFactmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("factMoney <=", value, "factmoney");
            return (Criteria) this;
        }

        public Criteria andFactmoneyIn(List<BigDecimal> values) {
            addCriterion("factMoney in", values, "factmoney");
            return (Criteria) this;
        }

        public Criteria andFactmoneyNotIn(List<BigDecimal> values) {
            addCriterion("factMoney not in", values, "factmoney");
            return (Criteria) this;
        }

        public Criteria andFactmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("factMoney between", value1, value2, "factmoney");
            return (Criteria) this;
        }

        public Criteria andFactmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("factMoney not between", value1, value2, "factmoney");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyIsNull() {
            addCriterion("paidMoney is null");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyIsNotNull() {
            addCriterion("paidMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyEqualTo(BigDecimal value) {
            addCriterion("paidMoney =", value, "paidmoney");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyNotEqualTo(BigDecimal value) {
            addCriterion("paidMoney <>", value, "paidmoney");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyGreaterThan(BigDecimal value) {
            addCriterion("paidMoney >", value, "paidmoney");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paidMoney >=", value, "paidmoney");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyLessThan(BigDecimal value) {
            addCriterion("paidMoney <", value, "paidmoney");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paidMoney <=", value, "paidmoney");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyIn(List<BigDecimal> values) {
            addCriterion("paidMoney in", values, "paidmoney");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyNotIn(List<BigDecimal> values) {
            addCriterion("paidMoney not in", values, "paidmoney");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paidMoney between", value1, value2, "paidmoney");
            return (Criteria) this;
        }

        public Criteria andPaidmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paidMoney not between", value1, value2, "paidmoney");
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