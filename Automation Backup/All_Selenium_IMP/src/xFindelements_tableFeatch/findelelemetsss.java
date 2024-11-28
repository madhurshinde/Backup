package xFindelements_tableFeatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import F_Popups.browser;

public class findelelemetsss {

	public void sample(WebDriver driver) throws InterruptedException {
		
		//WebElement hi =driver.findElement(By.xpath(""))
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@name=\"name\"]"));
		//System.out.println(checkbox.size());
		checkbox.get(0).click();
		Thread.sleep(5000);
		checkbox.get(1).click();
//		System.out.println(checkbox.get(0).getAttribute("id"));
//		System.out.println(checkbox.get(1).getAttribute("id"));		
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = browser.CallBrowser();
		findelelemetsss obj = new findelelemetsss();
		obj.sample(driver);		
	}
}
