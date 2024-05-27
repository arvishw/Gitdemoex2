package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngdemoprc3 {

	@BeforeMethod
	
	public void BeforeMethod()
	{
		System.out.println("It will execute this method first before any method in the same class");
	}
	
	@Test
	public void webloginhomelaonlogin() 
	{
		
		System.out.println("Webhome loan login");
	}
	@Test
	public void apploginHomelaonlogin() 
	{
		
		System.out.println("apphome loan login");
	}
	@Test
	public void apiloginHomelaonlogin() 
	{
		
		System.out.println("apihome loan login");
	}
}
