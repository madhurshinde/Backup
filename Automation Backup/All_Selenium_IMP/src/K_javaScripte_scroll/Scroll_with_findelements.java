package K_javaScripte_scroll;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import F_Popups.browser;

public class Scroll_with_findelements {

	public void scroll(WebDriver driver) throws InterruptedException {
//		WebElement hi =driver.findElement(By.xpath("(//div[@class=\"w3-col l6 w3-center\"])[1]"));
      		
	  List< WebElement > hii = driver.findElements(By.xpath("//div[@class=\"w3-col l6 w3-center\"]"));  // multiple webelements
		Thread.sleep(2000);

		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",hii.get(4));
		 Thread.sleep(2000);
		 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",hii.get(8));
		 Thread.sleep(3000);
		 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",hii.get(10));
		 hii.get(10).click();
		 		 
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = browser.CallBrowser();
		Scroll_with_findelements obj = new Scroll_with_findelements();
		obj.scroll(driver);
	}
}
