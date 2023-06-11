package POMpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNoPage 
{
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement mobno;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signIn;
	
	public PBMobNoPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Inputmobnum()
	{
		mobno.sendKeys("9049114610");
	}
	public void SignInWithPWD()
	{
		signIn.click();
	}

}
