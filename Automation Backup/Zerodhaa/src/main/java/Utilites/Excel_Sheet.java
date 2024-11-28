package Utilites;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Sheet {

	 public static String Sheet(int a , int b) throws EncryptedDocumentException, IOException {
	   String Path = "C:\\Users\\DELL\\eclipse-workspace\\Zerodhaa\\src\\test\\resources\\Test data.xlsx";  
	    FileInputStream file = new FileInputStream(Path);
	    String Value = WorkbookFactory.create(file).getSheet("Data").getRow(a).getCell(b).getStringCellValue();	// getnumical cell value// getboolena value 
         return Value;
	 }
}   
