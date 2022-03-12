package basic_selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_borwser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser
		
		driver.get("http://www.techdrills.in/staging/"); // to launch any url we use get method
		
		driver.findElement(By.linkText("Online Exam")).click();
		
		// driver.close();  // this is for close the browser's current tab
		
		driver.quit(); // this is for close the entire browser
	}

}
