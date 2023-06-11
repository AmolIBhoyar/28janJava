package POM_DDFAmol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNoPage 
{
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobno;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signinpwd;
	
	public PBMobNoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputPBMobNoPagemobno(String mobileno)
	{
		mobno.sendKeys(mobileno);
	}
	public void clickPBMobNoPagesigninpwd()
	{
		signinpwd.click();
	}

}
