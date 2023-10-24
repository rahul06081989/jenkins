package myproject;


import org.testng.Assert;
import org.testng.annotations.Test;
public class Apptest {
	
	@Test
	public void testlogin1()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userlogin("abc","123"));
		
	}
	@Test
	public void testlogin2()
	{
		App myapp=new App();
		Assert.assertEquals(1,myapp.userlogin("rahul","1234"));
		
	}

}
 