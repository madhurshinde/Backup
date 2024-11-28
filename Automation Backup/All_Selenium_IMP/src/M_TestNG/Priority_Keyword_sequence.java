package M_TestNG;

import org.testng.annotations.Test;

public class Priority_Keyword_sequence {
	
	@Test (priority = -5 )
	public void negativeFive() {
		System.out.println("priority -5");
	}
	
	@Test (priority =- 1 )
	public void Negativeone() {
		System.out.println("priority -1");
	}

	
	@Test (priority = 0)
	public void zeropriority() {
		System.out.println("priority ");
	}

	@Test (priority = 1 )
	public void one() {
		System.out.println("priority 1");
	}

	@Test (priority = 5)
	public void five() {
		System.out.println("priority 5");
	}

	@Test//(priority =0 )
	public void withno_priority() {
		System.out.println("no priority");
	}
	
}



