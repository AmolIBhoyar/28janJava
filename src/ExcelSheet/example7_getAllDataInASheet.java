package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example7_getAllDataInASheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\amol\\abcd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		int lastRowIndex = sh.getLastRowNum();
		for(int i=0;i<=lastRowIndex;i++)    //outer for loop--> rows
		{
			int lastCellIndex = sh.getRow(i).getFirstCellNum()-1;
			for(int j=0;j<=lastCellIndex;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}
			System.out.println();
		}
		
	}

}
