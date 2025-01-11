package logical_Program_IMP;

public class A5_String_CharAT_CreatCharacter {
	
	
	public static void main(String[] args) {
			
		A5_String_CharAT_CreatCharacter obj=new A5_String_CharAT_CreatCharacter();
//			obj.newString();
//			obj.newStringDigit_Character();
			obj.newString_RemoveWhiteSpace();
//			obj.newString_uppertoLower();
//			obj.reverseString();
//			obj.PalindromNumber();
//			obj.shiptby2();
//			obj.AaBbCc();
	
	}
	
	public void newString() {
	// Create a new String containg only upperCase Characters
		  
		  String name="Madhur Shinde";
		  String newName="";
		  for (int i=0; i<name.length();i++) {
			  char c =name.charAt(i); // M a S
			  if(Character.isUpperCase(c)) { 
				  newName=newName+c;  //M  S  //adding one by one 
				  }
		  }System.out.println("Upper Case Are =" +newName);
		  }	
	
	public void newStringDigit_Character(){
	//creat new String only digit 
		
		String name="NO26 madhur 67Sound";
		String Digit="";
		String Charcter="";
		
		for(int i=0; i<name.length(); i++) {
			char c=name.charAt(i);
			if(Character.isDigit(c)) {
				Digit=Digit+c;
			}else {
				Charcter=Charcter+c;
			}
		}
		System.out.println("digit are = "+Digit);
		System.out.println("Character are =" +Charcter);
	}

	public void newString_RemoveWhiteSpace() {
		// remove white Spaces in String		
		
		String name="NO26 Sound";
		String RemoveSpace="";
		for(int i=0; i<name.length(); i++) {
			char c=name.charAt(i);
		if(!Character.isWhitespace(c)) {
			RemoveSpace=RemoveSpace+c;
		}
		}
		System.out.println("Remove Space = " +RemoveSpace);
	}

	
	public void newString_uppertoLower() {
		// Change the cases 
		
		String name="Madhur Shinde";
		String change="";
		for(int i=0; i<name.length(); i++) {
			char c=name.charAt(i);
		if(Character.isUpperCase(c)) {
			change=change+Character.toLowerCase(c);
		}else {
			change=change+Character.toUpperCase(c);
		}	
		}
		System.out.println("upper to lover viseverse Change = "+ change);
	}

	
	public void reverseString() {
		
		String Reverse="";
		String name="madhur";
		
		for(int i=0; i<name.length(); i++) {		
			char c=name.charAt(i);
			Reverse =c+Reverse;      //only this Store process Change
		}
		System.out.println(Reverse);
	}

	public void PalindromNumber() {
		
		String Reverse="";
//		String name="nayan";
		String name="Rahul";
		for(int i=0; i<name.length(); i++) {		
			char c=name.charAt(i);
			Reverse =c+Reverse;  //only this Store process Change
		}
		if(Reverse.equals(name)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("non palindrom");
		}
	}
	
	
	public void shiptby2() {
	
		String name="SIMPLY"; //ukorna
		String enc="";
		for(int i=0; i<name.length(); i++) {		
			char c=name.charAt(i);
			if(c=='Y'||c=='Z'||c=='z'||c=='y') {
				c-=26;
				c+=2;
				enc=enc+c;
			}
			System.out.println(enc);
	}
}
	
	
	public void AaBbCc() {
		
		String name="abc";
		String Result="";
		
		for(int i=0; i<name.length();i++) {
			char c=name.charAt(i);
			Result=Result+c+c;
		}
	System.out.println(Result);
	
}
}