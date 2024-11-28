package xFindelements_tableFeatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class single_data_in_table {

	public static void main(String[] args) {
		 WebDriver driver = Browserrr.CallBrowser();
		 WebElement price = driver.findElement(By.xpath("//td[text()='687.3']"));   // it is a dynamic element 
         System.out.println(price);		 
         
         WebElement price2 =driver.findElement(By.xpath("//html//body//table//tr[5]//td[4]"));
         System.out.println(price2); nkjsj
	}
}
