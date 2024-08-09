package com.narottam.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver, String browser, String appurl ) throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		URL url=new URL("http://localhost:4444/wd/hub");
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("remote"))
		{
			driver=new RemoteWebDriver(url, dc);
		}
		else
		{
			System.out.println("We don't support any other browser");
		}
		
		driver.manage().window().maximize();
		driver.get(appurl);
		//driver.findElement(By.xpath("(//a[contains(@class,'btn-primary')])[1]")).click();
		//driver.findElement(By.name("email")).sendKeys("narottam.kumar5150@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("Test@1234");
		//driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
