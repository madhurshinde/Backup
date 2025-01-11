package String_program;

public class Day5_PalindromString {

	public static void main(String[] args) {
		// Palindrom String
	
//	String name = "nayan";
//	String name="nitin";
//	String name = "Kanak";
	String name ="Madam";
	
	String reverseName ="";    // blank string Define
	
     for(int i=name.length()-1; i>=0; i-- ) {
    	 reverseName=reverseName+name.charAt(i);    //saving String one by one in reverse order 
    //	 System.out.println(reverseName);
     }
     if(name.equalsIgnoreCase(reverseName)) {
    	 System.out.println(name+ " String is palindrome");
     }else {
    	 System.out.println("String is not palindrome");
     }
		}   
	}