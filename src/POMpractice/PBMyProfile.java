package POMpractice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyProfile
{
	@FindBy(xpath="")private WebElement Myprof;
	WebDriver driver1;
	
	public PBMyProfile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void ClickPBMyProfile()
	{
		Set<String> allids = driver1.getWindowHandles();
		ArrayList<String>a1=new ArrayList<String>(allids);
		driver1.switchTo().window(a1.get(1));
	}
	public void VeryfyFullName()
	{
		String actvalue = Myprof.getAttribute("value");
		String expvalue = "amit";
	

		if (actvalue.equals(expvalue))
		{
			System.out.println("Tc Pass");
		} 
		else
		{
   System.out.println("TC Pass");
		}
	
		}
	}

