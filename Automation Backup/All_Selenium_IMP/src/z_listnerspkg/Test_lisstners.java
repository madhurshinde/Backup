package z_listnerspkg;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(z_listnerspkg.Listn.class)       // it help  to lisen the implimentation class   by using   package.lisner 

public class Test_lisstners {
	
	@Test
	public void TestPass() {
		System.out.println("Pass");
	}
	
	
	@Test(timeOut= 1000)
	public void TestFail() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("fail test");
		}

       public void logindone() {
    	   System.out.println("Test 2");
       }
}
