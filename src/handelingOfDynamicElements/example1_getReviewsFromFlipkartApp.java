package handelingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_getReviewsFromFlipkartApp 
{
	public static void main(String[] args) 
	{
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//click on close btn
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//enter mob name
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 9 power");
	//click on submit btn
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	//get review
	String review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
    System.out.println(review);
}
}
