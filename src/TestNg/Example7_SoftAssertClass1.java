package TestNg;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example7_SoftAssertClass1
{
	@Test
	public void TC5()
	{
		String actresult="hi";
		String expresult="hello";
		Assert.assertEquals(actresult, expresult,"Failed1: both results are diff-");
		
		boolean actresult1=false;
		Assert.assertTrue(actresult1,"Failed2: act result is false-");

		//soft.assertAll();
	}
	

}
