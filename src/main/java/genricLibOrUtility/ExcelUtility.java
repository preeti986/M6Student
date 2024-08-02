package genricLibOrUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility{
	/*
	 * This method is used to read single data from excel
	 * @param sheetname
	 * @param rowNum
	 * @param cellNum
	 * @param value
	 * @throws Exception
	 */
	public String readDataFromExcel(String sheetName,int rowNum,int cellnum) throws Exception
	{
		FileInputStream fis=new FileInputStream(IconstantUtitlity.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(rowNum).getCell(cellnum));
		return value;
	}
	/*
	 * This is a generic method used to write data in excel
	 * @param sheetname
	 * @param rowNum
	 * @param cellNum
	 * @param value
	 * @throws Exception
	 * 
	 */
	public void writeDataFromExcel(String sheetName,int rowNum,int cellnum,String value) throws Exception
	{
		FileInputStream fis=new FileInputStream(IconstantUtitlity.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		sh.createRow(rowNum).createCell(cellnum).setCellValue(value);
		
		FileOutputStream fos =new FileOutputStream(IconstantUtitlity.excelpath);
		book.write(fos);
		
	}
	

}