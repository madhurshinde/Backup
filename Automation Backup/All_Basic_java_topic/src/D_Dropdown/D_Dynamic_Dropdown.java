package D_Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_Dynamic_Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe" );
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@text=\"Chennai (MAA)\"]")).click();

	    driver.findElement(By.xpath("(//a[@text=\"Bengaluru (BLR)\"])[2]")).click();
	
	}
}
