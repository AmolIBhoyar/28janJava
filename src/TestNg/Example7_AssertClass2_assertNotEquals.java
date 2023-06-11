package TestNg;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass2_assertNotEquals
{
	@Test
	public void TC2()
	{
		String actresult="hi";
		String expresult="hi";
		Assert.assertNotEquals(actresult, expresult);
	}

}
