package L_POM_PAge_objmodel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import F_Popups.browser;

public class Test_By_Pom {

	public void test() throws EncryptedDocumentException, IOException {
		WebDriver driver= browser.CallBrowser();
		POM_login_zeroda obj =new POM_login_zeroda( driver);
		obj.usee("Madhur@2021");   
		obj.pw("Madhur2222");	
	}

	public void test1() throws EncryptedDocumentException, IOException {
		WebDriver driver= browser.CallBrowser();
		POM_login_zeroda obj =new POM_login_zeroda( driver);
		obj.usee("Madhur@2021");   
		obj.pw("");	
	}
	
	
	public void test2() throws EncryptedDocumentException, IOException {
		WebDriver driver= browser.CallBrowser();
		POM_login_zeroda obj =new POM_login_zeroda ( driver);
		obj.usee("");   
		obj.pw("");
		}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Test_By_Pom obj =new Test_By_Pom();
		obj.test();
		obj.test1();
		obj.test2();
	}
}