package Practices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page_explicite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy ");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		WebElement Ss = driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
		Select Dropdown = new Select(Ss);
		Dropdown.selectByIndex(2);

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("signInBtn")).click();

		WebElement Explicite = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"btn btn-info\"])[1]")));

		List<WebElement> options = driver.findElements(By.xpath("//p[@class=\"card-text\"]"));

		for (int a = 1; a < options.size(); a++) {

			System.out.println(options.get(a).getText());
		}
	}
}
