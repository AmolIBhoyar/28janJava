package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_XpathByIndex
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//click on create new acc
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//enter fn
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Amol");
		//enter surname
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Bhoyar");
	    //enter mob no
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9049114610");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("abc");
	}

}
