package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataproviderparameterise {

	
	@Test(dataProvider = "getData")
	public void login(String username,String password)
	
	{
		System.out.println("Login Sucessfully");
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
         data[0][0]="user1";
         data[0][1]="pwd1";
         
         data[1][0]="user1";
         data[1][1]="pwd1";
         
         data[2][0]="user1";
         data[2][1]="pwd1";
         
         return data;
	}
	
}
