package HandelingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_SelectMultipleCheckBoxes
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/amol/New%20folder/multiplehandeling.html");
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allcheckboxes.size());
//		for(int i=0;i<=allcheckboxes.size();i++)
//		{
//			allcheckboxes.get(i).click();
//		}
		for(WebElement s1:allcheckboxes)
		{
			s1.click();
			Thread.sleep(500);

		}
	}

}
