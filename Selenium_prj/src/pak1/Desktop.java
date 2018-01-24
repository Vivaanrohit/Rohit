package pak1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desktop {

	
		public static String driverpath = "C:\\Users\\RHURKADL\\Desktop\\";

		public static void main(String[] args) {
			
			// 1. Launch Browser
			System.setProperty("webdriver.chrome.driver",driverpath+"chromedriver.exe");
			//WebDriver driver = new InternetExplorerDriver();
			WebDriver driver = new ChromeDriver();
			
			
			// 2. Navigate to URL
			driver.get("file:https://demo.opencart.com");

	}

}
