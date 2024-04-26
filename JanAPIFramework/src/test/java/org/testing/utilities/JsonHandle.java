package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHandle {
	
	
	//Input parameter-json file path
	//purpose of the method - reading json file data
	//output parameter - json data in the form of String
	
	public static String ReadJsondata(String filepath ) throws FileNotFoundException
	{
		File f = new File(filepath);//connection establish
		FileInputStream fi =new FileInputStream(f);//stream object
		JSONTokener jt =new JSONTokener(fi);//for reading any json file
		JSONObject j = new JSONObject(jt);   //tokener object
		return j.toString();
		
		
	}

}
