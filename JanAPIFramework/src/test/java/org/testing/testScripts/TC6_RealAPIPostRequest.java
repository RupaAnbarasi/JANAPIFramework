package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.testSteps.HTTPmethod;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonParsingUsingJsonPath;
import org.testing.utilities.jsonReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_RealAPIPostRequest {
	
	//public static String returnIDvalue;
	
	@Test
	public void testcase6()throws IOException {
		
		
		
	       Properties pr=PropertiesHandle.loadPropertiesFile("../JanAPIFramework/URI.properties");
			
	       String jsonRequestBody=JsonHandle.ReadJsondata("../JanAPIFramework/src/test/java/org/testing/resources/InputRequestBodyForRealAPI.json");
			 
	        
			HTTPmethod http =new HTTPmethod(pr);
			
			Response resObj=http.POSTmethod(jsonRequestBody,"Real_URI_POST");
			
			//returnIDvalue=jsonParsingUsingJsonPath.doParsing("id", resObj);
			
		}

}
