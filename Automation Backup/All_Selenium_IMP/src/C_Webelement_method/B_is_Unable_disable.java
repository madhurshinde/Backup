package C_Webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_is_Unable_disable {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	
	System.out.println(driver.findElement(By.xpath("//a[text()='Flash Movie Demo']")).isEnabled());// shotcut
	
	WebElement textdrop = driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));
    boolean newstatus = textdrop.isEnabled();
	System.out.println("Enabled "+newstatus);
    
	boolean status=textdrop.isDisplayed();
	
	Thread.sleep(3000); 
	
	System.out.println("Display "+status);
	textdrop.click();
	
	
}
}
