package Practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
	for(int i=0; i<list.size(); i++) 
	{
		String S= Keys.chord(Keys.CONTROL,Keys.ENTER);
      driver.findElements(By.tagName("a")).get(i).sendKeys(S);
      System.out.println(driver.findElements(By.tagName("a")).get(i).getText());
	}
		
	}

}
