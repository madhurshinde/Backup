package O_Assertion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import F_Popups.browser;
import L_POM_PAge_objmodel.POM_login_zeroda;

public class hard_asserion {

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
}
