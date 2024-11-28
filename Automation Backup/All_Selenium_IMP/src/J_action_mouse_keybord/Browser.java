package J_action_mouse_keybord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver callBrowser(){  //string url 
	       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");   
			WebDriver driver=new ChromeDriver();                                                           //uppcasting like old process     
	        driver.get("https://www.amazon.in/");                                               // move mouse
  	         //    driver.get("http://demo.guru99.com/test/ajax.html");                        // drag an drop
	       // driver.get("https://www.facebook.com/");                                             // keyboard action
           //  driver.get("http://demo.guru99.com/test/simple_context_menu.html");        			// double click
			//driver.get("https://www.w3schools.com/");
		//   	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			driver.manage().window().maximize();                                                               // maximize
			 return driver;                                                                                     //return type 
		    
		}

}


