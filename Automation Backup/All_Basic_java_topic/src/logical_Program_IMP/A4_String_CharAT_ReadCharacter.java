package logical_Program_IMP;

public class A4_String_CharAT_ReadCharacter {
	
	
	public static void main(String[] args) {
	
		A4_String_CharAT_ReadCharacter obj=new A4_String_CharAT_ReadCharacter();
//		obj.PrintEachCharInSeparateLine();
//		obj.PrintUpperChar();
//		obj.CountUpperCaseCharacter();
	    obj.FindVowelCharacter();
//		obj.asciiCode();
	}

	public void PrintEachCharInSeparateLine() {
	
		String name="helloJAva";    //0,1,2,3,4,5,6,7,8
		for(int i=0; i<name.length(); i++) {
			char c=name.charAt(i);    // 
			System.out.println(c);
		}  }

	public void PrintUpperChar() {
		// also same logic uSe to print lower Case/digit/alphabate

		String name="Hello Madhur 90 Shinde 1676  *&*&*";
		for(int i=0; i<name.length(); i++) {
			char c=name.charAt(i);
			if(Character.isUpperCase(c)) {   // use to print upper Case
	//		if(Character.isLowerCase(c)) {   //use to print lower Case Value
	//		if(Character.isDigit(c))     {   // use for digit  
	//		if(Character.isLetterOrDigit(c)) {   // use for Alphabate
				System.out.print(c);				
			}    }  
	}
	
	public void CountUpperCaseCharacter() {

		String name="Hello Java How Are UUUU 22 %%%&*";
		int count=0;
		for(int i=0; i<name.length(); i++) {
			char c=name.charAt(i);
	//		if(Character.isUpperCase(c)) {   // use to print upper Case
    //		if(Character.isLowerCase(c)) {   //use to print lower Case Value
	//		if(Character.isDigit(c))     {   // use for digit  
			if(Character.isLetterOrDigit(c)) {   // use for Alphabate		
				count++;
				}  
			}
		System.out.println(count);
	}

	public void FindVowelCharacter() {	

		String name="ajhhshkjeiougsf";
		
		for(int i=0; i<name.length(); i++) {
		   char c=name.charAt(i);
		   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			   System.out.println(c);
		   }
		}  
	}
	
	
	public void asciiCode() {
		
		
		String name="ABbcdefghijklmnopqrstuvwx";
		
		for(int i=0; i<name.length(); i++) {
		   char c=name.charAt(i);
		   System.out.println("Ascii code of "+c+" is "+(int)c);
		   }
		}  
	}
