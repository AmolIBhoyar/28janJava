package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass3_assertTrue
{
	@Test
	public void TC3()
	{
		boolean actresult=false;
		Assert.assertTrue(actresult,"Failed: act result is false- ");
	}

}
