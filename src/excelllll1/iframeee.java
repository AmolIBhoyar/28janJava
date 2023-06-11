package excelllll1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeee 
{
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	driver.switchTo().frame("iframeResult");
	String result = driver.findElement(By.tagName("p")).getText();
	System.out.println(result);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
	String as = driver.findElement(By.tagName("//iframe[@title='Iframe Example']")).getText();
	System.out.println(as);
	

}
}
