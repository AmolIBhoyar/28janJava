package mock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\amol\\abcd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		int row = sh.getRow(0).getLastCellNum()-1;	
		for(int i=0;i<=row;i++)
		{
			 String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		
	}

}
