package IMP_Program;

public class X4_Positive_Negative {

	
	//check num is positive negative or zero 
	
	public static void main(String[] args) {
		
		X4_Positive_Negative j=new X4_Positive_Negative();
		j.SecondApproch();
		
		int num=0;
		
		if(num>0) {
			System.out.println(num+" is positive");
		}else if(num<0) {
			System.out.println(num+" number is negative");
		}else
		System.out.println(num+" is zero");
	}

	public void SecondApproch() {

		int num=0;
	
		if(num>0) {
			System.out.println("positive");
		}else if(num <0){
			System.out.println("no is negative");
		}
}
}