package practice86;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		Thread.sleep(1000);
		//WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
Thread.sleep(1000);

		Select s=new Select(month);
		//s.selectByIndex(7);
		s.selectByValue("Aug");
	}

}
