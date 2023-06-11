package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class form
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("bhoyar.a94@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-required='false']")).sendKeys("Amol Istari Bhoyar");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@autocorrect='off'])[3]")).sendKeys("9049114610");
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])")).sendKeys("9421amol");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
