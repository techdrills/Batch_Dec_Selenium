package practice_page_locator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multi_select_dropdown_automation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser	
		driver.manage().window().maximize();
//		driver.get("http://www.techdrills.in/practice.html");
//		
//		// code to automate multiple selectable dropdown list
//		
//		driver.findElement(By.className("overSelect")).click();
//		driver.findElement(By.id("one")).click();
//		driver.findElement(By.id("three")).click();
		
		// ------------------------------- way 2 --------------------------
		
		// following code wont work because of invalid locator
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		WebElement multipleSelect = driver.findElement(By.xpath("//*[@id=\"select-wrapper-619459\"]/select"));
		
		Select select = new Select(multipleSelect);
		select.selectByIndex(0);
		select.selectByIndex(2);
		select.selectByIndex(4);
		
		
	}

}
