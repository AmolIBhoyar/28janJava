package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1alertpopup1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//1.get text from alert popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		//2.click on cancel btn from alert pop up
		//driver.switchTo().alert().dismiss();
		//3. click on "ok" btn from alert popup
		driver.switchTo().alert().accept();
		//3 click on "ok"btn from 2nd alert popup
		driver.switchTo().alert().accept();
	
		
		
		
		
	}

}
