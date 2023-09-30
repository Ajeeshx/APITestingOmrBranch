package com.qa.testing;

import java.util.ArrayList;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ApiHttpMethods {
	
	RequestSpecification reqspec;
	
	public static void main(String[] args) {
		RequestSpecification reqspec = RestAssured.given();
		
		 reqspec = reqspec.header("accept","application/json");
		 
		 Response response = reqspec.get("https://www.omrbranch.com/api/flights?page=1");
		 
		 int statusCode = response.getStatusCode();
		 System.out.println(statusCode);
		 
		 String asPrettyString = response.asPrettyString();
		 System.out.println(asPrettyString);
		
		
		
		
		
		
	}

}
