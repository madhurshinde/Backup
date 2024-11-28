package H_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import F_Popups.browser;
import J_action_mouse_keybord.Browser;

public class Nested_iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  Browser_Frame.callBrowser();
	  
	WebElement multiclick = driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]"));    // multi
	multiclick.click();
	
    Thread.sleep(3000);
	WebElement multi = driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 300px;width:600px\"]"));// frame1
	driver.switchTo().frame(multi);
	
	
	WebElement add = driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 250px;width: 400px\"]")); // frame 2
	driver.switchTo().frame(add);
	
	
	WebElement put = driver.findElement(By.xpath("//input[@type=\"text\"]")); // inner
	put.sendKeys("maza zala re paise dile ");

	
	 driver.switchTo().parentFrame();        // Switch focus to parent frame
	 driver.switchTo().defaultContent();     // Switch focus to main page
     
	}
}
