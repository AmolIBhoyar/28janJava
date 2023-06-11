package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aa 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ncertnt.samarth.edu.in/index.php/site/login");
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		driver.findElement(By.xpath("//input[@name='SignupForm[email]']")).sendKeys("bhoyar.a94@gmail.com");
		driver.findElement(By.xpath("//input[@name='SignupForm[repeatemail]']")).sendKeys("bhoyar.a94@gmail.com");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("9421amol");
		driver.findElement(By.xpath("//input[@name='SignupForm[repeatpassword]']")).sendKeys("9421amol");
		driver.findElement(By.xpath("//input[@name='SignupForm[mobile]']")).sendKeys("9049114610");
	}

}
