package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import smethod.browser;

public class droupdown {
	
	public void byindex() throws InterruptedException {
		WebDriver driver = browser.Clbrowser();
//		WebElement hh =driver.findElement(By.xpath("//span[@class=\"hm-icon-label\"]"));   // all click 
//		hh.click();
//		Select a =new Select(hh);
//		a.selectByIndex(2);
//		a.selectByValue("Movers and Shakers");
//		a.selectByVisibleText("Movers and Shakers");
	
		
		WebElement n =driver.findElement(By.xpath("(//span[@class=\"nav-icon nav-arrow\"])[4]"));  // prime account
		n.click();
		
		WebElement h =driver.findElement(By.xpath("(//span[@class=\"nav-icon nav-arrow\"])[2]"));  //sign in 
		h.click();
		
		WebElement k =driver.findElement(By.xpath("//input[@type=\"email\"]"));              // email id 
		k.sendKeys("9096448512");
		
		WebElement b =driver.findElement(By.xpath("//input[@id=\"continue\"]"));      //continue click 
		b.click();
		
		WebElement c =driver.findElement(By.xpath("//input[@type=\"password\"]"));         //password
		c.sendKeys("292929md");
		WebElement d =driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		d.click();
		
		

		WebElement e =driver.findElement(By.xpath("//select[@data-nav-digest=\"1A/TxAhvjBJ9KDqGirr+VGP6khw=\"]"));  //search software 
		
        Select g =new Select (e);
      	g.selectByIndex(35);                                      // by index
	//   g.selectByValue("search-alias=software");		          // by value 
  //       g.selectByVisibleText("software");                     // by visible text 
		
		WebElement m =driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")); //click on search 
		m.click();
      
		WebElement j =driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[1]"));// Click on checkbox 
		Thread.sleep(3000);
		j.click();
	
	}
	
	public static void main(String[] args) throws InterruptedException {

		droupdown ne = new droupdown ();
		ne.byindex();
		
	}

}
