package B_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_xpath_By_absolute_relative {
	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/html/default.asp");
	  driver.manage().window().maximize();
		
//     WebElement w3 =driver.findElement(By.xpath("//html/body/Div[3]/a[4]"));                // absolute Xpath click  
//     w3.click();
  
	   WebElement HTMLBasic= driver.findElement(By.xpath("html/body/div[6]/div[1]/div[1]/a[4]"));     
	   HTMLBasic.click();
		
//     WebElement w3learn=driver.findElement(By.xpath("//html/body/div[5]/div[1]/div[1]/div[1]/a"));  
//     w3learn.click();
		
		

    
//     WebElement w3 =driver.findElement(By.xpath("//html//Div[3]//a[4]"));       // relative Xpath click referance page
//     w3.click(); 
  
//     WebElement x =driver.findElement(By.xpath("//html//div[5]//div[1]//a"));              
//     x.click();
		
	   WebElement h= driver.findElement(By.xpath("html//div[6]//a[4][1]"));                    
   	   h.click();
} }