package Multi_Level_Inheritance;

public class WhatsApp_V1 {
	
	public void textSingle() {
	System.out.println("Text Single person Functionality version 1");
}

	public void textmulti() {
	System.out.println("Text multiple person Functionality version 1");
}
	
	public static void main(String[] args) {
	
		WhatsApp_V1 w1=new WhatsApp_V1();
		System.out.println("Classing non static method by creating obj");
		System.out.println();
	
		w1.textSingle();
		w1.textmulti();
	}
}
