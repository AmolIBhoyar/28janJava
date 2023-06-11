package excelllll1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplelementhandeling 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/s?k=online+shopping&i=fashion&rh=n%3A7141123011&dc&qid=1685073382&rnid=2528832011&ref=sr_nr_p_89_1&ds=v1%3AfFdbq6siWMrqxJSxZeNcplLYb3WRr2X5OEn3M1Aplw0");
		List<WebElement> list = driver.findElements(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
		System.out.println(list.size());
		for(int i=1;i<=list.size()-1;i++)
		{
			list.get(i).click();
			Thread.sleep(10000);
		}
	}

}
