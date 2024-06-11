package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.ResponseValidation;
import org.testing.testSteps.HTTPmethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_GetParticularoRequest {
	
	@Test
	public void testcase3() throws IOException
	{
		
	
	Properties pr=PropertiesHandle.loadPropertiesFile("../JanAPIFramework/URI.properties");
	HTTPmethod http=new HTTPmethod(pr);
	Response resObj=http.getParticularmethod("QA_URI1",TC1_PostRequest.returnIDvalue);
	/*Boolean result=ResponseValidation.StatuscodeValidate(201, resObj);
	Assert.assertTrue(result);*/
	
	
	

}

}
