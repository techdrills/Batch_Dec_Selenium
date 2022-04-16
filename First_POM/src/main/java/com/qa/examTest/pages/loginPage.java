package com.qa.examTest.pages;

import org.testng.annotations.Test;

import com.qa.examTest.basePackage.baseClass;

public class loginPage extends baseClass {
	
		
	// this is just for checking the connection is working or not with config file
	@Test
	public void connection() {

		System.out.println(prop.getProperty("browserName"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}

}
