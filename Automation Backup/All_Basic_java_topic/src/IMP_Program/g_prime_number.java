package IMP_Program;

public class g_prime_number {
	
	
public static void main(String[] args) {
		
   int a =13;               //ज्या संख्येला फक्त १ व ती संख्या यांनी पूर्ण भाग जातो, त्या संख्येला मूळ संख्या म्हणतात.
  
  if(a==2 || a==3 || a==5) {
	  System.out.println("prime  number"+a);
  }
  
  else if  (a%2 == 0 || a%3==0 || a%5==0) {
	  System.out.println("is not a Not prime number ");
  }
  else {
	  System.out.println("prime Number"+a);
  }
	  
}}
