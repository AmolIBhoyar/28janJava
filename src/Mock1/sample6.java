package Mock1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String>a1=new ArrayList<String>();
		String child = a1.get(1);
		driver.switchTo().window(child);
		driver.findElement(By.xpath("(//span[@class='menu-text'])[13]")).click();

}
}
