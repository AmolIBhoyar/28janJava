package POM_DDFAmol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogInPage 
{
	@FindBy(xpath="//a[@class='sign-in']")private WebElement Login;
	
	public PBLogInPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickPBLogInPageLogin()
	{
		Login.click();
	}

}
