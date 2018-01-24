package com.stackroute.datamunger;

import java.util.Scanner;

import com.stackroute.datamunger.query.parser.QueryParser;

public class DataMunger {

	public static void main(String[] args) {

		// read the query from the user
		System.out.println("Enter a queryString");
		String queryString = new Scanner(System.in).nextLine();
		System.out.println(queryString);

		// create an object of QueryParser class
		QueryParser queryParser = new QueryParser();		
		queryParser.parseQuery(queryString);
		/*
		 * call parseQuery() method of the class by passing the query string
		 * which will return object of QueryParameter
		 */
	}
}