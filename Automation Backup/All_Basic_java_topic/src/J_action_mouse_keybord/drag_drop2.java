package J_action_mouse_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class drag_drop2 {

	public void Drag (WebDriver driver) throws InterruptedException{
	     
		WebElement iframe =driver.findElement(By.xpath("(//iframe[@width=\"700\"])[1]"));   // iframe webelement  single
		driver.switchTo().frame(iframe);
	
	    // drag and drop 1 image 
		Actions action= new Actions(driver);
        WebElement Source =driver.findElement(By.xpath("(//img[@width=\"96\"])[1]")); 
        WebElement target =driver.findElement(By.xpath("//div[@id=\"trash\"]"));
        action.dragAndDrop(Source, target);	
        action.build().perform();
        
        Thread.sleep(2000);
        // reverse action    
        action.dragAndDrop(target,Source);
       WebElement gallary =driver.findElement(By.xpath("//ul[@id=\"gallery\"]"));
       action.dragAndDrop(Source,gallary);
        action.perform();
  }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.callBrowser();
	    Thread.sleep(3000);
		drag_drop2 drop = new drag_drop2();
		drop.Drag(driver);
		
	}
}
