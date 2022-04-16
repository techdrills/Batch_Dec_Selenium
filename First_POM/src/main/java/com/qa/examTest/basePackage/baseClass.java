package com.qa.examTest.basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class baseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public baseClass() {
		try {
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

}
