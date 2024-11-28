package b_Condition_loop;

public class D_else_if_condition {
  public static void main(I_line[] args) {
	int a = 12 ;
	int b = 15;
	
	if (a==b)                   // 1 conditon false then skip 
	{
		System.out.println(" a is equal");
	}
	else if (a>b)               // conditon true then print  otherwise  ove to next condtiton    
	{
		System.out.println("a is grater than b");
		}
	else if (a<15)              // conditon 1 and 2 false 
	{
		System.out.println(" a is less than 15");
	}
	else                       // all condition is false then else is print 
	{
		System.out.println(" a is very small ");
	}
	}
	
	
	
}
