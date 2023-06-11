package excelllll1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.input.Input;
import org.openqa.selenium.io.FileHandler;

public class screenshot
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.instagram.com/");
      Thread.sleep(500);
      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      System.out.println(src);
      File dest=new File("C:\\amol\\New folder\\bhoya.jpg");
      FileHandler.copy(src, dest);
	}

}
