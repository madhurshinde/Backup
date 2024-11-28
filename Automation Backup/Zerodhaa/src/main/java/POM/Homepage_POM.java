package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_POM {

		@FindBy(xpath="(//span[@tooltip-pos=\"down\"])[1]")private WebElement NIFTY ;
		@FindBy(xpath="(//span[@data-balloon=\"Open chart\"])[2]")private WebElement SENSEX;
		@FindBy(xpath="//img[@alt=\"Kite logo\"]")private WebElement Kite;
		@FindBy(xpath="//span[text()='Dashboard']")private WebElement Dashboard;
		@FindBy(xpath="//span[text()='Orders']")private WebElement Orders;
		@FindBy(xpath="(//span[text()='Orders'])[2]")private WebElement ORDERin;
		@FindBy(xpath="//span[text()='GTT']")private WebElement GTT;
		@FindBy(xpath="//span[text()='Baskets']")private WebElement Baskets;
		@FindBy(xpath="//span[text()='SIP']")private WebElement SIP;
		@FindBy(xpath="//span[text()='Alerts']")private WebElement Alerts;
		@FindBy(xpath="//span[text()='IPO']")private WebElement IPO;
		@FindBy(xpath="//span[text()='Holdings']")private WebElement Holdings;
		@FindBy(xpath="//span[text()='Positions']")private WebElement Positions;
		@FindBy(xpath="//span[text()='Funds']")private WebElement Funds;
		@FindBy(xpath="//span[text()='Apps']")private WebElement Apps;
		@FindBy(xpath="//span[text()='EM5241']")private WebElement id;
	
	public Homepage_POM (WebDriver driver) {
		PageFactory.initElements(driver, this);}

	public void NIFTYclick () {
		NIFTY.click();}

	public void SENSEXclick() {
		SENSEX.click();}

   public void Kiteclick() { 
		Kite.click();} 

   public void Dashboardclick() {
		Dashboard.click();}

    public void Ordersclick() {
 		Orders.click();}

    public void ORDERinclick() {
		ORDERin.click();}

    public void GTTclick() {
		GTT.click();}

    public void Basketsclick() {
	   Baskets.click();}

    public void SIPclick() {
	  SIP.click();}

    public void Alertsclick() {
   	 Alerts.click();}

    public void IPOclick() {
    	IPO.click();     }

	public void Holdingsclick() {
    	Holdings.click();}

	public void Positionsclick() {
		Positions.click();}

	public void Fundsclickclick() {
		Funds.click();}

	public void Appsclick() {
		Apps.click();}

	public void idclick() {
		id.click();}

	} 
