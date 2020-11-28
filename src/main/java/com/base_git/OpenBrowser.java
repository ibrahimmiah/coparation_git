package com.base_git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	
	public static WebDriver dr = null;
	
	
	public static WebDriver openBrowser(String browser) {
		
		//String browser=AppSettings.BROWSER_NAME;		
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			getBrowserForWindows(browser);

		} else {
			getBrowserForMac(browser);
		}
		dr.manage().window().maximize();
		return dr;
	}

	public static void getBrowserForWindows(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/ibrahimmiah/eclipse-workspace/Coparations_git/Drivers/chromedriver");
			dr = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/ibrahimmiah/eclipse-workspace/Coparations_git/Drivers/geckodriver");
			dr = new FirefoxDriver();
		} else {
			System.out.println(
					"You have Enterd " + browser + " that dose not exist.Please enter eigther chrome or firefox");
		}
	}

	public static void getBrowserForMac(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".Users/ibrahimmiah/eclipse-workspace/Coparations_git/Drivers/chromedriver");
			dr = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/ibrahimmiah/eclipse-workspace/Coparations_git/Drivers/geckodriver");
			dr = new FirefoxDriver();
		} else {
			System.out.println(
					"You have Enterd " + browser + " that dose not exist.Please enter eigther chrome or firefox");
		}
	}

}
