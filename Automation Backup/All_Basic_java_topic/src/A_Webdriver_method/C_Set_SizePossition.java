package A_Webdriver_method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Set_SizePossition {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
       Point p =new Point(200, 400);                     // set position of window 
       driver.manage().window().setPosition(p);
        
       Thread.sleep(5000);
       Dimension d = new Dimension(200,-800);         //  dimension of window by pixsal
	   driver.manage().window().setSize(d);
}
              
	}  

