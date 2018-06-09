package com.binto.YYSchedule.common.mybatis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TaskTimestampExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskTimestampExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseIsNull() {
            addCriterion("task_phase is null");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseIsNotNull() {
            addCriterion("task_phase is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseEqualTo(String value) {
            addCriterion("task_phase =", value, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseNotEqualTo(String value) {
            addCriterion("task_phase <>", value, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseGreaterThan(String value) {
            addCriterion("task_phase >", value, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseGreaterThanOrEqualTo(String value) {
            addCriterion("task_phase >=", value, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseLessThan(String value) {
            addCriterion("task_phase <", value, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseLessThanOrEqualTo(String value) {
            addCriterion("task_phase <=", value, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseLike(String value) {
            addCriterion("task_phase like", value, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseNotLike(String value) {
            addCriterion("task_phase not like", value, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseIn(List<String> values) {
            addCriterion("task_phase in", values, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseNotIn(List<String> values) {
            addCriterion("task_phase not in", values, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseBetween(String value1, String value2) {
            addCriterion("task_phase between", value1, value2, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andTaskPhaseNotBetween(String value1, String value2) {
            addCriterion("task_phase not between", value1, value2, "taskPhase");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeIsNull() {
            addCriterion("loaded_time is null");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeIsNotNull() {
            addCriterion("loaded_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("loaded_time =", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("loaded_time <>", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("loaded_time >", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loaded_time >=", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeLessThan(Date value) {
            addCriterionForJDBCDate("loaded_time <", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loaded_time <=", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("loaded_time in", values, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("loaded_time not in", values, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loaded_time between", value1, value2, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loaded_time not between", value1, value2, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeIsNull() {
            addCriterion("issued_time is null");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeIsNotNull() {
            addCriterion("issued_time is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("issued_time =", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("issued_time <>", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("issued_time >", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("issued_time >=", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeLessThan(Date value) {
            addCriterionForJDBCDate("issued_time <", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("issued_time <=", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("issued_time in", values, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("issued_time not in", values, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("issued_time between", value1, value2, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("issued_time not between", value1, value2, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeIsNull() {
            addCriterion("started_time is null");
            return (Criteria) this;
        }

        public Criteria andStartedTimeIsNotNull() {
            addCriterion("started_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("started_time =", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("started_time <>", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("started_time >", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("started_time >=", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeLessThan(Date value) {
            addCriterionForJDBCDate("started_time <", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("started_time <=", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("started_time in", values, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("started_time not in", values, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("started_time between", value1, value2, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("started_time not between", value1, value2, "startedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIsNull() {
            addCriterion("finished_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIsNotNull() {
            addCriterion("finished_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("finished_time =", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("finished_time <>", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("finished_time >", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("finished_time >=", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLessThan(Date value) {
            addCriterionForJDBCDate("finished_time <", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("finished_time <=", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("finished_time in", values, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("finished_time not in", values, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("finished_time between", value1, value2, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("finished_time not between", value1, value2, "finishedTime");
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