package J_action_mouse_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class keybord_action {

	public void presskey(WebDriver driver) throws InterruptedException {
		WebElement Email=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		Email.click();
		
   //Email.sendKeys("MAdhur Shinde");
		Actions act = new Actions(driver);  //obj of action class
		  act.sendKeys(Keys.CONTROL);           // m click
		  act.sendKeys("Madhur");
		
	//select all   control+ a
		act.keyDown(Keys.CONTROL);      //press key
	   	act.sendKeys("a");             // select A key
		act.keyUp(Keys.CONTROL);      // press key uppress
        act.build().perform();       
	
   //copy selected control+c
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("c");
	    act.keyUp(Keys.CONTROL);
	    act.build().perform();
	    
  //TAb to go to next tab  
	    act.sendKeys(Keys.TAB); 	//   click on tab
	    act.perform();
	    
  //Past Select Control+V
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("v");
	    act.keyUp(Keys.CONTROL);
	    act.build().perform();
        act.keyDown(Keys.BACK_SPACE); 
        act.keyDown(Keys.BACK_SPACE); 
        act.build().perform();
        
     WebElement c =driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls9\"]"));
  	  act.moveToElement(c);
  	  //act.click();
  	  act.perform();
  	 
	}	   
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.callBrowser();
		keybord_action c = new keybord_action();
		c.presskey(driver);
	}
}
