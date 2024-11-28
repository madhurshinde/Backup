package logical_Program_IMP;

public class Remove_Space_special_Char {

	public static void main(String[] args) {
		
		Remove_Space_special_Char obj =new Remove_Space_special_Char();
//		obj.replaceSpecialCharacter();
		obj.removeWhite_Space();
//		obj.removeWhite_Space_TRIm();
	}
	
	
	public void replaceSpecialCharacter() {
		
		String name ="M&*A^%*&D$#HU^%$^R";
		
		String PlaneName=name.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(PlaneName);
	}
	
	
	public void removeWhite_Space() {
		String name=" M  A   D HU    R ";

		String PlaneName=name.replaceAll(" ", "");
//		String PlaneName=name.replaceAll("\\s", "");
		System.out.println(PlaneName);
	}
	
	public void removeWhite_Space_TRIm() {

		String name="    MA DHU R     ";
		
		System.out.println(name);
		String PlaneName=name.trim();
		System.out.println(PlaneName);
		System.out.println("Trim only Remove Space from start and End");
	}
}
