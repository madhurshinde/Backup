package Utilites;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void S_Shot ( WebDriver driver , String a) throws IOException {

	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Zerodhaa\\Screenshot\\"+a+".jpg");
	FileHandler.copy(source, Destination);
	}
}
