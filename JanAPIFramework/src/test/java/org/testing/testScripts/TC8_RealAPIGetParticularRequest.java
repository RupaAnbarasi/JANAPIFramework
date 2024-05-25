package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPmethod;
import org.testing.utilities.PropertiesHandle;

public class TC8_RealAPIGetParticularRequest {
	
	
	public void testcase8() throws IOException
	{
	
	Properties pr=PropertiesHandle.loadPropertiesFile("../JanAPIFramework/URI.properties");
	HTTPmethod http=new HTTPmethod(pr);
	http.getParticularmethod("Real_URI_GETParticular","1");
	
	}

} 
