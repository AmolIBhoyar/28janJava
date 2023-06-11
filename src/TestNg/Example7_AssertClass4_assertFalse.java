package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass4_assertFalse
{
	@Test
	
		public void TC4()
		{
		boolean actresult=true;
		Assert.assertFalse(actresult,"Failed: act result is true- ");
			
		}
	}


