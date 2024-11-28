package C_Webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdiplay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver =new ChromeDriver();
		
		Driver.get("http://demo.guru99.com/test/flash-testing.html");                  // get link
		
		Driver.manage().window().maximize();                                             //maximize
		
		WebElement h = Driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));                   
         
		Boolean nvisible = h.isDisplayed();                                           //check visible or not
		System.out.println(nvisible);
		
		WebElement e = Driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"][1]"));  // click on selenium   (know visible) 
		e.click();
		
		Boolean visible = h.isDisplayed();                                          // check visible or not
		System.out.println(visible);
}
}