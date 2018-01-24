package pak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium {
	public static String driverpath = "C:\\Users\\RHURKADL\\Desktop\\";

	public static void main(String[] args) {
		
		// 1. Launch Browser
		System.setProperty("webdriver.chrome.driver",driverpath+"chromedriver.exe");
		//WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();
		
		
		// 2. Navigate to URL
		driver.get("file:///C:/Users/RHURKADL/Desktop/Demos/Lesson%205-HTML%20Pages/WorkingWithForms.html");
		//3.Enter Username
		driver.findElement(By.id("txtUserName")).sendKeys("Rohit");
		driver.findElement(By.id("txtPassword")).sendKeys("1234");
		driver.findElement(By.id("txtConfPassword")).sendKeys("1234");
		driver.findElement(By.id("txtFirstName")).sendKeys("Arun");
		driver.findElement(By.id("txtLastName")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("txtEmail")).sendKeys("vivaanrohit@gmail.com");
		driver.findElement(By.id("txtAddress")).sendKeys("Mangalwar Peth");
		driver.findElement(By.id("txtPhone")).sendKeys("9900334562");
		driver.findElement(By.xpath("//input[@value='Music']")).click();
		
		//driver.findElement(By.name("submit")).click();
		//driver.close();
	
	
	
	}

}
