package practice86;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/index.html");
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		//driver.switchTo().alert();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("bhoyar.a94@gmail.com");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("9421amol");
	driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		//alt.accept();
	//driver.findElement(By.xpath("(//a[@class='hrefch'])[5]")).click();
	driver.findElement(By.xpath("//a[text()='Cart']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	
	}

}
