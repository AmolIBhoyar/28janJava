package Mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Amol");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s=new Select(month);
		s.selectByVisibleText("Aug");
		Select s1=new Select(day);
		s.selectByValue("5");
		
	}

}
