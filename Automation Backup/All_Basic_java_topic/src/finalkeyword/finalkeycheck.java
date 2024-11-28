package finalkeyword;

public class finalkeycheck extends finalkeyword {             // no inheritance possible
	
	public void class1 () {                                   //can not overrider with final keyword
		System.out.println(" main statement can not override with final word");
	}
	public static void main(String[] args) {
	 finalkeycheck obj = new finalkeycheck();
	 obj.class1();
	
	}

}
