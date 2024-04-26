package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPmethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC5_DeleteParticulorRecord {
	
	@Test

	public void testcase5() throws IOException
	{
	
	Properties pr=PropertiesHandle.loadPropertiesFile("../JanAPIFramework/URI.properties");
	HTTPmethod http=new HTTPmethod(pr);
	
	http.deleteParticularmethod("QA_URI1",TC1_PostRequest.returnIDvalue);
	
	
	
	

}

}
