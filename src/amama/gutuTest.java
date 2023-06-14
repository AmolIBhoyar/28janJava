package amama;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gutuTest 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("C:\\amol\\abcd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet6");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		Thread.sleep(2000);
		
		String user = sh.getRow(0).getCell(0).getStringCellValue();
		guruloginpage guru=new guruloginpage(driver);
		guru.inputguruloginpageun(user);
		
		String pass = sh.getRow(0).getCell(1).getStringCellValue();
		guru.inputguruloginpagepass(pass);
		
		guru.clickguruloginpagelogin();
		//
		guruagileprojectpage pro=new guruagileprojectpage(driver);
		pro.clickguruagileprojectpageagile();
		//
		pro.Clickguruagileprojectpageclose();
		
		
		String user1 = sh.getRow(0).getCell(0).getStringCellValue();
		guruloginpage guru1=new guruloginpage(driver);
		guru.inputguruloginpageun(user1);
		
		String pass1 = sh.getRow(0).getCell(1).getStringCellValue();
		guru.inputguruloginpagepass(pass1);
		
		guru.clickguruloginpagelogin();
		
		
	}

}
