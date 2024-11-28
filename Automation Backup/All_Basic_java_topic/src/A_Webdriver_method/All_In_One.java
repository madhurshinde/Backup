package A_Webdriver_method;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_In_One {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.w3schools.com/");
		//driver.navigate().to("https://twitter.com/i/flow/login/");                        // to get link
        driver.manage().window().maximize();                                               // to maximize the window
		//driver.manage().window().minimize();                                          // to minimize the window      
		//driver.quit();                                                               // to quit all browser
		 
		 
       //Dimension d = new Dimension (200,-800);                                         //  dimension of window by pixsal
	 //  driver.manage().window().setSize(d);
      // Point p =new Point(200, 400);                                                  // set position of window 
      //  driver.manage().window().setPosition(p);
        
        //driver.navigate().back();                                                      //  to press back button
       // driver.navigate().forward();                                                  // To press forward 
        //driver.navigate().refresh();                                                 // refresh the page 
       // driver.close();                                                             // close the Window
      
              
	}
}


