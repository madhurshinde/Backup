package F_Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static WebDriver CallBrowser() {
	       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");   
			WebDriver driver=new ChromeDriver();                                                                                 //uppcasting like old process     
	   driver.get("https://www.facebook.com/");                                               // get url for hidden divission
	  //    driver.get("http://demo.guru99.com/test/delete_customer.php");                         // get url for alert popup
	 //   	driver.get("https://www.naukri.com/");                                                 //get url for childbrowser popup
	//   	driver.get("http://demo.automationtesting.in/Frames.html");
   //       driver.get("https://demoqa.com/frames");
  //    	driver.get("https://www.techmahindra.com/en-in/?f=2139356312");
 //         driver.get("https://www.amazon.in/");
		//	driver.get("https://twitter.com/i/flow/login");
			driver.manage().window().maximize();                                                                               // maximize
			return driver;                                                                                                       //return type 
		    
		}

}


