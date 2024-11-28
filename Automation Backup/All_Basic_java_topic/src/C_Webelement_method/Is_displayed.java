package C_Webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_displayed {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	  driver.get("https://www.w3schools.com/css/default.asp");                  // get link
      driver.manage().window().maximize();                                             //maximize

	WebElement aa = driver.findElement(By.xpath("//a[@style=\"width:132px\"]"));
	aa.click();
 
	WebElement HH = driver.findElement(By.xpath("(//a[@class=\"w3-bar-item w3-button\"])[96]"));   // is display method   use to check webelemnt is  display or not 
	boolean find = HH.isDisplayed();
    System.out.println(find);
      
}
}