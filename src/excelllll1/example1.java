package excelllll1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	 FileInputStream file=new FileInputStream("C:\\amol\\abcd.xlsx");
	 String result = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	 System.out.println(result);
	 
		
	}

}
