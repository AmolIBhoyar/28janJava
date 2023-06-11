package POM_DDF;

import java.io.FileInputStream;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file= new FileInputStream("C:\\amol\\abcd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login=new  PBLoginPage(driver);
		login.ClickPBSignpagesignIn();
		
		String mobile = sh.getRow(0).getCell(0).getStringCellValue();
		PBMobNumPage mob=new PBMobNumPage(driver);
		mob.InputPBMobNumPageMobNo(mobile);
		mob.ClickPBMobNumPageSignInWithPWD();
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		PBPwdPage page=new PBPwdPage(driver);
		page.InputPBwdPage(password);
		page.ClickonPBpwdPageSignIN();
		Thread.sleep(2000);
		
		PBHomePage pag=new PBHomePage(driver);
		pag.openDDOptionPBHomePageMyacc();
		Thread.sleep(2000);
		
		PBMyAccPage acc=new PBMyAccPage(driver);
		acc.clickPbMyAccPageMyProfile();
		
		
		String name = sh.getRow(0).getCell(2).getStringCellValue();
		PBProfilePage nag=new PBProfilePage(driver);
		nag.verifyPBProfilePagefullname();
		
		
		
	}
	}