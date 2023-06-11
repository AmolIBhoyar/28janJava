package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhoyar.a95@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9421896295");
	}

}
