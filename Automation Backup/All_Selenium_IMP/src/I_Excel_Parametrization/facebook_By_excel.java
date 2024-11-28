package I_Excel_Parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import F_Popups.browser;

public class facebook_By_excel {

	public static String anki(int a,int b) throws EncryptedDocumentException, IOException {
		FileInputStream pra = new FileInputStream ("C:\\Users\\Public\\Test data.xlsx");               // import 
	    String h = WorkbookFactory.create(pra).getSheet("Data").getRow(a).getCell(b).getStringCellValue();
        return h;   }
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = browser.CallBrowser();
		
		WebElement id = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	    String hi = facebook_By_excel.anki(6, 0);	    
		id.sendKeys(hi);
		
		WebElement pw = driver.findElement(By.xpath("//input[@type=\"password\"]"));
	    String he = facebook_By_excel.anki(6, 1);
	    pw.sendKeys(he);	}
}