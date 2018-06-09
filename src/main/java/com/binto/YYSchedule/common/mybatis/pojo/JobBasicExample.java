package com.binto.YYSchedule.common.mybatis.pojo;

import java.util.ArrayList;
import java.util.List;

public class JobBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobBasicExample() {
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

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeIsNull() {
            addCriterion("job_distribution_mode is null");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeIsNotNull() {
            addCriterion("job_distribution_mode is not null");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeEqualTo(String value) {
            addCriterion("job_distribution_mode =", value, "jobDistributionMode");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeNotEqualTo(String value) {
            addCriterion("job_distribution_mode <>", value, "jobDistributionMode");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeGreaterThan(String value) {
            addCriterion("job_distribution_mode >", value, "jobDistributionMode");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeGreaterThanOrEqualTo(String value) {
            addCriterion("job_distribution_mode >=", value, "jobDistributionMode");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeLessThan(String value) {
            addCriterion("job_distribution_mode <", value, "jobDistributionMode");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeLessThanOrEqualTo(String value) {
            addCriterion("job_distribution_mode <=", value, "jobDistributionMode");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeLike(String value) {
            addCriterion("job_distribution_mode like", value, "jobDistributionMode");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeNotLike(String value) {
            addCriterion("job_distribution_mode not like", value, "jobDistributionMode");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeIn(List<String> values) {
            addCriterion("job_distribution_mode in", values, "jobDistributionMode");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeNotIn(List<String> values) {
            addCriterion("job_distribution_mode not in", values, "jobDistributionMode");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeBetween(String value1, String value2) {
            addCriterion("job_distribution_mode between", value1, value2, "jobDistributionMode");
            return (Criteria) this;
        }

        public Criteria andJobDistributionModeNotBetween(String value1, String value2) {
            addCriterion("job_distribution_mode not between", value1, value2, "jobDistributionMode");
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