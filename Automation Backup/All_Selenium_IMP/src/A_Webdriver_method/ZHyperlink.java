package A_Webdriver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ZHyperlink {
    public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");	 
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 
//			WebElement hi = driver.findElement(By.linkText("https://www.google.co.in/"));
//			hi.click();
//		
			
		WebElement h= driver.findElement(By.xpath("//input[@type=\\\"tex\\\"]"));
			String j= h.getText();
			System.out.println(j);
			
			h.getAttribute("hi");
}}

