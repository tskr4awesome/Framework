package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomation.utilities.BrowserFactory;

public class BaseClass 
{
	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver =  BrowserFactory.startApplication(driver, "Chrome", "http://freeCRM.com"); 
	}
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);	
	}
}
