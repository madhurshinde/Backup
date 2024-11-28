package special;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

	public static  WebDriver callbrowser () {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");

	  	ChromeOptions options = new ChromeOptions();                                    // to dissmiss notification 
	     options.addArguments("--disable-notifications");
	     WebDriver driver = new ChromeDriver(options);
	  //   driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		driver.get("https://kite.zerodha.com/");
	   driver.manage().window().maximize();
		return driver;

	}
}
