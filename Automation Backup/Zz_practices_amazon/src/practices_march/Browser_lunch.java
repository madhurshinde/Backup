package practices_march;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_lunch {

  public static void main(String[]args) 
  {
   System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver =new ChromeDriver();
   driver.get("https://www.amazon.in/");
   
  }




                           }
