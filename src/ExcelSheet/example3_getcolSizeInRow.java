package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3_getcolSizeInRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\amol\\abcd.xlsx");
		short colsize = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println(colsize);
		
	}

}
