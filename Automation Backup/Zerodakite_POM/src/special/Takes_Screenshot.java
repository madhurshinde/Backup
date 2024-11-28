package special;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Takes_Screenshot {

	public static void getScreenshotAs(WebDriver driver) throws IOException {
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination =new File ("C:\\selenium\\Testing pic\\TEST1.jpg");
		
		FileHandler.copy(source, Destination);
	}
}
