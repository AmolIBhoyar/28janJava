package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathByAttribute
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//enter UN
		//driver.findElement("locator type")
		//driver.findelement(By.xpath("xpathExpression"))
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("9049114610");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("9421896295");
		//click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
