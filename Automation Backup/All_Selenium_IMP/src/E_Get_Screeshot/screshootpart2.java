package E_Get_Screeshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screshootpart2 {
	
	 public static void takeScreenshot() throws IOException  {
	     System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");   
			WebDriver Driver=new ChromeDriver();                                                                //uppcasting like old process     
			Driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");                // get url 
			Driver.manage().window().maximize();      
    
			
	         File Source = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
             File save = new File("D:\\testing video\\fulldaystudy.jpeg");                                            // save file in  D drive 
             FileHandler.copy(Source, save); }

	 
	 
	 public static void main(String[] args) throws IOException  {
		screshootpart2.takeScreenshot();
	 }
}