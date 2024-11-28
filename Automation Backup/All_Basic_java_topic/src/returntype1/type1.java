package returntype1;

public class type1 {

	public int addition(int a , int b) {            // add two number and multiply it by 10   but addition should be a separate method 
		 int c = a+b ; // 10+20
		 return c;
}
	
   public void multiply(int j ) {
	   int d= j*10;
	   System.out.println(d);
	   
   }
	
   
   public void divide(int k) {
	   int l= k/2;
	   System.out.println(l);
   }
   
	public static void main(String[] args) {
		type1 obj = new type1();
		int i = obj.addition(10, 20);
	    obj.multiply(i);	
	    obj.divide(i);
	}
}
