package H_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import J_action_mouse_keybord.Browser;

public class Iframe_by_INDEX {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  Browser_Frame.callBrowser();
        Thread.sleep(10000);
		
		
	      WebElement h =driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
	      h.sendKeys("hello");
	}
}
