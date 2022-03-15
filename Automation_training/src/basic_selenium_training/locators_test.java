package basic_selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser
		
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		
		//driver.findElement(By.className("au-input au-input--full")).sendKeys("123456"); // classname - this wont work because duplicate element
		
		//driver.findElement(By.id("password")).sendKeys("123456");  // id - id of the web element locator
		
		//driver.findElement(By.name("username")).sendKeys("1234565stwer");  // name - name of the locator
		
		//xpath-
		// there are two types of xpath
		// 1. Complete xpath - /html/body/div/div/div/div/div/div[2]/form/div[1]/input
		// 2. Relative xpath - //*[@id="username"]
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("root");  // relative xpath  - short xpath
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("admin");  // full xpath - complete path from top to targeted element
						
		//driver.findElement(By.tagName("button")).click(); // tagname - tagname of the locator
		
		driver.findElement(By.cssSelector("body > div > div > div > div > div > div.login-form > form > button")).click();
		
		
		// link text expample
		
		driver.get("http://www.techdrills.in/practice.html");
				// 1. linkText - complete text of the link
				// 2. partial linkText - some text of that link
				
				// driver.findElement(By.linkText("Navigate to Techdrills")).click();
				//driver.findElement(By.linkText("TechDrills was established by team of enthusiastic industry professionals from various organizations with the vision of providing IT training to fill the gap between industry requirement and learning")).click();
				driver.findElement(By.partialLinkText("s es")).click();
	}

}
