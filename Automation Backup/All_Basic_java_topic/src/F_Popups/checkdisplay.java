package F_Popups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import E_Get_Screeshot.Browser;
import E_Get_Screeshot.Screenshot_diff_name;
import E_Get_Screeshot.XBy_browserclass_screenshot;


public class checkdisplay {

	
	public void test(WebDriver driver) throws IOException {
		WebElement a =driver.findElement(By.xpath("(//img[@alt=\"Guru99\"])[1]"));
		if(a.isDisplayed()){
			Screenshot_diff_name.Shot(driver,"new name2");
		}
		else
			XBy_browserclass_screenshot.SDE(driver, "not on page ");
	}
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = Browser.CallBrowser();
		checkdisplay obj =new checkdisplay();
		obj.test(driver);
	}
}

