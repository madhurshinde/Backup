package D_Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_Calendar_Drowpdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		
		driver.findElement(By.cssSelector("ui-state-default ui-state-highlight")).click();
		
	}
}
