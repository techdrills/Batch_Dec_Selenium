package onlineTestExam_testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	
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
	public void verifyValidUserLogin() throws InterruptedException {
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.linkText("Signin")).sendKeys(Keys.TAB, Keys.TAB);
		driver.findElement(By.id("email")).sendKeys("test2@test.com");
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/account.php?q=1");
		String username = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/span/a[1]")).getText();
		Assert.assertEquals(username, "Peter Albert");
	}
	
	@Test
	public void verifyInvalidUserLogin() {
		
	}

}









