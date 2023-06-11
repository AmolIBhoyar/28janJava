package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample10
{
	public static void main(String[] args) throws InterruptedException 
	{
		//xpath by containsby attribute
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'_55r1 ')]")).sendKeys("abcd");
		
		driver.findElement(By.xpath("")).sendKeys("1234567891");
		driver.findElement(By.xpath("//button[contains(@data-testid,'_login')]")).click();
		driver.quit();
		
	}

}
