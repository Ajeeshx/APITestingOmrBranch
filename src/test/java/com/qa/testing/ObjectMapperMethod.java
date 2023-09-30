package com.qa.testing;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.pojo.Root;

public class ObjectMapperMethod {
	public static void main(String[] args) throws StreamReadException, IOException {
		
	

	File file = new File(
			"C:\\Users\\abdul azees\\eclipse-workspace\\APITestingOmrBranch\\src\\test\\resources\\listflights.json");

	ObjectMapper mapper = new ObjectMapper();
	
	Root readValue = mapper.readValue(file, Root.class);
	
	String name = readValue.getName();
	System.out.println(name);
	int age = readValue.getAge();
	System.out.println(age);
	String address = readValue.getAddress();
	System.out.println(address);
	
	
	
	
	}
}
