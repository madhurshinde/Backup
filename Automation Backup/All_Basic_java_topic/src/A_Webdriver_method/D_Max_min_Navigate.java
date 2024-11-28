package A_Webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_Max_min_Navigate {
    public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://twitter.com/i/flow/login/");               // to get link
      driver.navigate().refresh();
//    driver.navigate().back();                                                      //  to press back button
//	  driver.navigate().forward();                                                  // To press forward 
      
      driver.manage().window().minimize();                                   // to minimize the window  
      driver.manage().window().maximize();                                  // to maximize the window
      driver.manage().window().fullscreen();                               // full size  
      Thread.sleep(2000);
      driver.close();                                                    //close current browser
	}
}
