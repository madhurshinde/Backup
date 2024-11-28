package L_POM_PAge_objmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_login_zeroda {
	
 @FindBy(xpath="//img[@src=\"/static/images/kite-logo.svg\"]")private WebElement kit;
 @FindBy(xpath="//div[@class=\"form-header text-center\"]")private WebElement userid;
 @FindBy(xpath="//input[@id=\"userid\"]")private WebElement usee;
 @FindBy(xpath="//input[@id=\"password\"]")private WebElement pw;
 @FindBy(xpath="//button[@type=\"submit\"]")private WebElement sub;
 @FindBy(xpath="//input[@autocorrect=\"off\"]")private WebElement pin;
 @FindBy(xpath="//button[@type=\"submit\"]")private WebElement conti;

 
 public POM_login_zeroda (WebDriver driver) {
		PageFactory.initElements(driver, this);	}
 
 public void kit() {
	 kit.click();   }
 
 public boolean  userid(){
	return userid.isDisplayed(); }
 
 public void usee(String a) {
	 usee.sendKeys(a);}
 
 public void pw(String b){
	 pw.sendKeys(b);}
  
 public void sub() {
   	  sub.click();}
 
 public void pin( ) {  
	pin.sendKeys("552525"); }
 
 public void continue_click() {
	  conti.click(); }
 
 public boolean continue_display() {
	  return conti.isDisplayed();

}
}
 
	

