package zerodaloginBY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import special.Browser;



public class login {
   
 public void log (WebDriver driver) throws InterruptedException {
     WebElement id = driver.findElement(By.xpath("//input[@type=\"text\"]"));
     id.sendKeys("EM5241");
     
     WebElement Pw = driver.findElement(By.xpath("//input[@type=\"password\"]"));
     Pw.sendKeys("Akshay@1992");
     
     WebElement Submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
     Submit.click();
     Thread.sleep(2000);
     
     WebElement pin = driver.findElement(By.xpath("//input[@type=\"password\"]"));
     pin.sendKeys("552525");
     
     WebElement conti = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
     conti.click();
             
 }
 

public static void main(String[] args) throws InterruptedException {
    WebDriver driver = Browser.callbrowser();
         login obj = new login();
            obj.log(driver);
    	
}
}
