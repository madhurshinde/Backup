package D_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class A_Select_by_index_Value {
     public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");   
	    	WebDriver driver=new ChromeDriver();                                                                    
			driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");               
			driver.manage().window().maximize();                                                             
			   
	        WebElement h =  driver.findElement(By.xpath("//select[@id='first']"));    // find dropdrown webelement
		    Select a = new Select (h);                                               //  object of select Class
		    a.selectByValue("Google");                                              // Select by text 
	    		           
		    WebElement g = driver.findElement(By.xpath("//select[@class='col-lg-3'][2]"));
		    Select d = new Select(g);                                                   
		    d.selectByVisibleText("Avatar");                                     // Select by visible text
 
	}
}
