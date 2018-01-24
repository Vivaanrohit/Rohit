package pak1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShowAlertBox {
	
	public static String driverpath = "C:\\Users\\RHURKADL\\Desktop\\";

		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			
			// 1. Launch Browser
					System.setProperty("webdriver.chrome.driver",driverpath+"chromedriver.exe");
					//WebDriver driver = new InternetExplorerDriver();
					WebDriver driver = new ChromeDriver();
					
					
					// 2. Navigate to URL
					//driver.get("file:///C:/Users/RHURKADL/Desktop/Demos/Lesson%202%20-%20Demos/HTML%20Pages/LocatingElements.html");
					//driver.get("http://demo.opencart.com");
					//driver.get("file:///C:/Users/RHURKADL/Desktop/Demos/Lesson%205-HTML%20Pages/AlertExample.html");
					driver.get("file:///C:/Users/RHURKADL/Desktop/Demos/Lesson%205-HTML%20Pages/PopupWin.html");
					 Thread.sleep(2000);

					//driver.findElement(By.name("btnAlert")).click();
					// to check if alert present
					
					//WebDriverWait wait = new WebDriverWait(driver,10);
					//wait.until(ExpectedConditions.alertIsPresent());
					//Switching to alert
					//Alert alt = driver.switchTo().alert();
					//fetch the txt of alert
				//	System.out.println(alt.getText());
					
					//to perform action on alert
					// to click on ok button
					//alt.accept();
					//to esc alert
					//alt.dismiss();
				
					 
					 
					 
					 
					 
					 
					 
//  Window Handle
			//To store parent window id
					 
					 String parent_window = driver.getWindowHandle();
					 System.out.println(parent_window);
					 
					//click on open window button
					 driver.findElement(By.name("Open")).click();
					 Thread.sleep(2000);
					//switching from parent window to child
					 
					Set<String> s1 = driver.getWindowHandles(); 
					
					Iterator<String> it = s1.iterator();
					
					while(it.hasNext())
					{
						String child_window=it.next();
						if(!parent_window.equalsIgnoreCase(child_window))
						{
							System.out.println(child_window);
							//Switching from parent to child window
							driver.switchTo().window(child_window);
							Thread.sleep(5000);
							//performing actions on child window
							driver.findElement(By.id("lst-ib")).sendKeys("Testing");
						//	driver.close();
						}
					}
					//Switching  back to parent window
					
					driver.switchTo().window(parent_window);	
						
					}
					
					
	}


