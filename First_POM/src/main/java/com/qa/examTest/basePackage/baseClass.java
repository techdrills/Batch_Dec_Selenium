package com.qa.examTest.basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.qa.examTest.utilities.excelUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	public static Properties prop;
	public static excelUtility reader;
	public static WebDriver driver;
	
	public baseClass() {
		try {
			reader = new excelUtility("F:\\selenium_files\\student_data.xlsx");
			prop = new Properties();
			FileInputStream ip =new FileInputStream("F:\\Test_Projects\\First_POM\\src\\main\\java\\com\\qa\\examTest\\config\\config.properties");
			prop.load(ip);
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
	}
	
	
	public static void setUp() {
		String browserName = prop.getProperty("browserName");
		
		if(browserName.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserName.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.contains("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else {
			System.out.println("Browser Name is Undefined...");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	
	public static void setDownn() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
