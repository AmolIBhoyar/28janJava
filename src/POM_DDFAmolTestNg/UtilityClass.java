package POM_DDFAmolTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
	public static String GetTestdata(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\amol\\abcd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet5");
		String result = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return result;
		
	}
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\amol\\New folder\\screenshot\\TestCaseID"+TCID+".jpg");
		 FileHandler.copy(src, dest);
	}

	
	}


