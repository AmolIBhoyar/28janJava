package excelllll1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameWork
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9049114610");
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		//enter pass
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9421amol");
		
		//click login btn
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		//click on profile
		//driver.findElement(By.xpath("(//div[@class='col-1'])[5]")).click();
		//my acc
		WebElement move = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(move).perform();
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String>a1=new ArrayList<String>(allids);
		String child = a1.get(1);
		driver.switchTo().window(child);
		
		String acttext = driver.findElement(By.xpath("//input[@value='Amol Bhoyar']")).getAttribute("value");
		System.out.println(acttext);
		
		 String exptext="Amol Bhoyar";
		 if (acttext.equals(exptext))
		 {
			System.out.println("TC Pass");
		}
		 else
		 {
			 System.out.println("TC Fail");
		 }
		
		
	}

}
