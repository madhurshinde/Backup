package Testing_homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import special.Browser;
import special.pom_login;

public class Test_Ng_Annotations {
	
	
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("BeforeSuite:-----Run before Execution of all test , method in suite");		}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest:-----Run before Execution of all test method  belong to that class");}
	
	@BeforeClass
	public void before_class() {
		System.out.println("before_class:-----Before Class  Execute before 1st method will run or print");}
	
	@BeforeMethod
	public void Before_method() {
		System.out.println("Before_method:-----Execute before Before every method");		}

	@Test
	public void Login_zeroda() throws InterruptedException {
		WebDriver driver = Browser.callbrowser();
		pom_login hi =new pom_login(driver);
        hi.usee("EM5241");
        hi.pw("Akshay@1992");
        hi.sub();
        Thread.sleep(2000);
        hi.pin(driver, "552525");
        hi.continue_click();   }
	
	@Test()
	public void Login_withoutwrong() throws InterruptedException {
		WebDriver driver = Browser.callbrowser();
		pom_login hi =new pom_login(driver);
        hi.sub();
        Thread.sleep(2000);
        hi.pin(driver, "552525");
        hi.continue_click();  }
	
	@AfterMethod
	public void after_Method(){
		System.out.println("AfterMethod:-Execute after every method"); }
	
	@AfterClass
	public void after_class() {
		System.out.println(" after_class----- Execute after all test or method execution ");  }
	
	@AfterTest
	public void after_Test(){
		System.out.println("after_Test_--------- Execution of all test method");  }
	
	@AfterSuite
	public void after_Suite(){
		System.out.println("AfterSuite------Execute after all test Method in suite"); 	}
	
}

	


	
	
	
	
	
	

