package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ReadExcel {
	
	public Sheet readExcel(String filePath,String fileName,String sheetName) throws EncryptedDocumentException, IOException {
		File f= new File(filePath+"\\"+fileName);
		 FileInputStream fis= new FileInputStream(f);
		 Workbook wb= WorkbookFactory.create(fis);
		 Sheet s= wb.getSheet(sheetName);
		return s;
	}
}
