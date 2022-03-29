package onlineTestExam_testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class registration {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
	}
	
	@BeforeMethod
	public void setURL() {
		driver.get("https://www.techdrills.in/staging/examTest/");
	}
	
	@Test
	public void registerValidUser() throws InterruptedException {
		// Test Steps
		driver.findElement(By.id("namer")).sendKeys("Peter Albert");
		driver.findElement(By.id("gender")).sendKeys("Male");
		driver.findElement(By.id("colleger")).sendKeys("Sent Frasisc College, Johnseberg");
		driver.findElement(By.id("emailr")).sendKeys("test2@test.com");
		driver.findElement(By.id("mobr")).sendKeys("9191919191");
		driver.findElement(By.id("passwordr")).sendKeys("Pass@123");
		driver.findElement(By.id("cpasswordr")).sendKeys("Pass@123");
		driver.findElement(By.id("signupbtb")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/account.php?q=1");
		String username = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/span/a[1]")).getText();
		Assert.assertEquals(username, "Peter Albert");
	}

}









