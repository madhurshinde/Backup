package IMP_Program;

public class h_Prime_no02 {

	
	public static void main(String[] args) {
		int n=12;
		int prime =0;
		
	  for(int i=2;i<n-1;i++) {
			if(n%2==0)
			{
				prime=prime+1;
			}
		}
		if(prime>0) {
			System.out.println(n+"is not prime NO");
		}
		else
			System.out.println(n+"is prime No");
	}
}
