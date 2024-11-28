package I_Excel_Parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_boolen_string_number {

	public static void main(String[] args) throws IOException  {
		
	
		FileInputStream pra = new FileInputStream ("C:\\Users\\Public\\Test data.xlsx");      // import 
	    String strng = WorkbookFactory.create(pra).getSheet("Data").getRow(19).getCell(18).getStringCellValue();           // to Featch String value 
	    System.out.println(strng);
	    
	    double num = WorkbookFactory.create(pra).getSheet("Data").getRow(16).getCell(18).getNumericCellValue();            //for Featch numerical value
	    System.out.println(num);
	    
	    boolean bo = WorkbookFactory.create(pra).getSheet("Data").getRow(19).getCell(18).getBooleanCellValue();            // for featch the boolean value 
		 System.out.println(bo );
			 
	}
	
}
