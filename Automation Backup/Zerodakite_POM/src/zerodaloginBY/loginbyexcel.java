package zerodaloginBY;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import special.Browser;

public class loginbyexcel {
public class Zerodaexcellog {
	
public static String user(int a, int b) throws EncryptedDocumentException, IOException  {
			String path = "C:\\Users\\Public\\Test data.xlsx";             // path of file 
			FileInputStream file = new FileInputStream(path);              // obj of file input stream
			String value = WorkbookFactory.create(file).getSheet("Data").getRow(a).getCell(b).getStringCellValue();  // workbookfactory
		    return value;   
			}
public static double password(int i, int j) throws IOException {
			String path1 ="C:\\Users\\Public\\Test data.xlsx";
			FileInputStream file1 = new FileInputStream(path1);
		    double value1 = WorkbookFactory.create(file1).getSheet("Data").getRow(i).getCell(j).getNumericCellValue();
		    return value1 ;
  		  }
  		  }
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException{
	    WebDriver driver = Browser.callbrowser();
		
		WebElement id = driver.findElement(By.xpath("//input[@type=\"text\"]"));   // by excel ID put
    	String username =Zerodaexcellog.user(0, 0);
		id.sendKeys(username);
		
		WebElement pw = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		String passkey= Zerodaexcellog.user(0, 1);
		pw.sendKeys(passkey);
		Thread.sleep(3000);
		WebElement in = driver.findElement(By.xpath("//button[@type='submit']"));
		in.click();	
	    Thread.sleep(2000);
	    
	     WebElement enter = driver.findElement(By.xpath("//input[@type=\"password\"]"));
	     double in1 = Zerodaexcellog.password(2, 0);
	     enter.sendKeys(""+pw);
		
		}}


