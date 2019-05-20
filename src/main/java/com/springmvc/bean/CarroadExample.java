package com.springmvc.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarroadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarroadExample() {
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

        public Criteria andRoadidIsNull() {
            addCriterion("roadID is null");
            return (Criteria) this;
        }

        public Criteria andRoadidIsNotNull() {
            addCriterion("roadID is not null");
            return (Criteria) this;
        }

        public Criteria andRoadidEqualTo(Integer value) {
            addCriterion("roadID =", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidNotEqualTo(Integer value) {
            addCriterion("roadID <>", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidGreaterThan(Integer value) {
            addCriterion("roadID >", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roadID >=", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidLessThan(Integer value) {
            addCriterion("roadID <", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidLessThanOrEqualTo(Integer value) {
            addCriterion("roadID <=", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidIn(List<Integer> values) {
            addCriterion("roadID in", values, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidNotIn(List<Integer> values) {
            addCriterion("roadID not in", values, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidBetween(Integer value1, Integer value2) {
            addCriterion("roadID between", value1, value2, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidNotBetween(Integer value1, Integer value2) {
            addCriterion("roadID not between", value1, value2, "roadid");
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

        public Criteria andStartcityIsNull() {
            addCriterion("startCity is null");
            return (Criteria) this;
        }

        public Criteria andStartcityIsNotNull() {
            addCriterion("startCity is not null");
            return (Criteria) this;
        }

        public Criteria andStartcityEqualTo(Integer value) {
            addCriterion("startCity =", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityNotEqualTo(Integer value) {
            addCriterion("startCity <>", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityGreaterThan(Integer value) {
            addCriterion("startCity >", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityGreaterThanOrEqualTo(Integer value) {
            addCriterion("startCity >=", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityLessThan(Integer value) {
            addCriterion("startCity <", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityLessThanOrEqualTo(Integer value) {
            addCriterion("startCity <=", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityIn(List<Integer> values) {
            addCriterion("startCity in", values, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityNotIn(List<Integer> values) {
            addCriterion("startCity not in", values, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityBetween(Integer value1, Integer value2) {
            addCriterion("startCity between", value1, value2, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityNotBetween(Integer value1, Integer value2) {
            addCriterion("startCity not between", value1, value2, "startcity");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndcityIsNull() {
            addCriterion("endCity is null");
            return (Criteria) this;
        }

        public Criteria andEndcityIsNotNull() {
            addCriterion("endCity is not null");
            return (Criteria) this;
        }

        public Criteria andEndcityEqualTo(Integer value) {
            addCriterion("endCity =", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotEqualTo(Integer value) {
            addCriterion("endCity <>", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityGreaterThan(Integer value) {
            addCriterion("endCity >", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityGreaterThanOrEqualTo(Integer value) {
            addCriterion("endCity >=", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityLessThan(Integer value) {
            addCriterion("endCity <", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityLessThanOrEqualTo(Integer value) {
            addCriterion("endCity <=", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityIn(List<Integer> values) {
            addCriterion("endCity in", values, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotIn(List<Integer> values) {
            addCriterion("endCity not in", values, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityBetween(Integer value1, Integer value2) {
            addCriterion("endCity between", value1, value2, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotBetween(Integer value1, Integer value2) {
            addCriterion("endCity not between", value1, value2, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
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