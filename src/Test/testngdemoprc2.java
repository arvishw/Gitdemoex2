package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testngdemoprc2 {

	
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Before class belong to class lavel and it will execute before any method will execute");
	}
	
	@Test
	public void weblogincarlaonlogin() 
	{
		
		System.out.println("WEB car loan login");
	}
	@Test
	public void applogincarlaonlogin() 
	{
		
		System.out.println("APP car ****loan login");
	}
	@BeforeSuite
	public void beforsuite() {
		System.out.println("I am the no 1");
	}
	
	@Test
	public void applogincarlaonlogigsignin() 
	{
		
		System.out.println("APPcarloanloginSIGN IN");
	}
	@Test
	public void applogincarlaonloginsignout() 
	{
		
		System.out.println("APPcarloanloginSIGN OUT");
	}
	
	@Test
	public void apilogincarlaonlogin() 
	{
		
		System.out.println("APIcarloanlogin");
	}
	
	
}
