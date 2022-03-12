package basic_selenium_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_operations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser
		
		driver.get("https://www.selenium.dev/documentation/"); // to launch any url we use get method
				
		// get the title of the current tab/window
		String title = driver.getTitle();
		System.out.println(title);
		
		// get the current url
		String currentUrl =driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		System.out.println("---------------------------");
		
		driver.navigate().to("http://techdrills.in");
		
		// get the title of the current tab/window
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		// get the current url
		String currentUrl1 =driver.getCurrentUrl();
		System.out.println(currentUrl1);
		
		// get page source code
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
}
