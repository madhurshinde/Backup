package a__Operator;

public class Arithmatic_operators {

	public static void main(String[] args) {
	int a = 26 ;
	int b = 5 ;
	
	System.out.println("7 th Arithmatic operator are + , - , * , / , % , ++ , -- ");
	
	System.out.println(a+b); //adition 
	System.out.println( a+b + "Addition");// addition
	System.out.println( "Addition" + a+b);// concat operation done 
	System.out.println("addition"+ (a+b));// addition
	
	System.out.println(a-b);// Subsciption
	
  //System.out.println("substribution"+ a-b);                     //Error The operator - is undefined for the argument type(s) String, int
	
	System.out.println("Subsribtiton"+ (a-b));
	
	System.out.println(a*b);// Multiplication
	
	System.out.println(a/b);  // divided by 
	
	System.out.println( a % b); // mode to get remaining value 

	System.out.println(++a); // preincrement operator

	System.out.println(a++);//postincrement operator
	System.out.println(+a);//postincrement give output in next step
	
	System.out.println(--b);// predecrement operator

	System.out.println(b--); //postdecrement operator
	System.out.println(+b);//postdecrement give output in next step
	}
}


