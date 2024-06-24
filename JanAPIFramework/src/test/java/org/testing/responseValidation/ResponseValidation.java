package org.testing.responseValidation;

import org.testing.Assertion.Assertion;
import org.testing.utilities.jsonParsingUsingJsonPath;

import io.restassured.response.Response;

public class ResponseValidation {

	
	
	public static Boolean StatuscodeValidate(int expectedStatusCode, Response res,String classname)
	{
	
		int actualStatusCode =res.getStatusCode();
		
			Boolean result=Assertion.assert1(actualStatusCode, expectedStatusCode,classname);
			return result;
	}
	
	
	
	public static Boolean ResponseDataValidate(String expectedData, Response res,String  jsonpath )
	{
	
		String actualData =jsonParsingUsingJsonPath.doParsing(jsonpath, res);
		
			Boolean result=Assertion.assert2(actualData, expectedData);
			return result;
	}
}
