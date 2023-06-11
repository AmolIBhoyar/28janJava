package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class mock11
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://fluentcrm.com/blog/");
		driver.findElement(By.xpath("//span[text()='Resources']")).click();
		driver.findElement(By.xpath("//a[text()='Blog']")).click();
		driver.findElement(By.xpath("//h1[@class='page-title post-home-title archive-title']")).getText();
		
	}

}
