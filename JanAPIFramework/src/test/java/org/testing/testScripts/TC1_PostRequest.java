package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.Assertion.Assertion;
import org.testing.responseValidation.ResponseValidation;
import org.testing.testSteps.HTTPmethod;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.ResportHandling;
import org.testing.utilities.jsonParsingUsingJsonPath;
import org.testing.utilities.jsonReplacement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

public class TC1_PostRequest {
	
	
	public static String returnIDvalue;
	
	@Test
	public void testcase1()throws IOException {
		
	ExtentReports report	=ResportHandling.HandleReport();
	ExtentTest tc1 =report.startTest("TC1_PostRequest");
		
	
		
       Properties pr=PropertiesHandle.loadPropertiesFile("../JanAPIFramework/URI.properties");
		
       String jsonRequestBody=JsonHandle.ReadJsondata("../JanAPIFramework/src/test/java/org/testing/resources/InputRequestBody.json");
		 Random r= new Random();
		 Integer idvalue=r.nextInt();
        jsonRequestBody=jsonReplacement.assignValue(jsonRequestBody,"id",idvalue.toString());
        
		HTTPmethod http =new HTTPmethod(pr);
		
		Response resObj=http.POSTmethod(jsonRequestBody,"QA_URI1");
		
	
		Boolean result=ResponseValidation.StatuscodeValidate(201, resObj);
		
		Boolean dataresult=ResponseValidation.ResponseDataValidate("Arokiyam", resObj, "FirstName");
		Assert.assertTrue(dataresult);
		
		if((result)&&(dataresult))
		{
			tc1.log(LogStatus.PASS, "Test Case1 is pass...");
			returnIDvalue=jsonParsingUsingJsonPath.doParsing("id", resObj);
			report.endTest(tc1);
			report.flush();
		}
		else
		{
			tc1.log(LogStatus.FAIL, "Test Case1 is Fail...");
			Assert.assertTrue(result);
			report.endTest(tc1);
			report.flush();
			
		}
		
		
		
		
	
	
		
	}

}
