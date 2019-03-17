package com.learnautomation.testcases;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;


public class LoginTest extends BaseClass {

	@Test
	public void loginApp() throws IOException {

		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);

		lp.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

	}

}
