package xFindelements_tableFeatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Max_no {

	public static void main(String[] args) {
	 WebDriver driver = Browserrr.CallBrowser();
	List<WebElement> row =driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody//tr"));
	
	//Will return the total number of rows present.
	List<WebElement> column = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//thead//tr//th"));
	
	//Will return the total number o column present.
	System.out.println(row.size());
	System.out.println(column.size());
	
	double m =0;
	double r = 0;
	
	for(int i = 1; i<=row.size(); i++) {
	String max = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody//tr["+i+"]//td[4]")).getText();
	m = Double.parseDouble(max);
	System.out.println(m);
	
	if(m>r)
	{ 
	r=m;
	}
	}
	System.out.println("Maximum current price is : "+ r);

}
}