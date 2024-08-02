package genricLibOrUtility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {


	public static void main(String[] args) throws Exception 
	{
		File excelFile = new File("C:\\Selenium\\M6TestCaseData.xlsx");
		//FileInputStream fis = new FileInputStream(excelFile);	
		 FileInputStream fis = new FileInputStream(excelFile);
		 
		 Workbook book=WorkbookFactory.create(fis);
		 Sheet sh=book.getSheet("Sample");
		 Row r =sh.getRow(3);
		 Cell c =r.getCell(2);
		 //String Value=sh.getStringCellValue
         String Value= sh.getRow(3).getCell(2).getStringCellValue();
		 System.out.println(Value);
		
	}

}
