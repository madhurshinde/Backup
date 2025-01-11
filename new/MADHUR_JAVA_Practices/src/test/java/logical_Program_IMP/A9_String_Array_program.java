package logical_Program_IMP;

public class A9_String_Array_program {

	
	public static void main(String[] args) {
		A9_String_Array_program obj=new A9_String_Array_program();
		obj.stringLength();
		obj.startwithMa();
		obj.printONEorFOURCharacter();
		obj.CovertEachStringorFirstINUpper();
		obj.convertOnlyFirstchar();
		obj.arrayStringReverse();
	}
	
	public void stringLength() {
		
		String[] allName= {"madhur","baburao","Shinde"};
		for(int i=0; i < allName.length; i++) {
			
			if(allName[i].length()%2==0) {
			System.out.println("even length = "+allName[i]);
			}
		}
	}
	
	public void startwithMa() {
		
		String[] allName= {"madhur","baburao","shinde"};
		for(int i=0; i < allName.length; i++) {
			if(allName[i].startsWith("ma")) {
			System.out.println("Start with = " +allName[i]);
			}
			if(allName[i].endsWith("rao")) {
				System.out.println("end With = "+allName[i]);
			}
			
			if(allName[i].contains("in")) {
				System.out.println("contains = "+allName[i]);
			}
	}
		
	}
		public void printONEorFOURCharacter() {
	
			String[] allName= {"madhur","baburao","Shinde"};
			for(int i=0; i < allName.length; i++) {
			
				System.out.println("first character of String = " +allName[i].charAt(0));
				System.out.println("First 4 Character = "+allName[i].substring(0,4));
			}			
		}
		
		
		public void CovertEachStringorFirstINUpper() {
			
			String[] allName= {"madhur","baburao","Shinde"};
			for(int i=0; i < allName.length; i++) {
	
			String s= allName[i].toUpperCase();
			System.out.println(s);
			}
		}
		
		
		public void convertOnlyFirstchar() {
			
			String[] allName= {"madhur","baburao","Shinde"};
			for(int i=0; i < allName.length; i++) {
			
			char f= allName[i].charAt(0);
			f= Character.toUpperCase(f);
			String name=allName[i].substring(1);
			System.out.println(f+name);
			}				
		}
			
		
		public void arrayStringReverse() {
		
			String[] allName= {"madhur","baburao","Shinde"};
			for(int i=0; i < allName.length; i++) {
		
				String name= allName[i];
				String rev="";
				for(int j=0; j<name.length(); j++ ) {
					
					char c = name.charAt(j);
					rev=c+rev;
				}
				System.out.println(rev);
			}	
		}
	}

