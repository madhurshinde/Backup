package O_Assertion;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import F_Popups.browser;
import L_POM_PAge_objmodel.POM_login_zeroda;
import special.Browser;
import special.Pom_homepage;
import special.pom_buysell;


public class login_assersion {
  
	@Test (enabled= false)
	public void testinglogin() throws InterruptedException {
		WebDriver driver = browser.CallBrowser();
		POM_login_zeroda  hi= new POM_login_zeroda ( driver);
		//Assert.assertEquals(hi.getHeading(), "Login to Kit");
		hi.usee("EM5241");                             // id 
		hi.pw("Akshay@1992");                          // pw
		hi.sub();                                      // submit k
		Assert.assertEquals(hi.userid(),"EM5241");
		Thread.sleep(5000);
		hi.pin();                             //if valdation ok  then submit 
		 //Assert.assertEquals(hi.isselect_continue(), false );
		//Assert.assertEquals(hi.Cont_visible(), "Continue");       // is text 
		Assert.assertNotEquals(0, 0, 0, null);
		
		hi.continue_click();
	}

	@Test 
	public void AssersionTrue() throws InterruptedException {
		WebDriver driver = browser.CallBrowser();
		POM_login_zeroda  hi= new POM_login_zeroda ( driver);
         hi.usee("EM5241");
		  //Assert.assertFalse(true);
		  Assert.assertTrue(hi.continue_display());                           // what is the use of that and how it use
        hi.pw("Akshay@1992");
        hi.sub();
        Thread.sleep(2000);
        Assert.assertFalse(hi.continue_display());
        hi.pin();
        hi.continue_click();
	}
	@Test (enabled= false)
	public void Nullnotnull() throws InterruptedException {
		WebDriver driver =browser.CallBrowser();
		POM_login_zeroda  hi= new POM_login_zeroda ( driver);
		hi.usee("EM5241");
        hi.pw("Akshay@1992");
        hi.sub();
        Thread.sleep(2000);
        hi.pin("552525");
        hi.continue_click();
        POM_buy_Sell_zerodha gi =new POM_buy_Sell_zerodha(driver);
        Thread.sleep(3000);
        gi.search("TCS");
        gi.TCS(driver);
        gi.buy();
        gi.Regular();
        Thread.sleep(2000);
        gi.Intraday();
        Assert.assertNull(gi);
        gi.Qty("5");
       // Assert.assertNull(gi);
        Thread.sleep(2000);
       gi.Buy2();      
}
    @Test (enabled= false)
	public void Softassersion() throws InterruptedException {
		WebDriver driver =Browser.callbrowser();
		pom_login_demo  hi= new pom_login_demo ( driver);
		
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(hi.getHeading(),"Login to Kit");
		
//		Assert.assertEquals(hi.getHeading(), "Login to Kite");
		
		hi.usee("EM5241");                             
		hi.pw("Akshay@1992");                         
		hi.sub();                                      
		Thread.sleep(5000);
		hi.pin("552525");                             
		hi.continue_click();
	//	assertion.assertAll();	
		}
	

	}
