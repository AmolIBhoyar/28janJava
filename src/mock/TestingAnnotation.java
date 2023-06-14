package mock;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingAnnotation
{
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("Open Browser", true);
	}
	@BeforeMethod
	public void Login()
	{
		Reporter.log("Login", true);
	}
	@Test
	public void VerifyName()
	{
		Reporter.log("VerifyName", true);
	}
	@Test
	public void Verifyaddress()
	{
		Reporter.log("Verifyaddress", true);
	}
	@AfterMethod
	public void Logout()
	{
		Reporter.log("Logout", true);
	}
	@AfterClass
	public void close()
	{
		Reporter.log("close", true);
	}

}
