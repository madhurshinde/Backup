package B_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z_Practices_All_xpath_06 {

  public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.w3schools.com/html/default.asp");
	 driver.manage().window().maximize();
		
//	 WebElement w3 =driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]"));            // Xpath by attributr  fb
//	 w3.sendKeys("sorry"); 
	   
//   WebElement w3 =driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));                 // xpath by text fb
//   w3.click();
	    
//	 WebElement ss =driver.findElement(By.xpath("//input[contains(@type,'p')]"));                       // by contain fb
//	 ss.sendKeys("Ah"); 
	    	    
//   WebElement s =driver.findElement(By.xpath("//a[contains(@id,'navbt')][2]"));                       // by index
//   s.click();
             
//   WebElement d =driver.findElement(By.xpath("//html/body/div[6]/div[1]/div[1]/a[38]"));             // by Absolute
//   d.click();
        
     WebElement h =driver.findElement(By.xpath("//div//a[38]"));                                      // By Relative 
     h.click();	
}
}