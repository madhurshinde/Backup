package C_Webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear_text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");                                                       //get url
	     driver.manage().window().maximize();                                                              // maximize
	
	    WebElement cli = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]"));       //faceboook login page webelement path
	      cli.sendKeys("good");                                                                           // put credentials
        	Thread.sleep(2000); //2sec                                                                       // wait  
             cli.clear();                                                                                     // clear credentials
		
}
}