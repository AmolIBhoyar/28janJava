package amama;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guruagilePage
{
	@FindBy(xpath="//input[@autofocus='autofocus']")private WebElement un1;
	@FindBy(xpath="//input[@name='password']")private WebElement pass1;
	@FindBy(xpath="//input[@name='submit']")private WebElement login1;

	
	public guruagilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputguruloginpageun(String UN)
	{
		un1.sendKeys(UN);
	}
	public void inputguruloginpagepass(String pas)
	{
		pass1.sendKeys(pas);
	}
	public void clickguruloginpagelogin()
	{
		login1.click();
	}
}
