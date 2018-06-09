package com.binto.YYSchedule.common.mybatis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MissionBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MissionBasicExample() {
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

        public Criteria andMissionIdIsNull() {
            addCriterion("mission_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionIdIsNotNull() {
            addCriterion("mission_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionIdEqualTo(Integer value) {
            addCriterion("mission_id =", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotEqualTo(Integer value) {
            addCriterion("mission_id <>", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThan(Integer value) {
            addCriterion("mission_id >", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mission_id >=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThan(Integer value) {
            addCriterion("mission_id <", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("mission_id <=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdIn(List<Integer> values) {
            addCriterion("mission_id in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotIn(List<Integer> values) {
            addCriterion("mission_id not in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdBetween(Integer value1, Integer value2) {
            addCriterion("mission_id between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mission_id not between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionNameIsNull() {
            addCriterion("mission_name is null");
            return (Criteria) this;
        }

        public Criteria andMissionNameIsNotNull() {
            addCriterion("mission_name is not null");
            return (Criteria) this;
        }

        public Criteria andMissionNameEqualTo(String value) {
            addCriterion("mission_name =", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameNotEqualTo(String value) {
            addCriterion("mission_name <>", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameGreaterThan(String value) {
            addCriterion("mission_name >", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("mission_name >=", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameLessThan(String value) {
            addCriterion("mission_name <", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameLessThanOrEqualTo(String value) {
            addCriterion("mission_name <=", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameLike(String value) {
            addCriterion("mission_name like", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameNotLike(String value) {
            addCriterion("mission_name not like", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameIn(List<String> values) {
            addCriterion("mission_name in", values, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameNotIn(List<String> values) {
            addCriterion("mission_name not in", values, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameBetween(String value1, String value2) {
            addCriterion("mission_name between", value1, value2, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameNotBetween(String value1, String value2) {
            addCriterion("mission_name not between", value1, value2, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeIsNull() {
            addCriterion("mission_start_time is null");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeIsNotNull() {
            addCriterion("mission_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("mission_start_time =", value, "missionStartTime");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("mission_start_time <>", value, "missionStartTime");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("mission_start_time >", value, "missionStartTime");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mission_start_time >=", value, "missionStartTime");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("mission_start_time <", value, "missionStartTime");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mission_start_time <=", value, "missionStartTime");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("mission_start_time in", values, "missionStartTime");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("mission_start_time not in", values, "missionStartTime");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mission_start_time between", value1, value2, "missionStartTime");
            return (Criteria) this;
        }

        public Criteria andMissionStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mission_start_time not between", value1, value2, "missionStartTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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