package com.qa.examTest.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.examTest.basePackage.baseClass;
import com.qa.examTest.pages.loginPage;
import com.qa.examTest.pages.registerPage;

public class registerPageTest extends baseClass {
	
	registerPage register;
	
	public registerPageTest() {
		super();		
	}
	
	@BeforeMethod
	public void launchSetup() {
		setUp();
		register = new registerPage();		
	}
	
	@Test
	public void validaRegistration() {
		register.verifyInValidRegistration();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/account.php?q=1");
	}
	
	@Test
	public void invalidRegistration() {
		register.verifyInValidRegistration();
		String errText = driver.switchTo().alert().getText();
		Assert.assertEquals(errText, "your error text would be here...");
	}

}
