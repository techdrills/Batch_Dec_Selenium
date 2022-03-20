package practice_page_locator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_box_handeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser	
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/practice.html");
		
		// code to automate checkbox
		
		boolean javaCheckBoxStatus = driver.findElement(By.id("checkBoxjava")).isSelected();
		System.out.println(javaCheckBoxStatus);
		
		boolean pythonCheckBoxStatus = driver.findElement(By.id("checkBoxpython")).isSelected();
		System.out.println(pythonCheckBoxStatus);
		
		driver.findElement(By.id("checkBoxjava")).click();
		driver.findElement(By.id("checkBoxpython")).click();
		driver.findElement(By.id("checkBoxkotlin")).click();
	
		
		// to verify the checkbox is already selected or not we can use isSelected(); method
		// and that return boolean value true or false
		
		javaCheckBoxStatus = driver.findElement(By.id("checkBoxjava")).isSelected();
		System.out.println(javaCheckBoxStatus);
		
		pythonCheckBoxStatus = driver.findElement(By.id("checkBoxpython")).isSelected();
		System.out.println(pythonCheckBoxStatus);


	}

}
