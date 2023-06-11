package handelingOfCustomizedListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example2_Select_Oct_OptionUsing_Homekey
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//step1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		//step2
		Actions act=new Actions(driver);
		//step3
		act.click(month).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.HOME).perform();
		//
		for(int i=1;i<=9;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
			
		}
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
