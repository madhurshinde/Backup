package C_Webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Is_selected_radio_check {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/radio.html");
	  driver.manage().window().maximize();
	
	 //option ratio Button On 
	  WebElement option =driver.findElement(By.xpath("//input[@name=\"webform\"][1]"));        
	  boolean UNclick = option.isEnabled();
	  System.out.println(UNclick);                          

	  option.click();                                          

      boolean Click = option.isEnabled();
      System.out.println(Click); 
    
    //Check Box Select  
      
      System.out.println(driver.findElement(By.xpath("//input[@name='webform'][4]")).isSelected());
      WebElement h = driver.findElement(By.xpath("//input[@name='webform'][4]"));
  	  boolean Status = h.isSelected();                            
  	  System.out.println(Status);                                  // without click status 
  	
      h.click();
      boolean NewStatus =h.isSelected();
      System.out.println(NewStatus);                               // With click Status 
  	
	}
} 