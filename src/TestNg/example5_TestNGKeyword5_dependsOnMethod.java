package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_TestNGKeyword5_dependsOnMethod
{
	@Test
	public void Login()
	{
		Reporter.log("--running Login TC--", true);
	}
	
	@Test(dependsOnMethods ="Login")
	public void Logout()
	{
		Reporter.log("--running Logout Tc--", true);
	}

}
