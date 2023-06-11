package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_ScrollUpDown
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		//ScrollDown 1st parameter:0, 2nd Parameter=+ve
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		
		//scroll Up: 1st parameter 0, 2nd parameter-ve
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
		
	}

}
