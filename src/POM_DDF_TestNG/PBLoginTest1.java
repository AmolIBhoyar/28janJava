package POM_DDF_TestNG;

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

public class PBLoginTest1 
{
	 //declare globally
	PBLoginPage login;
	PBMobNumPage mob;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myacc;
	PBProfilePage profile;
	Sheet sh;
	WebDriver driver;
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\amol\\abcd.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		login=new  PBLoginPage(driver);
		mob=new PBMobNumPage(driver);
		pwd=new PBPwdPage(driver);
		home=new PBHomePage(driver);
		myacc=new PBMyAccPage(driver);
		profile=new PBProfilePage(driver);
		  //initialize locally
		
		
	}
	@BeforeMethod
	public void loginToApp() throws InterruptedException
	{
		login.ClickPBSignpagesignIn();
		mob.InputPBMobNumPageMobNo(sh.getRow(0).getCell(0).getStringCellValue());
		mob.ClickPBMobNumPageSignInWithPWD();
		pwd.InputPBwdPage(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.ClickonPBpwdPageSignIN();
		Thread.sleep(2000);
		
		
	}
	@Test
	public void verifyFullName()
	{
		home.openDDOptionPBHomePageMyacc();
		myacc.clickPbMyAccPageMyProfile();
		profile.SwitcToChildWindow();
		//profile.verifyPBProfilePageFullName(sh.getRow(0).getCell(2).getStringCellValue());
	String actResult=profile.verifyPBProfilePageFullname();
	String expResult=sh.getRow(0).getCell(2).getStringCellValue();
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
