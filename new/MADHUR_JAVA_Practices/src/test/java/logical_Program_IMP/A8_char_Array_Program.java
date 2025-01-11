package logical_Program_IMP;

public class A8_char_Array_Program {

	
	public static void main(String[] args) {
		
		A8_char_Array_Program obj =new A8_char_Array_Program();
		obj.asciiCode();
		obj.UpperCase();
		obj.countSpecificCondition();
		obj.vowel();
	}
	
	public void asciiCode() {
		
		char name[]= {'N','O','2','6',' ','S','O','U','N','D'};
		
		for(int i=0; i<name.length;i++){
		System.out.println(i+1+" "+name[i]+" "+(int)name[i]);	
		}
	}
	
	public void UpperCase() {
		
		char name[]= {'N','o','2','6',' ','S','o','u','n','D'};
		for(int i=0; i<name.length;i++){
		
//			if(Character.isUpperCase(name[i])) {                        // print upper case
//				if(Character.isLowerCase(name[i])) {                    // print lower case
//							if(Character.isDigit(name[i]))     {        // use for digit  
//							 if(Character.isLetterOrDigit(name[i])) {   // Remove space only character print
								 if(!Character.isSpace(name[i])) {      // remove Space
										
				System.out.println(name[i]);		
			}
		}
	}
	
	
		public void countSpecificCondition() {
		
		char name[]= {'N','o','2','6',' ','S','o','u','n','D'};
		int count =0;
		for(int i=0; i<name.length;i++){
		
			if(Character.isUpperCase(name[i])) {                        // count upper case
//				if(Character.isLowerCase(name[i])) {                    // count lower case
//							if(Character.isDigit(name[i]))     {        // count for digit  
//							 if(Character.isLetterOrDigit(name[i])) {   // count without Space only character digit
//								 if(!Character.isSpace(name[i])) {      // remove Space
				count++;									
				System.out.println(name[i]);		
			}
		}
		System.out.println("case count ="+count);	
		}
		
		
		public void vowel() {

		char name[]= {'N','o','a','e','i','S','o','u','n','D'};
					
		for(int i=0; i<name.length; i++) {
		   if(name[i]=='a'||name[i]=='e'||name[i]=='i'||name[i]=='o'||name[i]=='u') {
			   System.out.println(name[i]);
		   }
		}  
		}
}