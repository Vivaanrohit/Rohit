package pak1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLess {
	
	
	public static void main(String[] args)
	{
		                                                                                                                                                                                          
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(01, TimeUnit.SECONDS);
		Boolean title = driver.getTitle().contains("Your Store");
		// String title1 = driver.getTitle().contains("EmailRegistrationForm");
		System.out.println(title);
		
	
	}

}
