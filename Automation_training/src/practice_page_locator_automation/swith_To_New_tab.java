package practice_page_locator_automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swith_To_New_tab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser	
		driver.manage().window().maximize();
		driver.get("https://www.techdrills.in/practice.html");	

		driver.findElement(By.id("opentab")).click();
		
		
		// to switch on another Tab or Window we can use getWindowHandle() or getWindowHandles()
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("My Parent Window Id is  -  " + parentWindow);
		
		// ----------Code started to get other window id's and switching--------------------
			Set <String> allWindows = driver.getWindowHandles();
			int windowSize = allWindows.size();
			System.out.println("All windows/tab is "+ windowSize);
			
			for(String childWindow : allWindows) {
				System.out.println("Child window is "+ childWindow);
				
				if(!parentWindow.equalsIgnoreCase(childWindow)) {
					driver.switchTo().window(childWindow); 
					System.out.println(driver.getCurrentUrl());	
		//----------Code End to get other window id's and switching--------------------
				}
			}
			
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.partialLinkText("er Now")).click();
		driver.findElement(By.name("firstname")).sendKeys("I am on Child window");	
		
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("openwindow")).click();
		
		
		
		
		
		
		
	}

}
