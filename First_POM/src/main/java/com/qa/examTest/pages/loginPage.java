package com.qa.examTest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.examTest.basePackage.baseClass;

public class loginPage extends baseClass {
	
	// weblement arrangements
	
	@FindBy(linkText = "Signin") 
	WebElement SignInButton;
	
	@FindBy(id = "email")
	WebElement userNameTextbox;
	
	@FindBy (id = "password")
	WebElement passwordTextbox;
	
	@FindBy (xpath = "//*[@id=\"myModal\"]/div/div/div[3]/button[2]")
	WebElement logInButton;	
	
	// Initialising page object or webelements
	// constructor
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// actions
	public void verifyValidLogin() {
		SignInButton.click();
		SignInButton.sendKeys(Keys.TAB, Keys.TAB);
		userNameTextbox.sendKeys(prop.getProperty("username"));
		passwordTextbox.sendKeys(prop.getProperty("password"));
		logInButton.click();		
	}
	
	public void verifyInvalidLogin() {
		SignInButton.click();
		SignInButton.sendKeys(Keys.TAB, Keys.TAB);
		userNameTextbox.sendKeys(prop.getProperty("invalidUsername"));
		passwordTextbox.sendKeys(prop.getProperty("invalidPassword"));
		logInButton.click();
	}
	
	
}
