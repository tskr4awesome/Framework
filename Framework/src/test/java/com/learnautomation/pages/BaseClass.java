package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learnautomation.utilities.BrowserFactory;
import com.learnautomation.utilities.ConfigDataProvider;
import com.learnautomation.utilities.ExcelDataProvider;

public class BaseClass 
{
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider cfg;
	
	
	@BeforeSuite
	public void setUpSuite()
	{
		excel = new ExcelDataProvider();
		cfg = new ConfigDataProvider();
	}
	
	
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
