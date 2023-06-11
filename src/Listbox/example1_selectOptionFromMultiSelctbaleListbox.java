package Listbox;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_selectOptionFromMultiSelctbaleListbox
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Documents/swati.html");
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select s=new Select (SelectCountry);
		s.selectByVisibleText("Aus");
		//s.selectByIndex(0);
	}

}
