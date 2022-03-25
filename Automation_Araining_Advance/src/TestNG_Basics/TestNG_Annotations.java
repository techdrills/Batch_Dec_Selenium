package TestNG_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	// Pre-conditions annotations
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite");
	}
		
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}	
	
	// Test Cases
	// we use @Test annotation for test cases writing
	
	@Test
	public void testcase1() {
		System.out.println("This is my test case 1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("This is my test case 2");
	}
	
	// Post Conditions Annotation
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is my After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is my after class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is my after Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is my after Suite");
	}
		
}
