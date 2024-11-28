
package Practices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E_Commerse_web {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		List<WebElement> options = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));

		for (int i = 0; i < options.size(); i++) { // Loops 2

			String Mashroom = options.get(i).getText();              
			System.out.println(Mashroom);                                             // to print all vegitable name 
			if (Mashroom.equalsIgnoreCase("Potato - 1 Kg")) {
				driver.findElement(By.xpath("(//button[@type=\"button\"])[13]")).click();
			}
		}
		driver.findElement(By.xpath("//a[@class=\"cart-icon\"]")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter promo code\"]")).sendKeys("Madhur");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		WebElement op = driver.findElement(By.xpath("//select[@style=\"width: 200px;\"]"));
		Select n = new Select(op);
		n.selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@class=\"chkAgree\"]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

	}
}