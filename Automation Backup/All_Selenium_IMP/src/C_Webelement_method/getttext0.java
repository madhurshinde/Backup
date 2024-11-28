package C_Webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getttext0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");                                          // get URL

	WebElement k = driver.findElement(By.xpath("//button[@name=\"login\"]"));              //faceboook login page webelement path
	k.click();                                                                            //click on login page
		
	WebElement d = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]"));              // path of text which we have to find 
	
	String fb =d.getText();                                                              // check text is get or not 
	System.out.println(fb);
		
}
}