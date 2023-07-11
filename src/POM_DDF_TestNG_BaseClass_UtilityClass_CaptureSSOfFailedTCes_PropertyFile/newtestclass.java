package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newtestclass extends BaseClass
{
	
	//declare globally
	PBLoginPage login;
	PBMobNumPage mob;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage acc;
	PBProfilePage profile;
	
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		
		initializeBrowser();         //baseclass
		
		login=new  PBLoginPage(driver);
		mob=new PBMobNumPage(driver);
		pwd=new PBPwdPage(driver);
		home=new PBHomePage(driver);
		acc=new PBMyAccPage(driver);
		profile=new PBProfilePage(driver);
		   //initialize locally
		
		
	}
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.ClickPBSignpagesignIn();
		mob.InputPBMobNumPageMobNo(UtilityClass.getPFdata("MobNum"));
		mob.ClickPBMobNumPageSignInWithPWD();
		pwd.InputPBwdPage(UtilityClass.getPFdata("PWD"));
		pwd.ClickonPBpwdPageSignIN();
		Thread.sleep(2000);
		
		
	}
	@Test
	public void verifyDOB() throws EncryptedDocumentException, IOException
	{
		
		home.openDDOptionPBHomePageMyacc();
		acc.clickPbMyAccPageMyProfile();
		profile.SwitcToChildWindow();
		//profile.verifyPBProfilePageFullName(sh.getRow(0).getCell(2).getStringCellValue());
	String actResult=profile.verifyDOB();
	String expResult=UtilityClass.getTestData(0, 3);
	Assert.assertEquals(actResult, expResult);
	
	}
	@AfterMethod
	public void logoutFromApp() 
	{
		
		
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
