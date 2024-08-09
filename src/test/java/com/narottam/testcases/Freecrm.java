package com.narottam.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.narottam.pages.BaseClass;
import com.narottam.pages.LoginPage;
import com.narottam.utilities.BrowserFactory;

public class Freecrm extends BaseClass{
	
	
	
	@Test
	public void loginapp()
	{
		
		String s=driver.getTitle();
		System.out.println(s);
		LoginPage l= PageFactory.initElements(driver, LoginPage.class);
		l.clicklogin();
		l.entercred("narottam.kumar5150@gmail.com", "Test@1234");
		l.clickok();
		
	}
	
	

}
