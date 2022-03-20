package practice_page_locator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser	
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/practice.html");
		
		// code to automate alert type 1 - simple alert and OK button
		
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText(); // get the alertbox text
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
		
		//-----------------------------------------------
		
//		how to handle OK button - accept();
//		how to handel CANCEL button - dismiss();
		
		driver.navigate().refresh();
		// code to automate alert type 2 - alert with OK and CANCEL button
		driver.findElement(By.id("name")).sendKeys("abcdedgh");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();		// this will click on CANCEL  button
	
	}
}
