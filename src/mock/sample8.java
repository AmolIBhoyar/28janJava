package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample8
{
	public static void main(String[] args) throws InterruptedException
	{
		//x path by attribute
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9049114610");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9421896295");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}
	

}
