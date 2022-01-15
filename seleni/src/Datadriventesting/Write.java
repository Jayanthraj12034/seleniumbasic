package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream(".exel/Exel.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet b = book.getSheet("Sheet1");
		b.createRow(arg0)
		
		
		
		
		
	}

}
