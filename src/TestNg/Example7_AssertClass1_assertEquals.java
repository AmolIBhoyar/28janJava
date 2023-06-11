package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass1_assertEquals 
{
	@Test
	public void TC1()
	{
		String actResult="hi";
		String expeResult="hello";
		Assert.assertEquals(actResult, expeResult,"Failed: both results are diff-");   //classnam.methodname()
	}

}
