package J_action_mouse_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver =Browser.callBrowser();
	
  WebElement frame= driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));       //frame 2 small
	driver.switchTo().frame(frame);
	
	WebElement Source = driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));        //source 1st image
	
	WebElement target = driver.findElement(By.xpath("//div[@id=\"trash\"]"));                          //target
	
	WebElement img2 =driver.findElement(By.xpath("//img[@src=\"images/high_tatras2_min.jpg\"]"));     // 2nd image
	
	Actions act = new Actions(driver);
    act.dragAndDrop(Source,target);
    act.dragAndDrop(img2, target);
    act.build().perform();
    Thread.sleep(2000);
    
    //reverse image to target 
//    WebElement gal =driver.findElement(By.xpath("//ul[@id=\"gallery\"]"));
//    
//    act.dragAndDrop(Source, gal);
//    Thread.sleep(5000);
//    act.perform();
		
}
}
