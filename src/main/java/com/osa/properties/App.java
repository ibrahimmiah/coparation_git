package com.osa.properties;

public interface App {
	
	public static final String BROWSER=PropertiesFileReader.getProValue("browser");
	public static final String URL=PropertiesFileReader.getProValue("url");
}
