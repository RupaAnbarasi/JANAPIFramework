package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPmethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC7_RealAPIGetAllRequest {
	
	
	@Test
	public void testcase7() throws IOException
	{
	
	Properties pr=PropertiesHandle.loadPropertiesFile("../JanAPIFramework/URI.properties");
	HTTPmethod http=new HTTPmethod(pr);
	http.getAllmethod("Real_URI_GETAll");
	
	


}

}
