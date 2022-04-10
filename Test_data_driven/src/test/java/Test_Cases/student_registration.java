package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.excelUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class student_registration {
	
	public static WebDriver driver;
	excelUtility reader = new excelUtility("F:\\selenium_files\\student_data.xlsx");
	public static String sheetname = "registration";
	
	
	@BeforeClass
	public void setup() {
		String browser = reader.getCellData("config", "browser", 2);
		
		// code to launch browser dynamically from excel data
		
		if(browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		}
		else if(browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
					
		}
		else if(browser.contains("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else {
			System.out.println("Browser Name is invalid...");
		}
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void setURL() {
		String BaseUrl = reader.getCellData("config", "url", 2);
		driver.get(BaseUrl);
	}
	
	// our tests for registration
	
	@Test
	public void validReg() {
		// reading data and storing into the another variable and passing to sendkeys method
		String name = reader.getCellData(sheetname, "name", 2);
		driver.findElement(By.id("namer")).sendKeys(name);
		
		// reading data and passing to the sendkeys method without storing in another variable
		driver.findElement(By.id("gender")).sendKeys(reader.getCellData(sheetname, "gender", 2));
		driver.findElement(By.id("colleger")).sendKeys(reader.getCellData(sheetname, "college", 2));
		driver.findElement(By.id("emailr")).sendKeys(reader.getCellData(sheetname, "email", 2));
		driver.findElement(By.id("mobr")).sendKeys(reader.getCellData(sheetname, "mobile", 2));
		driver.findElement(By.id("passwordr")).sendKeys(reader.getCellData(sheetname, "password", 2));
		driver.findElement(By.id("cpasswordr")).sendKeys(reader.getCellData(sheetname, "cnfpassword", 2));
		driver.findElement(By.id("signupbtb")).click();
		
		// test case validation
		String expectedUrlAfterLogin = "https://www.techdrills.in/staging/examTest/account.php?q=1";
		Assert.assertEquals(expectedUrlAfterLogin, driver.getCurrentUrl());
		Assert.assertEquals(name, driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/span/a[1]")).getText());
		reader.setCellData(sheetname, "status", 2, "Passed");
	}
	
	@Test
	public void nameValidationReg() {		
		// reading data and passing to the sendkeys method without storing in another variable
		driver.findElement(By.id("namer")).sendKeys(reader.getCellData(sheetname, "name", 3));		
		driver.findElement(By.id("gender")).sendKeys(reader.getCellData(sheetname, "gender", 3));
		driver.findElement(By.id("colleger")).sendKeys(reader.getCellData(sheetname, "college", 3));
		driver.findElement(By.id("emailr")).sendKeys(reader.getCellData(sheetname, "email", 3));
		driver.findElement(By.id("mobr")).sendKeys(reader.getCellData(sheetname, "mobile", 3));
		driver.findElement(By.id("passwordr")).sendKeys(reader.getCellData(sheetname, "password", 3));
		driver.findElement(By.id("cpasswordr")).sendKeys(reader.getCellData(sheetname, "cnfpassword", 3));
		driver.findElement(By.id("signupbtb")).click();
		
		// test case validation
		Assert.assertEquals("Name must be filled out.", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		reader.setCellData(sheetname, "status", 3, "Passed");
		
	}
	
	@Test
	public void collegeValidationReg() {
		// reading data and passing to the sendkeys method without storing in another variable
		driver.findElement(By.id("namer")).sendKeys(reader.getCellData(sheetname, "name", 4));		
		driver.findElement(By.id("gender")).sendKeys(reader.getCellData(sheetname, "gender", 4));
		driver.findElement(By.id("colleger")).sendKeys(reader.getCellData(sheetname, "college", 4));
		driver.findElement(By.id("emailr")).sendKeys(reader.getCellData(sheetname, "email", 4));
		driver.findElement(By.id("mobr")).sendKeys(reader.getCellData(sheetname, "mobile", 4));
		driver.findElement(By.id("passwordr")).sendKeys(reader.getCellData(sheetname, "password", 4));
		driver.findElement(By.id("cpasswordr")).sendKeys(reader.getCellData(sheetname, "cnfpassword", 4));
		driver.findElement(By.id("signupbtb")).click();
		
		// test case validation
		Assert.assertEquals("college must be filled out.", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		reader.setCellData(sheetname, "status", 4, "Passed");
	}
	
	@Test
	public void emailValidationReg() {
		// reading data and passing to the sendkeys method without storing in another variable
		driver.findElement(By.id("namer")).sendKeys(reader.getCellData(sheetname, "name", 5));		
		driver.findElement(By.id("gender")).sendKeys(reader.getCellData(sheetname, "gender", 5));
		driver.findElement(By.id("colleger")).sendKeys(reader.getCellData(sheetname, "college", 5));
		driver.findElement(By.id("emailr")).sendKeys(reader.getCellData(sheetname, "email", 5));
		driver.findElement(By.id("mobr")).sendKeys(reader.getCellData(sheetname, "mobile", 5));
		driver.findElement(By.id("passwordr")).sendKeys(reader.getCellData(sheetname, "password", 5));
		driver.findElement(By.id("cpasswordr")).sendKeys(reader.getCellData(sheetname, "cnfpassword", 5));
		driver.findElement(By.id("signupbtb")).click();
		
		// test case validation
		Assert.assertEquals("Not a valid e-mail address.", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		reader.setCellData(sheetname, "status", 5, "Passed");
	}
	
	@Test
	public void passwordValidationReg() {
		// reading data and passing to the sendkeys method without storing in another variable
		driver.findElement(By.id("namer")).sendKeys(reader.getCellData(sheetname, "name", 6));		
		driver.findElement(By.id("gender")).sendKeys(reader.getCellData(sheetname, "gender", 6));
		driver.findElement(By.id("colleger")).sendKeys(reader.getCellData(sheetname, "college", 6));
		driver.findElement(By.id("emailr")).sendKeys(reader.getCellData(sheetname, "email", 6));
		driver.findElement(By.id("mobr")).sendKeys(reader.getCellData(sheetname, "mobile", 6));
		driver.findElement(By.id("passwordr")).sendKeys(reader.getCellData(sheetname, "password", 6));
		driver.findElement(By.id("cpasswordr")).sendKeys(reader.getCellData(sheetname, "cnfpassword", 6));
		driver.findElement(By.id("signupbtb")).click();
		
		// test case validation
		Assert.assertEquals("Password must be filled out", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		reader.setCellData(sheetname, "status", 6, "Passed");
	}
	
	@Test
	public void invalidMobileReg() {
		// reading data and passing to the sendkeys method without storing in another variable
		driver.findElement(By.id("namer")).sendKeys(reader.getCellData(sheetname, "name", 7));		
		driver.findElement(By.id("gender")).sendKeys(reader.getCellData(sheetname, "gender", 7));
		driver.findElement(By.id("colleger")).sendKeys(reader.getCellData(sheetname, "college", 7));
		driver.findElement(By.id("emailr")).sendKeys(reader.getCellData(sheetname, "email", 7));
		driver.findElement(By.id("mobr")).sendKeys(reader.getCellData(sheetname, "mobile", 7));
		driver.findElement(By.id("passwordr")).sendKeys(reader.getCellData(sheetname, "password", 7));
		driver.findElement(By.id("cpasswordr")).sendKeys(reader.getCellData(sheetname, "cnfpassword", 7));
		driver.findElement(By.id("signupbtb")).click();
		
		// test case validation
		Assert.assertEquals("Mobile should not be more than 10 digits", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		reader.setCellData(sheetname, "status", 7, "Passed");
	}
	
	@Test
	public void invalidEmailReg() {
		// reading data and passing to the sendkeys method without storing in another variable
		driver.findElement(By.id("namer")).sendKeys(reader.getCellData(sheetname, "name", 8));		
		driver.findElement(By.id("gender")).sendKeys(reader.getCellData(sheetname, "gender", 8));
		driver.findElement(By.id("colleger")).sendKeys(reader.getCellData(sheetname, "college", 8));
		driver.findElement(By.id("emailr")).sendKeys(reader.getCellData(sheetname, "email", 8));
		driver.findElement(By.id("mobr")).sendKeys(reader.getCellData(sheetname, "mobile", 8));
		driver.findElement(By.id("passwordr")).sendKeys(reader.getCellData(sheetname, "password", 8));
		driver.findElement(By.id("cpasswordr")).sendKeys(reader.getCellData(sheetname, "cnfpassword", 8));
		driver.findElement(By.id("signupbtb")).click();
		
		// test case validation
		String expectedUrlAfterInvalidEmail = "https://www.techdrills.in/staging/examTest/index.php";
		Assert.assertEquals(expectedUrlAfterInvalidEmail, driver.getCurrentUrl());
		reader.setCellData(sheetname, "status", 8, "Passed");
	}
	
	@Test
	public void invalidNameReg() {
		// reading data and passing to the sendkeys method without storing in another variable
		driver.findElement(By.id("namer")).sendKeys(reader.getCellData(sheetname, "name", 9));		
		driver.findElement(By.id("gender")).sendKeys(reader.getCellData(sheetname, "gender", 9));
		driver.findElement(By.id("colleger")).sendKeys(reader.getCellData(sheetname, "college", 9));
		driver.findElement(By.id("emailr")).sendKeys(reader.getCellData(sheetname, "email", 9));
		driver.findElement(By.id("mobr")).sendKeys(reader.getCellData(sheetname, "mobile", 9));
		driver.findElement(By.id("passwordr")).sendKeys(reader.getCellData(sheetname, "password", 9));
		driver.findElement(By.id("cpasswordr")).sendKeys(reader.getCellData(sheetname, "cnfpassword", 9));
		driver.findElement(By.id("signupbtb")).click();
		
		// test case validation
		Assert.assertEquals("Name must be filled out.", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		reader.setCellData(sheetname, "status", 9, "Passed");
	}
	
	@Test
	public void invalidConfirmPassReg() {
		// reading data and passing to the sendkeys method without storing in another variable
		driver.findElement(By.id("namer")).sendKeys(reader.getCellData(sheetname, "name", 10));		
		driver.findElement(By.id("gender")).sendKeys(reader.getCellData(sheetname, "gender", 10));
		driver.findElement(By.id("colleger")).sendKeys(reader.getCellData(sheetname, "college", 10));
		driver.findElement(By.id("emailr")).sendKeys(reader.getCellData(sheetname, "email", 10));
		driver.findElement(By.id("mobr")).sendKeys(reader.getCellData(sheetname, "mobile", 10));
		driver.findElement(By.id("passwordr")).sendKeys(reader.getCellData(sheetname, "password", 10));
		driver.findElement(By.id("cpasswordr")).sendKeys(reader.getCellData(sheetname, "cnfpassword", 10));
		driver.findElement(By.id("signupbtb")).click();
		
		// test case validation
		Assert.assertEquals("Passwords must match.", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		reader.setCellData(sheetname, "status", 10, "Passed");
	}
	
	
	
	@Test (enabled=false)
	public void readDataFromExcel() {
		// reading the data from excel sheet
		for(int i = 2; i <= reader.getRowCount(sheetname); i++){
			System.out.println(reader.getCellData(sheetname, "name", i));
			System.out.println(reader.getCellData(sheetname, "gender", i));
			System.out.println(reader.getCellData(sheetname, "college", i));
			System.out.println(reader.getCellData(sheetname, "email", i));
			System.out.println(reader.getCellData(sheetname, "mobile", i));
			System.out.println(reader.getCellData(sheetname, "password", i));
			System.out.println(reader.getCellData(sheetname, "type", i));
			System.out.println("----------------------");
		}
	}
	
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
