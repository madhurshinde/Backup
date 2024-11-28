package practices;




import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;


import smethod.browser;

public class childbrowserprac {

     public static void main(String[] args) {      // main 
		WebDriver driver = browser.Clbrowser();           //cl browser
	    
//		String a= driver.getWindowHandle();
//		String b = driver.getTitle();
//		System.out.println(a+b);
//	    driver.close();
//		
    List<String> adress = new ArrayList<String>(driver.getWindowHandles());    // obj create list<String>  all adress
        System.out.println(adress);                                            // list print
        driver.switchTo().window(adress.get(3));                               // 0 war naukari focus on 1 index 1 ta mahindra.tech mahin,3 sopra
      //System.out.println(driver.getTitle());                                 //0 main  index reverce
        String a = driver.getTitle();
        System.out.println(a);
        driver.manage().window().maximize();
        driver.close();
        driver.switchTo().window(adress.get(2));                               // focus switc 
        driver.close();
        driver.switchTo().window(adress.get(3));
        driver.close();        
	}	
}
