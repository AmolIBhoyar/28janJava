package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_isSelected2 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//click on create acc
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(3000);
		 WebElement femaleradiobtn = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		 femaleradiobtn.click();
		 boolean result = femaleradiobtn.isSelected();
		System.out.println(result);
		if(result)
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("radio button not selected");
		}
		
		
		}
		
	}


