package excelllll1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\amol\\abcd.xlsx");
//		Sheet size = WorkbookFactory.create(file).getSheet("Sheet1");
//		int rowsize = size.getLastRowNum();
//		System.out.println(rowsize);
		short colsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(colsize);
	}

}
