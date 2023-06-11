package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class example3_switchToChildwindow 
{
	

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on "new tab" from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		//get child window Id
		Set<String> allIds = driver.getWindowHandles();
			//{mainPageID,ChildwindowID}-->to get address of child window
	 ArrayList<String>a1=new ArrayList<String>(allIds);
	 //{mainpageID(0) ,childWindowID(1)}
	 String childwindowid = a1.get(1);
	 //switch to child window
	 driver.switchTo().window(childwindowid);
	 //click on "Training"linknfrom child window
	 driver.findElement(By.xpath("//span[text()='Training']")).click();
	 driver.findElement(By.xpath("//a[@class='wp-block-button__link wp-element-button']")).click();
	 
		
		
	}

}
