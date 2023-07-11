package DDFPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobnopage 
{
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement mobno;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement pwd;
	
	public PBMobnopage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputPBMobnopagemobno(String mobileNO)
	{
		mobno.sendKeys(mobileNO);
	}
	public void clickPBMobnopagepwd()
	{
		pwd.click();
	}

}
