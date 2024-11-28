package Practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet_Calender_JAvaScrip {

	
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		  ChromeOptions option = new ChromeOptions ();
	      option.addArguments("--disable-notifications");
	      WebDriver driver =new ChromeDriver(option);
	        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MICROSECONDS);
			  driver.get("https://www.spicejet.com/");
			  driver.manage().window().maximize();
			 
			WebElement Calendar= driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 css-bfa6kz r-homxoj r-ubezar\"])[1]"));
			  String dataVal = "Thu, 14 Apr 2022";
	           
			  SpiceJet_Calender_JAvaScrip.SelectByJS(driver, Calendar, dataVal);
			  
	}
			  public static void SelectByJS(WebDriver driver,WebElement element, String dataVal ){
				  JavascriptExecutor Js = ((JavascriptExecutor)driver);
				  Js.executeScript("arguments[0].setAttribute('value','"+dataVal+"');",element);              
			  
			  
			  
}
}