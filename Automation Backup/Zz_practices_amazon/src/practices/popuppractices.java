package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import smethod.browser;

public class popuppractices {
  public static void main(String[] args) throws InterruptedException  {
	WebDriver driver = browser.Clbrowser();
	Thread.sleep(3000);
   WebElement h =driver.findElement(By.xpath("//span[text()='Sign up with phone or email']"));
    h.click();

    Thread.sleep(5000);	
	
	WebElement a =driver.findElement(By.xpath("//input[@name=\"name\"]"));
	a.sendKeys("Madhur Shinde");
	WebElement b =driver.findElement(By.xpath("//input[@name=\"phone_number\"]"));
	b.sendKeys("9096448512");
	
	WebElement c =driver.findElement(By.xpath("//select[@aria-labelledby=\"SELECTOR_1_LABEL\"]"));    // month
     Select na = new Select(c);
     na.selectByIndex(8);
    
     WebElement d =driver.findElement(By.xpath("(//select[@aria-invalid=\"false\"])[2]"));           // date 
 	 Select da = new Select(d);
      da.selectByIndex(11);
     
      WebElement e =driver.findElement(By.xpath("(//select[@aria-invalid=\"false\"])[3]"));   // year 
      Select ea = new Select(e);
   //   ea.selectByIndex(8);
      ea.selectByVisibleText("2018");     
      
	
}
	
}
