package C_Webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aa_ISSelect_all {

  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	
// Select Assertion 	
	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());  // not Selected
	    
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();                           // Click action
	    
	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); //Selected 
	
     
	System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());

  }
}
