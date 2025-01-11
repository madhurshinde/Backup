package String_program;

public class Day2_Remove_space {
	
	public static  void main (String []args){
 	 //Tuesday:-Remove space, add space.
		    
		    String name ="my name is madhur shinde";
		    System.out.println(name);
		   String noSpacename=name.replace(" ","");
		    System.out.println("name after remove Space ="+noSpacename);
		    
		    String twoSpaceName =noSpacename.replace("","  ");
		    System.out.println(" name after adding extra space ="+twoSpaceName);
		   
	}

}
