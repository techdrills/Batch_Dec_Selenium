package Test_Cases;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.excelUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class student_login_testCases {
	
	public static WebDriver driver;
	//public static excelUtility read = new excelUtility("F:\\selenium_files\\testData.xlsx");
	excelUtility read = new excelUtility("F:\\selenium_files\\student_data.xlsx");
	public static String sheetname = "student_login";
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void setURL() {
		driver.get("https://www.techdrills.in/staging/examTest/index.php");
	}
	
	@Test
	public void verifyValidLogin() throws InterruptedException {
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.linkText("Signin")).sendKeys(Keys.TAB, Keys.TAB);
		
		// get the data for user id and password from the excel file
		
		String uname = read.getCellData(sheetname, "userid", 2);
		String pwd = read.getCellData(sheetname, "password", 2);		
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/account.php?q=1");
		String username = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/span/a[1]")).getText();
		Assert.assertEquals(username, "Peter Albert");
	}
	
	@Test
	public void verifyInvalidLogin1() throws InterruptedException {
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.linkText("Signin")).sendKeys(Keys.TAB, Keys.TAB);
		
		// get the data for user id and password from the excel file
		
		String uname = read.getCellData(sheetname, "userid", 3);
		String pwd = read.getCellData(sheetname, "password", 3);		
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		
		// alert message validation
		driver.switchTo().alert();
		String errorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, "Wrong Username or Password");
		driver.switchTo().alert().accept();
		
		// url validation
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/index.php?w=Wrong%20Username%20or%20Password");
	}
	
	@Test
	public void verifyInvalidLogin2() throws InterruptedException {
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.linkText("Signin")).sendKeys(Keys.TAB, Keys.TAB);
		
		// get the data for user id and password from the excel file
		
		String uname = read.getCellData(sheetname, "userid", 4);
		String pwd = read.getCellData(sheetname, "password", 4);		
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		
		// alert message validation
		driver.switchTo().alert();
		String errorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, "Wrong Username or Password");
		driver.switchTo().alert().accept();
		
		// url validation
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/index.php?w=Wrong%20Username%20or%20Password");
	}
	
	@Test
	public void verifyInvalidLogin3() throws InterruptedException {
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.linkText("Signin")).sendKeys(Keys.TAB, Keys.TAB);
		
		// get the data for user id and password from the excel file
		
		String uname = read.getCellData(sheetname, "userid", 5);
		String pwd = read.getCellData(sheetname, "password", 5);		
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		
		// alert message validation
		driver.switchTo().alert();
		String errorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, "Wrong Username or Password");
		driver.switchTo().alert().accept();
		
		// url validation
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/index.php?w=Wrong%20Username%20or%20Password");
	}
	
	@Test
	public void verifyInvalidLogin4() throws InterruptedException {
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.linkText("Signin")).sendKeys(Keys.TAB, Keys.TAB);
		
		// get the data for user id and password from the excel file
		
		String uname = read.getCellData(sheetname, "userid", 6);
		String pwd = read.getCellData(sheetname, "password", 6);		
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		
		// alert message validation
		driver.switchTo().alert();
		String errorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, "Wrong Username or Password");
		driver.switchTo().alert().accept();
		
		// url validation
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/index.php?w=Wrong%20Username%20or%20Password");
	}
	
	@Test
	public void verifyInvalidLogin5() throws InterruptedException {
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.linkText("Signin")).sendKeys(Keys.TAB, Keys.TAB);
		
		// get the data for user id and password from the excel file
		
		String uname = read.getCellData(sheetname, "userid", 7);
		String pwd = read.getCellData(sheetname, "password", 7);		
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		
		// alert message validation
		driver.switchTo().alert();
		String errorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, "Wrong Username or Password");
		driver.switchTo().alert().accept();
		
		// url validation
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/index.php?w=Wrong%20Username%20or%20Password");
	}
	
	@Test
	public void verifyInvalidLogin6() throws InterruptedException {
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.linkText("Signin")).sendKeys(Keys.TAB, Keys.TAB);
		
		// get the data for user id and password from the excel file
		
		String uname = read.getCellData(sheetname, "userid", 8);
		String pwd = read.getCellData(sheetname, "password", 8);		
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		
		// alert message validation
		driver.switchTo().alert();
		String errorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, "Wrong Username or Password");
		driver.switchTo().alert().accept();
		
		// url validation
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/index.php?w=Wrong%20Username%20or%20Password");
	}
	
	@Test
	public void verifyInvalidLogin7() throws InterruptedException {
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.linkText("Signin")).sendKeys(Keys.TAB, Keys.TAB);
		
		// get the data for user id and password from the excel file
		
		String uname = read.getCellData(sheetname, "userid", 9);
		String pwd = read.getCellData(sheetname, "password", 9);		
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		
		// alert message validation
		driver.switchTo().alert();
		String errorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, "Wrong Username or Password");
		driver.switchTo().alert().accept();
		
		// url validation
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/index.php?w=Wrong%20Username%20or%20Password");
	}
	
	@Test
	public void verifyInvalidLogin8() throws InterruptedException {
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.linkText("Signin")).sendKeys(Keys.TAB, Keys.TAB);
		
		// get the data for user id and password from the excel file
		
		String uname = read.getCellData(sheetname, "userid", 10);
		String pwd = read.getCellData(sheetname, "password", 10);		
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		
		// alert message validation
		driver.switchTo().alert();
		String errorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, "Wrong Username or Password");
		driver.switchTo().alert().accept();
		
		// url validation
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/index.php?w=Wrong%20Username%20or%20Password");
	}
	
	@Test
	public void verifyInvalidLogin9() throws InterruptedException {
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.linkText("Signin")).sendKeys(Keys.TAB, Keys.TAB);
		
		// get the data for user id and password from the excel file
		
		String uname = read.getCellData(sheetname, "userid", 11);
		String pwd = read.getCellData(sheetname, "password", 11);		
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		//Assertions i.e. Test Case Validations
		
		// alert message validation
		driver.switchTo().alert();
		String errorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, "Wrong Username or Password");
		driver.switchTo().alert().accept();
		
		// url validation
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.techdrills.in/staging/examTest/index.php?w=Wrong%20Username%20or%20Password");
	}
	
	
	@AfterClass
	public void closeSetup() {
		driver.quit();
	}
	
	
	
	
	
	
}
