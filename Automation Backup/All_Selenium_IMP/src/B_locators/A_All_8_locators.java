package B_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_All_8_locators {
     public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

    //  WebElement a =driver.findElement(By.tagName("input[3]"));      // 01 .to add login data By TAgname(locators)           
   //   a.sendKeys("Madhur");                                         // not run due to multiple tagname 
        
        driver.findElement(By.id("email")).sendKeys("MADHUR");           // 2.to add login data By id (locators)  
        WebElement w = driver.findElement(By.id("email"));                         
        w.sendKeys("madhur ");	
	
        driver.findElement(By.name("pass")).sendKeys("NEW");
        WebElement pass = driver.findElement(By.name("pass"));          //  3. to add login data By name (locator)                 
        pass.sendKeys("New");
	
//       driver.findElement(By.className("_8esh")).click();     
//       WebElement Cr = driver.findElement(By.className("_8esh"));   //  4.to add login by class name (located by class name)            
//       Cr.click();
//  		
		
    	driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Shinde");
        WebElement b= driver.findElement(By.cssSelector("input[type=\"text\"]"));      // 5.To add login data By CSS (locator)	                                         
        b.sendKeys("SHINDE");                                                         // syntex "tagname[attributor ='attribute name']")   
       
//       driver.findElement(By.linkText("Forgotten password?")).click();
//       WebElement k =driver.findElement(By.linkText("Forgotten password?"));        //7.To add login data By Link(locator)	
//       k.click();                                                                   
	
	  //   driver.findElement(By.partialLinkText("ten pas")).click();	 
//       WebElement hi = driver.findElement(By.partialLinkText("ten pas"));          //  8.By partial linktext 	                           
//       hi.click();
		
}
}
