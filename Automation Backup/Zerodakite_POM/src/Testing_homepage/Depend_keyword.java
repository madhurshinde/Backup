package Testing_homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import special.Browser;

import special.pom_login;

public class Depend_keyword {
    WebDriver driver;
@BeforeClass
	public void BeforeMethod() {
		driver=Browser.callbrowser();
		System.out.println("before method");}

@Test 
	public void login_correct() throws InterruptedException {
	    Thread.sleep(1000);	
		pom_login obj= new pom_login(driver);  
		obj.usee("EM5241");
		obj.pw("Akshay@1992");
		obj.sub();
	   Thread.sleep(2000);
	   obj.pin(driver, "552525");
	   obj.continue_click();	}
	
@Test (dependsOnMethods = {"login_correct"})
	public void login_act() throws InterruptedException {
	   Thread.sleep(2000);
		WebElement h = driver.findElement(By.xpath("(//a[@target=\"_blank\"])[2]"));
		h.click();
	}
@Test
	public void login_buy() throws InterruptedException {
	WebDriver driver=Browser.callbrowser();
	pom_login obj= new pom_login(driver);  
	obj.usee("EM5241");
	obj.pw("Akshay@1992");
	obj.sub();
   Thread.sleep(2000);
   obj.pin(driver, "552525");
   obj.continue_click();

}
}

