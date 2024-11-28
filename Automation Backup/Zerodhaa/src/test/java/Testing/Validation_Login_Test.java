package Testing;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclass.Browser;
import POM.Login_POM;

public class Validation_Login_Test {
  WebDriver driver;                 
  
 @BeforeMethod           // every test  before method run honar
   public void Call() {
	  driver = Browser.CallBrowser();  }
	  
 @Test 
   public void correct () {
     Login_POM h = new Login_POM(driver);
	   h.UserIdin("EM5241");
	   h.PwIn("Akshay@1992");
	   h.LoginClick();
	   h.PinIn("552525");
	   h.ContinueClick();  }    
	  
 @Test 
 public void Incorrect () {
	 Login_POM h = new Login_POM(driver);
	   h.UserIdin("EM115252");
	   h.PwIn("Akshay@1992");
	   h.LoginClick();
	   h.PinIn("552525");
	   h.ContinueClick();  }
  
  @Test 
  public void blank () {
		 Login_POM h = new Login_POM(driver);
		   h.UserIdin(" ");
		   h.PwIn("  ");
		   h.LoginClick();
		   h.PinIn("552525");
		   h.ContinueClick();         
   }
}