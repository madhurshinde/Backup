package Practices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_childBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		Set<String> ID = driver.getWindowHandles();
		Iterator<String> AllID = ID.iterator();
		String parents = AllID.next();
		String Child = AllID.next();

		driver.switchTo().window(Child);

		System.out.println(driver.findElement(By.xpath("//p[@class=\"im-para red\"]")).getText()); // print text on
																									// child

		String Email = driver.findElement(By.xpath("//p[@class=\"im-para red\"]")).getText().split("at")[1].trim()
				.split(" ")[0];
		driver.switchTo().window(parents); // fetch the email from child browser

		driver.findElement(By.id("username")).sendKeys(Email);
	}
}
