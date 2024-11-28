package M_TestNG;

import org.testng.annotations.Test;

public class All_keyword_testNG {
	
	@Test(enabled =false)                                                      // To skip the test case  enabled =false
	public void Login_Prajot() throws InterruptedException {
		 System.out.println("Prajot 01 Executions alphabate wise");
	}
	
	@Test(invocationCount =2)                                                  // invocatiocount  3 time execute 
	public void Login_Madhur() throws InterruptedException {
		 System.out.println("MAdhur01 Executions alphabate wise");
		 
	}
	@Test(priority = 1)                                                       // priority 1  
	public void Login_Ankita() throws InterruptedException {                  // capital  then small    // capital alphabate  then small albhabate 
		System.out.println("Ankita 02 Executions alphabate wise");  
	}
	@Test (priority = 1) 
	public void Login_Durgesh() throws InterruptedException {
		System.out.println("Durgesh 02 Executions alphabate wise");
		
	}
	@Test (dependsOnMethods= {"Login_Durgesh"})                                 // depnd on 
		public void Login_depend() throws InterruptedException {
			System.out.println("Durgesh 02 Executions alphabate wise");
	}
}
