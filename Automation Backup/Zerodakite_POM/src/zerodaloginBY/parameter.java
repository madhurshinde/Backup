package zerodaloginBY;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {

	@Test
	@Parameters({"file"})
	public void test(String file) {
		System.out.println(file);
     	
}
}
