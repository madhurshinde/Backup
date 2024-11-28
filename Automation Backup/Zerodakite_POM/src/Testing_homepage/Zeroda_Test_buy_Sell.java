package Testing_homepage;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import special.Browser;
import special.pom_buysell;
import special.pom_login;

public class Zeroda_Test_buy_Sell {
	WebDriver driver;
	
	@BeforeMethod
	public void BeforeMethod() {
		driver=Browser.callbrowser();
		System.out.println("before method");}
	
	@Test
	public void Sell() throws InterruptedException {
	
	pom_login obj = new pom_login (driver);
		obj.usee("EM5241");                              // user id 
		obj.pw("Akshay@1992");                           // pw 
		obj.sub();                                       // submit
		Thread.sleep(2000);  
		obj.pin(driver, "552525");                               // PIN
		obj.continue_click();                          // continue
        Thread.sleep(2000);
	pom_buysell hi = new pom_buysell(driver);
	    hi.search("TCS");
	    hi.TCS(driver);
	    hi.buy();
	    Thread.sleep(2000);
	    hi.switchcontrol();                            // switch
	    hi.Regular();
	    hi.Qty("1");
	    hi.SELL();
	}
	@Test
    public void Buy() throws InterruptedException {
    	pom_login obj = new pom_login (driver);
		obj.usee("EM5241");                              // user id 
		obj.pw("Akshay@1992");                           // pw 
		obj.sub();                                       // submit
		Thread.sleep(2000);  
		obj.pin(driver, "552525");                               // PIN
		obj.continue_click();                          // continue
        Thread.sleep(2000);
	pom_buysell hi = new pom_buysell(driver);
	    hi.search("TCS");
	    hi.TCS(driver);
	    hi.buy();
	    Thread.sleep(2000);
	    hi.Regular();
	    hi.Qty("1");
	    hi.Buy2();    }
	
	
	@BeforeClass
	public void hi() {
		System.out.println("Prajot mahol karte ahe ");
	}
}	
