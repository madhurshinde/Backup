package encapsulation;

public class Test {

	private int IDNumber;
	private String EmPName;
	private int EmPAge;
	
	public int getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}
	public String getEmPName() {
		return EmPName;
	}
	public void setEmPName(String emPName) {
		EmPName = emPName;
	}
	public int getEmPAge() {
		return EmPAge;
	}
	public void setEmPAge(int emPAge) {
		EmPAge = emPAge;
	}
	
	public static void main(String[] args) {
	
		Test obj =new Test();
		obj.setIDNumber(345);
		obj.setEmPName("madhur");
		obj.setEmPAge(4);
		
		System.out.println("IDNumber = "+obj.getIDNumber());
		System.out.println("empName = " +obj.getEmPName());
		System.out.println("EmPage = "+obj.getEmPAge());
	}

}
