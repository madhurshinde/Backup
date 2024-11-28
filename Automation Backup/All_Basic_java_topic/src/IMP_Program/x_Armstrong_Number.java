package IMP_Program;

public class x_Armstrong_Number {

	public static void main(String[] args) {
		int Number = 153;        //153, 370, 371, 407,1634, 8208, 9474, 
		int Total=0;
		int Remainder;
        int Temp =Number;
        
		while(Temp >0)
		   {
			Remainder= Temp % 10;         
			Total  =Total+ Remainder * Remainder * Remainder;           
			System.out.println(Total);
			Temp = Temp/10;	
		   }
		    if( Total == Number )
		     {
		      System.out.println("Amstrong Number" + Number);	
		     }
		      else {
		        System.out.println("Not a Amstrong Number"+Number);
		         }
	}
}
