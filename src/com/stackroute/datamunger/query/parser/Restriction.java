package com.stackroute.datamunger.query.parser;

/*
 * This class is used for storing name of field, condition and value for 
 * each conditions
 * */
/*`Restriction Class`

i.  Properties : propertyName, propertyValue, propertyPosition, condition etc.,

ii. Constructor:  create constructor with all the properties

iii. Generate getter/setter methods for all the methods*/
public class Restriction {
	private String propertyName, propertyValue,condition;

	public Restriction() {
	}

	public Restriction(String propertyName, String propertyValue, String condition) {
		this.propertyName = propertyName;
		this.propertyValue = propertyValue;
		//this.propertyPosition = propertyPosition;
		this.condition = condition;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

/*	public String getPropertyPosition() {
		return propertyPosition;
	}

	public void setPropertyPosition(String propertyPosition) {
		this.propertyPosition = propertyPosition;
	}
*/
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}