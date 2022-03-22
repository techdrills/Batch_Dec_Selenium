package practice_page_locator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser	
		driver.manage().window().maximize();
		driver.get("https://www.techdrills.in/practice.html");	
		
		// scroll the page little down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		driver.findElement(By.linkText("Top")).click();
		
		// code to read the text from web page
//		String readText = driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[2]/td[2]")).getText();
//		System.out.println(readText);
	}

}
