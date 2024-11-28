package zerodaloginBY;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import special.Browser;
import special.pom_login;


public class login_byPOM {
	
   @Test
	public void correct_idpw() throws InterruptedException {
		WebDriver driver=Browser.callbrowser();
		pom_login obj = new pom_login(driver);
	
		obj.usee("EM5241");
		obj.pw("Akshay@1992");
		obj.sub();
		
        obj.pin( driver, "552525");
		obj.continue_click();
   
        }

	
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=Browser.callbrowser();
//		login_byPOM tr = new login_byPOM();
//     	tr.correct_idpw(driver);
}

