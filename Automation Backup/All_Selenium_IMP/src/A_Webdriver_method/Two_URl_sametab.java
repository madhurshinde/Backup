package A_Webdriver_method;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Two_URl_sametab {
   public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
   	 WebDriver driver =new ChromeDriver();
   	 driver.manage().window().maximize();
   	 driver.get("https://www.facebook.com/");
	 System.out.println(driver.getTitle());
   	 
	 Thread.sleep(2000);
	 driver.get("https://twitter.com/");		
      System.out.println(driver.getTitle());
	}
}
