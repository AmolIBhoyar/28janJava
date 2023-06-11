package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_alertpopup2
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//switch to alert popup
		Alert alt = driver.switchTo().alert();
		//get text from alert popup
		String text = alt.getText();
		System.out.println(text);
		alt.dismiss();
		alt.accept();
		alt.accept();
		
	}

}
