package com.narottam.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.narottam.utilities.BrowserFactory;

public class BaseClass {
	
public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		try {
			driver=BrowserFactory.startApplication(driver, "chrome", "https://www.freecrm.com");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}

}
