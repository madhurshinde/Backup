package B_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_xpath_by_text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();                //tagname[text()="textvalue"]
		
	    WebElement j =driver.findElement(By.xpath("//a[text()=\"Financial Calculators\"]"));
	    j.click();
		
	    driver.findElement(By.xpath("//a[text()=\"Mortgage Calculator\"]")).click();
		
	    driver.findElement(By.xpath("//a[text()=\"Print\"]")).click();
	    
	    driver.findElement(By.xpath("//a[text()=\"Monthly Schedule\"]")).click();
	    
	    driver.quit();
	}

}
