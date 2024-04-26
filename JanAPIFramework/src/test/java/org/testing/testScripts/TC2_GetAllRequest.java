package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPmethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC2_GetAllRequest {
	
	@Test
	public void testcase2() throws IOException
	{
	
	Properties pr=PropertiesHandle.loadPropertiesFile("../JanAPIFramework/URI.properties");
	HTTPmethod http=new HTTPmethod(pr);
	http.getAllmethod("QA_URI1");
	
	
	

}
}