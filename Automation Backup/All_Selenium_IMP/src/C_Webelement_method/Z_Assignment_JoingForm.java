package C_Webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Z_Assignment_JoingForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("Madhur Shinde");                 // Name 
		driver.findElement(By.name("email")).sendKeys("shindemadhur50@gmail.com");    //Email Id 
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("292929Md");     // PW
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement Gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select C = new Select(Gender);
		C.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio1")).click();
	    driver.findElement(By.name("bday")).sendKeys("13-04-1992");
	    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	    
	    System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText());
	}
}
