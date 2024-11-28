package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_progrm {
	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		System.out.println(driver.findElements(By.tagName("iframe")).size()); // check sizze of frame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // switch to Frame
		WebElement Source = driver.findElement(By.id("draggable"));

		WebElement Target = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		act.dragAndDrop(Source, Target).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
	}
}
