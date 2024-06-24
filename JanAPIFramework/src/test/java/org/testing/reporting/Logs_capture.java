package org.testing.reporting;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs_capture {
	
	public static void TakeLog(String Classname,String msg)
	{
		DOMConfigurator.configure("../JanAPIFramework/layout.xml");
		Logger logger=Logger.getLogger(Classname);
		logger.info(msg);
		
	}

}
