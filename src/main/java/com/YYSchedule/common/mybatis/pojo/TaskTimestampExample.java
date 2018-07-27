package com.YYSchedule.common.mybatis.pojo;

import java.util.ArrayList;
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
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

        public Criteria andLoadedTimeEqualTo(Long value) {
            addCriterion("loaded_time =", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeNotEqualTo(Long value) {
            addCriterion("loaded_time <>", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeGreaterThan(Long value) {
            addCriterion("loaded_time >", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("loaded_time >=", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeLessThan(Long value) {
            addCriterion("loaded_time <", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeLessThanOrEqualTo(Long value) {
            addCriterion("loaded_time <=", value, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeIn(List<Long> values) {
            addCriterion("loaded_time in", values, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeNotIn(List<Long> values) {
            addCriterion("loaded_time not in", values, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeBetween(Long value1, Long value2) {
            addCriterion("loaded_time between", value1, value2, "loadedTime");
            return (Criteria) this;
        }

        public Criteria andLoadedTimeNotBetween(Long value1, Long value2) {
            addCriterion("loaded_time not between", value1, value2, "loadedTime");
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

        public Criteria andIssuedTimeEqualTo(Long value) {
            addCriterion("issued_time =", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeNotEqualTo(Long value) {
            addCriterion("issued_time <>", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeGreaterThan(Long value) {
            addCriterion("issued_time >", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("issued_time >=", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeLessThan(Long value) {
            addCriterion("issued_time <", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeLessThanOrEqualTo(Long value) {
            addCriterion("issued_time <=", value, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeIn(List<Long> values) {
            addCriterion("issued_time in", values, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeNotIn(List<Long> values) {
            addCriterion("issued_time not in", values, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeBetween(Long value1, Long value2) {
            addCriterion("issued_time between", value1, value2, "issuedTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTimeNotBetween(Long value1, Long value2) {
            addCriterion("issued_time not between", value1, value2, "issuedTime");
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

        public Criteria andStartedTimeEqualTo(Long value) {
            addCriterion("started_time =", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeNotEqualTo(Long value) {
            addCriterion("started_time <>", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeGreaterThan(Long value) {
            addCriterion("started_time >", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("started_time >=", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeLessThan(Long value) {
            addCriterion("started_time <", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeLessThanOrEqualTo(Long value) {
            addCriterion("started_time <=", value, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeIn(List<Long> values) {
            addCriterion("started_time in", values, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeNotIn(List<Long> values) {
            addCriterion("started_time not in", values, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeBetween(Long value1, Long value2) {
            addCriterion("started_time between", value1, value2, "startedTime");
            return (Criteria) this;
        }

        public Criteria andStartedTimeNotBetween(Long value1, Long value2) {
            addCriterion("started_time not between", value1, value2, "startedTime");
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

        public Criteria andFinishedTimeEqualTo(Long value) {
            addCriterion("finished_time =", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotEqualTo(Long value) {
            addCriterion("finished_time <>", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeGreaterThan(Long value) {
            addCriterion("finished_time >", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("finished_time >=", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLessThan(Long value) {
            addCriterion("finished_time <", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLessThanOrEqualTo(Long value) {
            addCriterion("finished_time <=", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIn(List<Long> values) {
            addCriterion("finished_time in", values, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotIn(List<Long> values) {
            addCriterion("finished_time not in", values, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeBetween(Long value1, Long value2) {
            addCriterion("finished_time between", value1, value2, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotBetween(Long value1, Long value2) {
            addCriterion("finished_time not between", value1, value2, "finishedTime");
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