package com.qa.examTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.examTest.basePackage.baseClass;

public class registerPage extends baseClass {
	
	// weblement arrangements
	
	@FindBy(id = "namer") 
	WebElement name;
	
	@FindBy(id = "gender")
	WebElement gender;
	
	@FindBy(id = "colleger")
	WebElement college;
	
	@FindBy(id = "emailr")
	WebElement email;
	
	@FindBy(id = "mobr")
	WebElement mobile;
	
	@FindBy(id = "passwordr")
	WebElement password;
	
	@FindBy(id = "cpasswordr")
	WebElement confirmPass;
	
	@FindBy(id = "signupbtb")
	WebElement btnSignUP;
	
	
	// Initialising page object or webelements
		// constructor
		public registerPage() {
			PageFactory.initElements(driver, this);
		}
		
		
	// actions
		
		public void verifyValidRegistration() {
			name.sendKeys(reader.getCellData("registration", "name", 11));
			gender.sendKeys(reader.getCellData("registration", "gender", 11));
			college.sendKeys(reader.getCellData("registration", "college", 11));
			email.sendKeys(reader.getCellData("registration", "email", 11));
			mobile.sendKeys(reader.getCellData("registration", "mobile", 11));
			password.sendKeys(reader.getCellData("registration", "password", 11));
			confirmPass.sendKeys(reader.getCellData("registration", "cnfpassword", 11));
			btnSignUP.click();
		}
		
		public void verifyInvalidName() {
			btnSignUP.click();
		}
		
		public void verifyInvalidCollege() {
			name.sendKeys(reader.getCellData("registration", "name", 11));
			btnSignUP.click();
		}
		
		public void verifyInvalidEmail() {
			name.sendKeys(reader.getCellData("registration", "name", 11));
			college.sendKeys(reader.getCellData("registration", "college", 11));
			btnSignUP.click();
		}
		
		public void verifyInvalidPassword() {
			name.sendKeys(reader.getCellData("registration", "name", 11));
			college.sendKeys(reader.getCellData("registration", "college", 11));
			email.sendKeys(reader.getCellData("registration", "email", 11));
			btnSignUP.click();
		}

}
