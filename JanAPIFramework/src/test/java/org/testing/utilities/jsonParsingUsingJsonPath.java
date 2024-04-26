package org.testing.utilities;

import io.restassured.response.Response;

public class jsonParsingUsingJsonPath {
	
	//Input parameter -- JSONpath and Response object
		//purpose of method  -parse thevalue from the  response based upon the JOSN path
		//Output parameter-Return the extracted value	
	
	public static String doParsing(String jsonpath, Response res)
	{
		
	String extractedValue=res.jsonPath().get(jsonpath);
	return extractedValue;
	
	}

}
