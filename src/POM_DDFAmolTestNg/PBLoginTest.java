package POM_DDFAmolTestNg;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest extends BaseClass 
{
	
	PBLogInPage login;
	PBMobNoPage mob;
    PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage acc;
	PBMyProfilePage profile;
	int TCID;
	WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser()
	{
		
		BrowserInitialization();
		 login=new PBLogInPage(driver);
		 mob=new PBMobNoPage(driver);
		 pwd=new PBPwdPage(driver);
		 home=new PBHomePage(driver);
		 acc=new PBMyAccPage(driver);
	 profile=new PBMyProfilePage(driver);
		
				
	}
	@BeforeMethod
	public void LoginApp() throws EncryptedDocumentException, IOException
	{
		login.ClickPBLogInPageLogin();
		mob.inputPBMobNoPagemobno(UtilityClass.GetTestdata(0, 0));
		mob.clickPBMobNoPagesigninpwd();
		pwd.inputPBPwdPagepwd(UtilityClass.GetTestdata(0, 1));
		pwd.ClickPBpwdPagelogin();
		
		
		
	}
	@Test
	public void VerifyFullName() throws EncryptedDocumentException, IOException
	{
		TCID=103;
		home.MoveToElementPBHomePagemyacc();
		acc.clickPBMyAccPagemyprof();
		profile.SwitcToChildWindow();
		String actresult = profile.verifyfullname();
		String expresult=UtilityClass.GetTestdata(0, 2);
		Assert.assertEquals(actresult, expresult);
		
	}
	@AfterMethod
	public void LogOut()
	{
		
	}
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
		
	}
	

}
