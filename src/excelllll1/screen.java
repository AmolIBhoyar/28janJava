package excelllll1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class screen
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/online-shopping/s?k=online+shopping");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\amol\\New folder\\amz.jpg");
        FileHandler.copy(src, dest);
        
        driver.findElement(By.xpath("(//img[@class='s-image'])[13]")).click();
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
	
	
		
	}

}
