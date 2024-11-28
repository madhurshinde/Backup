package K_javaScripte_scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import F_Popups.browser;

public class scroll {

	public void s (WebDriver driver) {     // camalecase method name 1small then big 
	     	
	//WebElement adv = driver.findElement(By.xpath("(//h2[@style=\"font-size:45px;font-weight:700\"])[1]"));
		
		
		WebElement adv = driver.findElement(By.xpath("(//div[@class=\"w3-card-2 w3-round\"])[1]"));          // webelemt where we scroll page
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", adv);                   // scroll by webelemnt
	    
	    
		//((JavascriptExecutor)driver).executeScript("Scroll,(0-2000)");                                        // Scroll  by axis
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = browser.CallBrowser();
		scroll obj= new scroll();
		Thread.sleep(2000);
		obj.s(driver);
	}
}
