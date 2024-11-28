package c_String_and_progrm;

import java.time.LocalDateTime;
import java.util.Random;

public class String_method {

	
	public static void main(String[] args) {      // string is immutable
		String a = "Madhur";                                        // lliteral way 
		String b = "Durgesh";
		String Aa= new String ("Hello Madhur");                   // by new keywords
		String Bb = new String ("Hello Durgesh");

		
	    System.out.println(a.length());                          // method provide length
	    System.out.println(a.charAt(0));                         // charater  on no & index no is start From 0
        System.out.println(a.concat(b));                         // join two string
	    System.out.println(a.contains("Dur"));                   // check the contain value in string
	    System.out.println(a.contains("dhu"));                   //if present then true return
	    System.out.println(a.endsWith("r"));                     // check string end with which charchter 
	    System.out.println(a.startsWith("M"));                   // check string Start with which charchter
	    System.out.println(a.equals(b));                         // equal use to   check compair two string   return true false 
	    System.out.println(a.indent(35));                         // to shift or give space between string
        System.out.println(a.isBlank());                          // to check string is blank or not 
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.substring(1));                         // subsring rem0ove index
        System.out.println(a.substring(2,5));
        System.out.println(a.indexOf("M"));                         // to find index value of char 
        System.out.println(Aa.replace("Hello", "Chalo"));           // replace String temporary 
        System.out.println(Aa);
        System.out.println(Bb);
       
        String h = "       ji chalo ji ghar chalo";
        System.out.println(h);
        System.out.println(h.trim());          // remove space 
        
        String i[]= h.split("ji");
        System.out.println(i[1]);        // array 0 index
        System.out.println(i[2]);       // array 01 index
        System.out.println(i[0]);       // array 02 index
        
        System.out.println(LocalDateTime.now());   // to print  timeand  date 
        
        Random rand = new Random();
        System.out.println(rand.nextInt(10));   // for random no 
       
	}

	
}
