package H_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import F_Popups.browser;
import J_action_mouse_keybord.Browser;

public class i_frame_by_ID {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser_Frame.callBrowser();
		driver.switchTo().frame("singleframe");                                      // by id or name (Attribute)
		Thread.sleep(2000);
		
		WebElement a =driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")); 
		a.sendKeys("hello");	
		
		Thread.sleep(10);
		driver.switchTo().defaultContent();
		WebElement n =driver.findElement(By.xpath("//a[text()='Single Iframe']")); 
		n.click();
	}
}
