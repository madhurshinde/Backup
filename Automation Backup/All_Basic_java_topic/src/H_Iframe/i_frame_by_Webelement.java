package H_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import F_Popups.browser;
import J_action_mouse_keybord.Browser;

public class i_frame_by_Webelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  Browser_Frame.callBrowser();
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();                           // click on i frame with an frame
		Thread.sleep(2000);
		
 		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));  
		driver.switchTo().frame(frame1);                                                                     // switch to first frame
				
   		WebElement frame2 = driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 250px;width: 400px\"]"));
		driver.switchTo().frame(frame2);                                                                   // switch to Second frame/inner frame
		
		WebElement frame3 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		frame3.sendKeys("madhur shinde");
		
		Thread.sleep(5000);
        driver.switchTo().parentFrame();     //predefile method of swith to parent 
        
         WebElement h =driver.findElement(By.xpath("//input[@type=\"text\"]"));
         h.sendKeys("he");
      
	}
}
