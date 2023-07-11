package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	public static String getTestData(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\amol\\abcd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
	}

}
