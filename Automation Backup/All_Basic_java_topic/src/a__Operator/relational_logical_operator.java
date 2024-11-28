package a__Operator;

public class relational_logical_operator {

	public static void main(String[] args) {
	int madhur = 25 ;
	int shinde = 35 ;
	
	System.out.println("Relational operator ==, >,<, <=,>=,!");
    
	System.out.println( madhur == shinde);
	
	System.out.println(madhur != shinde);
	
	System.out.println(madhur > shinde);

	System.out.println(madhur < shinde);
	
	System.out.println(madhur <= shinde);
	
	System.out.println(madhur >= shinde);
	
	System.out.println(" LOgical Operators && , || ");
	
	System.out.println(madhur != shinde & madhur <= shinde); // both true then true
	
	System.out.println(madhur == shinde & madhur <= shinde);// one false then false 
	
	System.out.println(madhur != shinde || madhur <= shinde); // both true 
	
	System.out.println(madhur == shinde & madhur <= shinde);//one false 
	
	
	}
	}


