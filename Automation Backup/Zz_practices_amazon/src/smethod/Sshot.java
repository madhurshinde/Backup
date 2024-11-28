package smethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.io.FileHandler;


public class Sshot {
	
       public static void picture (WebDriver driver, String mock2 ) throws IOException {              // string chnge 
        // arguments madhe webdriver import 
           	
      File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);                   //file import,takescreeshot import ,outputype import     	
      
 // file class reference  = takesscreenshot interface (upcasting) webdriver refernce driver. getscreenshot as method(takescreenshot chi)
// (argument output file outputtype.file === screnshot tycha output  save file cha refernce madhe  (Save screshot in file )
     
  //File destination = new File("C:\\selenium\\mock2.jpeg");                                    // save single screenshot 
   // class referance = new keyword file(path\name of file\extension like jpeg)
     
   File destination = new File("C:\\selenium\\"+mock2+".jpeg");                               // multiple screenshot 
     
     
   FileHandler.copy(source, destination);                                      // import file handler // source add throw declaration   IO exception 
 // filehandler class.  copy method ( file from and file to )
      
            }
    public static void main(String[] args) throws IOException {
	  WebDriver driver = browser.Clbrowser();
      driver.manage().window().maximize();
      Sshot.picture(driver, "prajot");
	 
	
      
       
}
}
