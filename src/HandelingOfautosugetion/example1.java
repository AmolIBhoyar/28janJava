package HandelingOfautosugetion;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(500);
		List<WebElement> alloptions = driver.findElements(By.xpath("//Ul[@class='G43f7e']/li"));
		String expText="Redmi 12C";
		for(WebElement s1:alloptions)
		{
			String actText = s1.getText();
			if(actText.equals(expText))
			{
				s1.click();
				break;
			}
		}
	}

}
