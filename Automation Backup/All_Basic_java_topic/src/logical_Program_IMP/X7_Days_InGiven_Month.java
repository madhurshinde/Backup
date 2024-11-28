package logical_Program_IMP;

public class X7_Days_InGiven_Month {

	// program to find days in given month 
	public static void main(String[] args) {
		
		X7_Days_InGiven_Month obj =new X7_Days_InGiven_Month();
		obj.daysInMonth_ByControlStatement();
		obj.daysInMonth_BySwitch();
		}
	
	
	public void daysInMonth_ByControlStatement() {
	
		System.out.println("find out days in the month BY Using Control Statement");
		int month= 10;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
		System.out.println(month+" Month have 31 Days ");
		}else if(month==4||month==6||month==9||month==11) {
		System.out.println(month+" Month have 30 Days ");
		}else if(month==2){
		System.out.println(month+" Month have 28 Days or 29 Days");
		}else {
			System.out.println(" dont know error");
		}		
	}
	
	
	public void daysInMonth_BySwitch() {
		

		System.out.println(" find out days in the month BY Using Switch Statement");
		int month=2;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+" Month have 31 Days ");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
		System.out.println(month+" Month have 30 Days ");
		break;
		case 2:
		System.out.println(month+" Month have 28 Days or 29 days");
		break;
		}
	}
}
