package Abstraction;

public class completeSBI extends inCompleteRBI{

	public void loan() {
		System.out.println("SBI Loan");
	}
	
	public void creditCard() {
		System.out.println("SBI credit Card");
	}
	
	public void debitCard() {
		System.out.println("SBI Debit Card");
		
	 }
	
	public static void main(String[] args) {
		
		completeSBI sb=new completeSBI();
		sb.loan();
		sb.creditCard();
		sb.debitCard();
		
//		inCompleteRBI rb= new inCompleteRBI();   
// 		can not create object of abstrct class (incomplete Class)
		
		inCompleteRBI rb= new completeSBI();
		rb.loan();
		rb.creditCard();
		rb.debitCard();
	}
	}
