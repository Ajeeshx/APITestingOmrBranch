package com.qa.testing;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ObjectAndArrayMethod {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader fileReader = new FileReader("C:\\Users\\abdul azees\\eclipse-workspace\\APITestingOmrBranch\\src\\test\\resources\\listflights.json");
		
		JSONParser jsonParser = new JSONParser();
		
		Object parse = jsonParser.parse(fileReader);
		
		JSONObject jsonObject = (JSONObject)parse;
		
		Object object = jsonObject.get("support");
		
		System.out.println(object);
		
		JSONObject jsonObject2 = (JSONObject)object;
		
		Object object2 = jsonObject2.get("url");
		System.out.println(object2);
		
		
		
		
		
		

	}

}
