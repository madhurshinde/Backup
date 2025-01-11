package logical_Program_IMP;

public class Remove_DuplicateCharacter {

	public static void main(String[] args) {

		Remove_DuplicateCharacter obj =new Remove_DuplicateCharacter();	
		obj.removeDuplicateCharacter();	

	}
	
	public void removeDuplicateCharacter() {
		
		String name="MAADHHURRR";
		
		String Result="";
		for(int i=0; i<name.length(); i++) {
			String ch=""+name.charAt(i);
			if(Result.contains(ch)) {
				System.err.println(ch+" = duplicate Char");
				continue;
			}
			Result=Result+ch;
		}
		System.out.println(Result);
	}
}
