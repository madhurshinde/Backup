package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_POM {
	
		 @FindBy(xpath="//img[@src=\"/static/images/kite-logo.svg\"]")private WebElement kit;
		 @FindBy(xpath="//div[@class=\"form-header text-center\"]")private WebElement userid;
		 @FindBy(xpath="//input[@id=\"userid\"]")private WebElement use;
		 @FindBy(xpath="//input[@id=\"password\"]")private WebElement pw;
		 @FindBy(xpath="//button[@type=\"submit\"]")private WebElement sub;
		 @FindBy(xpath="//input[@autocorrect=\"off\"]")private WebElement pin;
		 @FindBy(xpath="//button[@type=\"submit\"]")private WebElement conti;

		 
		 public Login_POM (WebDriver driver) {
		    PageFactory.initElements(driver, this);	}
		 
		 public void Clickkit() {
		    kit.click();    }
		 
		 public boolean  DisplayUserid(){
		   	return userid.isDisplayed(); }
		 
		 public void UserIdin(String a) {
		    use.sendKeys(a);}
	
		 
		 public void PwIn(String b){
		    pw.sendKeys(b);}
		  
		 public void LoginClick () {
		   	sub.click(); }
		 
		 public void PinIn(String c) {                                  
			 pin.sendKeys(c);  }
		 
		 public void ContinueClick() {
		    conti.click(); }
}
	