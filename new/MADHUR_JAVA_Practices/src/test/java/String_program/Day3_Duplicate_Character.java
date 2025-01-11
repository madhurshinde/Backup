package String_program;

public class Day3_Duplicate_Character {
  
	
	public static void main (String [] args){
		  // duplicate character count
	
	String name= "mynameismadhur";
    char [] na = name.toCharArray();
    String s2="";
    
     boolean isduplicate = false;
     
     for(int i=0; i<na.length;i++) {
    	 for(int j= 0; j<i; j++) {
    	 if (na[i]==na[j]) {
    //		System.out.println("duplicate"+na[i]);
    		isduplicate =true;
    		break;
    	 }
    	 if(!isduplicate) {
    		 s2=s2+na[i];
    	 }
    	 }
    	 System.out.println(s2);
    	 
     }
    	 
		}

}
