package labourcourt;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://districts.ecourts.gov.in/maharashtra-industriallabour-courts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Cause List']")).click();
		driver.findElement(By.xpath("(//a[@class='myfont'])[2]")).click();
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String>a1= new ArrayList<>(allids);
		driver.switchTo().window(a1.get(1));
		
		WebElement ele = driver.findElement(By.xpath("//select[@name='court_complex_code']"));
		Select s=new Select(ele);
		s.selectByIndex(7);
		
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='court_no']"));
		Select s1=new Select(ele1);
		s1.selectByIndex(2);
		
		driver.findElement(By.xpath("(//img[@alt='Popup'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Today']")).click();
		
		
		
	}

}
