package hostel_paradise_test_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class menu_test_addNewStudent extends utility {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_files\\chromedriver.exe");  // setting up system properties with chromedriver exe file
		WebDriver driver = new ChromeDriver();  // this code for launching the browser		
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		doLogin(driver);  // called a method for login functionality from utility class
		
		driver.findElement(By.xpath("//body/div[1]/aside[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]")).click();		
		Thread.sleep(2000); // 1000 Milliseconds = 1 sec
		
		String addNewStudentMenuUrl = driver.getCurrentUrl();
		System.out.println(addNewStudentMenuUrl);
		
		if(addNewStudentMenuUrl.contains("add_student")) {
			System.out.println("Add New Students Menu is visible and test case is passsed");
		}
		else {
			System.out.println("Test case is failed...");
		}
		
		doLogOut(driver);
		closeBrowser(driver);
		
		
		
	}

}
