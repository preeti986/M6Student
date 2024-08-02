package sampleLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws Exception
	{

		 FileInputStream fis = new FileInputStream("C:\\Selenium\\M6TestCaseData.xlsx");	
		 Workbook book=WorkbookFactory.create(fis);
		 Sheet sh=book.getSheet("Sample");
		 DataFormatter df =new DataFormatter();
		 
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			Row r =sh.getRow(i);
			for(int j=1;j<=r.getLastCellNum()-1;j++)
			{
				String Value =df.formatCellValue(r.getCell(j));
			}
		}
	}

}
