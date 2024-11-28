package N_Waits_in_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_wait {
	public static void main(String[] args) {
	
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
          
//        Thread.sleep(2000);
//        WebElement pin = driver.findElement(By.xpath(""//input[@minlength=\"6\"]""));      // by using thread
//        pin.sendKeys("552525");
          
         FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
         wait.withTimeout(Duration.ofMillis(5000));
         wait.pollingEvery(Duration.ofMillis(50));    //pooling  time  
         wait.ignoring(Exception.class);
     	 WebElement Fluent= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@minlength=\"6\"]")));   // by using fluent wait 
         Fluent.sendKeys("552525");           
}
}