package C_Webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver =new ChromeDriver();
		 Driver.get("http://demo.guru99.com/test/flash-testing.html");                  // get link
		 Driver.manage().window().maximize();                                             //maximize

		 WebElement gg = Driver.findElement(By.xpath("//font[@color=\"#0099CC\"]"));                 // get text method use to get text from webpage
		   String stat = gg.getText();
		    System.out.println(stat);
			
		WebElement nn = Driver.findElement(By.xpath("//a[text()=\"Insurance Project\"]"));
		  String astat = nn.getText();
		    System.out.println(astat);
}
}