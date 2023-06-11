package POM_With_Pagefactory;
//POM class3

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage
{
	
		@FindBy(xpath="//input[@name='password']")private WebElement pwd;
		@FindBy(xpath="//span[text()='Sign in']")private WebElement SignIn;
		
   public PBPwdPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
   
   public void EnterPwd()
   {
	   pwd.sendKeys("9421amol");
   }
		
   public void ClickonSignINbtn()
   {
	   SignIn.click();
	   
   }
	}


