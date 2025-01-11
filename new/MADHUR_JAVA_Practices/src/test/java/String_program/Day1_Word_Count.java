package String_program;

public class Day1_Word_Count {

	public static void main(String[] args){   
	    //Monday:- Word count, space count
	   
	    String name = "my name is madhur shinde";
		int spaceCount =0;
		int worscount= 0;
		
	   System.out.println("length of String is ="+name.length());
	   for(int i =0; i<name.length(); i++){
        if(name.charAt(i)==' '){
         spaceCount++;     
        }else{
    	 worscount++;
        } 
       }
    	System.out.println("space count ="+spaceCount);
    	System.out.println("word Count ="+worscount);      
	}
}