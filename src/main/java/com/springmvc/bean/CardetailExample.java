package com.springmvc.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CardetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardetailExample() {
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

        public Criteria andDetailidIsNull() {
            addCriterion("detailID is null");
            return (Criteria) this;
        }

        public Criteria andDetailidIsNotNull() {
            addCriterion("detailID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailidEqualTo(String value) {
            addCriterion("detailID =", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotEqualTo(String value) {
            addCriterion("detailID <>", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThan(String value) {
            addCriterion("detailID >", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThanOrEqualTo(String value) {
            addCriterion("detailID >=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThan(String value) {
            addCriterion("detailID <", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThanOrEqualTo(String value) {
            addCriterion("detailID <=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLike(String value) {
            addCriterion("detailID like", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotLike(String value) {
            addCriterion("detailID not like", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidIn(List<String> values) {
            addCriterion("detailID in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotIn(List<String> values) {
            addCriterion("detailID not in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidBetween(String value1, String value2) {
            addCriterion("detailID between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotBetween(String value1, String value2) {
            addCriterion("detailID not between", value1, value2, "detailid");
            return (Criteria) this;
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

        public Criteria andStartaddrIsNull() {
            addCriterion("startAddr is null");
            return (Criteria) this;
        }

        public Criteria andStartaddrIsNotNull() {
            addCriterion("startAddr is not null");
            return (Criteria) this;
        }

        public Criteria andStartaddrEqualTo(String value) {
            addCriterion("startAddr =", value, "startaddr");
            return (Criteria) this;
        }

        public Criteria andStartaddrNotEqualTo(String value) {
            addCriterion("startAddr <>", value, "startaddr");
            return (Criteria) this;
        }

        public Criteria andStartaddrGreaterThan(String value) {
            addCriterion("startAddr >", value, "startaddr");
            return (Criteria) this;
        }

        public Criteria andStartaddrGreaterThanOrEqualTo(String value) {
            addCriterion("startAddr >=", value, "startaddr");
            return (Criteria) this;
        }

        public Criteria andStartaddrLessThan(String value) {
            addCriterion("startAddr <", value, "startaddr");
            return (Criteria) this;
        }

        public Criteria andStartaddrLessThanOrEqualTo(String value) {
            addCriterion("startAddr <=", value, "startaddr");
            return (Criteria) this;
        }

        public Criteria andStartaddrLike(String value) {
            addCriterion("startAddr like", value, "startaddr");
            return (Criteria) this;
        }

        public Criteria andStartaddrNotLike(String value) {
            addCriterion("startAddr not like", value, "startaddr");
            return (Criteria) this;
        }

        public Criteria andStartaddrIn(List<String> values) {
            addCriterion("startAddr in", values, "startaddr");
            return (Criteria) this;
        }

        public Criteria andStartaddrNotIn(List<String> values) {
            addCriterion("startAddr not in", values, "startaddr");
            return (Criteria) this;
        }

        public Criteria andStartaddrBetween(String value1, String value2) {
            addCriterion("startAddr between", value1, value2, "startaddr");
            return (Criteria) this;
        }

        public Criteria andStartaddrNotBetween(String value1, String value2) {
            addCriterion("startAddr not between", value1, value2, "startaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrIsNull() {
            addCriterion("endAddr is null");
            return (Criteria) this;
        }

        public Criteria andEndaddrIsNotNull() {
            addCriterion("endAddr is not null");
            return (Criteria) this;
        }

        public Criteria andEndaddrEqualTo(String value) {
            addCriterion("endAddr =", value, "endaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrNotEqualTo(String value) {
            addCriterion("endAddr <>", value, "endaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrGreaterThan(String value) {
            addCriterion("endAddr >", value, "endaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrGreaterThanOrEqualTo(String value) {
            addCriterion("endAddr >=", value, "endaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrLessThan(String value) {
            addCriterion("endAddr <", value, "endaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrLessThanOrEqualTo(String value) {
            addCriterion("endAddr <=", value, "endaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrLike(String value) {
            addCriterion("endAddr like", value, "endaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrNotLike(String value) {
            addCriterion("endAddr not like", value, "endaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrIn(List<String> values) {
            addCriterion("endAddr in", values, "endaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrNotIn(List<String> values) {
            addCriterion("endAddr not in", values, "endaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrBetween(String value1, String value2) {
            addCriterion("endAddr between", value1, value2, "endaddr");
            return (Criteria) this;
        }

        public Criteria andEndaddrNotBetween(String value1, String value2) {
            addCriterion("endAddr not between", value1, value2, "endaddr");
            return (Criteria) this;
        }

        public Criteria andSendcustidIsNull() {
            addCriterion("sendCustID is null");
            return (Criteria) this;
        }

        public Criteria andSendcustidIsNotNull() {
            addCriterion("sendCustID is not null");
            return (Criteria) this;
        }

        public Criteria andSendcustidEqualTo(Integer value) {
            addCriterion("sendCustID =", value, "sendcustid");
            return (Criteria) this;
        }

        public Criteria andSendcustidNotEqualTo(Integer value) {
            addCriterion("sendCustID <>", value, "sendcustid");
            return (Criteria) this;
        }

        public Criteria andSendcustidGreaterThan(Integer value) {
            addCriterion("sendCustID >", value, "sendcustid");
            return (Criteria) this;
        }

        public Criteria andSendcustidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendCustID >=", value, "sendcustid");
            return (Criteria) this;
        }

        public Criteria andSendcustidLessThan(Integer value) {
            addCriterion("sendCustID <", value, "sendcustid");
            return (Criteria) this;
        }

        public Criteria andSendcustidLessThanOrEqualTo(Integer value) {
            addCriterion("sendCustID <=", value, "sendcustid");
            return (Criteria) this;
        }

        public Criteria andSendcustidIn(List<Integer> values) {
            addCriterion("sendCustID in", values, "sendcustid");
            return (Criteria) this;
        }

        public Criteria andSendcustidNotIn(List<Integer> values) {
            addCriterion("sendCustID not in", values, "sendcustid");
            return (Criteria) this;
        }

        public Criteria andSendcustidBetween(Integer value1, Integer value2) {
            addCriterion("sendCustID between", value1, value2, "sendcustid");
            return (Criteria) this;
        }

        public Criteria andSendcustidNotBetween(Integer value1, Integer value2) {
            addCriterion("sendCustID not between", value1, value2, "sendcustid");
            return (Criteria) this;
        }

        public Criteria andRececustidIsNull() {
            addCriterion("receCustID is null");
            return (Criteria) this;
        }

        public Criteria andRececustidIsNotNull() {
            addCriterion("receCustID is not null");
            return (Criteria) this;
        }

        public Criteria andRececustidEqualTo(Integer value) {
            addCriterion("receCustID =", value, "rececustid");
            return (Criteria) this;
        }

        public Criteria andRececustidNotEqualTo(Integer value) {
            addCriterion("receCustID <>", value, "rececustid");
            return (Criteria) this;
        }

        public Criteria andRececustidGreaterThan(Integer value) {
            addCriterion("receCustID >", value, "rececustid");
            return (Criteria) this;
        }

        public Criteria andRececustidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receCustID >=", value, "rececustid");
            return (Criteria) this;
        }

        public Criteria andRececustidLessThan(Integer value) {
            addCriterion("receCustID <", value, "rececustid");
            return (Criteria) this;
        }

        public Criteria andRececustidLessThanOrEqualTo(Integer value) {
            addCriterion("receCustID <=", value, "rececustid");
            return (Criteria) this;
        }

        public Criteria andRececustidIn(List<Integer> values) {
            addCriterion("receCustID in", values, "rececustid");
            return (Criteria) this;
        }

        public Criteria andRececustidNotIn(List<Integer> values) {
            addCriterion("receCustID not in", values, "rececustid");
            return (Criteria) this;
        }

        public Criteria andRececustidBetween(Integer value1, Integer value2) {
            addCriterion("receCustID between", value1, value2, "rececustid");
            return (Criteria) this;
        }

        public Criteria andRececustidNotBetween(Integer value1, Integer value2) {
            addCriterion("receCustID not between", value1, value2, "rececustid");
            return (Criteria) this;
        }

        public Criteria andRecepersonIsNull() {
            addCriterion("recePerson is null");
            return (Criteria) this;
        }

        public Criteria andRecepersonIsNotNull() {
            addCriterion("recePerson is not null");
            return (Criteria) this;
        }

        public Criteria andRecepersonEqualTo(String value) {
            addCriterion("recePerson =", value, "receperson");
            return (Criteria) this;
        }

        public Criteria andRecepersonNotEqualTo(String value) {
            addCriterion("recePerson <>", value, "receperson");
            return (Criteria) this;
        }

        public Criteria andRecepersonGreaterThan(String value) {
            addCriterion("recePerson >", value, "receperson");
            return (Criteria) this;
        }

        public Criteria andRecepersonGreaterThanOrEqualTo(String value) {
            addCriterion("recePerson >=", value, "receperson");
            return (Criteria) this;
        }

        public Criteria andRecepersonLessThan(String value) {
            addCriterion("recePerson <", value, "receperson");
            return (Criteria) this;
        }

        public Criteria andRecepersonLessThanOrEqualTo(String value) {
            addCriterion("recePerson <=", value, "receperson");
            return (Criteria) this;
        }

        public Criteria andRecepersonLike(String value) {
            addCriterion("recePerson like", value, "receperson");
            return (Criteria) this;
        }

        public Criteria andRecepersonNotLike(String value) {
            addCriterion("recePerson not like", value, "receperson");
            return (Criteria) this;
        }

        public Criteria andRecepersonIn(List<String> values) {
            addCriterion("recePerson in", values, "receperson");
            return (Criteria) this;
        }

        public Criteria andRecepersonNotIn(List<String> values) {
            addCriterion("recePerson not in", values, "receperson");
            return (Criteria) this;
        }

        public Criteria andRecepersonBetween(String value1, String value2) {
            addCriterion("recePerson between", value1, value2, "receperson");
            return (Criteria) this;
        }

        public Criteria andRecepersonNotBetween(String value1, String value2) {
            addCriterion("recePerson not between", value1, value2, "receperson");
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

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("unitName is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("unitName is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("unitName =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("unitName <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("unitName >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("unitName >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("unitName <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("unitName <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("unitName like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("unitName not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("unitName in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("unitName not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("unitName between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("unitName not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeIsNull() {
            addCriterion("insuranceFee is null");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeIsNotNull() {
            addCriterion("insuranceFee is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeEqualTo(BigDecimal value) {
            addCriterion("insuranceFee =", value, "insurancefee");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeNotEqualTo(BigDecimal value) {
            addCriterion("insuranceFee <>", value, "insurancefee");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeGreaterThan(BigDecimal value) {
            addCriterion("insuranceFee >", value, "insurancefee");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insuranceFee >=", value, "insurancefee");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeLessThan(BigDecimal value) {
            addCriterion("insuranceFee <", value, "insurancefee");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insuranceFee <=", value, "insurancefee");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeIn(List<BigDecimal> values) {
            addCriterion("insuranceFee in", values, "insurancefee");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeNotIn(List<BigDecimal> values) {
            addCriterion("insuranceFee not in", values, "insurancefee");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insuranceFee between", value1, value2, "insurancefee");
            return (Criteria) this;
        }

        public Criteria andInsurancefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insuranceFee not between", value1, value2, "insurancefee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIsNull() {
            addCriterion("otherFee is null");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIsNotNull() {
            addCriterion("otherFee is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfeeEqualTo(BigDecimal value) {
            addCriterion("otherFee =", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotEqualTo(BigDecimal value) {
            addCriterion("otherFee <>", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeGreaterThan(BigDecimal value) {
            addCriterion("otherFee >", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("otherFee >=", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeLessThan(BigDecimal value) {
            addCriterion("otherFee <", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("otherFee <=", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIn(List<BigDecimal> values) {
            addCriterion("otherFee in", values, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotIn(List<BigDecimal> values) {
            addCriterion("otherFee not in", values, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("otherFee between", value1, value2, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("otherFee not between", value1, value2, "otherfee");
            return (Criteria) this;
        }

        public Criteria andSendgoodsIsNull() {
            addCriterion("sendGoods is null");
            return (Criteria) this;
        }

        public Criteria andSendgoodsIsNotNull() {
            addCriterion("sendGoods is not null");
            return (Criteria) this;
        }

        public Criteria andSendgoodsEqualTo(String value) {
            addCriterion("sendGoods =", value, "sendgoods");
            return (Criteria) this;
        }

        public Criteria andSendgoodsNotEqualTo(String value) {
            addCriterion("sendGoods <>", value, "sendgoods");
            return (Criteria) this;
        }

        public Criteria andSendgoodsGreaterThan(String value) {
            addCriterion("sendGoods >", value, "sendgoods");
            return (Criteria) this;
        }

        public Criteria andSendgoodsGreaterThanOrEqualTo(String value) {
            addCriterion("sendGoods >=", value, "sendgoods");
            return (Criteria) this;
        }

        public Criteria andSendgoodsLessThan(String value) {
            addCriterion("sendGoods <", value, "sendgoods");
            return (Criteria) this;
        }

        public Criteria andSendgoodsLessThanOrEqualTo(String value) {
            addCriterion("sendGoods <=", value, "sendgoods");
            return (Criteria) this;
        }

        public Criteria andSendgoodsLike(String value) {
            addCriterion("sendGoods like", value, "sendgoods");
            return (Criteria) this;
        }

        public Criteria andSendgoodsNotLike(String value) {
            addCriterion("sendGoods not like", value, "sendgoods");
            return (Criteria) this;
        }

        public Criteria andSendgoodsIn(List<String> values) {
            addCriterion("sendGoods in", values, "sendgoods");
            return (Criteria) this;
        }

        public Criteria andSendgoodsNotIn(List<String> values) {
            addCriterion("sendGoods not in", values, "sendgoods");
            return (Criteria) this;
        }

        public Criteria andSendgoodsBetween(String value1, String value2) {
            addCriterion("sendGoods between", value1, value2, "sendgoods");
            return (Criteria) this;
        }

        public Criteria andSendgoodsNotBetween(String value1, String value2) {
            addCriterion("sendGoods not between", value1, value2, "sendgoods");
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsIsNull() {
            addCriterion("paidStuats is null");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsIsNotNull() {
            addCriterion("paidStuats is not null");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsEqualTo(String value) {
            addCriterion("paidStuats =", value, "paidstuats");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsNotEqualTo(String value) {
            addCriterion("paidStuats <>", value, "paidstuats");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsGreaterThan(String value) {
            addCriterion("paidStuats >", value, "paidstuats");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsGreaterThanOrEqualTo(String value) {
            addCriterion("paidStuats >=", value, "paidstuats");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsLessThan(String value) {
            addCriterion("paidStuats <", value, "paidstuats");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsLessThanOrEqualTo(String value) {
            addCriterion("paidStuats <=", value, "paidstuats");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsLike(String value) {
            addCriterion("paidStuats like", value, "paidstuats");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsNotLike(String value) {
            addCriterion("paidStuats not like", value, "paidstuats");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsIn(List<String> values) {
            addCriterion("paidStuats in", values, "paidstuats");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsNotIn(List<String> values) {
            addCriterion("paidStuats not in", values, "paidstuats");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsBetween(String value1, String value2) {
            addCriterion("paidStuats between", value1, value2, "paidstuats");
            return (Criteria) this;
        }

        public Criteria andPaidstuatsNotBetween(String value1, String value2) {
            addCriterion("paidStuats not between", value1, value2, "paidstuats");
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