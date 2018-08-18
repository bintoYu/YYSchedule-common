package com.YYSchedule.common.mybatis.pojo;

import java.util.ArrayList;
import java.util.List;

public class NodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodeExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNull() {
            addCriterion("node_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(String value) {
            addCriterion("node_id =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(String value) {
            addCriterion("node_id <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(String value) {
            addCriterion("node_id >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("node_id >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(String value) {
            addCriterion("node_id <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(String value) {
            addCriterion("node_id <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLike(String value) {
            addCriterion("node_id like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotLike(String value) {
            addCriterion("node_id not like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<String> values) {
            addCriterion("node_id in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<String> values) {
            addCriterion("node_id not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(String value1, String value2) {
            addCriterion("node_id between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(String value1, String value2) {
            addCriterion("node_id not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andIsBrokenIsNull() {
            addCriterion("is_broken is null");
            return (Criteria) this;
        }

        public Criteria andIsBrokenIsNotNull() {
            addCriterion("is_broken is not null");
            return (Criteria) this;
        }

        public Criteria andIsBrokenEqualTo(Boolean value) {
            addCriterion("is_broken =", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenNotEqualTo(Boolean value) {
            addCriterion("is_broken <>", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenGreaterThan(Boolean value) {
            addCriterion("is_broken >", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_broken >=", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenLessThan(Boolean value) {
            addCriterion("is_broken <", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenLessThanOrEqualTo(Boolean value) {
            addCriterion("is_broken <=", value, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenIn(List<Boolean> values) {
            addCriterion("is_broken in", values, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenNotIn(List<Boolean> values) {
            addCriterion("is_broken not in", values, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenBetween(Boolean value1, Boolean value2) {
            addCriterion("is_broken between", value1, value2, "isBroken");
            return (Criteria) this;
        }

        public Criteria andIsBrokenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_broken not between", value1, value2, "isBroken");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIsNull() {
            addCriterion("success_num is null");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIsNotNull() {
            addCriterion("success_num is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessNumEqualTo(Integer value) {
            addCriterion("success_num =", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotEqualTo(Integer value) {
            addCriterion("success_num <>", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumGreaterThan(Integer value) {
            addCriterion("success_num >", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("success_num >=", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumLessThan(Integer value) {
            addCriterion("success_num <", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumLessThanOrEqualTo(Integer value) {
            addCriterion("success_num <=", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIn(List<Integer> values) {
            addCriterion("success_num in", values, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotIn(List<Integer> values) {
            addCriterion("success_num not in", values, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumBetween(Integer value1, Integer value2) {
            addCriterion("success_num between", value1, value2, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotBetween(Integer value1, Integer value2) {
            addCriterion("success_num not between", value1, value2, "successNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumIsNull() {
            addCriterion("task_num is null");
            return (Criteria) this;
        }

        public Criteria andTaskNumIsNotNull() {
            addCriterion("task_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNumEqualTo(Integer value) {
            addCriterion("task_num =", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumNotEqualTo(Integer value) {
            addCriterion("task_num <>", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumGreaterThan(Integer value) {
            addCriterion("task_num >", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_num >=", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumLessThan(Integer value) {
            addCriterion("task_num <", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumLessThanOrEqualTo(Integer value) {
            addCriterion("task_num <=", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumIn(List<Integer> values) {
            addCriterion("task_num in", values, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumNotIn(List<Integer> values) {
            addCriterion("task_num not in", values, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumBetween(Integer value1, Integer value2) {
            addCriterion("task_num between", value1, value2, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumNotBetween(Integer value1, Integer value2) {
            addCriterion("task_num not between", value1, value2, "taskNum");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercIsNull() {
            addCriterion("cpu_use_perc is null");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercIsNotNull() {
            addCriterion("cpu_use_perc is not null");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercEqualTo(Double value) {
            addCriterion("cpu_use_perc =", value, "cpuUsePerc");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercNotEqualTo(Double value) {
            addCriterion("cpu_use_perc <>", value, "cpuUsePerc");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercGreaterThan(Double value) {
            addCriterion("cpu_use_perc >", value, "cpuUsePerc");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercGreaterThanOrEqualTo(Double value) {
            addCriterion("cpu_use_perc >=", value, "cpuUsePerc");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercLessThan(Double value) {
            addCriterion("cpu_use_perc <", value, "cpuUsePerc");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercLessThanOrEqualTo(Double value) {
            addCriterion("cpu_use_perc <=", value, "cpuUsePerc");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercIn(List<Double> values) {
            addCriterion("cpu_use_perc in", values, "cpuUsePerc");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercNotIn(List<Double> values) {
            addCriterion("cpu_use_perc not in", values, "cpuUsePerc");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercBetween(Double value1, Double value2) {
            addCriterion("cpu_use_perc between", value1, value2, "cpuUsePerc");
            return (Criteria) this;
        }

        public Criteria andCpuUsePercNotBetween(Double value1, Double value2) {
            addCriterion("cpu_use_perc not between", value1, value2, "cpuUsePerc");
            return (Criteria) this;
        }

        public Criteria andFreeMemIsNull() {
            addCriterion("free_mem is null");
            return (Criteria) this;
        }

        public Criteria andFreeMemIsNotNull() {
            addCriterion("free_mem is not null");
            return (Criteria) this;
        }

        public Criteria andFreeMemEqualTo(Long value) {
            addCriterion("free_mem =", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemNotEqualTo(Long value) {
            addCriterion("free_mem <>", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemGreaterThan(Long value) {
            addCriterion("free_mem >", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemGreaterThanOrEqualTo(Long value) {
            addCriterion("free_mem >=", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemLessThan(Long value) {
            addCriterion("free_mem <", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemLessThanOrEqualTo(Long value) {
            addCriterion("free_mem <=", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemIn(List<Long> values) {
            addCriterion("free_mem in", values, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemNotIn(List<Long> values) {
            addCriterion("free_mem not in", values, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemBetween(Long value1, Long value2) {
            addCriterion("free_mem between", value1, value2, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemNotBetween(Long value1, Long value2) {
            addCriterion("free_mem not between", value1, value2, "freeMem");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemIsNull() {
            addCriterion("jvm_free_mem is null");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemIsNotNull() {
            addCriterion("jvm_free_mem is not null");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemEqualTo(Long value) {
            addCriterion("jvm_free_mem =", value, "jvmFreeMem");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemNotEqualTo(Long value) {
            addCriterion("jvm_free_mem <>", value, "jvmFreeMem");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemGreaterThan(Long value) {
            addCriterion("jvm_free_mem >", value, "jvmFreeMem");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemGreaterThanOrEqualTo(Long value) {
            addCriterion("jvm_free_mem >=", value, "jvmFreeMem");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemLessThan(Long value) {
            addCriterion("jvm_free_mem <", value, "jvmFreeMem");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemLessThanOrEqualTo(Long value) {
            addCriterion("jvm_free_mem <=", value, "jvmFreeMem");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemIn(List<Long> values) {
            addCriterion("jvm_free_mem in", values, "jvmFreeMem");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemNotIn(List<Long> values) {
            addCriterion("jvm_free_mem not in", values, "jvmFreeMem");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemBetween(Long value1, Long value2) {
            addCriterion("jvm_free_mem between", value1, value2, "jvmFreeMem");
            return (Criteria) this;
        }

        public Criteria andJvmFreeMemNotBetween(Long value1, Long value2) {
            addCriterion("jvm_free_mem not between", value1, value2, "jvmFreeMem");
            return (Criteria) this;
        }

        public Criteria andQueueLengthIsNull() {
            addCriterion("queue_length is null");
            return (Criteria) this;
        }

        public Criteria andQueueLengthIsNotNull() {
            addCriterion("queue_length is not null");
            return (Criteria) this;
        }

        public Criteria andQueueLengthEqualTo(Integer value) {
            addCriterion("queue_length =", value, "queueLength");
            return (Criteria) this;
        }

        public Criteria andQueueLengthNotEqualTo(Integer value) {
            addCriterion("queue_length <>", value, "queueLength");
            return (Criteria) this;
        }

        public Criteria andQueueLengthGreaterThan(Integer value) {
            addCriterion("queue_length >", value, "queueLength");
            return (Criteria) this;
        }

        public Criteria andQueueLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("queue_length >=", value, "queueLength");
            return (Criteria) this;
        }

        public Criteria andQueueLengthLessThan(Integer value) {
            addCriterion("queue_length <", value, "queueLength");
            return (Criteria) this;
        }

        public Criteria andQueueLengthLessThanOrEqualTo(Integer value) {
            addCriterion("queue_length <=", value, "queueLength");
            return (Criteria) this;
        }

        public Criteria andQueueLengthIn(List<Integer> values) {
            addCriterion("queue_length in", values, "queueLength");
            return (Criteria) this;
        }

        public Criteria andQueueLengthNotIn(List<Integer> values) {
            addCriterion("queue_length not in", values, "queueLength");
            return (Criteria) this;
        }

        public Criteria andQueueLengthBetween(Integer value1, Integer value2) {
            addCriterion("queue_length between", value1, value2, "queueLength");
            return (Criteria) this;
        }

        public Criteria andQueueLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("queue_length not between", value1, value2, "queueLength");
            return (Criteria) this;
        }

        public Criteria andThreadNumIsNull() {
            addCriterion("thread_num is null");
            return (Criteria) this;
        }

        public Criteria andThreadNumIsNotNull() {
            addCriterion("thread_num is not null");
            return (Criteria) this;
        }

        public Criteria andThreadNumEqualTo(Integer value) {
            addCriterion("thread_num =", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumNotEqualTo(Integer value) {
            addCriterion("thread_num <>", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumGreaterThan(Integer value) {
            addCriterion("thread_num >", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("thread_num >=", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumLessThan(Integer value) {
            addCriterion("thread_num <", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumLessThanOrEqualTo(Integer value) {
            addCriterion("thread_num <=", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumIn(List<Integer> values) {
            addCriterion("thread_num in", values, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumNotIn(List<Integer> values) {
            addCriterion("thread_num not in", values, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumBetween(Integer value1, Integer value2) {
            addCriterion("thread_num between", value1, value2, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("thread_num not between", value1, value2, "threadNum");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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