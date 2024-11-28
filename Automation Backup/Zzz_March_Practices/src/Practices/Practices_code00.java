package Practices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Practices_code00 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//Screenshot Code to Take 
		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("D:\\velocity\\latest.jpeg");

		FileHandler.copy(Source, Destination);

		//ExcelSheet Code To featch DAta from excel
		
		FileInputStream File = new FileInputStream ("C:\\Users\\Public\\Test data.xlsx");
		
	    String Value = WorkbookFactory.create(File).getSheet("Data").getRow(0).getCell(1).getStringCellValue();
         System.out.println(Value);
         
	
       // JAvaScripte Executor
         
      
       
	}
}
