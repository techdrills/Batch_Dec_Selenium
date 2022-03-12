package basic_selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser
		
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		// get the current url
		System.out.println("URL Before Login " + driver.getCurrentUrl());
		
		// to enter text in textbox
		driver.findElement(By.id("username")).sendKeys("root");
		
		driver.findElement(By.id("password")).sendKeys("admin");
		
		driver.findElement(By.name("submit")).click();

		// get the current url
		System.out.println("URL After Login " + driver.getCurrentUrl());
		
		driver.close();
	}

}
