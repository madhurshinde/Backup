package xFindelements_tableFeatch;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Column_heading_List {

	public static void main(String[] args) {
		WebDriver driver = Browserrr.CallBrowser();
		 List<WebElement>column = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr//th"));   // start with th  means column 
		 System.out.println(column.size());                                      // use relative xpath for finding relative xpath
		 
		 for( int i=0; i<column.size(); i++) {
			 System.out.println(column.get(i).getText()); }
	}
}
