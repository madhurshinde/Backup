package G_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class check_exceptions {

	
	public void Thread() throws InterruptedException {                        // check exception    interruptedexception 
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");   
			WebDriver driver=new ChromeDriver(); 
			driver.manage().window().maximize();
		   java.lang.Thread.sleep(2000);
	}
	
	public static void Shot(WebDriver driver , String a) throws IOException {          //  check exception IO Exception 
	    File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	    File save = new File("D:\\velocity\\"+a+".jpg");
	    FileHandler.copy(source,save);
	}

	public static void main(String[] args) throws IOException  {                        // check 
		FileInputStream pra = new FileInputStream ("C:\\Users\\Public\\Test data.xlsx");      
		String strng = WorkbookFactory.create(pra).getSheet("Data").getRow(19).getCell(18).getStringCellValue();           
	    System.out.println(strng);
	}
	
	
}
