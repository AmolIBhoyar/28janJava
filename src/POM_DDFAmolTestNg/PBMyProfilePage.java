package POM_DDFAmolTestNg;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyProfilePage
{
	@FindBy(xpath="//input[@name='personName']")private WebElement myprof;
	@FindBy(xpath="//input[@name='mobNo']")private WebElement mobno;
	WebDriver driver1;
	public PBMyProfilePage(WebDriver driver)
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
	public String verifyfullname() 
	{
		
		String actName = myprof.getAttribute("value");
		return actName;
		
		
		
		
	}}
