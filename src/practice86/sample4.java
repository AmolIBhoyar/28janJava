package practice86;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample4
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		//Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s=new Select(month);
		List<WebElement> alloption = s.getOptions();
		for(WebElement s1:alloption)
		{
			System.out.println(s1.getText());
		}
		
	}

}
