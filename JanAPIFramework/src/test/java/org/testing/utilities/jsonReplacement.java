package org.testing.utilities;

import java.util.regex.Pattern;

public class jsonReplacement {
	
	//inputparameter- complete request body , varibale anme  ,variable value
	//purposeof the method- assign a value to a variable in the data
	//output parameter- return the updated data
	
	public static String assignValue(String body,String variableName, String variableValue)
	{
	body=body.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableValue);
	return body;
	
	}

}
