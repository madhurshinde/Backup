package xFindelements_tableFeatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class All_row_list {
	public static void main(String[] args) {
		WebDriver driver = Browserrr.CallBrowser();
		 List<WebElement> row = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));   // xpath by relative 
			for(int i=0 ; i<row.size() ; i++ ) {                      // loop to fetch all table
        		 System.out.println(row.get(i).getText());  }
			}  	}



