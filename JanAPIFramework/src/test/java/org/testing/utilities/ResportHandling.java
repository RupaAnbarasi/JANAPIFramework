package org.testing.utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ResportHandling {
	
	public static ExtentReports HandleReport()
	{
		ExtentReports report=new ExtentReports("C:\\Users\\user\\Desktop\\selenium notes\\API Automation\\result.html", false);
		return report;
		

	}
}
