package ActionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_handelingOfDropdown 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//click on close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		//step1
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		//step2
		Actions act=new Actions(driver);
		//step3
		act.moveToElement(login).perform();
		//click on wishlist element
		driver.findElement(By.xpath("")).click();
	}

}
