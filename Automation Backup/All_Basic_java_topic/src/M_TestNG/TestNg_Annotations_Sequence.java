package M_TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNg_Annotations_Sequence {
	
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
		System.out.println("Before_method:-----Execute before Before every method");		 }

	@Test
	public void Login_AA() throws InterruptedException {
		 System.out.println("TEST 01 Executions alphabate wise");         }
	
	@Test
	public void Login_AB() throws InterruptedException {
		System.out.println("TEST 02 Executions alphabate wise");             }
	
	
	@AfterMethod
	public void after_Method(){
		System.out.println("AfterMethod:-Execute after every method");             }
	
	@AfterClass
	public void after_class() {
		System.out.println(" After_class----- Execute after all test or method execution "); }
	
	@AfterTest
	public void after_Test(){
		System.out.println("After_Test_--------- Execution of all test method");              }
	
	@AfterSuite
	public void after_Suite(){
		System.out.println("AfterSuite------Execute after all test Method in suite"); 	      }
}

	


	
	
	
	
	
	

