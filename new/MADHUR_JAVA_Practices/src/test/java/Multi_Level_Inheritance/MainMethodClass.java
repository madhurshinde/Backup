package Multi_Level_Inheritance;

public class MainMethodClass {
	
	public static void main(String[] args) {
		
		WhatsApp_V1 w1 =new WhatsApp_V1();
		System.out.println("Calling method in v1");
		w1.textSingle();
		w1.textmulti();
		System.out.println();
		
		WhatsApp_V2 w2 =new WhatsApp_V2();
		System.out.println("Calling method in v2");
		w2.textSingle();
		w2.textmulti();
		w2.audioSingle();
		w2.audioMulti();
		System.out.println();
		
		WhatsApp_V3 w3= new WhatsApp_V3();
		System.out.println("Calling method in v3");
		w3.textSingle();
		w3.textmulti();
		w3.audioSingle();
		w3.audioMulti();
		w3.videoSingle();
		w3.audioMulti();
		System.out.println();
		
		WhatsApp_V4 w4 = new WhatsApp_V4();
		System.out.println("Calling method in v4");
		w4.textSingle();
		w4.textmulti();
		w4.audioSingle();
		w4.audioMulti();
		w4.videoSingle();
		w4.videoMulti();
		w4.paymentsingle();
		w4.paymentMulti();
		System.out.println();
	}   }
