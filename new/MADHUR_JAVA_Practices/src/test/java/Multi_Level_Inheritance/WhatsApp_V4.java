package Multi_Level_Inheritance;

public class WhatsApp_V4 extends WhatsApp_V3 {  // extends v3 method in v4

	public void paymentsingle() {
	System.out.println("payment to Single person Functionality version 4");
	}
	public void paymentMulti() {
	System.out.println("payment to multiple person Functionality version 4");
	}
	
	public static void main(String[] args) {	
		WhatsApp_V4 w4 =new WhatsApp_V4();
		System.out.println("calling own class method");
		w4.paymentsingle();
		w4.paymentMulti();
		System.out.println();
		System.out.println("Calling inherit class method");
		w4.textSingle();
		w4.textmulti();
		w4.audioSingle();
		w4.audioMulti();
		w4.videoSingle();
		w4.videoMulti(); 	}   }
