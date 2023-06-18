package amama;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guruloginpage 
{ //page1
	@FindBy(xpath="//input[@id='email']")private WebElement un;
	@FindBy(xpath="//input[@id='passwd']")private WebElement pass;
	@FindBy(xpath="//button[@id='SubmitLogin']")private WebElement login;
	
	public guruloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputguruloginpageun(String UN)
	{
		un.sendKeys(UN);
	}
	public void inputguruloginpagepass(String pas)
	{
		pass.sendKeys(pas);
	}
	public void clickguruloginpagelogin()
	{
		login.click();
	}
	

}
