package DDFPractice;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	//@AuthorName: Amol
		//This method is use to get Test data from excel.
		//need to pass 2 inputs: 1-rowIndex, 2-colIndex
	public static String getTestData(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
	
	FileInputStream file= new FileInputStream("C:\\amol\\abcd.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
	String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
	return value;
}
}