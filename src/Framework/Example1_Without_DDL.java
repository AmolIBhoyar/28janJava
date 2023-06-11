package Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_Without_DDL 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on sign in page
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//enter un
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9049114610");
		//clic on sign in with password btn
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		//enter pass
		driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys("9421amol");
		//click on sign in btn
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		//move on my acc
		WebElement myacc = driver.findElement(By.xpath("//div[@class='userprofile']"));
		Actions act=new Actions(driver);
		act.moveToElement(myacc).perform();
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		//child window find allids
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String>a1=new ArrayList<String>();
		String childwindow = a1.get(1);
		
		String text = driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]")).getAttribute("value");
		System.out.println(text);
	}

}
