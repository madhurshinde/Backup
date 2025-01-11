package Multi_Level_Inheritance;

public class WhatsApp_V2 extends WhatsApp_V1 {    // v2 extends v1 class properties  method of text1 and text 2
	
	public void audioSingle() {
	System.out.println("audio cl Single person Functionality version 2");
	}

	public void audioMulti() {
	System.out.println("audio cl multiple person Functionality version 2");
	}
	
	public static void main(String[] args) {
		
		WhatsApp_V2 wp =new WhatsApp_V2();
		System.out.println("Calling Child class non static method by creating obj");
		wp.audioSingle();
		wp.audioMulti();
		System.out.println();
		System.out.println("Calling Child class non static method which is inherit bu parent class");		
		wp.textSingle();
		wp.textmulti();				
	}
}
