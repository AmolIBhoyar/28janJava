package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhoyar.a95@gmail.com");
	     
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9421896295");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
