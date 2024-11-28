package special;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_buysell {

	@FindBy(xpath="//input[@type=\"text\"]")private WebElement search;
	@FindBy(xpath="//span[text()='TCS']")private WebElement TCS; 
	@FindBy(xpath="//script[@src=\"/static/js/app-legacy.fd5c8da1.js\"]")private WebElement Add;
	@FindBy(xpath="//button[@type=\"button\"]")private WebElement buy;
	@FindBy(xpath="(//button[@type=\"button\"])[2]")private WebElement sell;
	@FindBy(xpath="//span[@class=\"icon icon-align-center\"]")private WebElement MarketDepth;
	@FindBy(xpath="//span[@class=\"icon icon-trending-up\"]")private WebElement chart;
	@FindBy(xpath="//span[@class=\"icon icon-trash\"]")private WebElement Delete;
	@FindBy(xpath="//button[@data-balloon=\"More\"]")private WebElement More;
	@FindBy(xpath="(//li[@class=\"item\"])[1]")private WebElement marketwatch1;
	@FindBy(xpath="//li[@class=\"item selected\"]")private WebElement marketwatch2;
	@FindBy(xpath="(//li[@class=\"item\"])[2]")private WebElement marketwatch3;
	@FindBy(xpath="(//li[@class=\"item\"])[3]")private WebElement marketwatch4;
	@FindBy(xpath="(//li[@class=\"item\"])[4]")private WebElement marketwatch5;
	@FindBy(xpath="(//li[@class=\"item\"])[5]")private WebElement marketwatch6;
	@FindBy(xpath="(//li[@class=\"item\"])[6]")private WebElement marketwatch7;
	@FindBy(xpath="class=\"settings-button icon icon-settings\"")private WebElement settingsbutton;
    @FindBy(xpath="(//label[@class=\"su-radio-label\"])[4]")private WebElement BSE;
    @FindBy(xpath ="(//label[@class=\"su-radio-label\"])[5]")private WebElement NSE;
    @FindBy(xpath ="//label[@class=\"su-switch-control\"]")private WebElement switchcontrol;
    @FindBy(xpath ="(//label[@class=\"su-radio-label\"])[6]")private WebElement Regular;
    @FindBy(xpath="//label[text()='Cover']")private WebElement Cover;
    @FindBy(xpath ="//label[text()='AMO']")private WebElement AMO;
    @FindBy(xpath ="//label[text()='Intraday ']")private WebElement Intraday ;   
    @FindBy(xpath ="(//label[@class=\"su-radio-label\"])[10]")private WebElement Longterm ;
    @FindBy(xpath ="(//input[@type=\"number\"])[1]")private WebElement Qty;
    @FindBy(xpath ="(//input[@type=\"number\"])[2]")private WebElement price;	
    @FindBy(xpath ="(//input[@type=\"number\"])[3]")private WebElement Triggerprice ;
    @FindBy(xpath ="//span[@data-balloon=\"Hide options\"]")private WebElement more;
    @FindBy(xpath ="(//label[@class=\"su-radio-label\"])[10]")private WebElement Market;
    @FindBy(xpath ="(//label[@class=\"su-radio-label\"])[11]")private WebElement Limit;
    @FindBy(xpath ="(//label[@class=\"su-radio-label\"])[12]")private WebElement SL;
    @FindBy(xpath ="(//label[@class=\"su-radio-label\"])[13]")private WebElement SL_M;
    @FindBy(xpath ="(//label[@class=\"su-radio-label\"])[14]")private WebElement Day;
    @FindBy(xpath ="(//label[@class=\\\"su-radio-label\\\"])[14]")private WebElement Immediate_or_Cancel;
    @FindBy(xpath ="(//input[@type=\"number\"])[4]")private WebElement Disclosed_qty;
    @FindBy(xpath ="//img[@alt=\"GTT logo\"]")private WebElement GTT_logo;
    @FindBy(xpath ="(//span[@class=\"su-checkbox-box\"])[1]")private WebElement stoploss;
    @FindBy(xpath ="(//span[@class=\"su-checkbox-box\"])[2]")private WebElement Target;
    @FindBy(xpath="(//a[@target=\"_blank\"])[9]")private WebElement Learn_more ;
    @FindBy(xpath="//button[@type=\"submit\"]")private WebElement Buy2;
    @FindBy(xpath="(//button[@type=\"button\"])[2]")private WebElement Cancel;
    @FindBy(xpath="//button[@class=\"submit\"]")private WebElement SELL;
  
    
	public pom_buysell (WebDriver driver) {
	PageFactory.initElements(driver, this);}
	
	public void search (String a) {
		 search.sendKeys(a);      }
	 
	public void TCS(WebDriver driver) {                  // MOve to Element
	 Actions act= new Actions(driver);         
	 act.moveToElement(TCS);                      
	 act.perform();}
	
	public void Add() {
		Add.click();
	}
		 
	 public void buy() {
	     buy.click();}
	 
	 public void sell() {
		 sell.click();}
	 
	 public void MarketDepth() {
		 MarketDepth.click();}
	 
	 public void chart() {
		 chart.click();}
	 
	 public void Delete() {
		 Delete.click();}
	 
	 public void More() {
		 More.click(); }
	 
	 public void marketwatch1() {
		 marketwatch1.click(); }
	 
	 public void marketwatch2() {
		 marketwatch2.click();}
	 
	 public void marketwatch3() {
		 marketwatch3.click();}
	
	 public void marketwatch4() {
		 marketwatch4.click();}
	 
	 public void marketwatch5() {
		 marketwatch5.click();}
	 
	 public void marketwatch6() {
		 marketwatch6.click();}
     
	 public void marketwatch7() {
		 marketwatch7.click();}
	 
	 public void settingsbutton() {
		 settingsbutton.click();} 
	
	 public void BSE() {
	     BSE.click();}
	 
     public void NSE() {
	    NSE.click(); }
    
     public void switchcontrol() {
	    switchcontrol.click();}
   
     public void Regular() {
	    Regular.click();}
     
     public void Cover() {
    	 Cover.click(); }
   
     public void AMO() {
	     AMO.click();}
   
     public void Intraday() {
	    Intraday.click();}
   
     public void Longterm () {
    	 Longterm.click();}
     
     public void Qty(String a) {
    	 Qty.sendKeys(a); }
     
     public void price(String b) {
    	 price.sendKeys(b);}
     
     public void Triggerprice(String c) {
    	 Triggerprice.sendKeys(c); }
     
     public void more() {
    	 more.click();}
     
     public void Market() {
    	 Market.click();}
     
     public void Limit() {
    	 Limit.click();}
     
     public void SL() {
    	 SL.click();}
    
     public void SL_M() {
    	 SL_M.click();}
     
     public void Day() {
    	 Day.click();}
      
     public void Immediate_or_Cancel() {
    	 Immediate_or_Cancel.click();}
     
     public void Disclosed_qty(String d) {
    	 Disclosed_qty.sendKeys(d);}
     
     public void GTT_logo() {
    	 GTT_logo.click();}
    
     public void stoploss() {
    	 stoploss.click();}
     
     public void Target() {
    	 Target.click();}
     
     public void Learn_more() {
    	 Learn_more.click();}
     
     public void Buy2() {
    	 Buy2.click();}
    
     public void Cancel() {
    	 Cancel.click();}
     
     public void SELL() {
    	 SELL.click();
     }
     }
     


 

    

