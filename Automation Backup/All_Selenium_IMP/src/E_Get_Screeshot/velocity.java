package E_Get_Screeshot;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class velocity {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = Browser.CallBrowser ();
	 WebElement h =  driver.findElement(By.xpath("//div[text()='Select Title']"));    
   	  h.click();
   	  Actions act = new Actions(driver);
   	  act.sendKeys("Prof.");
   	  act.build().perform();
		
		 
}
}