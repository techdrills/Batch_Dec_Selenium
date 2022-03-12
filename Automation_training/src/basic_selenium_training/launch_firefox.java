package basic_selenium_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_firefox {

	public static void main(String[] args) {
		
		// first things is to decide which browser you are going open and set the binary path for the same.
		
		System.setProperty("webdriver.gecko.driver", "F:\\selenium_files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// to launch url
		driver.get("http://ecollegeweb.in/hostel_project/login");
	}

}
