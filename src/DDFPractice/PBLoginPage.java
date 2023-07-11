package DDFPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage 
{
	//class1
	@FindBy(xpath="//a[text()='Sign in']")private WebElement login;
	
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickPBLoginPagelogin()
	{
		login.click();
	}

}
