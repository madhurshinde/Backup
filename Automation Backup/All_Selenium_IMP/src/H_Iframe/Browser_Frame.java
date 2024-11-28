package H_Iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Frame {

	public static WebDriver callBrowser() {
	       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");   
			WebDriver driver=new ChromeDriver();                                                                                 //uppcasting like old process     
	     	driver.get("http://demo.automationtesting.in/Frames.html");
	     	//driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();                                                                               // maximize
			return driver;                                                                                                       //return type 
		    
		}

}


