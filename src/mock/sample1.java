package mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//open crome browser
		WebDriver s=new ChromeDriver();
		s.get("http://www.google.com/");
		Thread.sleep(3000);
		s.navigate();
		s.getCurrentUrl();
		s.close();
		s.quit();
		
		
	}

}
