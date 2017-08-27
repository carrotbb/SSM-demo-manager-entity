package com.fohow.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuartzLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuartzLogExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andExceTimeIsNull() {
            addCriterion("exce_time is null");
            return (Criteria) this;
        }

        public Criteria andExceTimeIsNotNull() {
            addCriterion("exce_time is not null");
            return (Criteria) this;
        }

        public Criteria andExceTimeEqualTo(Date value) {
            addCriterion("exce_time =", value, "exceTime");
            return (Criteria) this;
        }

        public Criteria andExceTimeNotEqualTo(Date value) {
            addCriterion("exce_time <>", value, "exceTime");
            return (Criteria) this;
        }

        public Criteria andExceTimeGreaterThan(Date value) {
            addCriterion("exce_time >", value, "exceTime");
            return (Criteria) this;
        }

        public Criteria andExceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exce_time >=", value, "exceTime");
            return (Criteria) this;
        }

        public Criteria andExceTimeLessThan(Date value) {
            addCriterion("exce_time <", value, "exceTime");
            return (Criteria) this;
        }

        public Criteria andExceTimeLessThanOrEqualTo(Date value) {
            addCriterion("exce_time <=", value, "exceTime");
            return (Criteria) this;
        }

        public Criteria andExceTimeIn(List<Date> values) {
            addCriterion("exce_time in", values, "exceTime");
            return (Criteria) this;
        }

        public Criteria andExceTimeNotIn(List<Date> values) {
            addCriterion("exce_time not in", values, "exceTime");
            return (Criteria) this;
        }

        public Criteria andExceTimeBetween(Date value1, Date value2) {
            addCriterion("exce_time between", value1, value2, "exceTime");
            return (Criteria) this;
        }

        public Criteria andExceTimeNotBetween(Date value1, Date value2) {
            addCriterion("exce_time not between", value1, value2, "exceTime");
            return (Criteria) this;
        }

        public Criteria andQuartzIdIsNull() {
            addCriterion("quartz_id is null");
            return (Criteria) this;
        }

        public Criteria andQuartzIdIsNotNull() {
            addCriterion("quartz_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuartzIdEqualTo(String value) {
            addCriterion("quartz_id =", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdNotEqualTo(String value) {
            addCriterion("quartz_id <>", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdGreaterThan(String value) {
            addCriterion("quartz_id >", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdGreaterThanOrEqualTo(String value) {
            addCriterion("quartz_id >=", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdLessThan(String value) {
            addCriterion("quartz_id <", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdLessThanOrEqualTo(String value) {
            addCriterion("quartz_id <=", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdLike(String value) {
            addCriterion("quartz_id like", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdNotLike(String value) {
            addCriterion("quartz_id not like", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdIn(List<String> values) {
            addCriterion("quartz_id in", values, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdNotIn(List<String> values) {
            addCriterion("quartz_id not in", values, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdBetween(String value1, String value2) {
            addCriterion("quartz_id between", value1, value2, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdNotBetween(String value1, String value2) {
            addCriterion("quartz_id not between", value1, value2, "quartzId");
            return (Criteria) this;
        }

        public Criteria andRunStatusIsNull() {
            addCriterion("run_status is null");
            return (Criteria) this;
        }

        public Criteria andRunStatusIsNotNull() {
            addCriterion("run_status is not null");
            return (Criteria) this;
        }

        public Criteria andRunStatusEqualTo(Integer value) {
            addCriterion("run_status =", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotEqualTo(Integer value) {
            addCriterion("run_status <>", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusGreaterThan(Integer value) {
            addCriterion("run_status >", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_status >=", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLessThan(Integer value) {
            addCriterion("run_status <", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLessThanOrEqualTo(Integer value) {
            addCriterion("run_status <=", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusIn(List<Integer> values) {
            addCriterion("run_status in", values, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotIn(List<Integer> values) {
            addCriterion("run_status not in", values, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusBetween(Integer value1, Integer value2) {
            addCriterion("run_status between", value1, value2, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("run_status not between", value1, value2, "runStatus");
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