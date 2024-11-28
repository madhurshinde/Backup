package I_Excel_Parametrization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Explain_excel {
	public static String Excel(int a,int b) throws EncryptedDocumentException, IOException {  // download apachi poi 5.1.0
	 
     // save  path of file in string new variable 
		String path ="C:\\Users\\Public\\Test data.xlsx";        
		
    // Create obj of FileInputStream (class)  to open a connections to the file	
		FileInputStream file = new FileInputStream(path);            
		
    // workbookfactory.crate method (argument ref of file stream).get row(return row) ,get cell(return cell) , call value (return String)	
	    String value = WorkbookFactory.create(file).getSheet("Data").getRow(a).getCell(b).getStringCellValue();  
		return value;                                                   
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String username = Explain_excel.Excel(6,0);
		String password = Explain_excel.Excel(6, 1);
		System.out.println(username);
		System.out.println(password);
	}
	
	
	

}
