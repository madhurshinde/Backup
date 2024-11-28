package A_Webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Geturl_Tittle_CurrentURL {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();

 //URL Konta ahe check Eg :- www.gooogle.com
	 System.out.println(driver.getCurrentUrl());    
	 String Url = driver.getCurrentUrl();             
     System.out.println(Url);
	
 //Print Tittle of Page Eg:- Facebook– log in or sign up   
     System.out.println(driver.getTitle());         
     String aa = driver.getTitle();                              
     System.out.println(aa);

     
     driver.close();                                  //close Single Window
     driver.quit();                                  //close Multiple or all Assosiated Window
	}
}