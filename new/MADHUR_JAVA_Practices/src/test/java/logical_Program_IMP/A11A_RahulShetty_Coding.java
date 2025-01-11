package logical_Program_IMP;

import java.util.ArrayList;
import java.util.Arrays;

public class A11A_RahulShetty_Coding {

	public static void main(String[] args) {
		A11A_RahulShetty_Coding obj =new A11A_RahulShetty_Coding();
	//	obj.sumofArray();
	//	obj.multiplyWithout(7, 11);
	//	obj.MaxDiffbtnNO();
	//	obj.compair2arrays();
	//	obj.sortingArray();
	//	obj.swapWithout3rd();
	//	obj.fibonacciSeriers();
	//	obj.primeNumber();
	//	obj.maxNumberInMultiDimensionArray();
	//	obj.duplicateAndUnique();
	//	obj.reversenumber();
		obj.anagram();
	}
	
	public void sumofArray() {
	//create a method which accept array and return sum of all element array

		int[] arr= {1,3,5,6,8,9};
		int sum=0;
		for(int i=0; i< arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		}
		
	
	public void multiplyWithout(int m,int n) {
		// multiple without using multiply operator
		
		int sum=0;
		for(int i=0; i<n; i++) {
			sum=sum+m;
		}
		System.out.println(sum);
	}
	
	public void MaxDiffbtnNO() {
		int[] a= {1,4,8,15,17}; //3/4/7/2  ans  is 7
		
		int temp=0;
		for(int i=0; i<a.length-1; i++) {
			int j =a[i+1]-a[i];
			if(j>temp) {
				temp = j;	}
			}
		System.out.println("mx diff="+temp);
		}
		
	public void compair2arrays() {
		//compair same index of 2 diff array  and creat another array for matching values 
		
		int a[]= {1,4,5,7};
		int b[]= {6,4,3,7};			// output {4,7}\
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++) {
			 if(a[i]==b[i]) {
			 al.add(a[i]);	 				// added in array list
			 }
		 }
		Object[] c = al.toArray();
		for(Object hh:c) {
		  System.out.println(hh);			// print array list
		}	
	  }
	
	
	public void sortingArray() {
		//sorting array asending and desending 
		int a[]= {2,6,1,4,9};
		int temp=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0 ; j<a.length; j++)
		//	if(a[i]<a[j]) {			// for asending order 
				if(a[i]>a[j]) {			// for desending order 
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		for(int lo:a) {
			System.out.println(lo);
		}
		
		Arrays.sort(a);									//Directly Sort array
		for(int i=0; i<a.length-1; i++) {
		System.out.println(a[i]+"check");
		}
	}
		
	public void swapWithout3rd() {
		//Swaping without 3 variable 
		
		int a=4;
		int b=5;
		
		a=a+b; //9
		b=a-b;//4
		a=a-b;
		System.out.println(a);
		System.out.println(b);	
		}
	
	public void fibonacciSeriers() {
		//fibonaccic series 
		
		int num1=0;
		int num2=1;
		int sum=0;
		
		for(int i=0; i<10;i++) {
			sum=num1+num2;   		// 0+1=1,1+1,1+2/
			num1=num2;			    //1,1
			num2=sum;			    //1,2
			System.out.println(sum);
		}
	}
	
	
	public void primeNumber() {
		//prime number
		
		int num=12;
		int count=0;	
		for(int i=0; i<10; i++) {
			if(num%2==0) {
				count++; }
		}
		if(count==2) {
			System.out.println("prime "+ num );
		  }else {
			System.out.println("odd no " + num);
		 }		
	}

	
	public void maxNumberInMultiDimensionArray() {
		
		int abc[][]= {{2,4,5},{3,1,7},{15,2,9}};
		
		int min=abc[0][0];
		int max=abc[0][0];
		for(int i=0; i<3; i++) {
			for(int j=0;j<3; j++) {
				 if(abc[i][j]<min) {
					 min=abc[i][j];
				 }
				 if(abc[i][j]>max) {
					 max=abc[i][j];
				 }
		}
			}
		System.out.println(max);
		System.out.println(min);	
	}
	
	
	public void duplicateAndUnique() {
		
		int a[]= {4,5,5,6,6,7,8,9,9,4};
	
		for(int i=0; i<a.length-1; i++) {
				if(a[i]==a[i+1]) {								//need to check ones again
					System.out.println(" Repeacted value = "+a[i]);
		//		break;
//				}else {
//					System.out.println("unique val "+a[i]);
				}
		}
		
	}
	
	
	public void reversenumber() {
		
		int num=19456;
		while(num >0) {
			System.out.print(num%10);
			num= num/10;
		}
	}
	
	
	public void anagram() {
		String first="LISTEN";
		String second="SILENT";
		
		char c1[]=first.toCharArray();
		char c2[]=second.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
	    
		for(int i=0; i<first.length(); i++) {
			if(c1[i]!=c2[i]) {
				System.out.println("NOt Anagram");
				break;
			}
			
		}
		System.out.println("Anagram");
	}

	}


