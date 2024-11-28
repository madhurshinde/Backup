package xFindelements_tableFeatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserrr {

	public static WebDriver CallBrowser(){ 
	       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");   
			WebDriver driver=new ChromeDriver();                           
		   	driver.get("http://demo.guru99.com/test/web-table-element.php");
			driver.manage().window().maximize();    
			 return driver;                                                                                     
		    
		}

}


