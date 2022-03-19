package practice_page_locator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down_selection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser	
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/practice.html");
		
		// code to handle dropdown
		
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		// select.selectByIndex(3);  // select by index (index always starts from 0)
		 select.selectByValue("Selenium-att");  // select by value (you will get value after inspecting the web element)
		// select.selectByVisibleText("TestCraft");  // select by visible text (you can select the option based on visible text)
		
	}

}
