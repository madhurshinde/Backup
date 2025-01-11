package String_program;

public class practice_of_string {

	public static void main(String[] args) {

		//Each chracter in seperate line
		String s1="Gayatri Jadhao";
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		
		System.out.println("********************");
		//Each character in ASCII Value
		
		String s2="Gayatri Pratiksha Trisha";
		for(int i=0;i<s2.length();i++) {
			char ch=s2.charAt(i);
			System.out.println(ch+"="+(int)ch);
		}
		System.out.println("*************");
		// uppercase character
		String s3="Gayatri Naresh Jadhao";
		for(int i=0;i<s3.length();i++) {
			char ch=s3.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.println(" "+ch);
			}
		}
		
		System.out.println("********************");
		//lowercase chracter
		String s4="Gayatri Naresh Jadhao";
		for(int i=0;i<s4.length();i++) {
			char ch=s4.charAt(i);
			if(Character.isLowerCase(ch)) {
				System.out.println(" "+ch);
			}
		}
		System.out.println("**********************");
		//count of Digit 
		String s5="Gayatri Naresh Jadhao1797";
		for(int i=0;i<s5.length();i++) {
			char ch=s5.charAt(i);
			if(Character.isDigit(ch)) {
				System.out.println(ch);
			}
		}
		System.out.println("******************");
		//print Vowels
		int count=0;
		String s6="Gayatri17 Naresh Jadhao97";
        for(int i=0;i<s6.length();i++) {
        	char c=s6.charAt(i);
        	char ch=Character.toUpperCase(c);
        	if( ch=='A'|| ch=='E' || ch=='I' ||ch=='O'||ch=='U') {
        		count++;
        		System.out.println(ch);
        	}
         }
        System.out.println("vowels count="+count);
	}

}
