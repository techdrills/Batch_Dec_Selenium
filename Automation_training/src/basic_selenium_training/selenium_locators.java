package basic_selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser
		
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		
		
		
		
//		Locators in Selenium
		
//		1. ID
//		2. Name
//		3. Class Name
//		4. xpath
//		5. CSS Selector
//		6. Link Text
//		7. Tag Name

	}

}
