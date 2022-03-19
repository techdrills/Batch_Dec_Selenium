package practice_page_locator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button_handeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser	
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/practice.html");
		
		// code to handel radio button
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[2]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[3]/input[1]")).click();
	}

}
