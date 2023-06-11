package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
      //webdriver method
		WebDriver driver =new ChromeDriver();
		driver.get("https://ncertnt.samarth.edu.in/index.php/site/signup");
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("(//input[@aria-required='true'])[1]")).sendKeys("bhoyar.a94@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='signupform-repeatemail']")).sendKeys("bhoyar.a94@gmail.com");
		driver.findElement(By.xpath("//input[@id='signupform-repeatpassword")).sendKeys("1234");
	}

}
