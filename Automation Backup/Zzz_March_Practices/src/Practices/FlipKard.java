package Practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class FlipKard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MICROSECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		WebElement id= driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		id.sendKeys("9096448512");
		

		WebElement PW = driver.findElement(By.xpath("(//input[@type=\"password\"])"));
		PW.sendKeys("292929@Md");
		
		WebElement Login = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		Login.click();
		
		Thread.sleep(2000);
		WebElement Mobile = driver.findElement(By.xpath("(//img[@alt=\"Mobiles\"])[1]"));
		Mobile.click();
		
		WebElement Rate =driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",Rate);
		
		WebElement H = driver.findElement(By.xpath("(//select[@class=\"_2YxCDZ\"])[2]"));
		Select Price = new Select(H);
		Price.selectByVisibleText("4000");
		
				
				
	}
}
