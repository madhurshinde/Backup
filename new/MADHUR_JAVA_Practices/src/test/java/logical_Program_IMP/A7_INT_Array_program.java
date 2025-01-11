package logical_Program_IMP;

public class A7_INT_Array_program {
	
	public static void main(String[] args) {
		A7_INT_Array_program obj =new A7_INT_Array_program();

//		 obj.printElementsInArray();
//		 obj.printevenOddInArray();
//		 obj.TwoDigitNumber();
//		 obj.squareCubArray();	
//		 obj.sumofArray();
//		 obj.productofArray();
//		 obj.countnumerArray();
		 obj.max_MinnumberInArray();
//		 obj.sortArrayasending();
		 obj.sortArraydesending();
	}
	
	
	public void printElementsInArray() {
	//print all String Value
		
		 int name[]= {4,5,7,9,33,45,66,44};
		 
		 for(int i=0; i<name.length; i++) {	 
			 System.out.println(name[i]);
		 }	   }
	
	public void printevenOddInArray() {
		
		int all[]= {5,12,4,21,8,2,3,7,9,11};
		
		for(int i=0;i<all.length; i++) {	
			if(all[i]%2==0) {
				System.out.println("Even no = "+all[i]);
			}else {
				System.out.println("odd no = "+all[i]);     }
		}  	}

	public void TwoDigitNumber() {
		
		int all[]= {5,12,4,21,8,2,3,7,9,11};
		
		for(int i=0;i<all.length; i++) {	
	   if(all[i]>9 &&all[i]<100) {
		   System.out.println("double digit number ="+all[i]);
	   }		}
	}

	public void squareCubArray() {
		
		int all[]= {5,12,4,21,8,2,3,7,9,11};
		
		for(int i=0; i<all.length; i++) {
			System.out.println("Square roots are if = "+ all[i] );
			System.out.printf("%2f\n",Math.sqrt(all[i]));
			System.out.println("cube roots are if = " + all[i]);
			System.out.printf("%2f\n",Math.pow(all[i], 3));
			System.out.println("cube ="+Math.cbrt(all[i]));
			
		}
	}
	
	public void sumofArray() {
		// find the sum of all array 
		// find the sum of even number
		//find the sum of odd number 
		//find the sum of 2 digit number 
		//sum of positive number 
	
		int all[]= {5,12,4,21,8,2,3,7,9,11};
		int sum =0;
		
		for(int i =0; i<all.length; i++) {
	
	//		if(all[i]>0) {					// positive number 
	//		if(all[i]>9 && all[i]<100) {	//  2 digit number 
	//		if(all[i]%2==0) {				// even no
			sum = sum+all[i];
//			}
		}
		System.out.println("Sum of Array = "+sum);
	}
	
	public void productofArray() {
		// find the product of all array 
		// find the product of even number
		//find the product of odd number 
		//find the product of 2 digit number 
		//product of positive number 
	
		int all[]= {5,12,4,21,8,2,3,7,9,11};
		int sum =1;
		
		for(int i =0; i<all.length; i++) {
	
	//		if(all[i]>0) {					// positive number 
	//		if(all[i]>9 && all[i]<100) {	//  2 digit number 
	//		if(all[i]%2==0) {				// even no
			sum = sum*all[i];
			}
//		}
		System.out.println("product of Array = "+sum);
	}

	public void countnumerArray() {
		// find the count of all array 
		// find the count of even number
		//count of number divided by 5
		//count of 3 digit no
		//count of number ending with 5
		
		int all[]= {5,12,4,21,8,2,3,7,9,11,95};
		int count =0;
		
		for(int i =0; i<all.length; i++) {
	
			if(all[i]%10==5) {
//			if(all[i]>99 && all[i]<1000) {	// 3digit number 
//			if(all[i]%5==0) {				// divided by 5
//			if(all[i]%2==0) {				// even no
			count++;
				}
		}
		System.out.println("count of Array = "+count);
	}

	public void max_MinnumberInArray() {
		
		int all[]= {5,12,4,21,8,2,3,7,9,11,95};
		int max=all[0];		int min =all[0];
		
		for(int i=0; i<all.length; i++) {
			
			if(all[i]>max) {
				max=all[i]; 			}
			if(all[i]<min) {
				min=all[i]; 			}
		}
		System.out.println("max number is = "+max);
		System.out.println("min number is = "+min);
	}
	
	public void sortArrayasending() {
	
		int arr[]= {5,2,8,7,1};
		
		int temp=0;
		for(int i=0;i<arr.length; i++) {
		System.out.println("Before Sort asending= "+arr[i]);	
		}
		
		for(int i=0;i<arr.length; i++) {
			for(int j=0; j<arr.length; j++){
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
			}
		}
		for(int k=0;k<arr.length; k++) {
			System.out.println("After sort asending= "+arr[k]);	
			}	
	
		
	}
	public void sortArraydesending() {
		
		int arr[]= {5,2,8,7,1};
		
		int temp=0;
		for(int i=0;i<arr.length; i++) {
		System.out.println("Before Sort desending= "+arr[i]);	
		}
		
		for(int i=0;i<arr.length; i++) {
			for(int j=0; j<arr.length; j++){
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
			}
		}
		for(int k=0;k<arr.length; k++) {
			System.out.println("After sort desending = "+arr[k]);	
			}	
	}
	
	
	
}
