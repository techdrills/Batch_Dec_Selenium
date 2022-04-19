package com.qa.examTest.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.examTest.basePackage.baseClass;
import com.qa.examTest.pages.loginPage;

public class loginPageTest extends baseClass{
	
	loginPage login;
	
	public loginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void launchSetup() {
		setUp();
		login = new loginPage();		
	}
	
	@Test
	public void verifyValidLogin() {
		login.verifyValidLogin();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/account.php?q=1");
	}
	
	@Test
	public void verifyInvalidLogin() {
		login.verifyInvalidLogin();
		String errText = driver.switchTo().alert().getText();
		Assert.assertEquals(errText, "Wrong Username or Password");
	
	}

	
//	@AfterMethod
//	public void close() {
//		setDownn();
//	}
	
	

}
