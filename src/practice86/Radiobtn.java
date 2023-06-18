package practice86;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Radiobtn 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("//input[@value='radio1']")).click();
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");

	WebElement move = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	Select s=new Select(move);
	s.selectByIndex(1);
	
	driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();;
//switchto window
//	
//	
//
//	
//	
Thread.sleep(2000);
	//
	driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("Amol");
	driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("//a[@class='btn-style class1 class2']")).click();
	Set<String> allids = driver.getWindowHandles();
	ArrayList<String>a1=new ArrayList<String>();
	driver.switchTo().window(a1.get(1));
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class='button float-left']")).click();	
	driver.switchTo().window(a1.get(0));
	
	}

}
