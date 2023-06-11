package excelllll1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.switchTo().frame("iframeResult");
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println(text);
		
		
		driver.switchTo().frame("//iframe[@title='Iframe Example']");
		String abc = driver.findElement(By.xpath("h1")).getText();
		System.out.println(abc);
	}

}
