package logical_Program_IMP;

public class sample {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {	      				// *
			for(int j=1; j<=i;j++) {				// * *
				System.out.print("*");				// * * *
			}										// * * * *
			System.out.println(" ");				// * * * * *
		} 
		
		System.out.println("------------------");
		
		
		System.out.println( "-------------------------");
		
		
		for(int i=1; i<=5; i++) {					    // * * * * *
			   for(int j=5; j>=i; j--) {				// * * * *
				   System.out.print("*");	   			// * * *
			   }										// * *
			                                            // *
			   System.out.println( );
		   }
		
		System.out.println("--------------------");
		
		for(int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
				}
			for (int k=5;k>=i;k--) {
				System.out.println("*");
			}
			System.out.println( );

		}

		
		
		for(int i=1; i<=5; i++) {						// * * * * *		
			  for(int j=1; j<=i; j++) {					//   * * * *
				  System.out.print(" ");				//     * * *
			  }											//       * * 
			  for(int z=5;z>=i; z--) {					//         *
				  System.out.print("*");
			  }
			  System.out.println( );
		  }
	}

}
