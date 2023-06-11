package TestNg;


import org.junit.Test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class example4_Annotation
{
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("--open browser ", true);
	}
	@BeforeMethod
	public void LoginToApp()
	{
		Reporter.log("--loginToApp--", true);
	}
	@Test
	public void verifyfullName1()
	{
		Reporter.log("--runnig verifyFullname TC1--", true);
	}
	@Test
	public void verifyfullName2()
	{
		Reporter.log("--runnig verifyFullname TC1--", true);
	}
	@AfterMethod
	public void LogOutfromapp()
	{
		Reporter.log("--Log Out From App--", true);
	}
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("--Close Browser--", true);
	}

}
