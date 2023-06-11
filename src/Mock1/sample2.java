package Mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mngr506124");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dUbYrEj");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Agile Project']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		
		
	}

}
