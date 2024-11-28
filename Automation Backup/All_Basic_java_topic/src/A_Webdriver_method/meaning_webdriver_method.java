package A_Webdriver_method;

import org.openqa.selenium.Point;                           // exception 
import org.openqa.selenium.WebDriver;                      // to remove exception
import org.openqa.selenium.chrome.ChromeDriver;             // to remove exception

public class meaning_webdriver_method {
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
 //class in java.method(system class chi)(String (key), path of chromedriver (string value)\\ browsername.exe(format)");
	
    WebDriver driver = new ChromeDriver();        // upcasting done 
 //interface.obj= new keyword class();
     
   driver.get("https://www.amazon.in/");                 // to get url
     
     
   String m = driver.getCurrentUrl();                      // obj   // url konta ahe te dakhvte 
   System.out.println(m);
    
//     String h = driver.getPageSource();                         // inspect page   page source 
//     System.out.println(h);
     
//     String aa = driver.getTitle();                              // tittle on tab 
//     System.out.println(aa);     
     
//     String ak = driver.getWindowHandle();                            //unique id for web page 
//     System.out.println(ak);                                        //CDwindow-995C23DFC72E6646159A3E2693849015
   
//     driver.manage().window().maximize(); 
//     webdriver.manage(option return)option providekarto  .window(return window) option method, maximize  method of window interface
//     driver.manage().window().fullscreen();                        // full size  
// driver.manage().window().minimize();   
   
       Point p = new Point(100,0);
      driver.manage().window().setPosition(p);
     
   //     WebElement a = driver.findElement(By.className(null))       // webelement return type (findelement method) webdriver 
    // return type obj= webdriver obj .findelement method (By static class locator method  (locator} tagname

}
}