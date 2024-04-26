package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandle {
	
	//Input parameter -- File path
	//purpose of method  -Loading any properities file
	//Output parameter-properties object
	
	public static Properties loadPropertiesFile(String filepath) throws IOException
	{
		File f = new File(filepath); //create a connection
		FileReader fr= new FileReader(f);
		Properties pr =new Properties();  //properties object to loading the file
		pr.load(fr);
		return pr;
		
		
	}

}
