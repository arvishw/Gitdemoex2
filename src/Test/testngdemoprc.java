package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngdemoprc {
	
	@Parameters({"URL"})
	@AfterTest
	public void aftertest(String urlname)
	{
		System.out.println("Will execute last");
		System.out.println(urlname);
	}
	
	@Test
	public void day1()
	{
		System.out.println("Hello TestNG");
	}
   
	@AfterSuite()
	public void AfterSuite() 
	{
		System.out.println("I am the number one from the last");
	
	}
	@Test
	public void day3() {
		
		System.out.println("Hello TestNG3");
	}
}
