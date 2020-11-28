package com.all_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base_git.OpenBrowser;
import com.osa.properties.App;
 class Login_Test {
	
	public WebDriver dr;
	@Test
	public void osaTest(String browser) {
	dr=	OpenBrowser.openBrowser(browser);
		dr.get(App.URL);
		
		dr.get("");
		
	}
	

}
