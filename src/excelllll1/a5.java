package excelllll1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on close btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//enter mob name
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("fan");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String result = driver.findElement(By.tagName("(//div[@class='_2kHMtA'])[1]//span[7]")).getText();
		System.out.println(result);
		
		
	}

}
