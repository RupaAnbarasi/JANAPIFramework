package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPmethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC8_RealAPIGetParticularRequest {
	
	
	
	
		
		
	
	@Test
	public void testcase8() throws IOException
	{
	
	Properties pr=PropertiesHandle.loadPropertiesFile("../JanAPIFramework/URI.properties");
	HTTPmethod http=new HTTPmethod(pr);
	http.getParticularmethod("Real_URI_GETParticular","1");
	
	}
	
	
	
	/* public static void main(String[] args) throws IOException {
		TC8_RealAPIGetParticularRequest tc8=new TC8_RealAPIGetParticularRequest();
		tc8.testcase8();
		
	}*/

} 

