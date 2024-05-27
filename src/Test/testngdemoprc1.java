package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngdemoprc1 {

	
	@Test
	public void day2()
	{
		System.out.println("Hello Test NG 2");
	}
	
	@BeforeTest
	
	public void before() 
	{
		System.out.println("I will execute first");
	}
}
