package TestNG_Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class coolAdmin_loginTestCases {
	
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
	}
	
	@Test
	public void verifyValidLoginTest() {
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		
		String afterLoginTitle = driver.getTitle();		
		Assert.assertEquals(afterLoginTitle, "Hostel Paradise" , "Verified the title of the dashboard");
	}
	
	@Test
	public void verifyInvalidLoginTest1() {
		driver.findElement(By.name("username")).sendKeys("root1");
		driver.findElement(By.name("password")).sendKeys("admin1");
		driver.findElement(By.tagName("button")).click();
		
		String afterLoginTitle = driver.getTitle();		
		Assert.assertEquals(afterLoginTitle, "Hostel Paradise" , "Verified the title of the dashboard");
	}
	
	@Test
	public void verifyInvalidLoginTest2() {
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("admin1");
		driver.findElement(By.tagName("button")).click();
		
		String afterLoginTitle = driver.getTitle();		
		Assert.assertEquals(afterLoginTitle, "Hostel Paradise" , "Verified the title of the dashboard");
	}
	
	@Test
	public void verifyInvalidLoginTest3() {
		driver.findElement(By.name("username")).sendKeys("root1");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		
		String afterLoginTitle = driver.getTitle();		
		Assert.assertEquals(afterLoginTitle, "Hostel Paradise" , "Verified the title of the dashboard");
	}
	
	
	@Test
	public void verifyInvalidLoginTest4() {
		driver.findElement(By.name("username")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		
		String afterLoginTitle = driver.getTitle();		
		Assert.assertEquals(afterLoginTitle, "Hostel Paradise" , "Verified the title of the dashboard");
	}
	
	@Test
	public void verifyInvalidLoginTest5() {
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.tagName("button")).click();
		
		String afterLoginTitle = driver.getTitle();		
		Assert.assertEquals(afterLoginTitle, "Hostel Paradise" , "Verified the title of the dashboard");
	}
	
	
	@Test
	public void verifyInvalidLoginTest6() {
		driver.findElement(By.name("username")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.tagName("button")).click();
		
		String afterLoginTitle = driver.getTitle();		
		Assert.assertEquals(afterLoginTitle, "Hostel Paradise" , "Verified the title of the dashboard");
	}
	
	@AfterClass
	public void browserClose() {
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
