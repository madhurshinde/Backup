package E_Get_Screeshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Explain_screshot {
	 public static void main(String[] args) throws IOException  {   {
	     System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");   
			WebDriver driver=new ChromeDriver();                                                                //uppcasting like old process     
			driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");                // get url 
			driver.manage().window().maximize();                                                               // maximize
			
			
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);                          
	//class obj =  interface Typecasting driver. method of takescreshot(argument and extension) output as a file save in referance of file class
		
	
	File Destination = new File("D:\\velocity\\fulldaystudy.jpeg ");                                            // save file in  D drive 
  //file class destinaiton=keyword file class (path\\Filename\\fileExtension) 
	
	FileHandler.copy(source, Destination );
  //class.copy_method(source ,destination);
  
	 }
	 }
}
