package com.doit.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InspectionTaskExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    public InspectionTaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
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

        public Criteria andInspectionTaskCodeIsNull() {
            addCriterion("inspection_task_code is null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeIsNotNull() {
            addCriterion("inspection_task_code is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeEqualTo(String value) {
            addCriterion("inspection_task_code =", value, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeNotEqualTo(String value) {
            addCriterion("inspection_task_code <>", value, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeGreaterThan(String value) {
            addCriterion("inspection_task_code >", value, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_task_code >=", value, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeLessThan(String value) {
            addCriterion("inspection_task_code <", value, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeLessThanOrEqualTo(String value) {
            addCriterion("inspection_task_code <=", value, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeLike(String value) {
            addCriterion("inspection_task_code like", value, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeNotLike(String value) {
            addCriterion("inspection_task_code not like", value, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeIn(List<String> values) {
            addCriterion("inspection_task_code in", values, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeNotIn(List<String> values) {
            addCriterion("inspection_task_code not in", values, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeBetween(String value1, String value2) {
            addCriterion("inspection_task_code between", value1, value2, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskCodeNotBetween(String value1, String value2) {
            addCriterion("inspection_task_code not between", value1, value2, "inspectionTaskCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameIsNull() {
            addCriterion("inspection_task_name is null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameIsNotNull() {
            addCriterion("inspection_task_name is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameEqualTo(String value) {
            addCriterion("inspection_task_name =", value, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameNotEqualTo(String value) {
            addCriterion("inspection_task_name <>", value, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameGreaterThan(String value) {
            addCriterion("inspection_task_name >", value, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_task_name >=", value, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameLessThan(String value) {
            addCriterion("inspection_task_name <", value, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameLessThanOrEqualTo(String value) {
            addCriterion("inspection_task_name <=", value, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameLike(String value) {
            addCriterion("inspection_task_name like", value, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameNotLike(String value) {
            addCriterion("inspection_task_name not like", value, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameIn(List<String> values) {
            addCriterion("inspection_task_name in", values, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameNotIn(List<String> values) {
            addCriterion("inspection_task_name not in", values, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameBetween(String value1, String value2) {
            addCriterion("inspection_task_name between", value1, value2, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskNameNotBetween(String value1, String value2) {
            addCriterion("inspection_task_name not between", value1, value2, "inspectionTaskName");
            return (Criteria) this;
        }

        public Criteria andLineCodeIsNull() {
            addCriterion("line_code is null");
            return (Criteria) this;
        }

        public Criteria andLineCodeIsNotNull() {
            addCriterion("line_code is not null");
            return (Criteria) this;
        }

        public Criteria andLineCodeEqualTo(String value) {
            addCriterion("line_code =", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotEqualTo(String value) {
            addCriterion("line_code <>", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThan(String value) {
            addCriterion("line_code >", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("line_code >=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThan(String value) {
            addCriterion("line_code <", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThanOrEqualTo(String value) {
            addCriterion("line_code <=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLike(String value) {
            addCriterion("line_code like", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotLike(String value) {
            addCriterion("line_code not like", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeIn(List<String> values) {
            addCriterion("line_code in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotIn(List<String> values) {
            addCriterion("line_code not in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeBetween(String value1, String value2) {
            addCriterion("line_code between", value1, value2, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotBetween(String value1, String value2) {
            addCriterion("line_code not between", value1, value2, "lineCode");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarIsNull() {
            addCriterion("inspection_task_startbar is null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarIsNotNull() {
            addCriterion("inspection_task_startbar is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarEqualTo(String value) {
            addCriterion("inspection_task_startbar =", value, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarNotEqualTo(String value) {
            addCriterion("inspection_task_startbar <>", value, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarGreaterThan(String value) {
            addCriterion("inspection_task_startbar >", value, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_task_startbar >=", value, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarLessThan(String value) {
            addCriterion("inspection_task_startbar <", value, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarLessThanOrEqualTo(String value) {
            addCriterion("inspection_task_startbar <=", value, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarLike(String value) {
            addCriterion("inspection_task_startbar like", value, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarNotLike(String value) {
            addCriterion("inspection_task_startbar not like", value, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarIn(List<String> values) {
            addCriterion("inspection_task_startbar in", values, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarNotIn(List<String> values) {
            addCriterion("inspection_task_startbar not in", values, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarBetween(String value1, String value2) {
            addCriterion("inspection_task_startbar between", value1, value2, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskStartbarNotBetween(String value1, String value2) {
            addCriterion("inspection_task_startbar not between", value1, value2, "inspectionTaskStartbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarIsNull() {
            addCriterion("inspection_task_endbar is null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarIsNotNull() {
            addCriterion("inspection_task_endbar is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarEqualTo(String value) {
            addCriterion("inspection_task_endbar =", value, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarNotEqualTo(String value) {
            addCriterion("inspection_task_endbar <>", value, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarGreaterThan(String value) {
            addCriterion("inspection_task_endbar >", value, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_task_endbar >=", value, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarLessThan(String value) {
            addCriterion("inspection_task_endbar <", value, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarLessThanOrEqualTo(String value) {
            addCriterion("inspection_task_endbar <=", value, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarLike(String value) {
            addCriterion("inspection_task_endbar like", value, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarNotLike(String value) {
            addCriterion("inspection_task_endbar not like", value, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarIn(List<String> values) {
            addCriterion("inspection_task_endbar in", values, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarNotIn(List<String> values) {
            addCriterion("inspection_task_endbar not in", values, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarBetween(String value1, String value2) {
            addCriterion("inspection_task_endbar between", value1, value2, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskEndbarNotBetween(String value1, String value2) {
            addCriterion("inspection_task_endbar not between", value1, value2, "inspectionTaskEndbar");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateIsNull() {
            addCriterion("inspection_task_release_date is null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateIsNotNull() {
            addCriterion("inspection_task_release_date is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_task_release_date =", value, "inspectionTaskReleaseDate");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_task_release_date <>", value, "inspectionTaskReleaseDate");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("inspection_task_release_date >", value, "inspectionTaskReleaseDate");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_task_release_date >=", value, "inspectionTaskReleaseDate");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateLessThan(Date value) {
            addCriterionForJDBCDate("inspection_task_release_date <", value, "inspectionTaskReleaseDate");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inspection_task_release_date <=", value, "inspectionTaskReleaseDate");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("inspection_task_release_date in", values, "inspectionTaskReleaseDate");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("inspection_task_release_date not in", values, "inspectionTaskReleaseDate");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inspection_task_release_date between", value1, value2, "inspectionTaskReleaseDate");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskReleaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inspection_task_release_date not between", value1, value2, "inspectionTaskReleaseDate");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkIsNull() {
            addCriterion("inspection_task_remark is null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkIsNotNull() {
            addCriterion("inspection_task_remark is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkEqualTo(String value) {
            addCriterion("inspection_task_remark =", value, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkNotEqualTo(String value) {
            addCriterion("inspection_task_remark <>", value, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkGreaterThan(String value) {
            addCriterion("inspection_task_remark >", value, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_task_remark >=", value, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkLessThan(String value) {
            addCriterion("inspection_task_remark <", value, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkLessThanOrEqualTo(String value) {
            addCriterion("inspection_task_remark <=", value, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkLike(String value) {
            addCriterion("inspection_task_remark like", value, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkNotLike(String value) {
            addCriterion("inspection_task_remark not like", value, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkIn(List<String> values) {
            addCriterion("inspection_task_remark in", values, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkNotIn(List<String> values) {
            addCriterion("inspection_task_remark not in", values, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkBetween(String value1, String value2) {
            addCriterion("inspection_task_remark between", value1, value2, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskRemarkNotBetween(String value1, String value2) {
            addCriterion("inspection_task_remark not between", value1, value2, "inspectionTaskRemark");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorIsNull() {
            addCriterion("inspection_task_executor is null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorIsNotNull() {
            addCriterion("inspection_task_executor is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorEqualTo(String value) {
            addCriterion("inspection_task_executor =", value, "inspectionTaskExecutor");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorNotEqualTo(String value) {
            addCriterion("inspection_task_executor <>", value, "inspectionTaskExecutor");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorGreaterThan(String value) {
            addCriterion("inspection_task_executor >", value, "inspectionTaskExecutor");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_task_executor >=", value, "inspectionTaskExecutor");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorLessThan(String value) {
            addCriterion("inspection_task_executor <", value, "inspectionTaskExecutor");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorLessThanOrEqualTo(String value) {
            addCriterion("inspection_task_executor <=", value, "inspectionTaskExecutor");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorLike(String value) {
            addCriterion("inspection_task_executor like", value, "inspectionTaskExecutor");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorNotLike(String value) {
            addCriterion("inspection_task_executor not like", value, "inspectionTaskExecutor");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorIn(List<String> values) {
            addCriterion("inspection_task_executor in", values, "inspectionTaskExecutor");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorNotIn(List<String> values) {
            addCriterion("inspection_task_executor not in", values, "inspectionTaskExecutor");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorBetween(String value1, String value2) {
            addCriterion("inspection_task_executor between", value1, value2, "inspectionTaskExecutor");
            return (Criteria) this;
        }

        public Criteria andInspectionTaskExecutorNotBetween(String value1, String value2) {
            addCriterion("inspection_task_executor not between", value1, value2, "inspectionTaskExecutor");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table inspection_task
     *
     * @mbg.generated do_not_delete_during_merge Mon Oct 23 09:16:48 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table inspection_task
     *
     * @mbg.generated Mon Oct 23 09:16:48 CST 2017
     */
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