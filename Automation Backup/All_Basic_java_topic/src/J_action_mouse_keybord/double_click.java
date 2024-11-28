package J_action_mouse_keybord;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) {
       WebDriver driver = Browser.callBrowser();
       
       WebElement  hh = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
         Actions act = new Actions(driver);
                 act.doubleClick(hh);
                 act.perform();
        Alert a = driver.switchTo().alert();
              a.accept();
      
      WebElement hi = driver.findElement(By.xpath("//span[text()='right click me']"));
          Actions act2=new Actions(driver);
                   act2.contextClick(hi);
                   act2.build().perform();  
	}
}
