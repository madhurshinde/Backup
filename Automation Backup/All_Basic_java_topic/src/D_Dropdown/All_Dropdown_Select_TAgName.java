package D_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_Dropdown_Select_TAgName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
//Type 1		
		WebElement Select =driver.findElement(By.xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]"));
		Select CURRENCY = new Select(Select);
		
		CURRENCY.selectByIndex(1);                                                 // Select BY ID
		System.out.println(CURRENCY.getFirstSelectedOption().getText()); 
		Thread.sleep(3000);
		
		CURRENCY.selectByVisibleText("USD");                                     //Select BY visible Text
		System.out.println(CURRENCY.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		CURRENCY.selectByValue("AED");                                         // Select BY Value 
		System.out.println(CURRENCY.getFirstSelectedOption().getText());      // to Print value in Dropdown 
		Thread.sleep(3000);

	}
}
