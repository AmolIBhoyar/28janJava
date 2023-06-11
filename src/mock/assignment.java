package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://givewp.com/");
		driver.findElement(By.xpath("//span[text()='Pricing']")).click();
		driver.findElement(By.xpath("(//a[@target='_self'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Try GiveWP for Free!']")).click();
		driver.findElement(By.xpath("(//input[@name='input_1.3'])[2]")).sendKeys("Amol");
		driver.findElement(By.xpath("(//input[@name='input_2'])[2]")).sendKeys("bhoyar.a94@gmail.com");
		driver.findElement(By.xpath("(//input[@class=\"gform_button button\"])[2]")).click();
	    driver.findElement(By.xpath("//span[text()='See a Live Demo']")).click();
	    driver.findElement(By.xpath("(//a[text()='Free Features'])[1]")).click();
	    driver.findElement(By.xpath("//a[text()='Multi-Step Form']")).click();
	    driver.findElement(By.xpath("(//a[contains(@href,'#free-')])[9]")).click();
	    driver.findElement(By.xpath("(//a[contains(@href,'#free-')])[10]")).click();
	    
	}
	

}
