package logical_Program_IMP;

public class A2_All_Star_Pattern {

	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {	      				// *
			for(int j=1; j<=i;j++) {				// * *
				System.out.print("*");				// * * *
			}										// * * * *
			System.out.println(" ");				// * * * * *
		}      
	
		System.out.println("combine both");          // * * * * *
	   for(int a=1; a<=5; a++) {					// * * * *
		   for(int b=5; b>=a; b--) {				// * * *
		System.out.print("*");	   					// * *
		   }										// *
		   System.out.println( );
	   }
	   
	   System.out.println( );
	  for(int x=1; x<=5; x++) {					
		  	for(int y=5; y>=x; y--) {			//            *
		  System.out.print(" ");				//          * *
		  	}									//      * * * *
		  for(int z=1;z<=x; z++) {				//    * * * * * 
			  System.out.print("*");			//  * * * * * *
		  }
		  System.out.println( );
	  }
	  
	  System.out.println("Combination Both");
	  for(int x=1; x<=5; x++) {						// * * * * *		
		  for(int y=1; y<=x; y++) {					//   * * * *
			  System.out.print(" ");				//     * * *
		  }											//       * * 
		  for(int z=5;z>=x; z--) {					//         *
			  System.out.print("*");
		  }
		  System.out.println( );
	  }

	  System.out.println("Normal Statement"  );
	  for(int j=1; j<=5;j++) {				
		  for(int k=5;k>=j;k--) {					//     *
			  System.out.print( " ");				//    * *
		  }											//   * * *
		  for(int l=1; l<=j; l++) {					//  * *	* *
			  System.out.print(" *");				// * * * * *
		  }
		  System.out.println( );
	  }
	  
	  
	  System.out.println("peramid by 1st process");

	  for(int e=1; e<=5; e++) {						//       *
		  for(int f=5; f>=e; f-- ) {				//      * *	
			  System.out.print(" ");				//     * * *
		  }											//    * * * *
		  for(int g=1;g<=e; g++) {					//   * * * * * 	
			  System.out.print("*");
		  }
		  for(int g=2;g<=e; g++) {
			  System.out.print("*");
		  }
	  System.out.println( );
	  }
	  
	  
	  System.out.println("paramid 2nd processs");
	  for(int e=1; e<=5; e++) {									//       *
		  for(int f=5; f>=e; f-- ) {							//      * *	
			  System.out.print(" ");							//     * * *
		  }														//    * * * *
		  for(int g=1;g<(e*2); g++) {	// <= not  only < use   //   * * * * * 	
			  System.out.print("*");
		  }
	  System.out.println( );
	  }
	  

	  System.out.println(" reverse peramid by 1st process");

	  for(int e=1; e<=5; e++) {						//   * * * * *
		  for(int f=1; f<=e; f++ ) {				//    * * * *
			  System.out.print(" ");				//     * * *
		  }											//      * *	
		  for(int g=5;g>=e; g--) {				    //       *
			  System.out.print("*");
		  }
		  for(int g=5;g>=e; g--) {
			  System.out.print("*");
		  }
	  System.out.println( );
	  }

	  
	  System.out.println("reverse paramid 2nd processs");
	  for(int e=1; e<=5; e++) {									//   * * * * *
		  for(int f=1; f<=e; f++ ) {							//    * * * *
			  System.out.print(" ");							//     * * *
		  }														//      * *	
		  for(int g=9;g>(e*2); g--) {	// Start from 9 and >   //       * 	
			  System.out.print("*");
		  }
	  System.out.println( );
	  }
	  
	  
	  System.out.println("reverse paramid 3nd processs");
	  for(int n=5; n>=1; n--) {									//   * * * * *
		  for(int m=5;m>n;m--) {								//    * * * *
			  System.out.print(" ");							//     * * *
		  }														//      * *	
		  for(int o=1; o<(n*2);o++) {							//       *
			  System.out.print("*");
		  }
		  System.out.println( );
	  }
	  
	  System.out.println( "Print one Star");
	 for(int t=1; t<=5;t++) {								// *
		 for(int s=1; s<=t; s++) {							//   *
			  if(t>=2 && s<=t-1) {	//1>=2 && 1<=1-1		//	  *
				 System.out.print(" ");						//		*
			 }else											//        *
			     System.out.print("*");
		      }
		 System.out.println( );
	 }
	 
	  System.out.println( "Print one Star");
		 for(int t=1; t<=5;t++) {								//          *
			 for(int s=5; s>=t; s--) {							//        *
				 System.out.print(" ");							//      *
			 }for(int q=1; q<=t; q++) {							//    *
			    if(t>=2 && q>1) {	       						//	*
					 System.out.print(" ");							
				 }else											 
				 System.out.print("*");
			 }
			 System.out.println( );
		}		 
		 }
	}