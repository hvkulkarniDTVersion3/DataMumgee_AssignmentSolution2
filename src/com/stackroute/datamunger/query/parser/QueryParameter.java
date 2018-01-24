package com.stackroute.datamunger.query.parser;

import java.util.List;

/*This class will contain the elements of the parsed Query String such as conditions,
logical operators,aggregate functions, file name, fields group by fields, order by
fields, Query Type*/

public class QueryParameter {
	private String file;
	private String baseQuery;
	private String queryString;
	private List<Restriction> restrictions;
	private List<String> fields;
	private List<String> logicalOperators;
	private List<String> groupByField;
	private List<String> orderByFields;
	private List<AggregateFunction> aggregateFunction;
	private String QUERY_TYPE = "SELECT * FROM Match.csv";
	public String getFile() {
		return file;
	}

	public List<AggregateFunction> getAggregateFunctions() {
		return aggregateFunction;
	}

	public void setAggregateFunction(List<AggregateFunction> aggregateFunction) {
		this.aggregateFunction = aggregateFunction;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public List<Restriction> getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(List<Restriction> restrictions) {
		this.restrictions = restrictions;
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public List<String> getLogicalOperators() {
		return logicalOperators;
	}

	public void setLogicalOperators(List<String> logicalOperators) {
		this.logicalOperators = logicalOperators;
	}

	public List<String> getGroupByFields() {
		return groupByField;
	}

	public void setGroupByFields(List<String> groupByFields) {
		this.groupByField = groupByFields;
	}

	public List<String> getOrderByFields() {
		return orderByFields;
	}

	public void setOrderByFields(List<String> orderByFields) {
		this.orderByFields = orderByFields;
	}

}