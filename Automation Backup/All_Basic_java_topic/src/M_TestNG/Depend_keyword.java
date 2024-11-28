package M_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import E_Get_Screeshot.Browser;
import F_Popups.browser;
import L_POM_PAge_objmodel.POM_login_zeroda;


public class Depend_keyword {
    WebDriver driver;
@BeforeClass
	public void BeforeMethod() {
		driver=browser.CallBrowser();
		System.out.println("before method");}

@Test 
	public void login_correct() throws InterruptedException {
	    Thread.sleep(1000);	
	    POM_login_zeroda obj= new POM_login_zeroda(driver);  
		obj.usee("EM5241");
		obj.pw("Akshay@1992");
		obj.sub();
	   Thread.sleep(2000);
	   obj.pin();
	   obj.continue_click();	}
	
@Test (dependsOnMethods = {"login_correct"})
	public void login_act() throws InterruptedException {
	   Thread.sleep(2000);
		WebElement h = driver.findElement(By.xpath("(//a[@target=\"_blank\"])[2]"));
		h.click();
	}
@Test
	public void login_buy() throws InterruptedException {
	WebDriver driver=Browser.CallBrowser();
	POM_login_zeroda obj= new POM_login_zeroda (driver);  
	obj.usee("EM5241");
	obj.pw("Akshay@1992");
	obj.sub();
   Thread.sleep(2000);
   obj.pin();
   obj.continue_click();

}
}

