package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example3_EmailableReports
{
	@Test
	public void TC1()
	{
		//System.out.println("hello");
		Reporter.log("running TC1 test case", true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("running TC2 test case", true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("running TC3 test case", true);
	}

	
}
