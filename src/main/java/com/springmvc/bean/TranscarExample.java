package com.springmvc.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranscarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TranscarExample() {
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

        public Criteria andTransidIsNull() {
            addCriterion("transID is null");
            return (Criteria) this;
        }

        public Criteria andTransidIsNotNull() {
            addCriterion("transID is not null");
            return (Criteria) this;
        }

        public Criteria andTransidEqualTo(Integer value) {
            addCriterion("transID =", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotEqualTo(Integer value) {
            addCriterion("transID <>", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidGreaterThan(Integer value) {
            addCriterion("transID >", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidGreaterThanOrEqualTo(Integer value) {
            addCriterion("transID >=", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidLessThan(Integer value) {
            addCriterion("transID <", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidLessThanOrEqualTo(Integer value) {
            addCriterion("transID <=", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidIn(List<Integer> values) {
            addCriterion("transID in", values, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotIn(List<Integer> values) {
            addCriterion("transID not in", values, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidBetween(Integer value1, Integer value2) {
            addCriterion("transID between", value1, value2, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotBetween(Integer value1, Integer value2) {
            addCriterion("transID not between", value1, value2, "transid");
            return (Criteria) this;
        }

        public Criteria andCaridIsNull() {
            addCriterion("carID is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carID is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Integer value) {
            addCriterion("carID =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Integer value) {
            addCriterion("carID <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Integer value) {
            addCriterion("carID >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("carID >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Integer value) {
            addCriterion("carID <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Integer value) {
            addCriterion("carID <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Integer> values) {
            addCriterion("carID in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Integer> values) {
            addCriterion("carID not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Integer value1, Integer value2) {
            addCriterion("carID between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Integer value1, Integer value2) {
            addCriterion("carID not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andGcountIsNull() {
            addCriterion("gcount is null");
            return (Criteria) this;
        }

        public Criteria andGcountIsNotNull() {
            addCriterion("gcount is not null");
            return (Criteria) this;
        }

        public Criteria andGcountEqualTo(BigDecimal value) {
            addCriterion("gcount =", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountNotEqualTo(BigDecimal value) {
            addCriterion("gcount <>", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountGreaterThan(BigDecimal value) {
            addCriterion("gcount >", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gcount >=", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountLessThan(BigDecimal value) {
            addCriterion("gcount <", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gcount <=", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountIn(List<BigDecimal> values) {
            addCriterion("gcount in", values, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountNotIn(List<BigDecimal> values) {
            addCriterion("gcount not in", values, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gcount between", value1, value2, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gcount not between", value1, value2, "gcount");
            return (Criteria) this;
        }

        public Criteria andSendcityIsNull() {
            addCriterion("sendCity is null");
            return (Criteria) this;
        }

        public Criteria andSendcityIsNotNull() {
            addCriterion("sendCity is not null");
            return (Criteria) this;
        }

        public Criteria andSendcityEqualTo(Integer value) {
            addCriterion("sendCity =", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityNotEqualTo(Integer value) {
            addCriterion("sendCity <>", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityGreaterThan(Integer value) {
            addCriterion("sendCity >", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendCity >=", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityLessThan(Integer value) {
            addCriterion("sendCity <", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityLessThanOrEqualTo(Integer value) {
            addCriterion("sendCity <=", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityIn(List<Integer> values) {
            addCriterion("sendCity in", values, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityNotIn(List<Integer> values) {
            addCriterion("sendCity not in", values, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityBetween(Integer value1, Integer value2) {
            addCriterion("sendCity between", value1, value2, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityNotBetween(Integer value1, Integer value2) {
            addCriterion("sendCity not between", value1, value2, "sendcity");
            return (Criteria) this;
        }

        public Criteria andRececityIsNull() {
            addCriterion("receCity is null");
            return (Criteria) this;
        }

        public Criteria andRececityIsNotNull() {
            addCriterion("receCity is not null");
            return (Criteria) this;
        }

        public Criteria andRececityEqualTo(Integer value) {
            addCriterion("receCity =", value, "rececity");
            return (Criteria) this;
        }

        public Criteria andRececityNotEqualTo(Integer value) {
            addCriterion("receCity <>", value, "rececity");
            return (Criteria) this;
        }

        public Criteria andRececityGreaterThan(Integer value) {
            addCriterion("receCity >", value, "rececity");
            return (Criteria) this;
        }

        public Criteria andRececityGreaterThanOrEqualTo(Integer value) {
            addCriterion("receCity >=", value, "rececity");
            return (Criteria) this;
        }

        public Criteria andRececityLessThan(Integer value) {
            addCriterion("receCity <", value, "rececity");
            return (Criteria) this;
        }

        public Criteria andRececityLessThanOrEqualTo(Integer value) {
            addCriterion("receCity <=", value, "rececity");
            return (Criteria) this;
        }

        public Criteria andRececityIn(List<Integer> values) {
            addCriterion("receCity in", values, "rececity");
            return (Criteria) this;
        }

        public Criteria andRececityNotIn(List<Integer> values) {
            addCriterion("receCity not in", values, "rececity");
            return (Criteria) this;
        }

        public Criteria andRececityBetween(Integer value1, Integer value2) {
            addCriterion("receCity between", value1, value2, "rececity");
            return (Criteria) this;
        }

        public Criteria andRececityNotBetween(Integer value1, Integer value2) {
            addCriterion("receCity not between", value1, value2, "rececity");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("driver is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("driver is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("driver =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("driver <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("driver >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("driver >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("driver <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("driver <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("driver like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("driver not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("driver in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("driver not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("driver between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("driver not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDrivertelIsNull() {
            addCriterion("driverTel is null");
            return (Criteria) this;
        }

        public Criteria andDrivertelIsNotNull() {
            addCriterion("driverTel is not null");
            return (Criteria) this;
        }

        public Criteria andDrivertelEqualTo(String value) {
            addCriterion("driverTel =", value, "drivertel");
            return (Criteria) this;
        }

        public Criteria andDrivertelNotEqualTo(String value) {
            addCriterion("driverTel <>", value, "drivertel");
            return (Criteria) this;
        }

        public Criteria andDrivertelGreaterThan(String value) {
            addCriterion("driverTel >", value, "drivertel");
            return (Criteria) this;
        }

        public Criteria andDrivertelGreaterThanOrEqualTo(String value) {
            addCriterion("driverTel >=", value, "drivertel");
            return (Criteria) this;
        }

        public Criteria andDrivertelLessThan(String value) {
            addCriterion("driverTel <", value, "drivertel");
            return (Criteria) this;
        }

        public Criteria andDrivertelLessThanOrEqualTo(String value) {
            addCriterion("driverTel <=", value, "drivertel");
            return (Criteria) this;
        }

        public Criteria andDrivertelLike(String value) {
            addCriterion("driverTel like", value, "drivertel");
            return (Criteria) this;
        }

        public Criteria andDrivertelNotLike(String value) {
            addCriterion("driverTel not like", value, "drivertel");
            return (Criteria) this;
        }

        public Criteria andDrivertelIn(List<String> values) {
            addCriterion("driverTel in", values, "drivertel");
            return (Criteria) this;
        }

        public Criteria andDrivertelNotIn(List<String> values) {
            addCriterion("driverTel not in", values, "drivertel");
            return (Criteria) this;
        }

        public Criteria andDrivertelBetween(String value1, String value2) {
            addCriterion("driverTel between", value1, value2, "drivertel");
            return (Criteria) this;
        }

        public Criteria andDrivertelNotBetween(String value1, String value2) {
            addCriterion("driverTel not between", value1, value2, "drivertel");
            return (Criteria) this;
        }

        public Criteria andMasterIsNull() {
            addCriterion("master is null");
            return (Criteria) this;
        }

        public Criteria andMasterIsNotNull() {
            addCriterion("master is not null");
            return (Criteria) this;
        }

        public Criteria andMasterEqualTo(String value) {
            addCriterion("master =", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotEqualTo(String value) {
            addCriterion("master <>", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterGreaterThan(String value) {
            addCriterion("master >", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterGreaterThanOrEqualTo(String value) {
            addCriterion("master >=", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLessThan(String value) {
            addCriterion("master <", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLessThanOrEqualTo(String value) {
            addCriterion("master <=", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLike(String value) {
            addCriterion("master like", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotLike(String value) {
            addCriterion("master not like", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterIn(List<String> values) {
            addCriterion("master in", values, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotIn(List<String> values) {
            addCriterion("master not in", values, "master");
            return (Criteria) this;
        }

        public Criteria andMasterBetween(String value1, String value2) {
            addCriterion("master between", value1, value2, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotBetween(String value1, String value2) {
            addCriterion("master not between", value1, value2, "master");
            return (Criteria) this;
        }

        public Criteria andMastertelIsNull() {
            addCriterion("masterTel is null");
            return (Criteria) this;
        }

        public Criteria andMastertelIsNotNull() {
            addCriterion("masterTel is not null");
            return (Criteria) this;
        }

        public Criteria andMastertelEqualTo(String value) {
            addCriterion("masterTel =", value, "mastertel");
            return (Criteria) this;
        }

        public Criteria andMastertelNotEqualTo(String value) {
            addCriterion("masterTel <>", value, "mastertel");
            return (Criteria) this;
        }

        public Criteria andMastertelGreaterThan(String value) {
            addCriterion("masterTel >", value, "mastertel");
            return (Criteria) this;
        }

        public Criteria andMastertelGreaterThanOrEqualTo(String value) {
            addCriterion("masterTel >=", value, "mastertel");
            return (Criteria) this;
        }

        public Criteria andMastertelLessThan(String value) {
            addCriterion("masterTel <", value, "mastertel");
            return (Criteria) this;
        }

        public Criteria andMastertelLessThanOrEqualTo(String value) {
            addCriterion("masterTel <=", value, "mastertel");
            return (Criteria) this;
        }

        public Criteria andMastertelLike(String value) {
            addCriterion("masterTel like", value, "mastertel");
            return (Criteria) this;
        }

        public Criteria andMastertelNotLike(String value) {
            addCriterion("masterTel not like", value, "mastertel");
            return (Criteria) this;
        }

        public Criteria andMastertelIn(List<String> values) {
            addCriterion("masterTel in", values, "mastertel");
            return (Criteria) this;
        }

        public Criteria andMastertelNotIn(List<String> values) {
            addCriterion("masterTel not in", values, "mastertel");
            return (Criteria) this;
        }

        public Criteria andMastertelBetween(String value1, String value2) {
            addCriterion("masterTel between", value1, value2, "mastertel");
            return (Criteria) this;
        }

        public Criteria andMastertelNotBetween(String value1, String value2) {
            addCriterion("masterTel not between", value1, value2, "mastertel");
            return (Criteria) this;
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

        public Criteria andSendtimeIsNull() {
            addCriterion("sendTime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendTime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendTime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendTime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendTime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendTime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendTime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendTime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendTime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendTime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendTime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendfeeIsNull() {
            addCriterion("sendFee is null");
            return (Criteria) this;
        }

        public Criteria andSendfeeIsNotNull() {
            addCriterion("sendFee is not null");
            return (Criteria) this;
        }

        public Criteria andSendfeeEqualTo(BigDecimal value) {
            addCriterion("sendFee =", value, "sendfee");
            return (Criteria) this;
        }

        public Criteria andSendfeeNotEqualTo(BigDecimal value) {
            addCriterion("sendFee <>", value, "sendfee");
            return (Criteria) this;
        }

        public Criteria andSendfeeGreaterThan(BigDecimal value) {
            addCriterion("sendFee >", value, "sendfee");
            return (Criteria) this;
        }

        public Criteria andSendfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sendFee >=", value, "sendfee");
            return (Criteria) this;
        }

        public Criteria andSendfeeLessThan(BigDecimal value) {
            addCriterion("sendFee <", value, "sendfee");
            return (Criteria) this;
        }

        public Criteria andSendfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sendFee <=", value, "sendfee");
            return (Criteria) this;
        }

        public Criteria andSendfeeIn(List<BigDecimal> values) {
            addCriterion("sendFee in", values, "sendfee");
            return (Criteria) this;
        }

        public Criteria andSendfeeNotIn(List<BigDecimal> values) {
            addCriterion("sendFee not in", values, "sendfee");
            return (Criteria) this;
        }

        public Criteria andSendfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sendFee between", value1, value2, "sendfee");
            return (Criteria) this;
        }

        public Criteria andSendfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sendFee not between", value1, value2, "sendfee");
            return (Criteria) this;
        }

        public Criteria andCarfeeIsNull() {
            addCriterion("carFee is null");
            return (Criteria) this;
        }

        public Criteria andCarfeeIsNotNull() {
            addCriterion("carFee is not null");
            return (Criteria) this;
        }

        public Criteria andCarfeeEqualTo(BigDecimal value) {
            addCriterion("carFee =", value, "carfee");
            return (Criteria) this;
        }

        public Criteria andCarfeeNotEqualTo(BigDecimal value) {
            addCriterion("carFee <>", value, "carfee");
            return (Criteria) this;
        }

        public Criteria andCarfeeGreaterThan(BigDecimal value) {
            addCriterion("carFee >", value, "carfee");
            return (Criteria) this;
        }

        public Criteria andCarfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("carFee >=", value, "carfee");
            return (Criteria) this;
        }

        public Criteria andCarfeeLessThan(BigDecimal value) {
            addCriterion("carFee <", value, "carfee");
            return (Criteria) this;
        }

        public Criteria andCarfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("carFee <=", value, "carfee");
            return (Criteria) this;
        }

        public Criteria andCarfeeIn(List<BigDecimal> values) {
            addCriterion("carFee in", values, "carfee");
            return (Criteria) this;
        }

        public Criteria andCarfeeNotIn(List<BigDecimal> values) {
            addCriterion("carFee not in", values, "carfee");
            return (Criteria) this;
        }

        public Criteria andCarfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("carFee between", value1, value2, "carfee");
            return (Criteria) this;
        }

        public Criteria andCarfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("carFee not between", value1, value2, "carfee");
            return (Criteria) this;
        }

        public Criteria andCarstatusIsNull() {
            addCriterion("carStatus is null");
            return (Criteria) this;
        }

        public Criteria andCarstatusIsNotNull() {
            addCriterion("carStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCarstatusEqualTo(String value) {
            addCriterion("carStatus =", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusNotEqualTo(String value) {
            addCriterion("carStatus <>", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusGreaterThan(String value) {
            addCriterion("carStatus >", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusGreaterThanOrEqualTo(String value) {
            addCriterion("carStatus >=", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusLessThan(String value) {
            addCriterion("carStatus <", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusLessThanOrEqualTo(String value) {
            addCriterion("carStatus <=", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusLike(String value) {
            addCriterion("carStatus like", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusNotLike(String value) {
            addCriterion("carStatus not like", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusIn(List<String> values) {
            addCriterion("carStatus in", values, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusNotIn(List<String> values) {
            addCriterion("carStatus not in", values, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusBetween(String value1, String value2) {
            addCriterion("carStatus between", value1, value2, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusNotBetween(String value1, String value2) {
            addCriterion("carStatus not between", value1, value2, "carstatus");
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