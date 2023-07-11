package POM_DDFAmolTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage
{
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	@FindBy(xpath="//span[@id='login-in-with-password-span']")private WebElement login;
	
	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputPBPwdPagepwd(String password)
	{
		PWD.sendKeys(password);
	}
	public void ClickPBpwdPagelogin()
	{
		login.click();
	}

}
