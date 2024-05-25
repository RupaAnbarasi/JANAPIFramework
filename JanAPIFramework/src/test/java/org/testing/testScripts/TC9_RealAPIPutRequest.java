package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPmethod;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonParsingUsingJsonPath;
import org.testing.utilities.jsonReplacement;

import io.restassured.response.Response;

public class TC9_RealAPIPutRequest {
	
	
	public void testcase9() throws IOException
	{


	       Properties pr=PropertiesHandle.loadPropertiesFile("../JanAPIFramework/URI.properties");
			
	       String jsonRequestBody=JsonHandle.ReadJsondata("../JanAPIFramework/src/test/java/org/testing/resources/InputRequestBodyForRealAPIUpdate");
			 
	        
			HTTPmethod http =new HTTPmethod(pr);
			
			Response resObj=http.PUTmethod(jsonRequestBody,"Real_URI_Update","21");
			
			
			
		}

		

} 
