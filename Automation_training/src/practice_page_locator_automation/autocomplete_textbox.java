package practice_page_locator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete_textbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser	
		driver.manage().window().maximize();
		driver.get("https://www.techdrills.in/practice.html");
		
		driver.findElement(By.id("myInput")).sendKeys("Indi");
		Thread.sleep(1000);
		driver.findElement(By.id("myInput")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		String selectedCoountry = driver.findElement(By.id("myInput")).getText();
		System.out.println("Inputed key is - Indi and Selected country is -- "+ selectedCoountry);

		
		// keys actions.... bottom, top, left, right, enter, alt, tab...
		
		driver.findElement(By.id("dropdown-class-example")).click();
		driver.findElement(By.id("dropdown-class-example")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.id("dropdown-class-example")).sendKeys(Keys.ENTER);
	}

}
