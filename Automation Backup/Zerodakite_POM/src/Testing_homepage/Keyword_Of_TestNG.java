package Testing_homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import special.Browser;
import special.pom_login;

public class Keyword_Of_TestNG {

WebDriver driver;

@BeforeMethod
public void beforeMethod() {
   driver= Browser.callbrowser();}

@Test //(timeOut = 5000)                                           //( priority=1,invocationCount = 3)      // correct cradantial         //2 min
public void login_correct() throws InterruptedException {
    Thread.sleep(5000);	
	pom_login obj= new pom_login(driver);  
	obj.usee("EM5241");
	obj.pw("Akshay@1992");
	obj.sub();
   Thread.sleep(2000);
   obj.pin(driver, "552525");
   obj.continue_click();	}


@Test (enabled=false)              // in correct 
public void login_incorrect() {
	pom_login obj= new pom_login(driver);
	obj.usee("EM8241");
	obj.pw("Akshay@1992");
	obj.sub();
	obj.pin(driver, "552525");
	obj.continue_click();	}


@Test(priority =-1,invocationCount=2 ,enabled=false )                             // blank 
public void login_Blank() {
	pom_login obj= new pom_login(driver);
	obj.usee("");
	obj.pw("");
	obj.sub();
	}

}
