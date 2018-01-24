package com.stackroute.datamunger.query.parser;

/* This class is used for storing name of field, aggregate function for 
 * each aggregate function
 * */
/*`AggregateFunctions` Class:

	i.   Properties : field, function, result

	ii.  Constructor:  create cons(Build QueryParameter)	

    iii. Generate getter/setter methods for all the methods*/
public class AggregateFunction {
	private String field, function;
	private int result;
	private int aggregateFieldIndex;

	public AggregateFunction() {
	}

	public AggregateFunction(String field, String function, int result) {
		this.field = field;
		this.function = function;
		this.result = result;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}
}