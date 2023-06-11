package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceLogin
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='firstname'])")).sendKeys("Amol");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Bhoyar");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7972663143");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("'9421amol");
		driver.findElement(By.xpath("//select[@title='Day']")).sendKeys("12");
		driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("OCT");
		driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("1994");
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		
	}

}
