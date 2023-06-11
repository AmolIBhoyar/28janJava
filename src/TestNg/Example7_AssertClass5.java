package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass5 
{
	@Test
	public void TC5()            //1st condition fail then next condition not execute
	{
		String actresult="hi";
		String expresult="hello";
		Assert.assertEquals(actresult, expresult,"Failed1: both results are diff- ");
		
		boolean actresult1=false;
		Assert.assertTrue(actresult1);
	}

}
