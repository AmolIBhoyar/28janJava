package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example5_getsizeOfAllSelectedOptionFrom_MultiSlectableListbox 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Documents/swati.html");
		WebElement abc = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s=new Select(abc);
		s.selectByIndex(3);
		s.selectByIndex(2);
		s.selectByIndex(0);
	//List<WebElement> allselectedoption = s.getAllSelectedOptions();
 List<WebElement> allselectedoption = s.getAllSelectedOptions();
	//	System.out.println(allselectedoption.size());
//	for(Object s1:allselectedoption)
//	{
//		System.out.println(s1.getClass());
//	}
	int size = allselectedoption.size();
	System.out.println(size);
		
	}

}
