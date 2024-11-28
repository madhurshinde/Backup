package F_Popups;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Hidden_division_popup {

public static void ss(WebDriver driver) throws InterruptedException {
	
	WebElement v =driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));      // click on create 
            	v.click();
	             Thread.sleep(2000);
	 
	WebElement a =driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")); // by attributr type
	           a.sendKeys("Madhur");


	WebElement h =driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
             	h.sendKeys("Shinde");
	
	WebElement n =driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
	           n.sendKeys(" 9096448512");
	
	WebElement w =driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));
	           w.sendKeys(" MadhurS@");
	              Thread.sleep(12);
	
	WebElement c =driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));              // put 10 on facebook
      Select hh = new Select(c);                                                                   // select class obj
             hh.selectByIndex(14);                                                                        // by index method
    
    
    WebElement gg =driver.findElement(By.xpath("(//select[@aria-label=\"Month\"])"));              // put 10 on facebook
      Select hg =new Select(gg); 
             hg.selectByVisibleText("Apr");                                                                // by visisble text
                 Thread.sleep(2000);
    
    WebElement sa =driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));              // put 10 on facebook
      Select re =new Select(sa);
             re.selectByValue("1993");                                                                      // by value 
    
    WebElement ha= driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));
               ha.click();
    
    WebElement nn= driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
              nn.click();
}

     public static void main(String[] args) throws InterruptedException {
	      WebDriver driver =browser.CallBrowser();
	      Hidden_division_popup.ss(driver);
	}
}