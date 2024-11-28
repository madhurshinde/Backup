
package IMP_Program;

public class Amstrong_number {

	 public static void amstrong(int num) {
		 int swapno, total=0,rem=0;
		 swapno =num;
		
    while(swapno!= 0) {
    	
    	rem = swapno%10;            // 3 
    	total = total+rem*rem*rem;  //27
    	swapno = swapno/10;        // 153/10= 15
    }
    if(total==num) {
    	System.out.println(num+ " is a Armstrong no ");
    }
    else
    {
    	System.out.println(num+ " is not a Amstrong num");
    }
    
	 }
	 public static void main(String[] args) {
		 Amstrong_number.amstrong(1634); // 153,370,371,407
	}
	
}
