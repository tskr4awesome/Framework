package com.learnautomation.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework
{
  @Test
  public void test1() throws IOException
    {
	  System.setProperty("webdriver.chrome.driver", "path ");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://freecrm.com");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.xpath(""));
	  driver.quit();
	  	  
	  
  }
}
