package Practices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_window_assingment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> ID = driver.getWindowHandles();
		Iterator<String> All = ID.iterator();

		String parent = All.next();
		String child = All.next();

		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//h3[text()=\"New Window\"]")).getText());

		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//h3[text()=\"Opening a new window\"]")).getText());

	}
}
