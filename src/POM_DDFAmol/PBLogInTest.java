package POM_DDFAmol;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLogInTest
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file= new FileInputStream("C:\\amol\\abcd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://www.policybazaar.com/");
		
		PBLogInPage log=new PBLogInPage(driver);
		log.ClickPBLogInPageLogin();
		Thread.sleep(2000);
		
		String mobile = sh.getRow(0).getCell(0).getStringCellValue();
		PBMobNoPage mob=new PBMobNoPage(driver);
		mob.inputPBMobNoPagemobno(mobile);
		mob.clickPBMobNoPagesigninpwd();
		Thread.sleep(1000);
		
		String pass = sh.getRow(0).getCell(1).getStringCellValue();
		PBPwdPage pa=new PBPwdPage(driver);
		pa.inputPBPwdPagepwd(pass);
		pa.ClickPBpwdPagelogin();
		Thread.sleep(1000);
		
		PBHomePage home=new PBHomePage(driver);
		home.MoveToElementPBHomePagemyacc();
		Thread.sleep(1000);
		
		PBMyAccPage ac=new PBMyAccPage(driver);
		ac.clickPBMyAccPagemyprof();
		Thread.sleep(1000);
		
		PBMyProfilePage pro=new PBMyProfilePage(driver);
		pro.SwitcToChildWindow();
		pro.verifyfullname();
		
		
		
	}

}
