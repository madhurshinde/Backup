package practices;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.browser.Browser;

import smethod.Sshot;
import smethod.browser;

public class clickSCreenshot {
 
	 public static void main(String[] args) throws IOException {
      WebDriver driver = browser.Clbrowser();                    // page open
      
      WebElement h = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));        // find element 
     // h.click();                                                                           // click option
     if (h.isSelected()) {                                                           // condition select tr  option 1 click
    	System.out.println("click done ");                      // true then click done 
     }
     else {
    	 Sshot.picture(driver,"nahi zala ");                                     // false Screenshot ghe nahi zala 
     }
    	 
	}
}
 