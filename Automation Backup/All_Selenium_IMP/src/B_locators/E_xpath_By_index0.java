package B_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_xpath_By_index0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/");
        driver.manage().window().maximize();
        
        WebElement p = driver.findElement(By.xpath("//span[contains(@onclick,'s')][1]"));
        p.click();
        
}
}