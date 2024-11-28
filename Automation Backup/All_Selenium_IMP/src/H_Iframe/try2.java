package H_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import F_Popups.browser;

public class try2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= browser.CallBrowser();
	
		//	driver.switchTo().frame("singleframe");   // switch method by id of frame
		
		WebElement Single = driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 300px;width: 600px\"]")); // switch to by web element
	    driver.switchTo().frame(Single);        // switch to iframe
	   
	    
	    Thread.sleep(5000);
//	    driver.switchTo().parentFrame();    ///   directly main page 
	    
	    WebElement k =driver.findElement(By.xpath("//a[text()='WebTable']"));      //2nd  multile find 
	    k.click();    
	    
	}
}
