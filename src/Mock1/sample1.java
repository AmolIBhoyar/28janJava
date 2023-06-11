package Mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1
{
	public static void main(String[] args) 
	{
		
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	WebElement abc = driver.findElement(By.xpath("//select"));
	Select s=new Select(abc);
	s.selectByVisibleText("India");
}
}
