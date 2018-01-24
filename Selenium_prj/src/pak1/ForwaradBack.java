package pak1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ForwaradBack {

	public static String driverpath = "C:\\Users\\RHURKADL\\Desktop\\";

	public static void main(String[] args) throws InterruptedException {
		
		// 1. Launch Browser
		System.setProperty("webdriver.chrome.driver",driverpath+"chromedriver.exe");
		//WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();
		
		
		// 2. Navigate to URL
		driver.get("file:///C:/Users/RHURKADL/Desktop/Demos/Lesson%202%20-%20Demos/HTML%20Pages/LocatingElements.html");
		driver.navigate().to("https://www.google.co.in/search?dcr=0&source=hp&ei=IoZdWoXOFYya8wWBgYzgBA&q=gmail&oq=g&gs_l=psy-ab.1.1.0i131k1l3j0j0i131k1j0l5.390093.390093.0.392262.1.1.0.0.0.0.494.494.4-1.1.0....0...1c.1.64.psy-ab..0.1.494....0.lql2CyrY-4c&safe=active");
		//driver.navigate().forward();
	
		//driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().back();

	}

}
