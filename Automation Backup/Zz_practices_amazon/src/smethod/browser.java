package smethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

  public static WebDriver Clbrowser()  {
	 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	 //driver.get("https://www.amazon.in/ref=nav_logo");  // For Dropdown
	// driver.get("http://demo.guru99.com/test/radio.html"); // use for screshot 
	 
	 //driver.get("https://twitter.com/");             // use to hidden division topup
	 
	// driver.get("https://nxtgenaiacademy.com/alertandpopup/");  // alert topup
	 
	driver.get("https://www.naukri.com/");                 //for child browser 
	  
	 driver.manage().window().maximize();
	 return driver;		
 }
}

