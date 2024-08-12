package com.Target.genericUtility.File_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_FileUtility {

	public String getDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(".//src/test/resources/CommonData.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
}
