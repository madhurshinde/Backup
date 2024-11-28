package C_Webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys_and_click {

         public static void main(String[] args) throws InterruptedException {
			
      System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
      WebDriver Driver = new ChromeDriver();
     
      Driver.get("http://demo.guru99.com/insurance/v1/index.php");                             //get link
      
      
      Driver.manage().window().maximize();
      
      WebElement anki = Driver.findElement(By.xpath("//input[@id=\"email\"]"));             // add credentials
      anki.sendKeys("Annkita hushar zali");
      
      
      WebElement w = Driver.findElement(By.xpath("//div[3]//form//div[2]//input "));          //webelement Sendkey method addc redentials
      w.sendKeys("Durgesh hushar zala");
      
      Thread.sleep(5000);
      
      WebElement ashwini =Driver.findElement(By.xpath("html/body/div[3]/form/div[3]/input"));      // Web element Click method 
      ashwini.click();
      
      
      
		} 	
}
