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
		SoftAssert soft=new SoftAssert();
		String actresult="hi";
		String expresult="hello";
		soft.assertEquals(actresult, expresult);
		
		boolean actResult1 = false;		
		soft.assertTrue(actResult1,"Failed2: act result is false- ");
		
		soft.assertAll();
	
		
	

		
	
	}
	

}
