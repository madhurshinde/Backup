package A_Webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class A_All_Browser_Lunch {

  public static void chrome_lunch()         { 
     System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();	}
	
  public static void firefox_Lunch()        {
	 System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver_win32\\geckodriver.exe");
     WebDriver driver =new FirefoxDriver ();      
	  driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();  }
  
  public static void Msedge_lunch()          {
	System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver_win32\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	 driver.get("https://www.facebook.com");
	 driver.manage().window().maximize();    }
  
  public static void IEDriver_lunch()       {
      System.setProperty("webdriver.ie.driver", "C:\\selenium\\IEDriver_win32\\IEDriverServer.exe");  
      WebDriver driver =(WebDriver) new InternetExplorerDriver();
      driver.get("https://www.facebook.com");
      driver.manage().window().maximize();    }
  
  
 public static void main(String[] args) throws InterruptedException {
		A_All_Browser_Lunch.chrome_lunch();
		A_All_Browser_Lunch.firefox_Lunch();
		A_All_Browser_Lunch.Msedge_lunch();
		A_All_Browser_Lunch.IEDriver_lunch();						
}  }
