package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_isEnable2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		boolean result=driver.findElement(By.xpath("//div[contains(@class,'x13lgxp2 ')]")).isEnabled();
		System.out.println(result);
		if(result)
		{
			System.out.println("is enable");
		}
		else
		{
			System.out.println("is disable");
		}
		
	}

}
