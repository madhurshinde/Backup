package xFindelements_tableFeatch;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Single_Row_list {

	public static void main(String[] args) {
		WebDriver driver = Browserrr.CallBrowser();
		List<WebElement> row = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));   // xpath by relative 
		System.out.println(row.size());
	     System.out.println(row.get(2).getText());	       // for single  row     
//		for(int i=0 ; i<row.size() ; i++ ) {                   // loop
//			 System.out.println(row.get(i).getText());
//		}
	}
	
}
