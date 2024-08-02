package sampleLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genricLibOrUtility.IconstantUtitlity;

public class WriteDataInExcel {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis= new FileInputStream(IconstantUtitlity.excelpath);
		Workbook book =WorkbookFactory.create(fis);
		Sheet sh= book.getSheet("Sample");
		sh.createRow(9).createCell(1).setCellValue("WELCOME");
		
		FileOutputStream fos = new FileOutputStream(IconstantUtitlity.excelpath);
		book.write(fos);
		System.out.println("pass");
				
		
		
	}

}
