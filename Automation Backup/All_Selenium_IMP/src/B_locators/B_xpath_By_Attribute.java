package B_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_xpath_By_Attribute {
   
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
			
    WebElement ID =driver.findElement(By.xpath("//input[@type=\"text\"]"));     	//Tagname[@attribute="Attribute value"]
    ID.sendKeys("Madhur Shinde");

    driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("My pAssword");
    
	driver.findElement(By.xpath(" //button[@value=\"1\"]")).click();
		
}
}