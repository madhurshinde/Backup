package Utilites;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listn implements  ITestListener {                        // iTestListner inferface     implimentation class(listerners)


   public void onTestStart(ITestResult result) {                   // itestResult complete
		System.out.println("Test Start"+result.getName());         // we use getname   to take all detail of test
   		}
	
	public void onTestSusses (ITestResult result) {
		System.out.println("Susses of test cases and its details "+result.getName());
       	}
	
	public void onTestFailure (ITestResult result,String a) throws IOException {         // to take screenshot after fail test
          System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Zerodhaa\\src\\main\\resources\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();                                                                                                                      
          Screenshot.S_Shot(driver,a);
          
        //File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
         // File destination = new File("D:\\velocity\\"+a+".jpg");
        //  FileHandler.copy(source,destination);
       //	System.out.println("TEst FAil zala "+result.getName());
	   
	  }
		
	public void onTestSkipped (ITestResult result) {
		System.out.println("skip of test case and it details "+result.getName());
	    }

	public void onTestFinish (ITestResult result) {
		System.out.println("finish test " +result.getName());
	    }
}
