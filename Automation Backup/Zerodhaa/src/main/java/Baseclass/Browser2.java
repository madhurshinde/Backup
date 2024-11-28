package Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser2 {

	
	public static WebDriver Callfire() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\Zerodhaa\\src\\main\\resources\\gekodriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable notifications");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://kite.zerodha.com/");
		driver2.manage().timeouts().implicitlyWait(3000,TimeUnit.MICROSECONDS);
		driver2.manage().window().maximize();
	    return driver2;
}
}