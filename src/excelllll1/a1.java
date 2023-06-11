package excelllll1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/amol/New%20folder/multiplehandeling.html");
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s=new Select(month);
		boolean result = s.isMultiple();
		System.out.println(result);
		System.out.println(allcheckbox.size());
//		for(WebElement s1:allcheckbox)
//		{
//			s1.click();
//		}
//	for(int i=allcheckbox.size()-1;i>=0;i--)
//	{
//		allcheckbox.get(i).click();
//	}
//		
	}

}
