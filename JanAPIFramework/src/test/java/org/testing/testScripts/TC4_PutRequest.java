package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
//import java.util.Random;

import org.testing.testSteps.HTTPmethod;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
//import org.testing.utilities.jsonParsingUsingJsonPath;
import org.testing.utilities.jsonReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_PutRequest {

	@Test
	public void testcase4() throws IOException
	{

    Properties pr=PropertiesHandle.loadPropertiesFile("../JanAPIFramework/URI.properties");
		
    String jsonRequestBody=JsonHandle.ReadJsondata("../JanAPIFramework/src/test/java/org/testing/resources/InputRequestforUpdate.json");
		 
     jsonRequestBody=jsonReplacement.assignValue(jsonRequestBody,"id",TC1_PostRequest.returnIDvalue);
     
		HTTPmethod http =new HTTPmethod(pr);
		
		Response resObj=http.PUTmethod(jsonRequestBody,"QA_URI1",TC1_PostRequest.returnIDvalue);
		
		
}
}
