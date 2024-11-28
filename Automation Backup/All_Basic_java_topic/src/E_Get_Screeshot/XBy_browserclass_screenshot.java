package E_Get_Screeshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class XBy_browserclass_screenshot {

	public static void SDE(WebDriver driver , String a) throws IOException    {
	    
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
         File save = new File("D:\\velocity\\"+a+".jpg");                       // by passing print  we rename 
	     FileHandler.copy(source,save);               
	}
}
