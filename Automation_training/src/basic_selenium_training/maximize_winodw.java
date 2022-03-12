package basic_selenium_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize_winodw {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser
		
		driver.get("http://www.techdrills.in/staging/"); // to launch any url we use get method
		
		driver.manage().window().maximize(); // to maximize the window size

	}

}
