package excelllll1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AW 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
		Select s=new Select(month);
		s.selectByIndex(6);
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s1=new Select(day);
		s1.selectByIndex(7);
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2012");
		
		driver.findElement(By.xpath("//input[@class='_8esa']")).click();
	
		

		{
			
		}
		
		
	}
	

}
