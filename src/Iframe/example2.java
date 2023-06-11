package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 
{
	public static void main(String[] args) 
	{
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	driver.switchTo().frame("iframeResult");
	String value = driver.findElement(By.tagName("p")).getText();
	System.out.println(value);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
	String result = driver.findElement(By.tagName("h1")).getText();
	System.out.println(result);
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[4]")).click();

	}

}
