package org.testing.Assertion;

public class Assertion {
	
	public static Boolean assert1(int actualStatusCode,int expectedStatusCode) {
		
		if(actualStatusCode==expectedStatusCode)
		{
			System.out.println("Staus code is matching ");
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


