package special;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pom_login {
	
 @FindBy(xpath="//img[@src=\"/static/images/kite-logo.svg\"]")private WebElement kit;
 @FindBy(xpath="//div[@class=\"form-header text-center\"]")private WebElement userid;
 @FindBy(xpath="//input[@id=\"userid\"]")private WebElement usee;
 @FindBy(xpath="//input[@id=\"password\"]")private WebElement pw;
 @FindBy(xpath="//button[@type=\"submit\"]")private WebElement sub;
 @FindBy(xpath="//input[@autocorrect=\"off\"]")private WebElement pin;
 @FindBy(xpath="//button[@type=\"submit\"]")private WebElement conti;

 
 public pom_login (WebDriver driver) {
		PageFactory.initElements(driver, this);	}
 
 public void kit() {
	 kit.click();
 }
 
 public boolean  userid(){
	return userid.isDisplayed();
	 
 }
 public void usee(String a) {
	 usee.sendKeys(a);}
 
 public void pw(String b){
	 pw.sendKeys(b);}
  
 public void sub() {
   	  sub.click();}
 
 public void pin( WebDriver driver ,String h) {  
	 WebDriverWait wa = new WebDriverWait(driver,500);                                  // explicite wait 
	  wa.until(ExpectedConditions.visibilityOf(pin));
	  pin.sendKeys(h); 
    
	 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);              // fulent wait
      wait.withTimeout(Duration.ofMillis(5000));
      wait.pollingEvery(Duration.ofMillis(50));
      wait.ignoring(Exception.class);
      wait.until(ExpectedConditions.visibilityOf(pin));
       pin.sendKeys(h);
 }
 
 public void continue_click() {
	  conti.click();
 }

}
 
	

