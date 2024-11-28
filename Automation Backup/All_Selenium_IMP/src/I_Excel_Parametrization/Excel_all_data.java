package I_Excel_Parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_all_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	  for(int i=0; i<=3; i++ ) {                                                                //i=1,2,3       // Row data featch   0,1,2,3
		  for(int j=0;  j<2; j++) {                                                             // true  j=0,1,2    // colume data fetch 0,1   not add 2 nd 
	     	FileInputStream file =new FileInputStream("C:\\Users\\Public\\Test data.xlsx");
			String value=WorkbookFactory.create(file).getSheet("Data").getRow(i).getCell(j).getStringCellValue();    //0,0 ankita /0,1 shejwal
              System.out.print(value);                                                                              //1,0 ashwini /1,1 Shinde
			}
			System.out.println();                                                                                 // enter next line,2enter
			}
		}
}