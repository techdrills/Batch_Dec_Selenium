package basic_selenium_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser
		
		driver.get("http://ecollegeweb.in/hostel_project/login"); // to launch any url we use get method
		
		driver.navigate().to("http://www.techdrills.in/staging/examTest/"); // to launch any url we use get method

		driver.navigate().back(); // it will navigate to one step back
		
		driver.navigate().forward(); // it will navigate to one step forward
		
		driver.navigate().refresh(); // it will refresh the page
	}

}
