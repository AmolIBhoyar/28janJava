package excelllll1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class a4
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement abc = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
	Actions act=new Actions(driver);
	act.moveToElement(abc);
	
	Select s=new Select(abc);
	s.selectByIndex(3);
	
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\amol\\New folder\\amit");
	FileHandler.copy(src, dest);
	
	
	}

}
