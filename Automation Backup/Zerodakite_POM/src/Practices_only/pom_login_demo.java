package Practices_only;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pom_login_demo {
	
 @FindBy(xpath="//img[@src=\"/static/images/kite-logo.svg\"]")private WebElement kit;
 @FindBy(xpath="//div[@class=\"form-header text-center\"]")private WebElement Heading;
 @FindBy(xpath="//html//div//h2")private WebElement EWali;
 @FindBy(xpath="//input[@id=\"userid\"]")private WebElement usee;
 @FindBy(xpath="//input[@id=\"password\"]")private WebElement pw;
 @FindBy(xpath="//button[@type=\"submit\"]")private WebElement sub;
 @FindBy(xpath="//input[@id=\"pin\"]")private WebElement pin;
 @FindBy(xpath="//button[@type=\"submit\"]")private WebElement conti;

 
 public pom_login_demo (WebDriver driver) {
		PageFactory.initElements(driver, this);	}
 
 public void kit() {
	 kit.click();
 }
  public String getHeading() {
	  return Heading.getText();
 }
 public void usee(String a) {
	 usee.sendKeys(a);}
 
 public void pw(String b){
	 pw.sendKeys(b);}
  
 public void sub() {
   	  sub.click();}
 
 public String Ewaliiddisplay() {
	 return EWali.getText();
	  }
 
 public void pin(String a) {
	 pin.sendKeys(a);
 }
 
 public void continue_click() {            // gettext 
	  conti.click();
 }
 public boolean isselect_continue() {  //boolean true and false
	  return conti.isDisplayed();
 }
 public String Cont_visible() {
	  return conti.getText();
}
}
	

