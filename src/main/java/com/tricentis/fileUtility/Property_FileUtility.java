package com.tricentis.fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_FileUtility {

	public String getDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./TestData/CommonData.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
}
