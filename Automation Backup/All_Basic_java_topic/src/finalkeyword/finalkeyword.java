package finalkeyword;

public final class finalkeyword {                     // Final class can not inherritace 

	
	final static int a =20;                                 // final variable can not change the value  
 	
	public final void class1 () {                    //can not overrider with final keyword
		System.out.println(" main statement " +a);
	}
	public void class1 (int d) {                      //overloading done  with final keyword
		System.out.println(" main statement can overload " +a);
	}
	
	public static void main(String[] args) {
		System.out.println(++a);                     // can not chnge after final keyword
		finalkeyword obj =new finalkeyword();
		obj.class1();
		obj.class1(1);	
	}
}
