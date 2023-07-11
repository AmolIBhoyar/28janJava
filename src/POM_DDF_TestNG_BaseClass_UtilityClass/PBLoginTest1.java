package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
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

public class PBLoginTest1 extends BaseClass
{
	 //declare globally
	PBLoginPage login;
	PBMobNumPage mob;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myacc;
	PBProfilePage profile;
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		
		initializeBrowser();
		
		login=new  PBLoginPage(driver);
		mob=new PBMobNumPage(driver);
		pwd=new PBPwdPage(driver);
		home=new PBHomePage(driver);
		myacc=new PBMyAccPage(driver);
		profile=new PBProfilePage(driver);
		   //initialize locally
		
		
	}
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.ClickPBSignpagesignIn();
		mob.InputPBMobNumPageMobNo(UtilityClass.getTestData(0, 0));
		mob.ClickPBMobNumPageSignInWithPWD();
		pwd.InputPBwdPage(UtilityClass.getTestData(0, 1));
		pwd.ClickonPBpwdPageSignIN();
		Thread.sleep(2000);
		
		
	}
	@Test
	public void verifyFullName() throws EncryptedDocumentException, IOException
	{
		home.openDDOptionPBHomePageMyacc();
		myacc.clickPbMyAccPageMyProfile();
		profile.SwitcToChildWindow();
		//profile.verifyPBProfilePageFullName(sh.getRow(0).getCell(2).getStringCellValue());
	String actResult=profile.verifyPBProfilePageFullname();
	String expResult=UtilityClass.getTestData(0, 2);
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
