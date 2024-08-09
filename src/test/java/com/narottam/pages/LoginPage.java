package com.narottam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="(//a[contains(@class,'btn-primary')])[1]") private WebElement login;
	@FindBy(name="email") private WebElement email;
	@FindBy(name="password") private WebElement password;
	@FindBy(xpath = "//div[text()='Login']") WebElement ok;
	
	public void clicklogin()
	{
		login.click();
	}
	public void entercred(String userid, String pswd)
	{
		email.sendKeys(userid);
		password.sendKeys(pswd);
	}
	public void clickok()
	{
		ok.click();
	}
	
}
