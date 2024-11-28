package L_POM_PAge_objmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_homepage_zeroda {
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
@FindBy(xpath="//input[@type=\"text\"]")private WebElement search;
@FindBy(xpath="//span[text()='TCS']")private WebElement TCS; 
@FindBy(xpath="//button[@type=\"button\"]")private WebElement buy;


	
public POM_homepage_zeroda(WebDriver driver) {
	
	PageFactory.initElements(driver, this);}

public void NIFTY () {
	NIFTY.click();}

public void SENSEX() {
	SENSEX.click();}

 public void Kite() { 
	Kite.click();} 

public void Dashboard() {
	Dashboard.click();}

public void Orders() {
	Orders.click();}

public void ORDERin() {
	ORDERin.click();}

public void GTT() {
	GTT.click();}

public void Baskets() {
	Baskets.click();}

public void SIP() {
	SIP.click();}

public void Alerts() {
	Alerts.click();}

public void IPO() {
	IPO.click();}

public void Holdings() {
	Holdings.click();}

public void Positions() {
	Positions.click();}

public void Funds() {
	Funds.click();}

public void Apps() {
	Apps.click();}

public void id() {
	id.click();}	
} 