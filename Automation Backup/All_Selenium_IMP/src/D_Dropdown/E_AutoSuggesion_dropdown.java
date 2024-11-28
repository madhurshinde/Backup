
package D_Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_AutoSuggesion_dropdown {

	 public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("autosuggest")).sendKeys("Ind");
	    Thread.sleep(5000);
	    List<WebElement> options = driver.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
       
	   for(WebElement option :options) 
	       {
		   if(option.getText().equalsIgnoreCase("India"))
	       {
	    	option.click(); 
	    	break;
	       }
	   }
	  }
	
}
