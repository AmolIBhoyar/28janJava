package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example6_DragAndDrop 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement srcEle = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement destEle = driver.findElement(By.xpath("//li[@class='placeholder']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(srcEle, destEle).perform();;
		
	}

}
