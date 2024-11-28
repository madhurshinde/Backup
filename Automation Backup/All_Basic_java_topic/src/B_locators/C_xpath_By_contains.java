package B_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_xpath_By_contains {
	
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe"); 
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();                  //tagname[contain(@attributename,'attributevalue')]

   driver.findElement(By.xpath("//input[contains(@placeholder,'Ema')]")).sendKeys("Madhur");     //1st
    WebElement ID = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')] "));     //2nd   
    ID.sendKeys("Hello");
      
    driver.findElement(By.xpath("//input[contains(@placeholder,'Pas')]")).sendKeys("PAssword");
    WebElement PW =driver.findElement(By.xpath("//input[contains(@placeholder,'Pas')]"));  
    PW.sendKeys("My PW");
    
    driver.findElement(By.xpath("//button[contains(@id,'u_0_d_')]")).click();
     
}   }
