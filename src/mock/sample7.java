package mock;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample7 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//maximize
		driver.manage().window().minimize();
		
		
	}

}
