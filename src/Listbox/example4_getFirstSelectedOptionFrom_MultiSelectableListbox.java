package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example4_getFirstSelectedOptionFrom_MultiSelectableListbox
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Documents/bhoyar.html");
	WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
	
	
	Select s=new Select(selectcountry);
s.selectByIndex(3);
s.selectByIndex(2);
s.selectByIndex(0);
String text = s.getFirstSelectedOption().getText();
System.out.println(text);
}
}
