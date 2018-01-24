package pak1;

import java.net.MalformedURLException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class SelGrid {
	
	//public static String driverpath = "C:\\Users\\RHURKADL\\Desktop\\";

	public static void main(String[] args) throws MalformedURLException 
	{
		

	//System.setProperty("webdriver.chrome.driver", driverpath+ "chromedriver.exe");	
	// WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new ChromeDriver();
		
		
		//Desired Capabilities capability = DesireCapabilities.firefox();
	
		
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		
		capability.setVersion("25.0");
		capability.setPlatform(Platform.ANY);
		//capability.setVersion(Version.getVersion());
		//WebDriver driver=new RemoteWebDriver(new URL("http://localhost/wd/hub"),capability);
         WebDriver driver = new RemoteWebDriver(new URL("http://10.51.91.95:5566/wd/hub"),capability);
		// new RemoteWebDriver (new URL(""));
		
		try{
			driver.get("http://demo.opencart.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
		}
		
		catch(Exception ex){
			System.out.println("Hello");
		}
		
		
		
		
		
	}

}
