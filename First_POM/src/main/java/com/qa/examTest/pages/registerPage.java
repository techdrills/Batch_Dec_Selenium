package com.qa.examTest.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.examTest.basePackage.baseClass;

public class registerPage extends baseClass {
	
	// weblement arrangements
	
	
	// Initialising page object or webelements
		// constructor
		public registerPage() {
			PageFactory.initElements(driver, this);
		}
		
		
	// actions
		
		public void verifyValidRegistration() {
			// your code will be here
		}
		
		public void verifyInValidRegistration() {
			// your code will be here	
		}

}
