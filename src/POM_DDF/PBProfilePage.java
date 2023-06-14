package POM_DDF;

import java.util.ArrayList;



import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PBProfilePage 
{
	@FindBy(xpath="//input[@name='personName']") private WebElement myProf;
	WebDriver driver1;
	
	
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
		
	}
	public void SwitcToChildWindow()
	{
		Set<String> allids = driver1.getWindowHandles();
		ArrayList<String>a1=new ArrayList<String>(allids);
		driver1.switchTo().window(a1.get(1));
	}
	public void verifyPBProfilePageFullname(String expName) 
	{
		String actName = myProf.getAttribute("value");
		
		
		if(actName.equals(expName))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");

}
}}
