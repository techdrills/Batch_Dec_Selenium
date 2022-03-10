package basic_selenium_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome_browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		
		WebDriver driver = new ChromeDriver();  // this code for launching the browser
	
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("http://techdrills.in");
		
	}

}
