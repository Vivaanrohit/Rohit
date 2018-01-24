package TestNGdemoPak;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	
	@BeforeClass
	public void bfrtest1()
	{
		System.out.println("Before class");	
	}
	@BeforeTest
	public void bfrtest()
	{
		System.out.println("Before Test");	
	}
	@BeforeMethod
	public void bfrtest2()
	{
		System.out.println("Before method");	
	}
  @Test(priority=0)
 
  //public void f() {
  	//System.out.println("Hello");
 
  public void update() {
	  System.out.println("updating the records");
  }
  
  @Test(priority=1)
  public void delete() {
	  System.out.println("deleting the records");
  }
  @AfterTest
	public void afterTest()
	{
		System.out.println("After test");	
	}
  @AfterClass
  	public void aftrtest1()
  	{
	  System.out.println("after class");
  	}
  
  @AfterMethod
	public void aftrtest2()
	{
	  System.out.println("after method");
	}
  
  
  
  
}
