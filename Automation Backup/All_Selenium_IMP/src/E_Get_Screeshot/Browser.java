package E_Get_Screeshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver CallBrowser() {
	       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");   
			WebDriver driver=new ChromeDriver();                                                                                   //uppcasting like old process     
			//driver.get("https://www.guru99.com/how-test-reports-predict-the-success-of-your-testing-project.html");                // get url 
			driver.get("https://demoqa.com/select-menu");
			driver.manage().window().maximize();                                                                                  // maximize
			return driver;                                                                                                       //return type 
		    
		}

}
