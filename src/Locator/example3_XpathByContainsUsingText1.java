package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_XpathByContainsUsingText1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		//click on forgotten pwd link
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		
	}

}
