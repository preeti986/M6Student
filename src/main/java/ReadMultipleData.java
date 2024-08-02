import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws Exception
	{

		 FileInputStream fis = new FileInputStream("C:\\Selenium\\M6TestCaseData.xlsx");	
		 Workbook book=WorkbookFactory.create(fis);
		 Sheet sh=book.getSheet("Sample");
		 DataFormatter df =new DataFormatter();
		 
		 String Value =df.formatCellValue(sh.getRow(0).getCell(1));
		 System.out.println(Value);
	}

}
