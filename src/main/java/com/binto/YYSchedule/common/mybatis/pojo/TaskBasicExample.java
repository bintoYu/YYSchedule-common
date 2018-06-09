package com.binto.YYSchedule.common.mybatis.pojo;

import java.util.ArrayList;
import java.util.List;

public class TaskBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskBasicExample() {
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

        public Criteria andTaskPriorityIsNull() {
            addCriterion("task_priority is null");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityIsNotNull() {
            addCriterion("task_priority is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityEqualTo(String value) {
            addCriterion("task_priority =", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityNotEqualTo(String value) {
            addCriterion("task_priority <>", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityGreaterThan(String value) {
            addCriterion("task_priority >", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("task_priority >=", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityLessThan(String value) {
            addCriterion("task_priority <", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityLessThanOrEqualTo(String value) {
            addCriterion("task_priority <=", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityLike(String value) {
            addCriterion("task_priority like", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityNotLike(String value) {
            addCriterion("task_priority not like", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityIn(List<String> values) {
            addCriterion("task_priority in", values, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityNotIn(List<String> values) {
            addCriterion("task_priority not in", values, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityBetween(String value1, String value2) {
            addCriterion("task_priority between", value1, value2, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityNotBetween(String value1, String value2) {
            addCriterion("task_priority not between", value1, value2, "taskPriority");
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

        public Criteria andTaskStatusIsNull() {
            addCriterion("task_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(String value) {
            addCriterion("task_status =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(String value) {
            addCriterion("task_status <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(String value) {
            addCriterion("task_status >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(String value) {
            addCriterion("task_status >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(String value) {
            addCriterion("task_status <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(String value) {
            addCriterion("task_status <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLike(String value) {
            addCriterion("task_status like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotLike(String value) {
            addCriterion("task_status not like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<String> values) {
            addCriterion("task_status in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<String> values) {
            addCriterion("task_status not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(String value1, String value2) {
            addCriterion("task_status between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(String value1, String value2) {
            addCriterion("task_status not between", value1, value2, "taskStatus");
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