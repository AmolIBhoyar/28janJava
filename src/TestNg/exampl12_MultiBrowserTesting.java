package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class exampl12_MultiBrowserTesting 
{
	@org.testng.annotations.Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
		WebDriver driver =null;
	if(browserName.equals("chrome"))
	{
		ChromeDriver driver1 = new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	

	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.quit();
}
}
