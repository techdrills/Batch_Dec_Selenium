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
	public void ValidRegistration() {
		register.verifyValidRegistration();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/account.php?q=1]");
		driver.close();
	}
	
	@Test
	public void invalidName() {
		register.verifyInvalidName();
		Assert.assertEquals(driver.switchTo().alert().getText(), "Name must be filled out.");
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	@Test
	public void verifyCollge() {
		register.verifyInvalidCollege();
		Assert.assertEquals(driver.switchTo().alert().getText(), "college must be filled out.");
		driver.switchTo().alert().accept();	
		driver.close();
	}
	
	@Test
	public void verifyEmail() {
		register.verifyInvalidEmail();
		Assert.assertEquals(driver.switchTo().alert().getText(), "Not a valid e-mail address.");
		driver.switchTo().alert().accept();	
		driver.close();
	}
	
	@Test
	public void verifyPass() {
		register.verifyInvalidPassword();
		Assert.assertEquals(driver.switchTo().alert().getText(), "Password must be filled out");
		driver.switchTo().alert().accept();	
		driver.close();
	}
}
