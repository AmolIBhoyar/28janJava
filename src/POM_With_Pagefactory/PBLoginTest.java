package POM_With_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login=new  PBLoginPage(driver);
		login.ClickPBLoginPageSignIn();
		
		
		PBMobNumPage mob=new PBMobNumPage(driver);
		mob.EnterMobNo();
		mob.ClickOnSignInWithPWD();
		
		PBPwdPage page=new PBPwdPage(driver);
		page.EnterPwd();
		page.ClickonSignINbtn();
		
		PBHomePage map=new PBHomePage(driver);
		map.OpenMyAccDropDown();
		
		PBMyAccPage raw=new PBMyAccPage(driver);
		raw.clickOnMyProfile();
		
		PBProfilePage frof=new PBProfilePage(driver);
		frof.SwitcToChildWindow();
		frof.verifyfullname();
		
	}

}
