package Testing_homepage;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import POM.Login_POM;

public class External_report {
    
	private static final String LaunchBrowser = null;
	ExtentReports reports ;
	ExtentHtmlReporter Htmlreports ;
	ExtentTest test ; 
	
	@BeforeTest
	public void startTest() {
		reports = new ExtentReports();
		Htmlreports = new ExtentHtmlReporter(System.getProperty("user.dir") + "/testoutput/ExtentReport.html"); // out save in local system 
	reports.attachReporter(Htmlreports);
	reports.setSystemInfo("Machine", "Ajeet-772G");  // machin is and user info
	reports.setSystemInfo("Env", "DevOps");                               // enviorement 
	reports.setSystemInfo("Build", "Integration");                // 
	reports.setSystemInfo("Browser", "Chrome");  // browser use 
	}

	
	@Test
	public void test() {
		test = reports.createTest("test");
	

	}
}