package excelllll1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\amol\\abcd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		int rowindex = sh.getLastRowNum();
		for(int i=0;i<=rowindex;i++)
		{
			int lastcellnum = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastcellnum;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value+" ");
			}
			System.out.println();
			
		}
		
	}

}
