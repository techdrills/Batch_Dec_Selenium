package hostel_paradise_test_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser
		
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		// test case 1
		
		driver.findElement(By.id("username")).sendKeys("root");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		
		String homepageText = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[1]/h2")).getText();
		System.out.println(homepageText);
		
		String urlAfterLogin = driver.getCurrentUrl();
		//if(driver.getCurrentUrl().contains("/index")) {
		
		if(urlAfterLogin.contains("/index")) {
			System.out.println("Test Case is passed...");
		}
		else {
			System.out.println("Test Case is failed...");
		}
		

	}

}
