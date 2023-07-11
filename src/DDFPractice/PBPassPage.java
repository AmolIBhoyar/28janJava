package DDFPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPassPage
{
	@FindBy(xpath="//input[@type='password']")private WebElement pass;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement pwdclick;
	
	public PBPassPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputPBMobnopagepass(String password)
	{
		pass.sendKeys(password);
	}
	public void clickPBPassPagepwdclick()
	{
		pwdclick.click();

}
}
