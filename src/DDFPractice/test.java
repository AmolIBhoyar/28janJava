package DDFPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test extends BaseClass
{
	PBLoginPage login;
	PBMobnopage mob;
	PBPassPage pass;
	PBhomepage home;
	PBMyaccPage acc;
	PBMyProfilePage profile;
	
	
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		
		
		initialize();
		
		login=new PBLoginPage(driver);
		mob=new PBMobnopage(driver);
		pass=new PBPassPage(driver);
		home=new PBhomepage(driver);
	    acc=new PBMyaccPage(driver);
	     profile=new PBMyProfilePage(driver);
		
		
	}
	@BeforeMethod
	public void LoginToApp() throws EncryptedDocumentException, IOException
	{
		login.clickPBLoginPagelogin();
		mob.inputPBMobnopagemobno(UtilityClass.getTestData(0, 0));
		mob.clickPBMobnopagepwd();
		pass.inputPBMobnopagepass(UtilityClass.getTestData(0, 1));
		pass.clickPBPassPagepwdclick();
		
		
	}
	@Test
	public void verifyFullname() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(2000);
		home.openDDOptionPBHomePageMyacc();
		Thread.sleep(2000);
		acc.clickPbMyAccPageMyProfile();
		Thread.sleep(2000);
		profile.switchToChildWindowPBMyProfilePagemyprofile();
		
		String ActResult=profile.varifyfullnamePBMyProfilePagefullname();
		String ExpResult=UtilityClass.getTestData(0, 2);
		Assert.assertEquals(ActResult, ExpResult);
		
		
	}
	@AfterMethod
	public void LogoutApp()
	{
		
	}
	@AfterClass
	public void Closebrowser()
	{
		driver.quit();
		
	}

}
