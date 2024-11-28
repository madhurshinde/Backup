package F_Popups;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;


public class child_Browser_Arraylist {

	public static void main(String[] args) {
		WebDriver driver = browser.CallBrowser();
		
     String main =driver.getWindowHandle();                                          // single id 
      System.out.println(main);
     
     List<String> adress = new ArrayList<String>(driver.getWindowHandles());       // multiple id   save list of string   list = id order save krte 
      
     
     driver.switchTo().window(adress.get(0));                                    //drive.switch.window(adress.get(0)) // main 0
	 driver.close();
                                                                             // main 0 , last open index 1,........
	 driver.switchTo().window(adress.get(1));                              //drive.switch.window(adress.get(1))  last open index 1
	 driver.close();
	
	 driver.switchTo().window(adress.get(2));    
	 driver.close();
	 
	 driver.switchTo().window(adress.get(3));                               //last open popup
	 driver.close();

	}
	}

//System.out.println(adress.get(0));  // main page 
//System.out.println(adress.get(1));	 //last open popup
//System.out.println(adress.get(2));  //second last
//System.out.println(adress.get(3));  //third last