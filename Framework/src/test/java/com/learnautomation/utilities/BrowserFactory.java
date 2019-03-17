package com.learnautomation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
	{
	
		if(browserName.equals("Chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe ");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("Firefox"))
		{
			 System.setProperty("webdriver.geckodriver.driver", "./Drivers/geckodriver.exe ");
				driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			
			
		}
		else
		{
			System.out.println("We do not support this browser");
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		
		
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver)
	{
	
		driver.quit();
		
		
	}

}
