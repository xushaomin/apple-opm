package com.appleframework.opm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RopModulExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RopModulExample() {
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

        public Criteria andModulNameIsNull() {
            addCriterion("modul_name is null");
            return (Criteria) this;
        }

        public Criteria andModulNameIsNotNull() {
            addCriterion("modul_name is not null");
            return (Criteria) this;
        }

        public Criteria andModulNameEqualTo(String value) {
            addCriterion("modul_name =", value, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulNameNotEqualTo(String value) {
            addCriterion("modul_name <>", value, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulNameGreaterThan(String value) {
            addCriterion("modul_name >", value, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulNameGreaterThanOrEqualTo(String value) {
            addCriterion("modul_name >=", value, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulNameLessThan(String value) {
            addCriterion("modul_name <", value, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulNameLessThanOrEqualTo(String value) {
            addCriterion("modul_name <=", value, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulNameLike(String value) {
            addCriterion("modul_name like", value, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulNameNotLike(String value) {
            addCriterion("modul_name not like", value, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulNameIn(List<String> values) {
            addCriterion("modul_name in", values, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulNameNotIn(List<String> values) {
            addCriterion("modul_name not in", values, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulNameBetween(String value1, String value2) {
            addCriterion("modul_name between", value1, value2, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulNameNotBetween(String value1, String value2) {
            addCriterion("modul_name not between", value1, value2, "modulName");
            return (Criteria) this;
        }

        public Criteria andModulCodeIsNull() {
            addCriterion("modul_code is null");
            return (Criteria) this;
        }

        public Criteria andModulCodeIsNotNull() {
            addCriterion("modul_code is not null");
            return (Criteria) this;
        }

        public Criteria andModulCodeEqualTo(String value) {
            addCriterion("modul_code =", value, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulCodeNotEqualTo(String value) {
            addCriterion("modul_code <>", value, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulCodeGreaterThan(String value) {
            addCriterion("modul_code >", value, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulCodeGreaterThanOrEqualTo(String value) {
            addCriterion("modul_code >=", value, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulCodeLessThan(String value) {
            addCriterion("modul_code <", value, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulCodeLessThanOrEqualTo(String value) {
            addCriterion("modul_code <=", value, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulCodeLike(String value) {
            addCriterion("modul_code like", value, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulCodeNotLike(String value) {
            addCriterion("modul_code not like", value, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulCodeIn(List<String> values) {
            addCriterion("modul_code in", values, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulCodeNotIn(List<String> values) {
            addCriterion("modul_code not in", values, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulCodeBetween(String value1, String value2) {
            addCriterion("modul_code between", value1, value2, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulCodeNotBetween(String value1, String value2) {
            addCriterion("modul_code not between", value1, value2, "modulCode");
            return (Criteria) this;
        }

        public Criteria andModulDescIsNull() {
            addCriterion("modul_desc is null");
            return (Criteria) this;
        }

        public Criteria andModulDescIsNotNull() {
            addCriterion("modul_desc is not null");
            return (Criteria) this;
        }

        public Criteria andModulDescEqualTo(String value) {
            addCriterion("modul_desc =", value, "modulDesc");
            return (Criteria) this;
        }

        public Criteria andModulDescNotEqualTo(String value) {
            addCriterion("modul_desc <>", value, "modulDesc");
            return (Criteria) this;
        }

        public Criteria andModulDescGreaterThan(String value) {
            addCriterion("modul_desc >", value, "modulDesc");
            return (Criteria) this;
        }

        public Criteria andModulDescGreaterThanOrEqualTo(String value) {
            addCriterion("modul_desc >=", value, "modulDesc");
            return (Criteria) this;
        }

        public Criteria andModulDescLessThan(String value) {
            addCriterion("modul_desc <", value, "modulDesc");
            return (Criteria) this;
        }

        public Criteria andModulDescLessThanOrEqualTo(String value) {
            addCriterion("modul_desc <=", value, "modulDesc");
            return (Criteria) this;
        }

        public Criteria andModulDescLike(String value) {
            addCriterion("modul_desc like", value, "modulDesc");
            return (Criteria) this;
        }

        public Criteria andModulDescNotLike(String value) {
            addCriterion("modul_desc not like", value, "modulDesc");
            return (Criteria) this;
        }

        public Criteria andModulDescIn(List<String> values) {
            addCriterion("modul_desc in", values, "modulDesc");
            return (Criteria) this;
        }

        public Criteria andModulDescNotIn(List<String> values) {
            addCriterion("modul_desc not in", values, "modulDesc");
            return (Criteria) this;
        }

        public Criteria andModulDescBetween(String value1, String value2) {
            addCriterion("modul_desc between", value1, value2, "modulDesc");
            return (Criteria) this;
        }

        public Criteria andModulDescNotBetween(String value1, String value2) {
            addCriterion("modul_desc not between", value1, value2, "modulDesc");
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