package N_Waits_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Emplicit_wait {
	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	     ChromeOptions options = new ChromeOptions();                                    // to dissmiss notification 
         options.addArguments("--disable-notifications");
          WebDriver driver = new ChromeDriver(options);
        	driver.get("https://kite.zerodha.com/");
            driver.manage().window().maximize();
            
            WebElement id = driver.findElement(By.xpath("//input[@type=\"text\"]"));
            id.sendKeys("EM5241");
            
            WebElement Pw = driver.findElement(By.xpath("//input[@type=\"password\"]"));
            Pw.sendKeys("Akshay@1992");
            
            WebElement Submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
            Submit.click();
            
//          Thread.sleep(2000);                                                                      // 2 sec thamb 
//          WebElement pin = driver.findElement(By.xpath("//input[@minlength=\"6\"]"));           // by using thread
//          pin.sendKeys("552525");
            
            WebDriverWait wait = new WebDriverWait(driver,3000); //  3 sec 
       	    WebElement Explicit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@minlength=\"6\"]")));   // by using Explicite wait 
            Explicit.sendKeys("552525");               // polling time 500 milisec  
  
}
}