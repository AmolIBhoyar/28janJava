package POMpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBSignInPage sign=new PBSignInPage(driver);
		sign.ClickSignInClick();
		
		PBMobNoPage mob=new PBMobNoPage(driver);
		mob.Inputmobnum();
		mob.SignInWithPWD();
		
		PBPasswordpage pass=new PBPasswordpage(driver);
		pass.inputPasswordpagePassword();
		pass.Clicksignin2();
		
		PBHomePage home=new PBHomePage(driver);
		home.MoveToPomPracticemyacc();
		Thread.sleep(2000);
		
		PBMyProfile prof=new PBMyProfile(driver);
		prof.ClickPBMyProfile();
		
		
		
		
	}

}
