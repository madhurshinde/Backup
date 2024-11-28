package F_Popups;


import java.util.Set;

import org.openqa.selenium.WebDriver;


public class Child_browse_by_SetofString {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = browser.CallBrowser();
	    
	String id = driver.getWindowHandle();                       // single page
	     System.out.println("id of Parent page id "+id);
	     
	Set<String> ids = driver.getWindowHandles();                  // multiple string handler   getwindowhandlers
	     System.out.println("Id of parent and child "+ ids );
	     int s = ids.size();
          System.out.println("size of child"+s);
     
   // To close Child Pages From parent page by using Switch To       
	     for(String child : ids ) {
	    	 if(!id.equals(child)); {
	    		 driver.switchTo().window(child);                                 // Switch
	    		 Thread.sleep(3000);
	    		 System.out.println("child window are"+driver.getTitle());    //print title 
	    		 Thread.sleep(3000);
	    		 driver.close();                                              // if not equal then close
}

	}
}}


