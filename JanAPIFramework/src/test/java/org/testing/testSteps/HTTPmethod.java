package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;



public class HTTPmethod {
	
	Properties pr;//Global variable
	
	public  HTTPmethod(Properties pr){
		
		this.pr=pr;
		
	}
	
	
	public Response POSTmethod(String requestBody,String urikeyName)
	{
		String uriValue =pr.getProperty(urikeyName);
		
	   Response res=
		given().contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(uriValue);
	   
	   System.out.println("Response code is" +res.statusCode());
	   System.out.println("Response data is");
	   System.out.println(res.asString());
		
	   return res;
		
	}
	
	
	public void getAllmethod(String urikeyName)
	{
		String uriValue =pr.getProperty(urikeyName);
		
	   Response res=
		given().contentType(ContentType.JSON)
		.when()
		.get(uriValue);
	   
	   System.out.println("Response code is" +res.statusCode());
	   System.out.println("Response data is");
	   System.out.println(res.asString());
		
	}

	
	//public void getParticularmethod(String urikeyName)
	public void getParticularmethod(String urikeyName, String endpoint)
	
	{
		String uriValue =pr.getProperty(urikeyName)+"/"+endpoint;
		
	   Response res=
		given().contentType(ContentType.JSON)
		.when()
		.get(uriValue);
	   
	   System.out.println("Response code is" +res.statusCode());
	   System.out.println("Response data is");
	   System.out.println(res.asString());
	}
	
	

	//public Response PUTmethod(String requestBody,String urikeyName)
public Response PUTmethod(String requestBody,String urikeyName,String endpointValue)
	
	{
		String uriValue =pr.getProperty(urikeyName)+"/"+endpointValue;
		
	   Response res=
		given().contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.put(uriValue);
	   
	   System.out.println("Response code is" +res.statusCode());
	   System.out.println("Response data is " +res.asString());
	   return res;
		
	}
	
	
	
	

	//public void deleteParticularmethod(String urikeyName)
	public void deleteParticularmethod(String urikeyName, String endpoint)
	{
		String uriValue =pr.getProperty(urikeyName) +"/"+endpoint;
		
	   Response res=
		given().contentType(ContentType.JSON)
		.when()
		.delete(uriValue);
	   
	   System.out.println("Response code is" +res.statusCode());
	   System.out.println("Response data is");
	   System.out.println(res.asString());
		
	}

	}
	



