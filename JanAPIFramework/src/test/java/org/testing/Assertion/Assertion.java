package org.testing.Assertion;

import org.testing.reporting.Logs_capture;

public class Assertion {
	
	public static Boolean assert1(int actualStatusCode,int expectedStatusCode,String classname) {
		
		if(actualStatusCode==expectedStatusCode)
		{
			Logs_capture.TakeLog(classname, "Staus code is matching");
			//("Staus code is matching ");
			return true;
		}
		else
		{
			System.out.println("Staus code is not matching ");
			return false;
		}
			
		}
	
	

	public static Boolean assert2(String actualData,String expectedData) {
		
		if(actualData.equals(expectedData))
		{
			System.out.println("Response Data is matching ");
			return true;
		}
		else
		{
			System.out.println("Response Data  is not matching ");
			return false;
		}
			
		}
		
		
	}


