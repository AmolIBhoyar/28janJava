package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2_DeselectOptionFromMultiSelectableListbox
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Documents/swati.html");
		WebElement abc = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select s=new Select(abc);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		s.deselectByIndex(2);
		
	
		
	}

}
