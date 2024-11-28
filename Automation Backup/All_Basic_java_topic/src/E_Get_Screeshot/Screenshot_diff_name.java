package E_Get_Screeshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_diff_name {

	public static void Shot(WebDriver driver , String a) throws IOException {
	    File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	    File save = new File("D:\\velocity\\"+a+".jpg");
	    FileHandler.copy(source,save);
	}
}



