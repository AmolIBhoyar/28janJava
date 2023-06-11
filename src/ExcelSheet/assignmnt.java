package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class assignmnt
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\amol\\abcd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
		int row = sh.getRow(0).getLastCellNum()-1;
		int col = sh.getLastRowNum();
		
		for(int i=0; i<=row; i++)
		{
			for(int j=0;j<=col;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value);
			}
		
		
		
		
	}

}
}
