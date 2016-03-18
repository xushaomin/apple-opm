package com.appleframework.opm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RopServerExample {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RopServerExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServerDescIsNull() {
            addCriterion("server_desc is null");
            return (Criteria) this;
        }

        public Criteria andServerDescIsNotNull() {
            addCriterion("server_desc is not null");
            return (Criteria) this;
        }

        public Criteria andServerDescEqualTo(String value) {
            addCriterion("server_desc =", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescNotEqualTo(String value) {
            addCriterion("server_desc <>", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescGreaterThan(String value) {
            addCriterion("server_desc >", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescGreaterThanOrEqualTo(String value) {
            addCriterion("server_desc >=", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescLessThan(String value) {
            addCriterion("server_desc <", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescLessThanOrEqualTo(String value) {
            addCriterion("server_desc <=", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescLike(String value) {
            addCriterion("server_desc like", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescNotLike(String value) {
            addCriterion("server_desc not like", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescIn(List<String> values) {
            addCriterion("server_desc in", values, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescNotIn(List<String> values) {
            addCriterion("server_desc not in", values, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescBetween(String value1, String value2) {
            addCriterion("server_desc between", value1, value2, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescNotBetween(String value1, String value2) {
            addCriterion("server_desc not between", value1, value2, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerHostIsNull() {
            addCriterion("server_host is null");
            return (Criteria) this;
        }

        public Criteria andServerHostIsNotNull() {
            addCriterion("server_host is not null");
            return (Criteria) this;
        }

        public Criteria andServerHostEqualTo(String value) {
            addCriterion("server_host =", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostNotEqualTo(String value) {
            addCriterion("server_host <>", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostGreaterThan(String value) {
            addCriterion("server_host >", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostGreaterThanOrEqualTo(String value) {
            addCriterion("server_host >=", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostLessThan(String value) {
            addCriterion("server_host <", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostLessThanOrEqualTo(String value) {
            addCriterion("server_host <=", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostLike(String value) {
            addCriterion("server_host like", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostNotLike(String value) {
            addCriterion("server_host not like", value, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostIn(List<String> values) {
            addCriterion("server_host in", values, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostNotIn(List<String> values) {
            addCriterion("server_host not in", values, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostBetween(String value1, String value2) {
            addCriterion("server_host between", value1, value2, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerHostNotBetween(String value1, String value2) {
            addCriterion("server_host not between", value1, value2, "serverHost");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNull() {
            addCriterion("server_port is null");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNotNull() {
            addCriterion("server_port is not null");
            return (Criteria) this;
        }

        public Criteria andServerPortEqualTo(String value) {
            addCriterion("server_port =", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotEqualTo(String value) {
            addCriterion("server_port <>", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThan(String value) {
            addCriterion("server_port >", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThanOrEqualTo(String value) {
            addCriterion("server_port >=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThan(String value) {
            addCriterion("server_port <", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThanOrEqualTo(String value) {
            addCriterion("server_port <=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLike(String value) {
            addCriterion("server_port like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotLike(String value) {
            addCriterion("server_port not like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortIn(List<String> values) {
            addCriterion("server_port in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotIn(List<String> values) {
            addCriterion("server_port not in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortBetween(String value1, String value2) {
            addCriterion("server_port between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotBetween(String value1, String value2) {
            addCriterion("server_port not between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSideTypeIsNull() {
            addCriterion("side_type is null");
            return (Criteria) this;
        }

        public Criteria andSideTypeIsNotNull() {
            addCriterion("side_type is not null");
            return (Criteria) this;
        }

        public Criteria andSideTypeEqualTo(Integer value) {
            addCriterion("side_type =", value, "sideType");
            return (Criteria) this;
        }

        public Criteria andSideTypeNotEqualTo(Integer value) {
            addCriterion("side_type <>", value, "sideType");
            return (Criteria) this;
        }

        public Criteria andSideTypeGreaterThan(Integer value) {
            addCriterion("side_type >", value, "sideType");
            return (Criteria) this;
        }

        public Criteria andSideTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("side_type >=", value, "sideType");
            return (Criteria) this;
        }

        public Criteria andSideTypeLessThan(Integer value) {
            addCriterion("side_type <", value, "sideType");
            return (Criteria) this;
        }

        public Criteria andSideTypeLessThanOrEqualTo(Integer value) {
            addCriterion("side_type <=", value, "sideType");
            return (Criteria) this;
        }

        public Criteria andSideTypeIn(List<Integer> values) {
            addCriterion("side_type in", values, "sideType");
            return (Criteria) this;
        }

        public Criteria andSideTypeNotIn(List<Integer> values) {
            addCriterion("side_type not in", values, "sideType");
            return (Criteria) this;
        }

        public Criteria andSideTypeBetween(Integer value1, Integer value2) {
            addCriterion("side_type between", value1, value2, "sideType");
            return (Criteria) this;
        }

        public Criteria andSideTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("side_type not between", value1, value2, "sideType");
            return (Criteria) this;
        }

        public Criteria andEnvTypeIsNull() {
            addCriterion("env_type is null");
            return (Criteria) this;
        }

        public Criteria andEnvTypeIsNotNull() {
            addCriterion("env_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnvTypeEqualTo(Integer value) {
            addCriterion("env_type =", value, "envType");
            return (Criteria) this;
        }

        public Criteria andEnvTypeNotEqualTo(Integer value) {
            addCriterion("env_type <>", value, "envType");
            return (Criteria) this;
        }

        public Criteria andEnvTypeGreaterThan(Integer value) {
            addCriterion("env_type >", value, "envType");
            return (Criteria) this;
        }

        public Criteria andEnvTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("env_type >=", value, "envType");
            return (Criteria) this;
        }

        public Criteria andEnvTypeLessThan(Integer value) {
            addCriterion("env_type <", value, "envType");
            return (Criteria) this;
        }

        public Criteria andEnvTypeLessThanOrEqualTo(Integer value) {
            addCriterion("env_type <=", value, "envType");
            return (Criteria) this;
        }

        public Criteria andEnvTypeIn(List<Integer> values) {
            addCriterion("env_type in", values, "envType");
            return (Criteria) this;
        }

        public Criteria andEnvTypeNotIn(List<Integer> values) {
            addCriterion("env_type not in", values, "envType");
            return (Criteria) this;
        }

        public Criteria andEnvTypeBetween(Integer value1, Integer value2) {
            addCriterion("env_type between", value1, value2, "envType");
            return (Criteria) this;
        }

        public Criteria andEnvTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("env_type not between", value1, value2, "envType");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
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