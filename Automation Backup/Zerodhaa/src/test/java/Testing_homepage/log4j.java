package Testing_homepage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Baseclass.Browser;
import POM.Login_POM;


public class log4j {
	static Logger Log = Logger.getLogger(log4j.class.getName());
	
	@Test
	public void test() {
		WebDriver driver =Browser.CallBrowser();
		Log.info(" Browser Lunced Succefully");     // if lucnch then print 
	
		
		
		Login_POM hi = new Login_POM (driver);
		hi.DisplayUserid();
		Log.info(" User logged sussessfully ");
	    Log.debug("check");
	}

}
