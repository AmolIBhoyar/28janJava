package Framework;

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

public class aa 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("C:\\amol\\abcd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on sign in page
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//enter un
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		//clic on sign in with password btn
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		//enter pass
		driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		//click on sign in btn
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		//move on my acc
		WebElement myAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(myAcc).perform();
		Thread.sleep(1000);
		//click on profile btn
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		//child window find allids
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String>a1=new ArrayList<String>(allids);
		driver.switchTo().window(a1.get(1));
		
		String acttext = driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]")).getAttribute("value");
		String exptext="Amol Bhoyar";
		if (exptext.equals(acttext)) 
		{
			System.out.println("TS run");
		}
		else 
		{
          System.out.println("TS not run");
		}
	}

}
