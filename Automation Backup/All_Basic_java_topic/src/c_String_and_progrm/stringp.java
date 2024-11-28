package c_String_and_progrm;

public class stringp {

	public static void main(String[] args) {
		
  String a= "Madhur";                           // String declare by String literal type
  
  String b = "SHINDE";
  
  String c = "shinde";
  
  String d = new String("hello");             // String declare by new Keyword
  
  System.out.println(a);                      //print name

  System.out.println(a.length());            // length of string
  
  System.out.println(a.charAt(3));           // alpha bet on 3 rd no
  
  System.out.println(a.concat(b));          // concat function          
  System.out.println(d.concat(a));          // concat  
  
  System.out.println(a.toUpperCase());     // convert to upper case
  
  System.out.println(b.toLowerCase());     // convert to lower case 
  
  System.out.println(a.equals(b));         // check equal or not  one string with other
  
  System.out.println(b.compareTo(c));      // compair string 
 
  System.out.println(a.contains("mad"));
  System.out.println(a.split(b));
  
  
  //reverse String 

  int len =a.length();              // check length of string ( space also calculate)
  for(int i=len-1; i>=0 ; i--)     // for reverse Name
  {
	  System.out.print(a.charAt(i));
  }
}
	
}
