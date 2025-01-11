package String_program;

public class Day4_Reverse_String {
	  
	  public static void main (String [] args){
		  //Reverse string, reverse each word,
			  
		  String myname = "Gayatri Jadhao";
			  
		  System.out.println(myname.length());
		
		  for(int i = myname.length()-1; i>=0; i--){
		    
		   System.out.print(myname.charAt(i));
		       
		  }
		}
}
