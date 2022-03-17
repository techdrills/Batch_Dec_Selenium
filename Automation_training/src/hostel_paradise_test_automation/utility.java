package hostel_paradise_test_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class utility {
	
	// utility method to login
	public static void doLogin(WebDriver driver) {
		driver.findElement(By.id("username")).sendKeys("root");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();		
	}
	
	public static void doLogOut(WebDriver driver) throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	

}
