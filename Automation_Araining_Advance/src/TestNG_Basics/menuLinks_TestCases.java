package TestNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class menuLinks_TestCases {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		driver = new ChromeDriver();  // this code for launching the browser	
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void setURL() {
		driver.get("http://ecollegeweb.in/hostel_project/login");
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
	}
	
	@Test
	public void verifyMenu_addNewStudent() throws InterruptedException {
		driver.findElement(By.xpath("//body/div[1]/aside[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]")).click();		
		Thread.sleep(2000); // 2000 Milliseconds = 1 sec		
		String addNewStudentMenuUrl = driver.getCurrentUrl();
		Assert.assertEquals(addNewStudentMenuUrl, "http://ecollegeweb.in/hostel_project/add_student");
	}
	
	@Test
	public void verifyMenu_admittedStudent() throws InterruptedException {
		driver.findElement(By.xpath("//body/div[1]/aside[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]")).click();		
		Thread.sleep(2000); // 2000 Milliseconds = 1 sec		
		Assert.assertEquals(driver.getCurrentUrl(), "http://ecollegeweb.in/hostel_project/student_management");
	}
	
	@AfterClass
	public void browserClose() {
		driver.quit();
	}
}
