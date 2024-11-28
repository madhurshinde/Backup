package practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import smethod.browser;

public class aleratpop {
	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver =browser.Clbrowser();	
	 
	  WebElement a =driver.findElement(By.xpath("//button[@name=\"alertbox\"]"));                 //accept 
	  a.click();
	  Alert h = driver.switchTo().alert();
	  Thread.sleep(2000);
//	  h.accept();
//	  
//	  WebElement b = driver.findElement(By.xpath("//button[@name=\"confirmalertbox\"]"));       // dismiss
//	  b.click();
//      Alert i = driver.switchTo().alert();
//      Thread.sleep(2000);
//      i.accept();
	  
	  WebElement c = driver.findElement(By.xpath("//button[@name=\"promptalertbox1234\"]"));      //sendkey 
	  c.click();
      Alert j = driver.switchTo().alert();
	  j.sendKeys("yes");

	 String kk= j.getText();                                                                        // gettext 
	 System.out.println(kk);

	
    Thread.sleep(2000);
	 j.accept();
//	 
//	 
	 
	}

}
