package pak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection_box {

	
		public static String driverpath = "C:\\Users\\RHURKADL\\Desktop\\";

		public static void main(String[] args) {
			
			// 1. Launch Browser
			System.setProperty("webdriver.chrome.driver",driverpath+"chromedriver.exe");
			//WebDriver driver = new InternetExplorerDriver();
			WebDriver driver = new ChromeDriver();
			
			
			// 2. Navigate to URL
			//driver.get("file:///C:/Users/RHURKADL/Desktop/Demos/Lesson%202%20-%20Demos/HTML%20Pages/LocatingElements.html");
			driver.navigate().to("file:///C:/Users/RHURKADL/Desktop/Demos/Lesson%202%20-%20Demos/HTML%20Pages/LocatingElements.html");
			//driver.navigate().forward();
			//driver.navigate().back();
			driver.navigate().refresh();
	
			
			//3.Select value from Drop down
				//1. Find drop down
			WebElement wb1 = driver.findElement(By.id("country"));
				//create an object of select class
					Select sel = new Select(wb1);
					// select value from Drop down
					//sel.selectByVisibleText("USA");
					//sel.selectByValue("USA");
					sel.selectByIndex(2);
					//driver.findElement(By.className("Format")).sendKeys("09/12/1995");
					driver.findElement(By.cssSelector("input#FN")).sendKeys("Rohit");
					
					driver.findElement(By.name("mname")).sendKeys("Arun");
					driver.findElement(By.cssSelector("input[value='male']")).click();
					driver.findElement(By.id("LN")).sendKeys("Hurkadli");
					driver.findElement(By.className("Format")).sendKeys("09/12/1995");
					driver.findElement(By.name("contact_no")).sendKeys("9900334562");
					driver.findElement(By.id("EmailID")).sendKeys("vivaanrohit@gmail.com");
					driver.findElement(By.id("PNO")).sendKeys("ALMPH1305A");
					driver.findElement(By.name("total_exp")).sendKeys("3");
					driver.findElement(By.name("relv_exp")).sendKeys("3");
					driver.findElement(By.name("present_emp")).sendKeys("Capgemini");
					
					
					WebElement wb2 = driver.findElement(By.name("relation"));
					Select sel1 = new Select(wb2);
					sel1.selectByIndex(02);
					driver.findElement(By.name("resume")).sendKeys("Rohit Resume");
					
					WebElement wb3 = driver.findElement(By.id("city_input"));
					Select sel2 = new Select(wb3);
					sel2.selectByIndex(02);
					//driver.findElement(By.name("submit")).click();
					driver.findElement(By.id("prev")).click();
					
				
	}

}
