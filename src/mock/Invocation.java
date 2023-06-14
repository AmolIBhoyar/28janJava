package mock;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation
{
	@Test(invocationCount=5)
	public void TC1()
	{
		Reporter.log("running Tc1", true);
	}

}
