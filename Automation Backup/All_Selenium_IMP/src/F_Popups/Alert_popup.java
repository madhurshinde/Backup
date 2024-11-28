package F_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alert_popup {
 public void guru(WebDriver driver) throws InterruptedException {
	WebElement v =driver.findElement(By.xpath("//input[@type=\"text\"]"));
	v.sendKeys("4512");                                                             
		
	WebElement s =driver.findElement(By.xpath("//input[@name=\"submit\"]"));
	s.click();
	Thread.sleep(2000);		
				          
	Alert a =driver.switchTo().alert();                  // alert interface obj = driver.switch to method().alert()
	a.accept();                                   // 1. method of alert   accept
  
//	Alert f =driver.switchTo().alert();                       
//	f.dismiss();                                      // 2. method of alert   Dissmiss
    	
//  Alert gf =driver.switchTo().alert();                    
//  gf.sendKeys("Prajot");                          // 3. method of alert   Sendkeys 
	 
	          
   Alert hh =driver.switchTo().alert();
   String j = hh.getText();                    // 4. method of alert   GetText  which return String 
   System.out.println(j);
            
}

 public static void main(String[] args) throws InterruptedException {
    WebDriver driver = browser.CallBrowser();
    Alert_popup d = new Alert_popup();
    d.guru(driver);
}
}
