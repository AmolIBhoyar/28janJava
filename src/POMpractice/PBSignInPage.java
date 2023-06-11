package POMpractice;
//1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSignInPage
{
	@FindBy(xpath="//a[text()='Sign in']")private WebElement SignIn;
	
	public PBSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickSignInClick()
	{
		SignIn.click();
	}

}
