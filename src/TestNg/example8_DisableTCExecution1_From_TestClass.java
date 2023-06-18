package TestNg;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_DisableTCExecution1_From_TestClass 
{
	@Test
	public void TC1()
	{
		Reporter.log("--runing Tc1--", true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("--runing Tc2--", true);
	}
	@Test(enabled=false)
	public void TC3()
	{
		Reporter.log("--runing Tc3--", true);
	}

}
