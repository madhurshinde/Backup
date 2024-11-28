package F_Popups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import E_Get_Screeshot.Screenshot_diff_name;
import E_Get_Screeshot.XBy_browserclass_screenshot;

public class isselectcheck {

	public void test(WebDriver driver) throws IOException {
		WebElement a =driver.findElement(By.xpath("//input[@type=\"radio\"]"));
		a.click();
		if(a.isSelected()){
			 
		}
		else
			XBy_browserclass_screenshot.SDE(driver, " not slelect ");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver = browser.CallBrowser();
		checkdisplay obj =new checkdisplay();
		obj.test(driver);
	}
}

