package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPmethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;


public class TC10_RealAPIDeleteRequest {
	
	
	@Test
	public void testcase10() throws IOException
	{
	
	Properties pr=PropertiesHandle.loadPropertiesFile("../JanAPIFramework/URI.properties");
	HTTPmethod http=new HTTPmethod(pr);
	
	http.deleteParticularmethod("Real_URI_Delete","2");
	
	
	
	

}

}  
