package excelllll1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a2 
{public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Documents/swati.html");
   WebElement abc = driver.findElement(By.xpath("//select[@multiple='true']"));
   Select s=new Select(abc);
   s.selectByIndex(0);
   s.selectByIndex(2);
   s.selectByIndex(3);
   s.deselectAll();
 
   
     
      
}
}