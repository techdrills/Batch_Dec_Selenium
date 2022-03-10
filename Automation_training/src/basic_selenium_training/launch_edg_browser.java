package basic_selenium_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launch_edg_browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "F:\\selenium_files\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		

		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("http://techdrills.in");
		
	}

}
