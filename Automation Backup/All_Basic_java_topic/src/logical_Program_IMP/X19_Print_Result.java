package logical_Program_IMP;

public class X19_Print_Result {
  //Java Program To Print Result Of 1+2-3+4+5-6+7+8-9 | Java For Loop
	
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<=10; i++) {
//			if(i==3||i==6||i==9) {
			if(i%3==0) {
			 sum=sum-i;
			}else
			sum=sum+i;
		}
		System.out.println("result "+sum);
	}
}
