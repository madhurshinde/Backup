package J_action_mouse_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_movement {

	public static void main(String[] args) {
		WebDriver driver = Browser.callBrowser();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hello"); // print hello dirctly

		//hello print by Mouse and keyboard Actions
		Actions Act = new Actions(driver);// move mouse to Account
		Act.moveToElement(driver.findElement(By.id("nav-search-bar-form"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

      driver.switchTo().
		
		
		// By using mouse action and Keyboard action
//		WebElement a = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]")); // move mouse to elements
//		Actions act = new Actions(driver);
//		act.moveToElement(a);
//		act.perform();                                                              // perform action after every method
//		act.build().perform();                                                      // multiple action perform

		
//      Act.moveToElement(driver.findElement(By.xpath("//span[@class=\"nav-line-2\"]"))).build().perform(); // ShotCut of above Step less code
		
	}
}
