package logical_Program_IMP;

public class X5_SwapValue_2Ways {

	public static void main(String[] args) {
	
	
		X5_SwapValue_2Ways obj =new X5_SwapValue_2Ways();
		
		obj.swapWith3rdVariable();
		obj.swapdirectly();
	
	
}
	public void swapWith3rdVariable() {
	
		int a=10;
		int b=20;
		
		int c=a; //10
		a=b;     //20
		b=c;     //10
		System.out.println("Swap value with USing The 3rd variable");
		System.out.println("A=10 now value after swap A = "+a);
		System.out.println("B=20 now value after Swap B = "+b);
		
	}
	
	public void swapdirectly() {
		int a=10;
		int b=20;	
		a=a+b; //30
		b=a-b; //30-20 ans 10
        a=a-b;
        System.out.println("Swap directly ");
        System.out.println("A=10 now value after swap A = "+a);
		System.out.println("B=20 now value after Swap B = "+b);
		
        //by multiple and division
        int i =20;
        int j=30;   //600 //2/3
        
	}
}