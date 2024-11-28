package O_Assertion;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import F_Popups.browser;
import L_POM_PAge_objmodel.POM_login_zeroda;

public class Soft_assersion {

	public void Softassersion() throws InterruptedException {
		WebDriver driver =browser.CallBrowser();
		POM_login_zeroda hi= new POM_login_zeroda ( driver);
		
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(hi.userid(),"Login to Kit");
		
//		Assert.assertEquals(hi.getHeading(), "Login to Kite");
		
		hi.usee("EM5241");                             
		hi.pw("Akshay@1992");                         
		hi.sub();                                      
		Thread.sleep(5000);
		hi.pin();                             
		hi.continue_click();
		assertion.assertAll();	
		}
	
}
