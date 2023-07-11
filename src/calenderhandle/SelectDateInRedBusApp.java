package calenderhandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectDateInRedBusApp 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("-disabl-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//source
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		//dest
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Nagpur");
		Thread.sleep(2000);
		//open date menu
		driver.findElement(By.xpath("//text[@class='dateText']")).click();
		Thread.sleep(2000);
		//navigate to expectedmonth-> Aug
		while(driver.findElement(By.xpath("")))
		
		
	}

}
