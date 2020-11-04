package com.osa.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {


	
	/**
	 * This method will take the key of properties file value
	 * And the method will return String value from the properties file based on the
	 * @param key: To Read value from Pro file
	 * @return String: Value
	 */
public static String getProValue(String key) {
		Properties pro=new Properties();
		try {
		FileInputStream fs=new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\main\\resources\\test.properties"));
		pro.load(fs);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	   String value= pro.getProperty(key).toString();
	 return value;
	}


	
	
}
