package POMpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPasswordpage
{
	@FindBy(xpath="//input[@name='password']")private WebElement Password;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement SignIn1;
public PBPasswordpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}

public void inputPasswordpagePassword()
{
Password.sendKeys("9421amol");	

}
public void Clicksignin2()
{
SignIn1.click();	

}

}
