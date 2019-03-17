package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	//Locators which we use
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="passworrd")
	WebElement passwrdd;
	
	@FindBy(name="button")
	WebElement button;
	
	public void loginToCRM(String usrnmae,String psswrd) 
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			
		}
	
		userName.sendKeys(usrnmae);
		passwrdd.sendKeys(psswrd);
		button.clear();
	}

	
	
	
}
