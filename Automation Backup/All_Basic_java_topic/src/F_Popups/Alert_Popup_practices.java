package F_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_practices {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("Madhur");
		driver.findElement(By.id("alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText()); // shotcut way GET text on Alert

		Alert alert = driver.switchTo().alert(); // Accept
		alert.accept();

		driver.findElement(By.id("name")).sendKeys("Madhur");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText()); // print Text
		driver.switchTo().alert().dismiss(); // Dismiss

	}
}
