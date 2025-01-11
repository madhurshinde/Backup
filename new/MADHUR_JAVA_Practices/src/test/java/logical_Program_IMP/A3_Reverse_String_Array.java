package logical_Program_IMP;

import java.util.Scanner;

public class A3_Reverse_String_Array {

	
	public static void main(String[] args) {

		A3_Reverse_String_Array obj=new A3_Reverse_String_Array();
		
		obj.ReverseString1Method();
		obj.ReverseArray();
		obj.ReverseStringCovertingToArray();
		obj.ReverseByStringBuffer();
		obj.ReverseByStringBuilder();
		obj.ReverseOnSamePlace();
		obj.ReverseByUserInput();
    }
// Approcha-1
	public void ReverseString1Method() {
		String name="Hello";
		int size=name.length();
		for(int i=size-1; i>=0; i--){ //4
			System.out.print(name.charAt(i));   //char at
		}
		System.out.println(" = Reverse String Approcha-1 ");
		}

//Approcha 2	
	public void ReverseStringCovertingToArray(){
		
		String name="Hello";
		char[] Covertarray=name.toCharArray();	  // only coverting String into Array
		int sizeArray= Covertarray.length;
		for(int i=sizeArray-1; i>=0; i--){
			System.out.print(Covertarray[i]);
		}
		System.out.println(" = after converting string into Array Reverse Approcha-2");
	}	
		
	//Approcha 3
	public void ReverseByStringBuffer() {
		String name="Hello";
		StringBuffer sb= new StringBuffer(name);
		System.out.println(sb.reverse()+" =Reverse by String Buffer Approch -3 ");
		}
	
	//Approcha 4
	public void ReverseByStringBuilder() {
		String name="Hello";
		StringBuilder SB= new StringBuilder(name);
		System.out.println(SB.reverse()+" =Reverse by String Builder Approch -4 ");
	}
	
	//by taking user input
	public void ReverseByUserInput() {
		
		Scanner sc=new Scanner(System.in);
		String name=sc.next();    //method for String next // nextint for int 
		int size=name.length();
		for(int i=size-1; i>=0; i--){
			System.out.print(name.charAt(i));
		}
		System.out.println(" = Reverse String by user input ");
		}

	
	public void ReverseOnSamePlace() {
		
		String nameStr ="Madhur Shinde";
		String[] words=nameStr.split(" ");
		System.out.println(words[0]);
		System.out.println(words[1]);

		String output =""; 
		for(String word:words) {
			String revWord="";
			for(int i=word.length()-1;i>=0;i--) {   //6-1 
				revWord=revWord+word.charAt(i); // 1 st loop ruhdam/ 2nd loop ednihs
			}
			output=revWord+" ";
			System.out.print(output);
		}
		System.out.println(" = Reverse String on Same Place");
	}
	
	
	public void ReverseArray() {
		char name[] = {'H','e','l','l','o'};
		int size= name.length;	
		for(int i=size-1; i>=0; i--){
			System.out.print(name[i]);  // index call
		}
		System.out.println(" = Array Reverse Approcha-1");
		}
	
	
	
}	
	
