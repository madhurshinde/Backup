package Multi_Level_Inheritance;

public class WhatsApp_V3 extends WhatsApp_V2 {   // extends property of v2 (which include v1 property)

	public void videoSingle() {
	System.out.println("video cl Single person Functionality version 3");
	}
	public void videoMulti() {
	System.out.println("video cl multiple person Functionality version 3");
	}
	
	public static void main(String[] args) {
		WhatsApp_V3 w3 =new WhatsApp_V3();
		System.out.println("calling own class method");
		 System.out.println();
		 w3.videoSingle();
		 w3.videoMulti();
		 System.out.println();
		 System.out.println("calling extends class method");
		 w3.audioSingle();     // caling w2 
		 w3.audioMulti();
		 w3.textSingle();     // calling w1 
		 w3.textmulti();
}   }
