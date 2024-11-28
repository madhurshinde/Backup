package B_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z_practice_locators_8_ {

    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
//       WebElement a = driver.findElement(By.id("pass"));                                           // by id 
//       a.sendKeys("new");
//       
//       WebElement h =driver.findElement(By.name("email"));                                         // by name 
//       a.sendKeys("Ashwini hushar zali");
        
      //  WebElement f = driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"));
      //  f.click();
        
        //WebElement d = driver.findElement(By.cssSelector("input[type=\"text\"]"));                 // by css
        //d.sendKeys("Hhh");
        
//        WebElement guru =driver.findElement(By.linkText("Forgotten password?"));                  // by linktext
//        guru.click();
//        
//        WebElement hi = driver.findElement(By.partialLinkText("Up"));                               // by partial linktext 
//        hi.click();
// 
       WebElement hi = driver.findElement(By.cssSelector("input[id=\"pass\"]"));
       hi.sendKeys("paha");
        
          
} 
}
