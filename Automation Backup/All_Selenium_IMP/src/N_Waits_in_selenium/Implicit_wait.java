package N_Waits_in_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_wait {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
     ChromeOptions options = new ChromeOptions();                                            // to dissmiss notification 
       options.addArguments("--disable-notifications");
         WebDriver driver1 = new ChromeDriver(options);
         driver1.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);            // implicite wait  use in all  method of webdriver 
	     driver1.get("https://kite.zerodha.com/");                                           //applicable every driver instance it wait for every element to be visible 
         driver1.manage().window().maximize();
     
      WebElement id = driver1.findElement(By.xpath("//input[@type=\"text\"]"));  /// wait 
      id.sendKeys("EM5241");
      
      WebElement Pw = driver1.findElement(By.xpath("//input[@type=\"password\"]")); // wait
      Pw.sendKeys("Akshay@1992");
      
      WebElement Submit = driver1.findElement(By.xpath("//button[@type=\"submit\"]")); // wait 
      Submit.click();
      Thread.sleep(2000);
      
      WebElement pin = driver1.findElement(By.xpath("//input[@type=\"password\"]"));// wait
      pin.sendKeys("552525");
      
      WebElement continuek = driver1.findElement(By.xpath("//button[@type=\"submit\"]")); // wait
      continuek.click();
}
}
