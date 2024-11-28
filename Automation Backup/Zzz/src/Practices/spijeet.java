package Practices;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class spijeet {
	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions option = new ChromeOptions ();
      option.addArguments("--disable-notifications");
      WebDriver driver =new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MICROSECONDS);
		  driver.get("https://www.spicejet.com/");
		  driver.manage().window().maximize();
		  WebElement Round = driver.findElement(By.xpath("//div[text()=\"round trip\"]"));
		  Round.click();
		  
		  WebElement Mumbai = driver.findElement(By.xpath("(//input[@autocorrect=\"on\"])[1]"));
		  Mumbai.sendKeys("Mum");
		            
		  Thread.sleep(2000);
		  WebElement Delhi = driver.findElement(By.xpath("(//input[@autocorrect=\"on\"])[2]"));
		  Delhi.sendKeys("Del");
		  
		  WebElement April= driver.findElement(By.xpath("(//div[@style=\"font-family: inherit;\"])[97]"));
		  April.click();
		  
		  WebElement June = driver.findElement(By.xpath("(//div[@dir=\"auto\"])[180]"));
		  June.click();
        
		  WebElement Passanger = driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]"));
		  Passanger.click();
		 
		  WebElement Adult = driver.findElement(By.xpath("(//div[@tabindex=\"0\"])[22]"));
		  Adult.click();

		  WebElement Child = driver.findElement(By.xpath("(//div[@tabindex=\"0\"])[24]"));
		  Child.click();

		  WebElement Serch = driver.findElement(By.xpath("//div[text()=\"Search Flight\"]"));
		  Actions Act = new Actions(driver);
		  Act.moveToElement(Serch);
		  Act.click();
		  Act.perform();
			}
}
