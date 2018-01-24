package pak1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Title {
	public static String driverpath = "C:\\Users\\RHURKADL\\Desktop\\";


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// 1. Launch Browser
				System.setProperty("webdriver.chrome.driver",driverpath+"chromedriver.exe");
				//WebDriver driver = new InternetExplorerDriver();
				WebDriver driver = new ChromeDriver();
				
				
				// 2. Navigate to URL
				driver.get("file:///C:/Users/RHURKADL/Desktop/Demos/Lesson%202%20-%20Demos/HTML%20Pages/LocatingElements.html");
				//driver.get("http://demo.opencart.com");
				
				
				Thread.sleep(5000);
		//maximize browser window
				
				//driver.manage().window().maximize();
				
		
		
		//compare expected title with actual title
				
				/*String expectedtitle= "Employee Detail";
				String actualtitle=driver.getTitle();
				if(actualtitle.equals(expectedtitle))
				{
					System.out.println("Test Passsed");
				}
				else
				{
					System.out.println("Test Failed");
				}
				
				driver.findElement(By.id("FN")).sendKeys("Rohit");
				//driver.findElement(By.id("FN")).sendKeys.
				//System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getPageSource());
				boolean txt= driver.getPageSource().contains("alert");
				System.out.println(txt);
				
				WebElement wb5 = driver.findElement(By.xpath("//h3"));
						String htxt = wb5.getText();
					System.out.println(htxt);*/
				
	//getattribute Method
					
					
					//String str1 = driver.findElement(By.id("FN")).getAttribute("name");
					//System.out.println(str1);
					
					//String str1 = driver.findElement(By.id("FN")).getAttribute("type");
					//System.out.println(str1);
					
					//String str1 = driver.findElement(By.id("FN")).getAttribute("name");
					//System.out.println(str1);
					
					//String str1 = driver.findElement(By.id("FN")).getAttribute("value");
					//System.out.println(str1);
					
					
	
					/* List<WebElement> linkElements = driver.findElements(By.tagName("a"));
					System.out.println(linkElements.size());
					String [] linkTexts = new String[linkElements.size()];
					int i = 0;
					
				//extract the link texts of each link element
					
					for(WebElement e : linkElements)
					{	
						linkTexts[i] = e.getText();
						System.out.println("The Hyperlink-text is"+linkTexts[i]);
						i++;
					}  */
					
	
			
					
	  //to wait till the page gets load
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
	
					
					
					
					
	}

}
