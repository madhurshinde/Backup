package Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

public static WebDriver CallBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Zerodhaa\\src\\main\\resources\\chromedriver.exe");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MICROSECONDS);
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
    return driver;
}
		
}
