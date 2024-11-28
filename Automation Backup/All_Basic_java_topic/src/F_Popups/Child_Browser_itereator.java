package F_Popups;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;


public class Child_Browser_itereator {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =browser.CallBrowser(); 
	
     Set<String> adr =driver.getWindowHandles();              // single adrees by getwindow handle  //return Type Set<String>   //4 window 
        System.out.println(adr);                              // all adress print in console
	 
	   Iterator <String> g = adr.iterator();                   //return type Iterator <String>
	    
	    String title ="Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";
	      
	     while (g.hasNext()) {                                 //1 st adress 8AD2 // 2 adree 0E65 //3 adress 2B37// 4 adress 4015
            driver.switchTo().window(g.next());
             String tit = driver.getTitle();                 //get tittle //ellie //congnizant//tech
              System.out.println(tit);
                if(!tit.equals(title)) {                              // if TIt is not equal to jobs-requipment  (only main page remain)
                  Thread.sleep(2000);                             
                   driver.manage().window().maximize();                 // then maximize
                   Thread.sleep(2000);
                    driver.close();                                      // after maximize close uable 
    }
    }
	}}
