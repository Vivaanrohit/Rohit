package pak1;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandle {

	
	public static String driverpath = "C:\\Users\\RHURKADL\\Desktop\\";
	public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", driverpath+ "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/RHURKADL/Desktop/Demos/Lesson%205-HTML%20Pages/PopupWin.html");
			driver.manage().window().maximize();

			String parent_window = driver.getWindowHandle();
			System.out.println(parent_window);
			
			driver.findElement(By.name("Open")).click();
			Thread.sleep(2000);
			
			
//			Switching from parent window to child window			
			Set<String> s1 = driver.getWindowHandles();
			
			Iterator<String> it = s1.iterator();
			
			while (it.hasNext())
			{
				String child_window = it.next();
				if(!parent_window.equalsIgnoreCase(child_window))
				{
					System.out.println(child_window);
					
//					Switching from parent to child window
					driver.switchTo().window(child_window);
					Thread.sleep(5000);
					
//					Performing action on child window
					driver.findElement(By.linkText("Open Window"));
					driver.close();
					
				}
			}
//			Switching back to parent window
			driver.switchTo().window(parent_window);
			
		}

	}


